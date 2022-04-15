package src.com.ang;

public class CountPoint_1828 {

    public static void main(String[] args) {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries  = {{2,3,1},{4,3,1},{1,1,2}};

        countPoints(points, queries);
    }

    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];
            for (int j = 0; j < points.length; j++) {
                if ( r * r >=(Math.abs(x - points[j][0]) * Math.abs(x - points[j][0]) + Math.abs(y - points[j][1]) * Math.abs(y - points[j][1]))) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
