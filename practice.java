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
            int cases, n=0;
            System.out.print("\nEnter the number of test cases available");
            cases = input.nextInt();
            do {
            House h1 = new House();
            System.out.print("\nEnter the number of houses available ");
            int size = input.nextInt();
            System.out.print("\nEnter the budget available ");
            int budget = input.nextInt();
            int[] array = new int[size];
            System.out.print("\nEnter the price of the houses");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }
            h1.sortArray(array, size);
            int number = h1.setCount(array, size, budget);
            System.out.print("\nCase#"+(n+1)+": "+number);
            n++;
        } while(n<cases);
    }
}