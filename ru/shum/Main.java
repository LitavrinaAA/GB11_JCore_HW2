package ru.shum;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 3, 4, 8, 9, 3, 0};
        int[] arr2 = {2, 2, 0, 0, 2, 3, 8, 0, 0, 0};
        int[] arr3 = {1, 3, 5, 3, 33, 0, 333, 0};

        printResult(arr1, "Количество чётных элементов", CountEvens.countEvens(arr1));
        printResult(arr2, "Количество чётных элементов", CountEvens.countEvens(arr2));
        printResult(arr3, "Количество чётных элементов", CountEvens.countEvens(arr3));

    System.out.println();

    printResult(arr1, "Разница между мин. и макс.", FindDifference.findDifference(arr1));
    printResult(arr2, "Разница между мин. и макс.", FindDifference.findDifference(arr2));
    printResult(arr3, "Разница между мин. и макс.", FindDifference.findDifference(arr3));

    System.out.println();

    printResult(arr1, "Имеются ли два соседних элемента, с нулевым значением",
        HasZeroNeighbors.hasZeroNeighbors(arr1));
    printResult(arr2, "Имеются ли два соседних элемента, с нулевым значением",
        HasZeroNeighbors.hasZeroNeighbors(arr2));
    printResult(arr3, "Имеются ли два соседних элемента, с нулевым значением",
        HasZeroNeighbors.hasZeroNeighbors(arr3));

    }

    /**
     * Метод для печати результатов
     *
     * @param arrayOfNums Массив
     * @param message     Содержит сообщение какая операция была выполнена
     * @param result      Содержит результат выполненной операции
     */
    public static void printResult(int[] arrayOfNums, String message, Object result) {
        String printMessage = Arrays.toString(arrayOfNums) +
                " " +
                message +
                ":" +
                result;
        System.out.println(printMessage);

    }

}
