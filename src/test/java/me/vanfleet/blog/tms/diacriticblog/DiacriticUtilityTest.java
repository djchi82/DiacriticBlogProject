package me.vanfleet.blog.tms.diacriticblog;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DiacriticUtilityTest {

    @Test
    public void testStripDiacritic(){
        assertEquals("aabbsser3ssa35ds", DiacriticUtility.stripDiacritics("aabbsser3ssa35ds"));
        assertEquals("This is a funky String", DiacriticUtility.stripDiacritics("Tĥïŝ ĩš â fůňķŷ Šťŕĭńġ"));
        assertEquals("Ø or Ł", DiacriticUtility.stripDiacritics("Ø or Ł"));
        assertEquals("the German umlauts: a, o, u", DiacriticUtility.stripDiacritics("the German umlauts: ä, ö, ü"));
        assertEquals("manana", DiacriticUtility.stripDiacritics("mañana"));
        assertEquals("Æ æ Æ æ æ or Æ æ", DiacriticUtility.stripDiacritics("Ǣ ǣ Ǽ ǽ æ or Æ æ"));
    }
}
