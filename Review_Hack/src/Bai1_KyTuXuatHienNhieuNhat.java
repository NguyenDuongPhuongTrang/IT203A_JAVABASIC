import java.util.Scanner;
public class Bai1_KyTuXuatHienNhieuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine().toLowerCase();
        int maxCount = 0;
        char result = ' ';
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int count = 0;
                // Dem so lan xuat hien
                for (int j = 0; j < input.length(); j++) {
                    if (c == input.charAt(j)) {
                        count++;
                    }
                }
                // Neu lon hon max thi cap nhat
                if (count > maxCount) {
                    maxCount = count;
                    result = c;
                }
            }
        }
        System.out.println(result + " (xuat hien " + maxCount + " lan)");
        sc.close();
    }
}