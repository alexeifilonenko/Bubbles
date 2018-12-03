package com.company;

import com.company.sorter.Sorter;

import java.util.Random;

                    //1. Создал пустой массив
                    //2. Заполнил его слкчайными значениями
                    //3. Вывел эти случайные значения, как исходный массив
                    //4. Отсортировал этот массив
                    //5. Присвоил этому же массиву уже отсортированные значения

public class Main {

    public static void main(String[] args) {
	int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);                     //выводим начальный массив
        }

        Sorter sorter = new Sorter(arr);                    //создаем экземпляр класс Sorter, в который передаем наш массив
        arr = sorter.bubbleSortUp();                        //отсортировал массив и присвоил эти значиния исходному массиву
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);                     //выводим отсортированный массив
        }

        arr = sorter.bubbleSortDown();                      //отсортировал массив и присвоил эти значиния исходному массиву
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);                     //выводим отсортированный массив
        }
        System.out.println();
        arr = sorter.showMinMaxArr(20, 75);
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);                     //выводим отсортированный массив
        }

    }
}


