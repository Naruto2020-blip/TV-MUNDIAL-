package com.example.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.model.ChannelCategory
import com.example.data.model.TvChannel
import com.example.data.repository.CostaRicaChannelsData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class TvViewModel(application: Application) : AndroidViewModel(application) {

    private val _allChannels = MutableStateFlow<List<TvChannel>>(CostaRicaChannelsData.channels)
    val allChannels: StateFlow<List<TvChannel>> = _allChannels.asStateFlow()

    private val _selectedChannel = MutableStateFlow<TvChannel?>(
        CostaRicaChannelsData.channels.firstOrNull { it.id == "canal6repretel" }
            ?: CostaRicaChannelsData.channels.firstOrNull()
    )
    val selectedChannel: StateFlow<TvChannel?> = _selectedChannel.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedCategory = MutableStateFlow(ChannelCategory.TODOS)
    val selectedCategory: StateFlow<ChannelCategory> = _selectedCategory.asStateFlow()

    val filteredChannels: StateFlow<List<TvChannel>> = combine(
        _allChannels,
        _searchQuery,
        _selectedCategory
    ) { channels, query, category ->
        channels.filter { channel ->
            val matchesCategory = when (category) {
                ChannelCategory.TODOS -> true
                else -> channel.category == category
            }

            val matchesQuery = if (query.isBlank()) {
                true
            } else {
                val q = query.trim().lowercase()
                channel.name.lowercase().contains(q) ||
                    channel.callsign.lowercase().contains(q) ||
                    channel.category.displayName.lowercase().contains(q) ||
                    channel.description.lowercase().contains(q)
            }

            matchesCategory && matchesQuery
        }
    }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        CostaRicaChannelsData.channels
    )

    fun selectChannel(channel: TvChannel) {
        _selectedChannel.value = channel
    }

    fun onSearchQueryChange(query: String) {
        _searchQuery.value = query
    }

    fun selectCategory(category: ChannelCategory) {
        _selectedCategory.value = category
    }
}
