public class BandageHealing {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int hp = health;
        int t = 0;

        for (int i = 0; i < attacks.length; i++) {
            int h1 = attacks[i][0] - t - 1;
            int h2 = h1 / bandage[0];

            t = attacks[i][0];

            hp = Math.min(health, hp + h1 * bandage[1]);
            hp = Math.min(health, hp + h2 * bandage[2]);

            hp -= attacks[i][1];

            if (hp <= 0) {
                return -1;
            }
        }

        return hp;
    }
}
