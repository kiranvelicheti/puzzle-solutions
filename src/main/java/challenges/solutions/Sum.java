package challenges.solutions;

import java.util.List;

public class Sum {

    public static int pallindrome(String S) {
        int N = S.length(), ans = 0;
        for (int center = 0; center <= 2 * N - 1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }

    static int music(List<Integer> albums) {
        int count = 0;
        for (int i = 0; i < albums.size() - 1; i++) {
            for (int j = i + 1; j < albums.size(); j++) {
                if ((albums.get(i) + albums.get(j)) % 60 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
