package com.example.data.model

enum class ChannelCategory(val displayName: String) {
    TODOS("Todos"),
    COSTA_RICA("Costa Rica"),
    PERU("Perú")
}

data class TvChannel(
    val id: String,
    val name: String,
    val callsign: String,
    val category: ChannelCategory = ChannelCategory.TODOS,
    val streamUrls: List<String>,
    val webFallbackUrl: String? = null,
    val logoUrl: String? = null,
    val description: String = ""
)
