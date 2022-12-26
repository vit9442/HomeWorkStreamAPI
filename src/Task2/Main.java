package Task2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(String[] args) {

        //Задание2.	Напишите метод, который на вход принимает целое число(количество зарплат) и возвращает список вещественных чисел,
        // состоящих из случайных зарплат, распределенных по закону нормального распределения.
        // Примечание: У нормального распределения есть два параметра: mean(среднее значение) и std(среднее отклонение).
        // У класса Random есть метод nextGaussian(), который генерирует нормально распределенное число с параметрами mean=0, std=1.
        // Для генерации зарплат попробуйте параметры: std = 11190, mean = 29267(можете поподбирать свои).
        // Используйте такую формулу генерации: случайная зарплата = nextGaussian() * std + mean.
        System.out.println("Задание2.\nслучайно распределённые зарплаты:");
        List<Double> salary = randomSalary(10);
        salary.forEach(System.out::println);
    }

    public static List<Double> randomSalary (int amoutSalary){
        Random random =new Random();

        List<Double> salary = DoubleStream.generate(() -> random.nextGaussian()*11190 + 29267)
                .boxed()
                .limit(amoutSalary)
                .collect(Collectors.toList());

        return salary;
    }

}
