package src.com.ang;

public class Account_1672 {

    public int maximumWealth(int[][] accounts) {
        int result =0;
        for (int i = 0; i < accounts.length; i++) {
            int max =0;
            for (int j = 0; j< accounts[i].length; j++) {
                max += accounts[i][j];
            }
            if (result < max) {
                result = max;
            }
        }
        return result;
    }
}
