public class ColaProblem {
    public int solution(int a, int b, int n) {
        return swap(n, a, b);
    }

    public int swap(int n, int a, int b) {
        int change = n / a;
        int bottle = change * b;

        if (n < a) {
            return 0;
        }

        return bottle + swap(n - change * a + bottle, a, b);
    }
}
