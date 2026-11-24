import java.util.Arrays;

public class SortStringDescending {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        String result = new StringBuilder(new String(arr))
                .reverse()
                .toString();

        return result;
    }
}
