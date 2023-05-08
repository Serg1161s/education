package leetcode.dota2Senat;

public class SolutionDota2Senat2 {
    public String predictPartyVictory(String senate) {
        char[] c = senate.toCharArray();
        int l = senate.length();
        int r = 0;

        do {
            int nl = 0;

            for (int i = 0; i < l; i++) {
                if (c[i] == 'R') {
                    r++;
                    if (r > 0)
                        c[nl++] = 'R';
                }
                else {
                    r--;
                    if (r < 0)
                        c[nl++] = 'D';
                }
            }

            l = nl;
        } while (l > Math.abs(r));

        return c[0] == 'R' ? "Radiant" : "Dire";
    }
}

