package com.example.data.repository

import com.example.data.model.ChannelCategory
import com.example.data.model.TvChannel

object CostaRicaChannelsData {

    val channels: List<TvChannel> = listOf(
        // === CANALES DE COSTA RICA ===
        TvChannel(
            id = "canal6repretel",
            name = "Repretel Canal 6",
            callsign = "Canal 6",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://d2pdmpypqinyd5.cloudfront.net/out/v1/fa97da5f5db3405c9354e604ec223ecb/index.m3u8",
                "https://d1w7xnf525t4l4.cloudfront.net/out/v1/7d3a0429f6fc41cc996e838b8ebaf783/index.m3u8"
            ),
            description = "Canal nacional de noticias, entretenimiento y deportes en Costa Rica."
        ),
        TvChannel(
            id = "canal7teletica",
            name = "Teletica Canal 7",
            callsign = "Canal 7",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "http://190.61.101.11:7050/play/a07t/index.m3u8",
                "https://d10rltuy0iweup.cloudfront.net/teleticahls/mobile/live/livestream.m3u8"
            ),
            description = "Televisora de Costa Rica con transmisión de noticias, novelas y programas en vivo."
        ),
        TvChannel(
            id = "canal4repretel",
            name = "Repretel Canal 4",
            callsign = "Canal 4",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://d2pdmpypqinyd5.cloudfront.net/out/v1/fa97da5f5db3405c9354e604ec223ecb/index.m3u8",
                "https://d1w7xnf525t4l4.cloudfront.net/out/v1/7d3a0429f6fc41cc996e838b8ebaf783/index.m3u8"
            ),
            description = "Canal dedicado a series clásicas, películas y entretenimiento juvenil."
        ),
        TvChannel(
            id = "canal11repretel",
            name = "Repretel Canal 11",
            callsign = "Canal 11",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://d2pdmpypqinyd5.cloudfront.net/out/v1/fa97da5f5db3405c9354e604ec223ecb/index.m3u8"
            ),
            description = "Información, programas de opinión, comedias y talk shows en vivo."
        ),
        TvChannel(
            id = "canal8multimedios",
            name = "Canal 8 Multimedios",
            callsign = "Canal 8",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://mdstrm.com/live-stream-playlist/5a7b1e63a8da282c34d65445.m3u8"
            ),
            description = "Telediario en vivo, noticias locales, entretenimiento y deportes."
        ),
        TvChannel(
            id = "canal42extratv",
            name = "Extra TV 42",
            callsign = "Canal 42",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://d2n1wzrr0aogf5.cloudfront.net/ts:abr.m3u8",
                "https://59ef525c24caa.streamlock.net/extratv42/extratv42/playlist.m3u8"
            ),
            description = "El canal del pueblo costarricense, con noticias de impacto y análisis."
        ),
        TvChannel(
            id = "canal13sinart",
            name = "Trece Costa Rica TV",
            callsign = "Canal 13",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://cdn.sinart.go.cr/live/trece_costa_rica_tv/playlist.m3u8"
            ),
            description = "Televisión pública de Costa Rica con educación, cultura y opinión."
        ),
        TvChannel(
            id = "vmlatino",
            name = "VM Latino",
            callsign = "VM Latino",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://59ef525c24caa.streamlock.net/vmtv/vmlatino/playlist.m3u8"
            ),
            description = "El canal de la música de Costa Rica con los mejores éxitos y videoclips."
        ),
        TvChannel(
            id = "colosaltv",
            name = "Colosal TV Canal 54",
            callsign = "Canal 54",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://5eac7b031d945.streamlock.net/COLOSAL/COLOSAL/playlist.m3u8",
                "https://59ef525c24caa.streamlock.net/colosal/colosal/playlist.m3u8"
            ),
            description = "Televisión de la Región Brunca de Costa Rica."
        ),
        TvChannel(
            id = "tvsurcanal14",
            name = "TV Sur Canal 14",
            callsign = "Canal 14",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://k20.usastreams.com:8081/tvsur/index.m3u8",
                "https://59ef525c24caa.streamlock.net/tvsurcanal14/tvsurcanal14/playlist.m3u8"
            ),
            description = "Canal regional de la Zona Sur de Costa Rica (Pérez Zeledón y alrededores)."
        ),
        TvChannel(
            id = "telefides",
            name = "Telefides Canal 40",
            callsign = "Canal 40",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://59ef525c24caa.streamlock.net/telefides/telefides/playlist.m3u8"
            ),
            description = "Canal católico oficial de la Conferencia Episcopal de Costa Rica."
        ),
        TvChannel(
            id = "enlacecr",
            name = "Enlace Costa Rica",
            callsign = "Enlace",
            category = ChannelCategory.COSTA_RICA,
            streamUrls = listOf(
                "https://livecdnusa.enlace.plus/ejtv/smil:ejtv-hd.smil/playlist.m3u8",
                "https://enlace-live.hls.adaptive.level3.net/hls-live/livepkgr/_definst_/liveevent/enlace_1080p.m3u8"
            ),
            description = "Cadena internacional cristiana con sede en San José, Costa Rica."
        ),

        // === CANALES DE PERÚ ===
        TvChannel(
            id = "americatv_pe",
            name = "América Televisión",
            callsign = "Canal 4 PE",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/AMERICA-TV/index.m3u8"
            ),
            description = "Canal líder de la televisión peruana con novelas, espectáculos y noticias."
        ),
        TvChannel(
            id = "latinatv_pe",
            name = "Latina Televisión",
            callsign = "Canal 2 PE",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/LATINA/index.m3u8",
                "https://dai.google.com/linear/hls/event/oYQGDqEGTmGdHE_fz9oLlg/master.m3u8"
            ),
            description = "Canal 2 de Perú con entretenimiento, series, realities y noticias 24/7."
        ),
        TvChannel(
            id = "panamericanatv_pe",
            name = "Panamericana Televisión",
            callsign = "Canal 5 PE",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/PANAMERICANA/index.m3u8"
            ),
            description = "Canal histórico de la televisión peruana con periodismo y entretenimiento."
        ),
        TvChannel(
            id = "tvperu_pe",
            name = "TV Perú",
            callsign = "Canal 7 PE",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/TV-PERU/index.m3u8"
            ),
            description = "Canal del Estado Peruano (IRTP), cultura, información y descentralización."
        ),
        TvChannel(
            id = "atv_pe",
            name = "ATV",
            callsign = "Canal 9 PE",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/ATV/index.m3u8"
            ),
            description = "Andina de Televisión Canal 9 de Perú, noticias, entretenimiento y deportes."
        ),
        TvChannel(
            id = "willaxtv_pe",
            name = "Willax Televisión",
            callsign = "Canal 31 PE",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/WILLAX/index.m3u8"
            ),
            description = "Canal de noticias, opinión, análisis político y entretenimiento peruano."
        ),
        TvChannel(
            id = "exitosatv_pe",
            name = "Exitosa TV",
            callsign = "Exitosa",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/EXITOSA/index.m3u8"
            ),
            description = "La voz que integra al Perú, canal de noticias y debate ciudadano."
        ),
        TvChannel(
            id = "rpptv_pe",
            name = "RPP Noticias TV",
            callsign = "RPP",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/RPP/index.m3u8"
            ),
            description = "Radio Programas del Perú, señal informativa continua líder del país."
        ),
        TvChannel(
            id = "tvperunoticias_pe",
            name = "TV Perú Noticias",
            callsign = "7.3 Noticias",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/TV-PERU-NOTICIAS/index.m3u8"
            ),
            description = "Señal continua de noticias del Instituto Nacional de Radio y Televisión del Perú."
        ),
        TvChannel(
            id = "atvsur_pe",
            name = "ATV Sur",
            callsign = "ATV Sur",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "http://190.93.224.42/ATV-SUR/index.m3u8"
            ),
            description = "Canal regional del Grupo ATV para Arequipa y el sur peruano."
        ),
        TvChannel(
            id = "betheltv_pe",
            name = "Bethel TV",
            callsign = "Bethel",
            category = ChannelCategory.PERU,
            streamUrls = listOf(
                "https://alfa.betheltv.tv/srt/3_abr/playlist.m3u8"
            ),
            description = "Canal cristiano de valores y orientación familiar transmitiendo desde Lima."
        )
    )
}
