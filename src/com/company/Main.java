package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j = j - 1) {
            System.out.print(j + " ");
        }
        System.out.println();

        int firstFriday = 7;
        for (int k = firstFriday; k <= 31; k = k + 7) {
            System.out.println("Сегодня пятница, " + k + "-е число. Необходимо сдать отчет.");
        }

        int currentYear = 2022;
        int ago200 = currentYear - 200;
        int in100 = currentYear + 100;
        int periodOfComet = 79;
        int yearOfComet = 0;
        while (yearOfComet < ago200) {
            yearOfComet = yearOfComet + periodOfComet;
        }
        System.out.println(yearOfComet);
        yearOfComet = yearOfComet + periodOfComet;
        for (int k = yearOfComet; yearOfComet < in100; yearOfComet = yearOfComet + periodOfComet) {
            System.out.println(yearOfComet);
        }
    }
}
