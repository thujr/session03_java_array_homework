package array_homework;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi 1");
        String str1=sc.nextLine();
        System.out.println("Nhập chuỗi 2");
        String str2=sc.nextLine();
//        concat là phương thức nối chuỗi trong String
        String result=str1.concat(" ").concat(str2);
        System.out.println("Kết quả sau khi nối chuỗi: "+result);
    }
}
