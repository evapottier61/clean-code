package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * Default format for a date
     */
    private static final String DEFAULT_FORMAT = "dd/MM/yyyy HH:mm:ss";

    /** Formatte la date en String avec un pattern
     * @param date date
     * @param pattern pattern
     * @return String
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /** Formate la date en String avec le pattern par défaut
     * @param date date à formater
     * @return String
     */
    public static String formatDefaut(Date date) {
        return format(DEFAULT_FORMAT, date);
    }
}

