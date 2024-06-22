package array_homework;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng");
        int n=Integer.parseInt(scanner.nextLine());
        int[]arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]",i);
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là :"+min);
    }
}

