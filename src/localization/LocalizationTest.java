package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationTest {
    public static void main(String[] args) {
        String lang = "ge";
        String country = "GE";

        Locale l = new Locale(lang, country);
        ResourceBundle r = ResourceBundle.getBundle("localization/Bundle", l);

        String str = r.getString("wish");
        System.out.println(str);
    }
}
