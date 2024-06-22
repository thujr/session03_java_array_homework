package array_homework;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột trong mảng 2 chiều ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số hàng trong mảng 2 chiêu");
        int cols = Integer.parseInt(sc.nextLine());
        int[][] array = new int[rows][cols];
        System.out.println("Nhập số phần tử trong ma trận");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("array[%d][%d]", i, j);
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
            System.out.println();
        }
        System.out.println("Mảng: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
        int maxValue = array[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: "+maxValue);
    }
}



