public class VideoPlayer {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int now = toSeconds(pos);
        int ops = toSeconds(op_start);
        int ope = toSeconds(op_end);
        int limit = toSeconds(video_len);

        now = skipOpening(now, ops, ope);

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "next":
                    now += 10;
                    if (now > limit) {
                        now = limit;
                    }
                    break;

                case "prev":
                    now -= 10;
                    if (now < 0) {
                        now = 0;
                    }
                    break;
            }

            now = skipOpening(now, ops, ope);
        }

        String result = toFormat(now);
        return result;
    }

    private int toSeconds(String format) {
        String[] time = format.split(":");

        int mm = Integer.parseInt(time[0]);
        int ss = Integer.parseInt(time[1]);

        return mm * 60 + ss;
    }

    private String toFormat(int seconds) {
        int mm = seconds / 60;
        int ss = seconds % 60;

        return String.format("%02d:%02d", mm, ss);
    }

    private int skipOpening(int now, int ops, int ope) {
        if (now >= ops && now <= ope) {
            now = ope;
        }

        return now;
    }
}
