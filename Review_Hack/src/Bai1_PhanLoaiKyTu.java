import java.util.Scanner;
public class Bai1_PhanLoaiKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();
        String nguyenAm = "";
        String phuAm = "";
        // Duyet tung ky tu trong chuoi
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Kiem tra co phai chu cai khong
            if (Character.isLetter(c)) {
                // Dua ve chu thuong
                c = Character.toLowerCase(c);
                // Kiem tra nguyen am
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    nguyenAm += c;
                } else {
                    phuAm += c;
                }
            }
        }
        System.out.println("Nguyen am: " + nguyenAm);
        System.out.println("Phu am: " + phuAm);
        sc.close();
    }
}