/**
 * @author res-nullius
 * @version 1.0
 */

import java.util.Collections;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class MakeTwoConsecutive {

    public String solve(String S) {
        List<String> word = new ArrayList<>();
        Collections.addAll(word, S.split(""));
        for (int i = 1; i < word.size(); i++) {
            int idx = word.subList(i, word.size()).indexOf(word.get(i-1));
            System.out.println(idx);
            switch (idx) {
                case 0: if (word.size() > 2) return "Possible"; break;
                case 1: return "Possible";
                case 2: word.remove(idx);
                    System.out.println(word);
                    idx = word.indexOf(word.get(i-1));
                    if (idx == 1) return "Possible"; break;
            }
        }
        return "Impossible";
    }
}