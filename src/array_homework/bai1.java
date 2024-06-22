package array_homework;

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10,4,6,7,8,6,0,0,0,0};
        System.out.println("Value:"+ Arrays.toString(array));
        System.out.print("Nhập phần tử muốn xóa: ");
        int elementDelete=Integer.parseInt(scanner.nextLine());
        int indexDelete=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==elementDelete){
                indexDelete=i;
                break;
            }
        }
        if(indexDelete==-1){
            System.out.println("Không tồn tại "+elementDelete+" trong mảng array");
        }else{
            for(int i=indexDelete;i<array.length-1;i++){
                array[i]=array[i+1];

            }
            System.out.println("New Value: "+Arrays.toString(array));

        }
    }
}
