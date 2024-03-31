package tachiyomi.domain.chapter.model

data class ChapterUpdate(
    val id: Long,
    val mangaId: Long? = null,
    val read: Boolean? = null,
    val bookmark: Boolean? = null,
    val lastPageRead: Long? = null,
    val dateFetch: Long? = null,
    val sourceOrder: Long? = null,
    val url: String? = null,
    val name: String? = null,
    val dateUpload: Long? = null,
    val chapterNumber: Double? = null,
    val scanlator: String? = null,
<<<<<<< HEAD
    val version: Long? = null,
=======
    val version: Long? = null,
>>>>>>> a926ff6c1eda85ff1f1b0c36cee366d795cc2b39
)

fun Chapter.toChapterUpdate(): ChapterUpdate {
    return ChapterUpdate(
        id,
        mangaId,
        read,
        bookmark,
        lastPageRead,
        dateFetch,
        sourceOrder,
        url,
        name,
        dateUpload,
        chapterNumber,
        scanlator,
<<<<<<< HEAD
        version,
=======
        version,
>>>>>>> a926ff6c1eda85ff1f1b0c36cee366d795cc2b39
    )
}
