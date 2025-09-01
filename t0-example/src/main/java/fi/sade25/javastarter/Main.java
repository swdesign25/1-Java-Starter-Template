package fi.sade25.javastarter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Use I18n (internationalization) from the beginning
        // ... kaikki tulostettavissa myös suomeksi !

        I18n.setEnglishLocale();
        System.out.println("-----------------");
        System.out.println(I18n.get("hello"));

        I18n.setFinnishLocaleLocale();
        System.out.println("-----------------");
        System.out.println(I18n.get("hello"));

        I18n.setJapaneseLocaleLocale();
        System.out.println("-------------");
        System.out.println(I18n.get("hello"));

    }
}