package com.java.Practice;
import java.util.Scanner;
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
        Scanner input = new Scanner(System.in);
        House h1 = new House();
        System.out.print("Enter the number of houses available");
        int size = input.nextInt();
        System.out.print("\nEnter the budget available");
        int budget = input.nextInt();
        int[] array = new int[size];
        System.out.print("\nEnter the elements of the array");
        for(int i=0; i<size; i++) {
            array = input.nextInt();
        }
        h1.sortArray(array, size);
        int number = h1.setCount(array, size, budget);
        System.out.print("\nThe number of houses that can be bought within the budget is "+number);
    }
}
