package ru.shum;

public class FindDifference {
  /**
   * Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
   * переданного не пустого массива.
   *
   * @param arrayOfNums Принимает массив
   * @return Возвращаем разницу между максимальным и минимальным элементами
   */
  public static int findDifference(int[] arrayOfNums) {
    if (arrayOfNums.length <= 1) {
      return 0;
    }

    int max = arrayOfNums[0];
    int min = arrayOfNums[0];

    for (int num : arrayOfNums) {
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
    }

    return max - min;
  }

}
