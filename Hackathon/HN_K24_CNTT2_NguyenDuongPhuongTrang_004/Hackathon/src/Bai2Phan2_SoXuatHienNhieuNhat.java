import java.util.Scanner;

public class Bai2Phan2_SoXuatHienNhieuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        System.out.println("Nhập phần tử của mảng: ");
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Mảng hiện tại: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        int maxCount = 0;
        int number = 0;
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = i; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > maxCount){
                maxCount = count;
                number = arr[i];
            }
        }
        System.out.println("\nSố xuất hiện nhiều nhất: " + number);
        System.out.println("Số lần: " + maxCount);
    }
}
