package nl.avisi.uitgeschrevendatum;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class UitgeschrevenDatumTest {

    @Test
    public void testJava() {
        //dag van de maand van 1 t/m 31
        assertEquals("eenjanuaritweeduizendtwaalf", new UitgeschrevenDatum(createDate("01-01-2012")).toString());
        assertEquals("tweejanuaritweeduizendtwaalf", new UitgeschrevenDatum(createDate("02-01-2012")).toString());

        //jan t/m dec
        assertEquals("eenjunitweeduizendtwaalf", new UitgeschrevenDatum(createDate("01-06-2012")).toString());

        //2012 t/m 2051
        assertEquals("eendecembertweeduizenddertien", new UitgeschrevenDatum(createDate("01-12-2013")).toString());
    }

    private LocalDate createDate(String dateString) {
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}