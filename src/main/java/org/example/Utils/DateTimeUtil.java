package org.example.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A utility class that formats and returns the current date and time.
 */

public class DateTimeUtil {

    public static String getCurrentDateTime() {

        LocalDateTime dateAndTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("eeee dd MMM yyyy HH:mm");
        return dateAndTime.format(format);

    }
}
