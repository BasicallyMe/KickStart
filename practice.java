package com.java.Practice;

class House {
    int count=0;
    void sortArray(int[] array, int size) {
        int min = 0;
        for (int i = 0; i < size-1; i++) {
            min = i;
            for (int j = i+1; j < size; j++) {
                if (array[j]<array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    int setCount(int[] array, int size, int budget) {
        int sum=0;
        for (int i = 0; i < size; i++) {
           sum+=array[i];
           if(sum<=budget) {
               count++;
           }
        }
        return count;
    }

}
class Calc {
    public static void main(String[] args) {
        House h1 = new House();
        int size = 4;
        int budget = 100;
        int[] array = {20,90,40,90};
        h1.sortArray(array, size);
        int number = h1.setCount(array, size, budget);
        System.out.print("\nThe number of houses that can be bought within the budget is "+number);
    }
}