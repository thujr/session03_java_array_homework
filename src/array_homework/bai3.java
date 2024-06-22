package array_homework;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng 1: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Nhập các giá trị phần tử trong mảng 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d]= ", i);
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Mảng 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%5d", arr1[i]);
        }
        System.out.println();
        System.out.println("Nhập số lượng phần tử mảng 2: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Nhập các giá trj phần tử trong mảng 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d]= ", i);
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Mảng 2: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%5d", arr2[i]);
        }
        System.out.println();
        int n3 = n1 + n2;
        int[] arr3 = new int[n3];
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr3[n1+i] = arr2[i];
        }
        System.out.println("Mảng sau khi gộp: ");
        for (int i = 0; i < n3; i++) {
            System.out.printf("%5d",arr3[i]);
        }
        System.out.println();
    }
}
