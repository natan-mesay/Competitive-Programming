package Week1;

import java.math.MathContext;

public class KClosestPointstoOrigin {
    public int[][] kClosest(int[][] points, int k) {
        int [][] output ={{0}};
        double min = 100;
        for( int i = 0;i<points.length;i++){
            double sum = 0;
            for (int j = 0; j < output[i].length; j++) {
                 sum += Math.pow(points[i][j],2);
            }
            min= Math.min(min, sum);

        }

        System.out.println(min);
        return output;
    }

    public static void main(String[] args) {
        int[][] x = {{1,2},{5,7}};

        KClosestPointstoOrigin lc = new KClosestPointstoOrigin();
        lc.kClosest(x, 1);
    }
}
