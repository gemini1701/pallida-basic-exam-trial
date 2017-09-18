import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class OddFilter {



    public static void main(String[] args) {

        System.out.println(oddFilter(Arrays.asList(1, 2, 3, 4, 5)));

    }

    static List<Integer> oddFilter(List<Integer> oddFilter) {
        List<Integer> outputList = new ArrayList<>();


        for (int i = 0; i < oddFilter.size(); i++) {
            if(oddFilter.get(i)%2!=0) {
                outputList.add(oddFilter.get(i));

            }
        }return outputList;
    }

}
