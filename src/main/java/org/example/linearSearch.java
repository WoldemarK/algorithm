package org.example;

public class linearSearch {
    public static void main(String[] args) {
        System.out.println
                (linearSearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67));
    }

    public static int linearSearch(int arr[], int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }
}
