package leetcode.spiral.matrix;

public class SolutionSpiralMatrix2 {


        public int[][] generateMatrix(int n) {

            int [][] answer = new int [n][n];
            if (n == 1) {
                answer[0][0] = 1;
                return answer;
            }

            int i = 0;
            int j = 0;

            int maxI = n-1;
            int maxJ = maxI;
            int minI = 0;
            int minJ = minI;
            int num = 0;
            int target = (n) * (n);

            while (answer[i][j] < target) {
                if (answer[i][j]>0) return answer;
                answer[i][j] = ++num;
                j++;
                if (answer[i][j]>0) return answer;
                while (j < maxJ ) {
                    answer[i][j++] = ++num;

                }


                maxJ--;
                while (i < maxI){
                    answer[i++][j] = ++num;

                }


                maxI--;
                while (j >minJ) {
                    answer[i][j--] = ++num;
                }

                minJ++;
                while (i > minI){
                    answer[i--][j] = ++num;
                }
                minI++;
                i = minI;
                j = minJ;


            }

            answer[i][j] = ++num;
            return answer;
        }

}
