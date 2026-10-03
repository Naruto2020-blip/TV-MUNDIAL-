package com.example

import com.example.data.model.ChannelCategory
import com.example.data.repository.CostaRicaChannelsData
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class CostaRicaChannelsTest {

    @Test
    fun testChannelsListNotEmpty() {
        val channels = CostaRicaChannelsData.channels
        assertTrue("Channel list should not be empty", channels.isNotEmpty())
        assertTrue("Should have at least 20 channels", channels.size >= 20)
    }

    @Test
    fun testCanal6Present() {
        val canal6 = CostaRicaChannelsData.channels.find { it.id == "canal6repretel" }
        assertNotNull("Canal 6 should be present", canal6)
        assertEquals("Canal 6", canal6?.callsign)
        assertEquals(ChannelCategory.COSTA_RICA, canal6?.category)
        assertTrue("Canal 6 should have active stream URLs", canal6?.streamUrls?.isNotEmpty() == true)
    }

    @Test
    fun testCanal7Present() {
        val canal7 = CostaRicaChannelsData.channels.find { it.id == "canal7teletica" }
        assertNotNull("Canal 7 should be present", canal7)
        assertEquals("Canal 7", canal7?.callsign)
        assertEquals(ChannelCategory.COSTA_RICA, canal7?.category)
    }

    @Test
    fun testPeruChannelsPresent() {
        val america = CostaRicaChannelsData.channels.find { it.id == "americatv_pe" }
        assertNotNull("América Televisión should be present", america)
        assertEquals(ChannelCategory.PERU, america?.category)

        val latina = CostaRicaChannelsData.channels.find { it.id == "latinatv_pe" }
        assertNotNull("Latina should be present", latina)
        assertEquals(ChannelCategory.PERU, latina?.category)

        val tvperu = CostaRicaChannelsData.channels.find { it.id == "tvperu_pe" }
        assertNotNull("TV Perú should be present", tvperu)
        assertEquals(ChannelCategory.PERU, tvperu?.category)
    }

    @Test
    fun testUniqueChannelIds() {
        val ids = CostaRicaChannelsData.channels.map { it.id }
        val uniqueIds = ids.toSet()
        assertEquals("All channel IDs should be unique", ids.size, uniqueIds.size)
    }

    @Test
    fun testAllCategoriesHaveChannels() {
        val categories = CostaRicaChannelsData.channels.map { it.category }.toSet()
        assertTrue("Should have Costa Rica", categories.contains(ChannelCategory.COSTA_RICA))
        assertTrue("Should have Perú", categories.contains(ChannelCategory.PERU))
    }
}
