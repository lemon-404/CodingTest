import java.util.ArrayList;
import java.util.List;

public class RemoveConsecutiveDuplicates {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.size() == 0 || list.get(list.size()-1)!=arr[i]) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
