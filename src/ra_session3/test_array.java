package ra_session3;

import java.util.Scanner;

public class test_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[n];

        do {
            System.out.println("\n Menu:");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2.In giá trị các phần tử");
            System.out.println("3.TÍnh tổng các phần tử");
            System.out.println("4. In các phần tử có giá trị lẻ trong mảng");
            System.out.println("5.In các phàn tử có chỉ số chẵn trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần");
            System.out.println("7. Thoát");
            System.out.println("Lựa chọn của bạn");
            int choice =Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("NHập giá trị các phần tử");
                    for (int i = 0; i < arrInt.length; i++) {
                        System.out.printf("arrInt[%d]=", i);
                        arrInt[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("In các phần tử trong mảng");
                    for (int element:arrInt) {
                       System.out.printf("%d\t",element);
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum=0;
                    for (int i = 0; i < arrInt.length; i++) {
                        sum+=arrInt[i];
                    }
                    System.out.println("Tổng các phần tử trong mảng là "+sum);
                    break;
                case 4:
                    System.out.println("Các phần tử có giá trị lẻ trong bảng");
                    for (int i = 0; i < arrInt.length; i++) {
                        if (arrInt[i]%2!=0){
                            System.out.printf("%d\t",arrInt[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("các phần tử có chỉ số chẵn");
                    for (int i = 0; i < arrInt.length; i++) {
                        if (i%2==0) {
                            System.out.printf("%d",arrInt[i]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 6:
                    for (int i = 0; i < arrInt.length-1; i++) {
                        for (int j = i; j < arrInt.length; j++) {
                            if (arrInt[i]>arrInt[j]) {
                                int temp=arrInt[i];
                                arrInt[i]=arrInt[j];
                                arrInt[j]=temp;
                            }
                        }
                    }
                    System.out.println("Mảng đã được sắp xếp tăng dần");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-7");
            }
        } while (true);
    }
}
