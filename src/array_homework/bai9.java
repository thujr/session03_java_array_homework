package array_homework;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập Email: ");
        String email = scanner.nextLine();
        if (isEmail(email)) {
            System.out.println("Email hợp lệ");
        }else{
            System.out.println("Email không hợp lệ");
        }
        System.out.println("Mời nhập mật khẩu: ");
        String password = scanner.nextLine();
        if (isPassword(password)){
            System.out.println("Mật khẩu hợp lệ: ");
        }else{
            System.out.println("Mật khẩu không hợp lệ");
        }
    }
    public static boolean isEmail(String email) {
        String emailRegex="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
        return email.matches(emailRegex);
    }
    public static boolean isPassword(String password) {
       return !password.isEmpty() && password.length() > 6 ;
    }
}
