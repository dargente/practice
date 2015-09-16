package DailyProgrammer.Challenge220;


import java.util.*;

/**
 * Reddit's /r/DailyProgrammer Challenge 219 [Easy]
 * Created by Dominic Argente (23/6/15)
 */
public class MangledSentences {

    public String mangleSentence(String input) {
        StringBuilder output = new StringBuilder();
        StringTokenizer inputWords = new StringTokenizer(input);

        while(inputWords.hasMoreElements()) {
            output.append(mangleWord(inputWords.nextToken() + " "));
        }
        output.deleteCharAt(output.length() - 1);
        return output.toString();
    }

    private String mangleWord(String word) {

        boolean hasCaps = false;
        if(Character.isUpperCase(word.charAt(0))) hasCaps = true;

        List<Character> sortList = new ArrayList<Character>();
        for(int i = 0; i < word.length(); i++) {
         if(Character.isLetterOrDigit(word.charAt(i))) {
             sortList.add(word.toLowerCase().charAt(i));
         }
        }

        Collections.sort(sortList);

        StringBuilder output = new StringBuilder();
        for(int i = 0; i < sortList.size(); i++) {
            if(i == 0 && hasCaps)
                output.append(Character.toUpperCase(sortList.get(0)));
            else
                output.append(sortList.get(i));
        }

        for(int i = 0; i < word.length(); i++) {
            if(!Character.isLetterOrDigit(word.charAt(i))) {
                output.insert(i, word.charAt(i));
            }

        }
        return output.toString();
    }


}
