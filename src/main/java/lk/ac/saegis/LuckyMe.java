package lk.ac.saegis;

import logic.LuckyCalculator;

import java.util.Scanner;

public class LuckyMe {

    public static void main(String[] args) {

        LuckyCalculator luckyCalculator = new LuckyCalculator();
        System.out.println("ENTER YOUR BIRTHDATE IN FORMAT : DD-MM-YYYY ");

        Scanner scanner = new Scanner(System.in);
        String birthdate = scanner.next();

        System.out.println("Your lucky number is : " + luckyCalculator.calculateMyLuckyNumber(birthdate));

    }
}
