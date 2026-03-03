package re.edu.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // MAP lưu cặp key - value (key - kháo là 1 SET<key>: không được trùng lặp), giống CLASS
        // MAP tương tự SET

        //4 lớp triển khai
        //HashMap
        //LinkedHashMap
        //TreeMap
        //EnumMap

        Map<String, String> dictionary = new HashMap<>();

        //Các phương thức làm việc
        dictionary.put("apple", "táo"); // Thêm hoặc sửa
        dictionary.put("aplle", "bưởi"); // Nếu tồn tại từ khóa rồi thì sẽ là sửa
        dictionary.remove("apple"); // Xóa theo từ khóa
        String value = dictionary.get("apple"); // chỉ lấy được giá trị theo từ khóa chứ k lấy đự ngược lại vì 1 giá trị có thể có nhiều key
        dictionary.containsKey("apple"); // trả về có hoặc không, kiểm tra xe từ khóa tồn tại không
        dictionary.containsValue("táo"); //kiểm tra xem giá trị tồn tại không

        //duyệt collection
        // 3 cách duyệt
        // theo key
        for (String key : dictionary.keySet()){
            //làm việc với key
        }

        // theo values
        for (String values : dictionary.values()){
            //làm viêc với value
        }

        // theo cả 2
        for (Map.Entry<String, String> entry: dictionary.entrySet()){
            // làm việc
            String key = entry.getKey();
            String values = entry.getValue();
        }
    }
}
