import java.util.*;

public class DataAnalysis {
    public int[][] solution(int[][] data, String ext,
                            int val_ext, String sort_by) {

        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        int sortIndex = map.get(sort_by);

        TreeSet<int[]> set = new TreeSet<>(
            Comparator.comparingInt(arr -> arr[sortIndex])
        );

        for (int i = 0; i < data.length; i++) {
            int fragment = data[i][map.get(ext)];

            if (fragment < val_ext) {
                set.add(data[i]);
            }
        }

        return set.toArray(new int[0][]);
    }
}
