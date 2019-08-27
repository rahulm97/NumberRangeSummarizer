package numberrangesummarizer;

import java.util.Collection;

/**
 * @author Werner
 *
 * Implement this Interface to produce a comma delimited list of numbers,
 * grouping the numbers into a range when they are sequential.
 *
 *
 * Sample Input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31
 * Result: "1, 3, 6-8, 12-15, 21-24, 31"
 *
 * The code will be evaluated on
 *   - functionality
 *   - style
 *   - robustness
 *   - best practices
 *   - unit tests
 */
public interface NumberRangeSummarizer {

    //collect the input
    Collection<Integer> collect(String input);

    List<Integer> list = Arrays.asList(input);

    StringBuilder strBuild = new StringBuilder();
    
    int prev = list.get(0);

    int st = prev;{
    for(int next: list.subList(1, list.size())) {

        if(prev+1 != next) {
            appendRange(strBuild, st, prev).append(", ");
            st = next;
        }

        prev = next;
    }

String result = appendRange(strBuild, st, prev).toString();
    }
    

    //get the summarized string
    String summarizeCollection(Collection<Integer> input);

    

private static StringBuilder appendRange(StringBuilder strBuild, int st, int prev) {

    strBuild.append(st);

    if(st!=prev){

        strBuild.append(prev-st>1 ? " - ": ", ").append(prev);
    } 

    return strBuild;
}

}


