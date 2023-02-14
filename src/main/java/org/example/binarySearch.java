package org.example;

public class binarySearch {
    public static void main(String[] args) {
        System.out.println
                (binarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67));

    }

    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {

            int middleIndex = (firstIndex + lastIndex) / 2;

            if (arr[middleIndex] == elementToSearch)
                return middleIndex;

            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;
        }
        return -1;
    }
}
