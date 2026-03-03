import java.util.Scanner;

public class Bai1Phan2_ChuoiDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        StringBuilder newStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            newStr.append(str.charAt(i));
        }
        if (str.equals(newStr.toString())){
            System.out.println("Chuỗi đối xứng");
        }else {
            System.out.println("Không phải chuỗi đối xứng");
        }
    }
}
