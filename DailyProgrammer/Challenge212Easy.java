package DailyProgrammer;

import java.util.Scanner;

/**
 * Reddit /r/dailyprogrammer Challenge 202 Easy.
 * http://www.reddit.com/r/dailyprogrammer/comments/341c03/20150427_challenge_212_easy_r%C3%B6varspr%C3%A5ket/
 */
public class Challenge212Easy {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input text to be translated:");
        String text = input.nextLine();

        StringBuilder translation = new StringBuilder();

        for(int i=0; i < text.length(); i++) {
            if("bcdfghjklmnpqrstvwxz".contains((text.toLowerCase().charAt(i)+""))) {
                translation.append(text.charAt(i) + "o" + text.toLowerCase().charAt(i));
            }
            else {
                translation.append(text.charAt(i));
            }
        }

        System.out.println(translation.toString());

    }
}
