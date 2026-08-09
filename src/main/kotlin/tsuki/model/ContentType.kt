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
	 * Western comics
	 */
	COMICS,

	NOVEL,

	/**
	 * Use this type if no other suits your needs. For example, for an indie manga
	 */

	ONE_SHOT,
	DOUJINSHI,
	IMAGE_SET,
	ARTIST_CG,
	GAME_CG,
	OTHER,
	
	/**
	 * ExHentai-specific categories.
	 *
	 * These correspond to ExHentai/e-hentai f_cats values
	 * and should only be used by the ExHentai parser.
	 */

	WESTERN,
	NON_H,
	COSPLAY,
	ASIAN_PORN,
	MISC,
}
