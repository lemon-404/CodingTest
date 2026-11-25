public class CountPAndY {
    boolean solution(String s) {
        boolean result = false;
        int pCount = 0;
        int yCount = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case 'p':
                    pCount++;
                    break;
                case 'y':
                    yCount++;
                    break;
            }
        }

        return pCount == yCount ? true : false;
    }
}
