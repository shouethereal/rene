package tsuki.model

public enum class ContentType {

	/**
	 * Standard manga, manhua, webtoons, etc
	 */
	MANGA,

	MANHWA,

	MANHUA,

	/**
	 * Use this if the source provides mostly nsfw content.
	 */
	HENTAI,

	/**
	 * ExHentai / E-Hentai content.
	 */
	EXHENTAI,

	/**
	 * Western comics
	 */
	COMICS,

	NOVEL,

	/**
	 * Use this type if no other suits your needs.
	 */
	ONE_SHOT,

	DOUJINSHI,
	IMAGE_SET,
	ARTIST_CG,
	GAME_CG,
	OTHER,

	/**
	 * ExHentai-specific gallery categories.
	 */
	WESTERN,
	NON_H,
	COSPLAY,
	ASIAN_PORN,
	MISC,
}