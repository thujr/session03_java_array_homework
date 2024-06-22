package array_homework;

import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử mảng");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] ", i);
            arr[i] = Integer.parseInt(sc.next());
        }
        System.out.println("Nhập giá trị cần thêm");
        int X = sc.nextInt();
        System.out.println("Nhập vị trị index cần chèn X ( từ 0 đến " + (arr.length - 1) + "):");
        int index = sc.nextInt();
        if (index < 0 || index >= arr.length) {
            System.out.println("Không thể chèn phần tử và mảng với vị trị " + index);
        } else {
//            di chuyển các phần tử sang phải để tạo khoảng trống cho X
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = X;
            System.out.println("New value:" + Arrays.toString(arr));
        }
    }
}
