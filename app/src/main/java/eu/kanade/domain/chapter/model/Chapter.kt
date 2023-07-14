package eu.kanade.domain.chapter.model

import eu.kanade.tachiyomi.data.database.models.ChapterImpl
import eu.kanade.tachiyomi.source.model.SChapter
import tachiyomi.data.Chapters
import tachiyomi.domain.chapter.model.Chapter
import eu.kanade.tachiyomi.data.database.models.Chapter as DbChapter

// TODO: Remove when all deps are migrated
fun Chapter.toSChapter(): SChapter {
    return SChapter.create().also {
        it.url = url
        it.name = name
        it.date_upload = dateUpload
        it.chapter_number = chapterNumber
        it.scanlator = scanlator
    }
}

fun Chapter.copyFromSChapter(sChapter: SChapter): Chapter {
    return this.copy(
        name = sChapter.name,
        url = sChapter.url,
        dateUpload = sChapter.date_upload,
        chapterNumber = sChapter.chapter_number,
        scanlator = sChapter.scanlator?.ifBlank { null },
    )
}

fun Chapter.copyFrom(other: Chapters): Chapter {
    return copy(
        name = other.name,
        url = other.url,
        dateUpload = other.date_upload,
        chapterNumber = other.chapter_number,
        scanlator = other.scanlator?.ifBlank { null },
        lastModifiedAt = other.last_modified_at,
    )
}

fun Chapter.toDbChapter(): DbChapter = ChapterImpl().also {
    it.id = id
    it.manga_id = mangaId
    it.url = url
    it.name = name
    it.scanlator = scanlator
    it.read = read
    it.bookmark = bookmark
    it.last_page_read = lastPageRead.toInt()
    it.date_fetch = dateFetch
    it.date_upload = dateUpload
    it.chapter_number = chapterNumber
    it.source_order = sourceOrder.toInt()
    it.last_modified = lastModifiedAt
}
