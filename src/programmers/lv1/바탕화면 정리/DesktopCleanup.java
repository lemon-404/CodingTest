public class DesktopCleanup {
    public int[] solution(String[] wallpaper) {
        // 1. wallpaper를 2차원 배열로 변환
        String[][] coordinates = new String[wallpaper.length][wallpaper[0].length()];

        for (int i = 0; i < wallpaper.length; i++) {
            coordinates[i] = wallpaper[i].split("");
        }

        // 2. 시작점 S와 끝점 E 초기화
        int[] s = {coordinates.length, coordinates[0].length};
        int[] e = {0, 0};

        // 3. 2차원 배열 순회
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                if (coordinates[i][j].equals("#")) {
                    // S 좌표 비교
                    if (i < s[0]) s[0] = i;
                    if (j < s[1]) s[1] = j;

                    // E 좌표 비교
                    if (i + 1 > e[0]) e[0] = i + 1;
                    if (j + 1 > e[1]) e[1] = j + 1;
                }
            }
        }

        // 4. 결과 반환
        int[] answer = {s[0], s[1], e[0], e[1]};
        return answer;
    }
}
