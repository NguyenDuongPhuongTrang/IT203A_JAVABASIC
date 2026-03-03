import java.util.Scanner;

public class Bai2Phan1_MangDoiXung {
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
        int start = 0;
        int end = arr.length - 1;
        boolean flag = true;
        while (start < end){
            if (arr[start] != arr[end]){
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if (flag){
            System.out.println("\nMảng đối xứng");
        }else {
            System.out.println("\nMảng không đối xứng");
        }
    }
}
