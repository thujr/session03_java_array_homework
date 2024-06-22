package ra_session3;

import java.util.Scanner;

public class Array_Two_UD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cột trong mảng 2 chiều");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số dòng trong mảng 2 chiều");
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[rows][cols];
        do {
            System.out.println("*********MENU***************");
            System.out.println("1.Nhập giá trị các phần tử");
            System.out.println("2.In giá trị các phần tử theo ma trận");
            System.out.println("3.In giá trị các phần tử nằm trên đường biên của ma trânj");
            System.out.println("4.In tổng các phần tử chia hết cho 3");
            System.out.println("5.In ra các phần tử trên đường chéo chính và chéo phụ của mảng và tính tổng");
            System.out.println("6.Sắp xếp các dòng giảm dần");
            System.out.println("7.Thoát");
            System.out.println("Lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị các phần tử");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.printf("arr[%d][%d]", i, j);
                            arr[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.printf("%5d", arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                                System.out.printf("%5d", arr[i][j]);
                            } else {
                                System.out.printf("%5s", " ");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case 4:
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (arr[i][j] % 3 == 0) {
                                sum += arr[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử chia hết cho 3 là " + sum);
                    break;
                case 5:
                    if (rows != cols) {
                        System.out.println("Mảng không phải ma trận vuông");
                        break;
                    }
                    int sum1 = 0;
                    int sum2 = 0;
                    System.out.print("Phần tử trên đường chéo chính");
                    for (int i = 0; i < rows; i++) {
                        System.out.print(arr[i][i] + "");
                        sum1 += arr[i][i];
                    }
                    System.out.println("\n Tổng các phần tử trên đường chéo chính là:" + sum1);
                    System.out.print("Phần tử trên đường chéo phụ ");
                    for (int i = 0; i < rows; i++) {
                        System.out.print(arr[i][cols-1-i] + "");
                        sum2 += arr[i][cols-1-i];
                    }
                    System.out.println("\n Tổng các phần tử trên đường chéo phụ là:" + sum2);
                    break;
                case 6:
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            for (int k = j+1; k < cols; k++) {
                                if (arr[i][j]>arr[i][k]) {
                                        int temp=arr[i][j];
                                        arr[i][j]=arr[i][k];
                                        arr[i][k]=temp;
                                }
                            }
                        }
                    }
                    System.out.println("Mảng 2 chiều sau khi sắp xếp");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.printf("%5d", arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-7");
            }

        } while (true);
    }
}
