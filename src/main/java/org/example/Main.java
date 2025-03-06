package org.example;

import java.util.Arrays;

//Необходимо реализовать следующий метод:
//Получаем на входе массив чисел.
//Все четные числа увеличиваем на единицу.
//Возвращаем кусок списка с 3-го по 7-й элемент.

public class Main {
    public static void main(String[] args) {

        int[] myArray = {10, 13, 8, 4, 3, 19, 32, 43, 65};
        int[] array = myMethod(myArray);
        Arrays.stream(array)
                .forEach(System.out::println);

    }

    public static int[] myMethod(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = numbers[i] + 1;
            }
        }

        return Arrays.stream(numbers)
                .skip(2)
                .limit(5)
                .toArray();
    }
}