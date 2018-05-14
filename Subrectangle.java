/*
* @author res-nullius
* @version 1.0
**/

import java.lang.Math;
import java.lang.CharSequence;

public class Subrectangle {

    public int minMissed(String S) {

        if (!(S.contains("#"))) { return 1; }
        else if (!(S.contains("."))) { return 0; }
        else {
            int hash = S.indexOf("#");
            int dot = S.indexOf(".", hash);
            String row;
            if (S.startsWith("#")) { row = S.substring(0, dot+1); }
            else { row = S.substring(0, dot); }
            int cursor = row.length();
            int misses = 0;
            System.out.println(row);
            while (cursor < S.length()) {
                String nextRow = S.substring(cursor);
                System.out.println(nextRow);
                if (row.length() > nextRow.length()) {
                    misses += Math.abs(row.length() - nextRow.length());
                    cursor = S.length();
                } else if (row.length() <= nextRow.length()) {
                    if (!(nextRow.startsWith(row))) {
                        for (int i = 0; i < row.length(); i++) {
                            if (nextRow.charAt(i) != row.charAt(i)) {
                                misses++;
                                cursor++;
                            }
                        }
                    } else { cursor += row.length(); }
                }
            }
            return misses;
        }
    }
}