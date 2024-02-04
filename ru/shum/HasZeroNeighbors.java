package ru.shum;

public class HasZeroNeighbors {
  /**
   * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с
   * нулевым значением.
   *
   * @param arrayOfNums Принимает массив
   * @return Возвращает true или false
   */
  public static boolean hasZeroNeighbors(int[] arrayOfNums) {
    if (arrayOfNums.length < 2) {
      return false;
    }

    for (int i = 0; i < arrayOfNums.length - 1; i++) {
      if (arrayOfNums[i] == 0 && arrayOfNums[i + 1] == 0) {
        return true;
      }
    }
    return false;
  }

}
