import java.util.Scanner;

public class Bai1Phan1_DemKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        int countLetter = 0;
        int countNumber = 0;
        int countSpecial = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLetter(c)) {
                countLetter++;
            } else if (Character.isDigit(c)) {
                countNumber++;
            }else countSpecial++;
        }
        System.out.println("Chu cai: " + countLetter + "\nChu so: " + countNumber + "\nKy tu dac biet: " + countSpecial);
        sc.close();
    }
}
