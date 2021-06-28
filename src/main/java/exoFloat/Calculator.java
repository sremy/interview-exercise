package exoFloat;

import java.text.DecimalFormat;
import java.text.NumberFormat;

class Calculator {

    /**
     * Sums an array of numbers.
     * <p>
     * * @return the exact sumWithString of the given numbers
     */
    static String sumWithString(String... numbers) {
        double total = 0;
        for (String number : numbers) {
            total = total + Double.parseDouble(number);
        }
        return String.valueOf(total);
    }


    static String sumWithFormat(String... numbers) {
        double total = 0;
        NumberFormat nf = new DecimalFormat("#.##");
        for (String number : numbers) {
            total = total + Double.parseDouble(number);
        }
        return nf.format(total);
    }
}