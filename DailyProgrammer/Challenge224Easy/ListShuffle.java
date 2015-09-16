package DailyProgrammer.Challenge224Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by dom on 7/22/2015.
 */
public class ListShuffle {

    public String shuffleList(String input) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(input.split(" ")));
        ArrayList<String> shuffled = new ArrayList<String>();
        Random random = new Random();
        // Fisher and Yates shuffle method
        while(list.isEmpty() == false) {
            int n = random.nextInt(list.size());
            shuffled.add(list.get(n));
            list.remove(n);
        }

        return shuffled.toString();

    }
}
