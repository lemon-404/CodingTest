public class RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        if (arr.length < 2) {
            return new int[]{-1};
        }

        int[] result = new int[arr.length - 1];
        int minIndex = 0;

        // 최솟값의 인덱스 탐색
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // 최솟값을 제외한 요소 삽입
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == minIndex) {
                continue;
            }

            result[index++] = arr[i];
        }

        return result;
    }
}
