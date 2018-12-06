package com.company;

import com.company.sorter.Sorter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

//1. Создал пустой массив
//2. Заполнил его слкчайными значениями
//3. Вывел эти случайные значения, как исходный массив
//4. Отсортировал этот массив
//5. Присвоил этому же массиву уже отсортированные значения

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);        // метод, позволяющий ввод данных с клавиатуры

        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);                     //выводим начальный массив
        }

        Sorter sorter = new Sorter(arr);                    //создаем экземпляр класс Sorter, в который передаем наш массив
        arr = sorter.bubbleSortUp();                        //отсортировал массив и присвоил эти значиния исходному массиву
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);                     //выводим отсортированный массив по возрастанию
        }

        arr = sorter.bubbleSortDown();                      //отсортировал массив и присвоил эти значиния исходному массиву
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);                     //выводим отсортированный массив по убыванию
        }
        System.out.println();

        // Вывод массива, который сортируется в пределах двух чисел, вводимых с клавиатура
        System.out.println(">> Введите х: ");
        int x = in.nextInt();

        System.out.println(">> Введите y: ");
        int y = in.nextInt();

        System.out.println("Отсортированный массив в пределе от " + x + " до " + y);
        arr = sorter.showMinMaxArr(x, y);

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);                     //выводим отсортированный массив
        }

    }
}


