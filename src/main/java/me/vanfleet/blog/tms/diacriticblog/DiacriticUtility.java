package me.vanfleet.blog.tms.diacriticblog;


import java.text.Normalizer;

public class DiacriticUtility {

    public static String stripDiacritics(String input){
        if ( !Normalizer.isNormalized(input, Normalizer.Form.NFD) ) {
            return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("\\p{M}+", "");
        }
        return input;
    }
}
