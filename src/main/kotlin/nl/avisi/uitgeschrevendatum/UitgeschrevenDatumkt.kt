package nl.avisi.uitgeschrevendatum

import com.ibm.icu.text.RuleBasedNumberFormat
import java.time.LocalDate
import java.util.*

/**
 * Uitgeschreven datum zoals deze in notariële akten voorkomt.
 */
class UitgeschrevenDatumkt(private val datum: LocalDate) {

    private val ruleBasedNumberFormat = RuleBasedNumberFormat(DUTCH_LOCALE, RuleBasedNumberFormat.SPELLOUT)

    override fun toString(): String {
        return ""
    }

    companion object {

        private val DUTCH_LOCALE = Locale("nl", "NL")
    }

}