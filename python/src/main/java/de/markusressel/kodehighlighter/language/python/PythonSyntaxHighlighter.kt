package de.markusressel.kodehighlighter.language.python

import de.markusressel.kodehighlighter.core.SyntaxHighlighter
import de.markusressel.kodehighlighter.core.colorscheme.SyntaxColorScheme
import de.markusressel.kodehighlighter.core.rule.SyntaxHighlighterRule
import de.markusressel.kodehighlighter.language.python.colorscheme.DarkBackgroundColorScheme
import de.markusressel.kodehighlighter.language.python.rule.*

/**
 * Python syntax highlighter
 */
class PythonSyntaxHighlighter : SyntaxHighlighter {

    override val defaultColorScheme: SyntaxColorScheme = DarkBackgroundColorScheme()

    override fun getRules(): Set<SyntaxHighlighterRule> {
        return setOf(
                ClassKeywordRule(),
                CommentRule(),
                DecoratorRule(),
                DefKeyword(),
                ExceptRule(),
                InternalFunctionsRule(),
                MagicRule(),
                OtherKeywordsRule(),
                ReturnKeywordRule(),
                SelfKeywordRule(),
                TypeKeywordRule())
    }

}