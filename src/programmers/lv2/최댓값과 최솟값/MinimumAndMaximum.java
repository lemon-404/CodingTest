public class MinimumAndMaximum {
    public String solution(String s) {
        String answer = "";

        int maximum=Integer.MIN_VALUE;
        int minimum=Integer.MAX_VALUE;

        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            int n = Integer.parseInt(split[i]);

            if (n > maximum) {
                maximum = n;
            }
            if (n < minimum) {
                minimum=n;
            }
        }
        answer = String.format("%d %d", minimum, maximum);  //String format하는 방법 잘 기억이 안낫음  String.format() 또는 minimum + " " + maximum 사용 가능
        return answer;
    }
}
