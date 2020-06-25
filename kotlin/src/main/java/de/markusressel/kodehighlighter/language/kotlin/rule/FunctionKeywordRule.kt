package de.markusressel.kodehighlighter.language.kotlin.rule

import de.markusressel.kodehighlighter.core.rule.RuleHelper
import de.markusressel.kodehighlighter.core.rule.RuleMatch
import de.markusressel.kodehighlighter.core.rule.SyntaxHighlighterRule

class FunctionKeywordRule : SyntaxHighlighterRule {

    override fun findMatches(text: CharSequence): List<RuleMatch> {
        return RuleHelper.findRegexMatches(text, PATTERN)
    }

    companion object {
        val PATTERN = "fun(?=\\s)".toRegex()
    }

}