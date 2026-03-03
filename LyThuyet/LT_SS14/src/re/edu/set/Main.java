package re.edu.set;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //SET kế thừa COLLECTION
        //SET không lưu tữ phần tử trùng lặp
        //4 lớp triển khai:
        //HashSet: không xác định thứ tự lưu trữ
        //LinkedHashSet: sắp xếp theo vị trí chèn
        //TreeSet: các phần tử được SẮP XẾP TĂNG DẦN theo thứ tự tự nhiên hoặc Comparator
        //EnumSet: Nhẹ và nhanh (chỉ nhanh khi tìm kiếm, ít khi dùng), là hằng, không thay đổi dc
        //Set<Integer> set = new HashSet<>();
        //Set<Integer> set = new LinkedHashSet<>();
        //Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        Set<Sex> set = EnumSet.of(Sex.MALE, Sex.FEMALE, Sex.OTHER);
        System.out.println(set);

        // Các phương thức làm việc
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(1); // giá trị gống nhau sẽ không được lưu

        // duyệt SET
        //duyệt bằng for
        for (Integer values: set1){};
        // duyệt bằng iterator
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()){
            //làm việc với phần tử
            Integer values = iterator.next();
        }
    }
}