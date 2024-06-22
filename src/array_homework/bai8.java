package array_homework;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mỗi chuỗi");
        String str = scanner.nextLine();
        String trim = trimExtraSpace(str);
        System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa: \"" + trim + "\"");
    }
    public static String trimExtraSpace(String str) {
        String trim = str.trim();
        return trim;

    }
}
