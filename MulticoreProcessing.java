/**
* @author res-nullius
* @version 1.0
*/

import java.lang.Math;

public class MulticoreProcessing {

    int fastestTime(int jobLength, int corePenalty, int[] speed, int[] cores) {
        int len = cores.length;
        double minTime = ((double) jobLength / (cores[0] * speed[0])) + (corePenalty * (cores[0]-1));
        for (int i = 1; i < len; i++) {
            if (((double) jobLength / (cores[i] * speed[i])) + (corePenalty * (cores[i]-1)) < minTime) {
                minTime = ((double) jobLength / (cores[i] * speed[i])) + (corePenalty * (cores[i]-1));
            }
        }
        return (int) Math.ceil(minTime);
    }
}