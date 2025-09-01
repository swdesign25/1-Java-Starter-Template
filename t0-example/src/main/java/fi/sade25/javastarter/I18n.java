package fi.sade25.javastarter;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18n {

    private static Locale japaneseLocale = new Locale.Builder().setLanguage("jp").build();
    private static Locale finnishLocale = new Locale.Builder().setLanguage("fi").build();

    private static Locale defaultLocale = Locale.ROOT;
    private static Locale currentLocale = Locale.ROOT;
    private static ResourceBundle bundle = ResourceBundle.getBundle("Messages", Locale.ROOT);

    private static void updateBundle(Locale locale) {
        currentLocale = locale;
        bundle = ResourceBundle.getBundle("Messages", currentLocale);
    }

    public static void setJapaneseLocaleLocale() {
        updateBundle(japaneseLocale);
    }

    public static void setFinnishLocaleLocale() {
        updateBundle(finnishLocale);
    }

    public static void setEnglishLocale() {
        updateBundle(defaultLocale);
    }

    public static String get(String key) {
        return bundle.getString(key);
    }

    public static Locale getCurrentLocale() {
        return currentLocale;
    }
}
