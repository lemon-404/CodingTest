import java.util.Arrays;

public class Park {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);

        int rows = park.length;
        int cols = park[0].length;

        // 가장 큰 돗자리부터 검사
        for (int m = mats.length - 1; m >= 0; m--) {
            int size = mats[m];

            // 돗자리를 놓을 시작 좌표 탐색
            for (int i = 0; i <= rows - size; i++) {
                for (int j = 0; j <= cols - size; j++) {
                    boolean possible = true;

                    // 정사각형 내부의 모든 칸 검사
                    for (int k = 0; k < size; k++) {
                        for (int h = 0; h < size; h++) {
                            if (!park[i + k][j + h].equals("-1")) {
                                possible = false;
                                break;
                            }
                        }

                        if (!possible) break;
                    }

                    // 배치 가능한 가장 큰 돗자리 반환
                    if (possible) {
                        return size;
                    }
                }
            }
        }

        return -1;
    }
}
