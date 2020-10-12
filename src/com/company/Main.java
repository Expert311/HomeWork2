package com.company;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday = 1991;
        int monthOfBirthday = 7;
        int dayOfBirthday = 2;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения:" + " " + sum);
        boolean monthBiggerDay = monthOfBirthday > dayOfBirthday;
        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
        char[] nameLetter = new char[5];
        nameLetter[0] = 'А';
        nameLetter[1] = 'р';
        nameLetter[2] = 'т';
        nameLetter[3] = 'ё';
        nameLetter[4] = 'м';
        System.out.print("Массив с моим именем: ");
        System.out.println(nameLetter);
        double myAge = 29;
        double partYear = 3.0 / 12.0;
        System.out.println("Мне " + (myAge + partYear));
    }

}
