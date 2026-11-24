public class FoodFightCompetition {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int qt = food[i] / 2;

            for (int j = 0; j < qt; j++) {
                left.append(i);
            }

            // Java 11 이상에서는 위 반복문을 repeat()로 대체 가능
            // left.append(String.valueOf(i).repeat(qt));
        }

        String answer = left + "0";

        return answer + left.reverse();
    }
}
