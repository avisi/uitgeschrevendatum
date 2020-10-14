package nl.avisi.uitgeschrevendatum;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.time.LocalDate;
import java.util.Locale;

/**
 * Uitgeschreven datum zoals deze in notariële akten voorkomt.
 */
public class UitgeschrevenDatum {

    private static final Locale DUTCH_LOCALE = new Locale("nl", "NL");

    private RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat(DUTCH_LOCALE, RuleBasedNumberFormat.SPELLOUT);

    private LocalDate datum;

    public UitgeschrevenDatum(final LocalDate datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return null;
    }

}