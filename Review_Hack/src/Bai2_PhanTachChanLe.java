import java.util.Scanner;
public class Bai2_PhanTachChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        while (left < right) {
            // Tim so le ben trai
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            // Tim so chan ben phai
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            // Hoan doi
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        System.out.println("Mang sau khi phan tach:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}