package tsuki.core

import tsuki.InternalParsersApi
import tsuki.MangaLoaderContext
import tsuki.model.Manga
import tsuki.model.MangaListFilter
import tsuki.model.MangaParserSource
import tsuki.model.MangaSource
import tsuki.model.SortOrder

@InternalParsersApi
public abstract class SinglePageMangaParser(
	context: MangaLoaderContext,
	source: MangaParserSource,
) : AbstractMangaParser(context, source) {

	/** ABI shim for plugins built against the pre-"Update parsers structure" [MangaSource] constructor. */
	@InternalParsersApi
	public constructor(context: MangaLoaderContext, source: MangaSource) : this(context, source as MangaParserSource)

	final override suspend fun getList(offset: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
		if (offset > 0) {
			return emptyList()
		}
		return getList(order, filter)
	}

	public abstract suspend fun getList(order: SortOrder, filter: MangaListFilter): List<Manga>
}
