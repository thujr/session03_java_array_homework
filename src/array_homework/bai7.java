package array_homework;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi chính: ");
        String mainStr=scanner.nextLine();
        System.out.println("Nhập chuõi cần kiểm tra");
        String checkStr=scanner.nextLine();
//        sử dụng phương thức contains() của lớp String
        if (mainStr.contains(checkStr)) {
            System.out.println(mainStr+" chứa "+checkStr);
        }else{
            System.out.println(mainStr+" không chứa" + checkStr);
        }
    }
}
