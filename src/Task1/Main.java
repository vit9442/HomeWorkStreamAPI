package Task1;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //Задание 1. Напишите метод, который на вход принимает диапазон лет, возвращает список високосных годов в этом диапазоне.
        // Примечание: год високосный если он делится на 400 или делится на 4 при этом не делясь на 100.
        int yearStart = 1970; // начальный диапазон года
        int yearEnd = 2022;     // конечный диапазон года

        List<Integer> leapY = leapYear(yearStart, yearEnd); // Возвращает список високосных годов в диапазоне
        System.out.println("Задание1.\nВисокосные года в промежутке от " + yearStart + " до " + yearEnd + ": ");
        leapY.forEach(System.out::println);
        }


    public static List<Integer> leapYear(int yearStart, int yearEnd) { // Возвращает список високосных годов в диапазоне

        List<Integer> leapY = IntStream.rangeClosed(yearStart, yearEnd)
                .filter(n -> n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
                .boxed()
                .collect(Collectors.toList());
        return leapY;
    }


}

