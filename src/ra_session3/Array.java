package ra_session3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        Khai báo mảng số nguyên 1 chiều
//        Syntax: Datatype[] arrayName=new Datatype[size];
        int[] numbers = new int[10];
        String[] studentNames = {"mai","hoa","thu"};
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;
//        In giá trị các phần tử trong mảng studentNames
        for (int i = 0; i <studentNames.length; i++) {
            System.out.printf("%s\t",studentNames[i]);
        }
        System.out.println();
//        Nhập sô phần tử của mảng số nguyên (n) và khai váo số nguyên n phần tử
//        nhập các giá trị của mảng từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <array.length; i++) {
            System.out.printf("%s\t", studentNames[i]);
            array[i] = sc.nextInt();
        }
        System.out.println("Cấc phân tử chẵn trong mảng");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                System.out.printf("%s\t", studentNames[i]);

            }
            System.out.printf("%s\t", array[i]);
        }
    }

}
