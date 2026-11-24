public class DivisorCountAndSum {
    public int solution(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);

            if (sqrt * sqrt == i) {
                result -= i;
            } else {
                result += i;
            }
        }

        return result;
    }
}
