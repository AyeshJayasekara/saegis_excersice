package logic;

public class LuckyCalculator {

    private static final String BIRTHDATE_SPLITTER = "/";


    public int calculateMyLuckyNumber(String birthday) {
        String dateString = getDate(birthday);
        String monthString = getMonth(birthday);
        String yearString = getYear(birthday);

        String allNumbers = dateString.concat(monthString).concat(yearString);

        int allDigits = convertToNumber(allNumbers);

        return calculateMyLuckyNumber(allDigits);
    }

    private int calculateMyLuckyNumber(int allNumbers) {
        return getNumberTotal(allNumbers);
    }

    private int getNumberTotal(int number) {
        int total = 0;

        while (number > 0) {
            total = total + number % 10;
            number = number / 10;
        }

        if (total > 1)
            return getNumberTotal(total);

        return total;
    }

    private int convertToNumber(String numberString) {
        return Integer.parseInt(numberString);
    }

    private String getDate(String birthday) {
        String[] components = birthday.split(BIRTHDATE_SPLITTER);
        return components[0];
    }

    private String getMonth(String birthday) {
        String[] components = birthday.split(BIRTHDATE_SPLITTER);
        return components[0];
    }

    private String getYear(String birthday) {
        String[] components = birthday.split(BIRTHDATE_SPLITTER);
        return components[2];
    }
}
