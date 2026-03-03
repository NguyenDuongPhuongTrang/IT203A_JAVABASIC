public class Bai3_CapSoCoTongBangK {
    public static void main(String[] args) {
        int[] arr = {2,11,15};
        int k = 9;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length - 1; j++){
                if(arr[i] + arr[j] == k){
                    flag = false;
                    System.out.println("Cap tim duoc: " + arr[i] + " và " + arr[j]);
                    break;
                }
            }
        }
        if (flag){
            System.out.println("Không tồn tại cặp");
        }
    }
}
