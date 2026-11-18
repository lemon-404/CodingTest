public class BillFolding {
    public int solution(int[] wallet, int[] bill) {
        int result = 0;
        int x = wallet[0];
        int y = wallet[1];

        while (!((bill[0] <= x && bill[1] <= y) ||
                 (bill[0] <= y && bill[1] <= x))) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }

            result++;
        }

        return result;
    }
}
