package nl.avisi.uitgeschrevendatum

import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class UitgeschrevenDatumTestkt {

    @Test
    fun testKotlin() {
        //dag van de maand van 1 t/m 31
        assertEquals("eenjanuaritweeduizendtwaalf", UitgeschrevenDatumkt(createDate("01-01-2012")).toString())
        assertEquals("tweejanuaritweeduizendtwaalf", UitgeschrevenDatumkt(createDate("02-01-2012")).toString())

        //jan t/m dec
        assertEquals("eenjunitweeduizendtwaalf", UitgeschrevenDatumkt(createDate("01-06-2012")).toString())

        //2012 t/m 2051
        assertEquals("eendecembertweeduizenddertien", UitgeschrevenDatumkt(createDate("01-12-2013")).toString())
    }

    private fun createDate(dateString: String): LocalDate {
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"))
    }
}