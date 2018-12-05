package com.company.sorter;

public class Sorter {
    private int[] arr;                      //создаем поле массива

    public Sorter(int[] arr) {              //создаем контсруктор, в параметр которго передаем поле массива
        this.arr = arr;
    }

    //метод, который меняет местами два соседних элемента
    private void swap(int[] arr, int index) {   //в метод передаем массив и индекс
        int temp = arr[index - 1];                        //сохраняем значение самого крайнего элемента (newArr[j - 1])
        arr[index - 1] = arr[index];            //крайнему элементу присваиваем значение следующего элемента
        arr[index] = temp;                      //элемент слева должен равняться тому элементу, который мы уже затерли

    }


    //создаем метод сортировки массива методом пузырьков по возрастанию
    public int[] bubbleSortUp() {
        int[] newArr = arr.clone();                 //создаем новый массив, к которому будем применять метод сортировки
        for (int i = 1; i < newArr.length; i++) {       //цикл, который ходит от 2го элемента до последнего
            for (int j = newArr.length - 1; j >= i; j--) {    //цикл, который будет ходит по парам
                if (newArr[j - 1] > newArr[j])
                    swap(newArr, j);          //если элемент, который стоит левее больше, чем элемент справо от него - то мы меняем их местами
            }
        }
        return newArr;
    }

    //создаем метод сортировки массива методом пузырьков по убыванию
    public int[] bubbleSortDown() {
        int[] newArr1 = arr.clone();                 //создаем новый массив, к которому будем применять метод сортировки
        for (int i = 1; i < newArr1.length; i++) {       //цикл, который ходит от 2го элемента до последнего
            for (int j = newArr1.length - 1; j >= i; j--) {    //цикл, который будет ходит по парам
                if (newArr1[j - 1] < newArr1[j])
                    swap(newArr1, j);          //если элемент, который стоит левее больше, чем элемент справо от него - то мы меняем их местами
            }
        }
        return newArr1;
    }

    public int[] showMinMaxArr(int minNumber, int maxNumber) {
        int[] newArr2 = arr.clone();
        for (int i = 0; i < newArr2.length; i++) {
            int currentNumber = newArr2[i];
            if (minNumber < currentNumber && currentNumber < maxNumber) {
                System.out.println(newArr2[i]);
            }
        }
        return newArr2;
    }
}
