package org.example;

import org.example.Utils.CurrencyConverterUtil;
import org.example.Utils.RateUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CurrencyConverterUtilTest {

    @Test
    void testConvertSekToEuro() {
        // Arrange
        double sek = 100;
        // 100 * 0.091352
        double expected = sek * RateUtil.SEK_TO_EURO_RATE;

        // Act
        double actual = CurrencyConverterUtil.convertSekToEuro(sek);

        // Assert
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    void testConvertSekToUsd() {
        // Arrange
        double sek = 100;
        // 100 * 0.099744
        double expected = sek * RateUtil.SEK_TO_USD_RATE;

        // Act
        double actual = CurrencyConverterUtil.convertSekToUsd(sek);

        // Assert
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    void testConvertEuroToSek() {
        // Arrange
        double sek = 100;
        // 100 * 10.990212
        double expected = sek * RateUtil.EURO_TO_SEK_RATE;

        // Act
        double actual = CurrencyConverterUtil.convertEuroToSek(sek);

        // Assert
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    void testConvertEuroToUsd() {
        // Arrange
        double euro = 100;
        // 100 * 1.087497
        double expected = euro * RateUtil.EURO_TO_USD_RATE;

        // Act
        double actual = CurrencyConverterUtil.convertEuroToUsd(euro);
        // Assert
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    void testConvertUsdToSek() {
        // Arrange
        double sek = 100;
        // 100 * 10.101447
        double expected = sek * RateUtil.USD_TO_SEK_RATE;

        // Act
        double actual = CurrencyConverterUtil.convertUsdToSek(sek);

        // Assert
        assertEquals(expected, actual, 0.000001);
    }

    @Test
    void testConvertUsdToEuro() {
        // Arrange
        double usd = 100;
        // 100 * 0.92391
        double expected = usd * RateUtil.USD_TO_EURO_RATE;

        // Act
        double actual = CurrencyConverterUtil.convertUsdToEuro(usd);

        // Assert
        assertEquals(expected, actual, 0.000001);
    }


}
