package org.example.Utils;

/**
 * A utility class. Performs currency conversions using predefined rates from RateUtil.
 */

public class CurrencyConverterUtil {

    public static double convertSekToEuro(double sekAmount) {
        return sekAmount * RateUtil.SEK_TO_EURO_RATE;
    }

    public static double convertSekToUsd(double sekAmount) {
        return sekAmount * RateUtil.SEK_TO_USD_RATE;
    }

    public static double convertEuroToSek(double euroAmount) {
        return euroAmount * RateUtil.EURO_TO_SEK_RATE;
    }

    public static double convertEuroToUsd(double euroAmount) {
        return euroAmount * RateUtil.EURO_TO_USD_RATE;
    }

    public static double convertUsdToSek(double usdAmount) {
        return usdAmount * RateUtil.USD_TO_SEK_RATE;
    }

    public static double convertUsdToEuro(double usdAmount) {
        return usdAmount * RateUtil.USD_TO_EURO_RATE;
    }

}