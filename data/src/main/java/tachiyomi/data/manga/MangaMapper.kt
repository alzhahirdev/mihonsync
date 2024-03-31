package tachiyomi.data.manga

import eu.kanade.tachiyomi.source.model.UpdateStrategy
import tachiyomi.domain.library.model.LibraryManga
import tachiyomi.domain.manga.model.Manga

object MangaMapper {
    @Suppress("LongParameterList")
    fun mapManga(
        id: Long,
        source: Long,
        url: String,
        artist: String?,
        author: String?,
        description: String?,
        genre: List<String>?,
        title: String,
        status: Long,
        thumbnailUrl: String?,
        favorite: Boolean,
        lastUpdate: Long?,
        nextUpdate: Long?,
        initialized: Boolean,
        viewerFlags: Long,
        chapterFlags: Long,
        coverLastModified: Long,
        dateAdded: Long,
        updateStrategy: UpdateStrategy,
        calculateInterval: Long,
        lastModifiedAt: Long,
        favoriteModifiedAt: Long?,
        version: Long,
<<<<<<< HEAD
        @Suppress("UNUSED_PARAMETER")
=======
        @Suppress("UNUSED_PARAMETER")
>>>>>>> a926ff6c1eda85ff1f1b0c36cee366d795cc2b39
        isSyncing: Long,
    ): Manga = Manga(
        id = id,
        source = source,
        favorite = favorite,
        lastUpdate = lastUpdate ?: 0,
        nextUpdate = nextUpdate ?: 0,
        fetchInterval = calculateInterval.toInt(),
        dateAdded = dateAdded,
        viewerFlags = viewerFlags,
        chapterFlags = chapterFlags,
        coverLastModified = coverLastModified,
        url = url,
        title = title,
        artist = artist,
        author = author,
        description = description,
        genre = genre,
        status = status,
        thumbnailUrl = thumbnailUrl,
        updateStrategy = updateStrategy,
        initialized = initialized,
        lastModifiedAt = lastModifiedAt,
        favoriteModifiedAt = favoriteModifiedAt,
<<<<<<< HEAD
        version = version,
=======
        version = version
>>>>>>> a926ff6c1eda85ff1f1b0c36cee366d795cc2b39
    )

    @Suppress("LongParameterList")
    fun mapLibraryManga(
        id: Long,
        source: Long,
        url: String,
        artist: String?,
        author: String?,
        description: String?,
        genre: List<String>?,
        title: String,
        status: Long,
        thumbnailUrl: String?,
        favorite: Boolean,
        lastUpdate: Long?,
        nextUpdate: Long?,
        initialized: Boolean,
        viewerFlags: Long,
        chapterFlags: Long,
        coverLastModified: Long,
        dateAdded: Long,
        updateStrategy: UpdateStrategy,
        calculateInterval: Long,
        lastModifiedAt: Long,
        favoriteModifiedAt: Long?,
        version: Long,
        isSyncing: Long,
        totalCount: Long,
        readCount: Double,
        latestUpload: Long,
        chapterFetchedAt: Long,
        lastRead: Long,
        bookmarkCount: Double,
        category: Long,
    ): LibraryManga = LibraryManga(
        manga = mapManga(
            id,
            source,
            url,
            artist,
            author,
            description,
            genre,
            title,
            status,
            thumbnailUrl,
            favorite,
            lastUpdate,
            nextUpdate,
            initialized,
            viewerFlags,
            chapterFlags,
            coverLastModified,
            dateAdded,
            updateStrategy,
            calculateInterval,
            lastModifiedAt,
            favoriteModifiedAt,
            version,
            isSyncing,
        ),
        category = category,
        totalChapters = totalCount,
        readCount = readCount.toLong(),
        bookmarkCount = bookmarkCount.toLong(),
        latestUpload = latestUpload,
        chapterFetchedAt = chapterFetchedAt,
        lastRead = lastRead,
    )
}
