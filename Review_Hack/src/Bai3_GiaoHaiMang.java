import java.util.Scanner;
public class Bai3_GiaoHaiMang {
    // Ham kiem tra gia tri da ton tai trong mang chua
    public static boolean isExist(int[] arr, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Nhap mang A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        int[] B = new int[m];
        System.out.println("Nhap mang B:");
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        int[] result = new int[n];
        int k = 0;
        // Tim giao
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    // Kiem tra da in chua
                    if (!isExist(result, k, A[i])) {
                        result[k] = A[i];
                        k++;
                    }
                }
            }
        }
        System.out.println("Giao cua hai mang:");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}