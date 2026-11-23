public class KnightWeapon {
    public int solution(int number, int limit, int power) {
        int result = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;

            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;

                    if (j * j != i) {
                        count++;
                    }
                }
            }

            if (count > limit) {
                count = power;
            }
            result += count;
        }

        return result;
    }
}
