package leetcode.dota2Senat;

public class SolutionDota2Senat {


    protected String predictPartyVictory(String senate) {
        char[] arraySenate = senate.toCharArray();
        String answer1 = "Radiant";
        String answer2 = "Dire";

       round1(arraySenate);

       int count = round2(arraySenate);

       if (count < 0) return answer2;

       return answer1;
    }

    private void round1(char[] arrayRound1) {
        int tempR = 0;
        int tempD = 0;
        for (int i = 0; i < arrayRound1.length; i++) {

            if (arrayRound1[i] == 'R') {
                if (tempR == 0) {
                    ++tempD;
                } else if (tempR > 0) {
                    arrayRound1[i] = 'B';
                    --tempR;
                }
            }
            if (arrayRound1[i] == 'D') {
                if (tempD == 0) {
                   ++tempR;
                } else if (tempD > 0) {
                    arrayRound1[i] = 'B';
                    --tempD;
                }
            }

        }
        if (tempD > 0){
            for (int i = 0; i < arrayRound1.length; i++) {
                if (arrayRound1[i] == 'D') {
                    arrayRound1 [i] = 'B';
                    tempD--;
                }
            if (tempD == 0) break;
            }
        }
        if (tempR > 0 ){
            for (int i = 0; i < arrayRound1.length; i++) {
                if (arrayRound1[i] == 'R') {
                    arrayRound1 [i] = 'B';
                    tempR--;
                }
             if (tempR == 0) break;
            }
        }

    }
    private int round2(char[] arrayRound1) {
        int tempR = 0;
        int tempD = 0;
        int answer = 0;
        for (int i = 0; i < arrayRound1.length; i++) {

            if (arrayRound1[i] == 'R') {
                if (tempR == 0) {
                    ++tempD;
                    answer++;
                } else if (tempR > 0) {
                    arrayRound1[i] = 'B';
                    --tempR;
                }
            }
            if (arrayRound1[i] == 'D') {
                if (tempD == 0) {
                    ++tempR;
                    answer--;
                } else if (tempD > 0) {
                    arrayRound1[i] = 'B';
                    --tempD;
                }
            }

        }
      return answer;

    }


}