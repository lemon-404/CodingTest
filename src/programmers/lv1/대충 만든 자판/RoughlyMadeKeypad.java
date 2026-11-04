import java.util.Arrays;

public class RoughlyMadeKeypad {
    public int[] solution(String[] keymap, String[] targets) {
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, 101);

        int[] result = new int[targets.length];

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                int index = c - 'A';

                alphabet[index] = Math.min(alphabet[index], j + 1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int pushSum = 0;

            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                int index = c - 'A';

                if (alphabet[index] == 101) {
                    pushSum = -1;
                    break;
                }

                pushSum += alphabet[index];
            }

            result[i] = pushSum;
        }

        return result;
    }
}
