import java.util.Scanner;

public class Bai2_XoaVaDichTrai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhap gia tri x can xoa: ");
        int x = sc.nextInt();
        int k = 0; // chi so moi
        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println("Mang sau khi xoa:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nKich thuoc moi: " + k);
        sc.close();
    }
}