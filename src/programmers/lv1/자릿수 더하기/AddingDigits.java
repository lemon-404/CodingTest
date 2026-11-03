import java.util.Arrays;

public class AddingDigits {
    public int solution(int n) {
        int answer=0;
        String[] split = String.valueOf(n).split("");
        answer = Arrays.stream(split).mapToInt(Integer::parseInt).sum();

        return answer;
    }
}
