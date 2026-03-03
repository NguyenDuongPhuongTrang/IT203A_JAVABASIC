import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        //tạo 100 số ngẫu nhin từ 0 - 1000
        for (int i = 0; i < 100; i++){
            int num = (int) (Math.random() * 1000);
            nums.add(num);
        }
        //Loại bỏ trùng lặp
        Set<Integer> ListNotDuplicate = new HashSet<>(nums);
        for (Integer num : ListNotDuplicate){
            System.out.println(num);
        }
        // đếm số lần xuất hiện của các phần tử
        Map<Integer, Integer> frequency = new HashMap<>();
        for (Integer num: nums){
            if (frequency.containsKey(num)){
                frequency.put(num, frequency.get(num) + 1);
            }else {
                frequency.put(num, 1);
            }
        }
        // in ra kết quả
        for (Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }
    }
}