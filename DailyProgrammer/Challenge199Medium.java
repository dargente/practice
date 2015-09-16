package DailyProgrammer;

import java.util.Scanner;

/**
 * Reddit /r/DailyProgrammer Challenge 199 [Medium]
 * http://www.reddit.com/r/dailyprogrammer/comments/2u0fyx/2015126_challenge_199_bank_number_banners_pt_2/
 * This solution is most likely the simplest to write, but not the most efficient.
 */
public class Challenge199Medium {

    static String[] TOP_DIGIT = new String[] {" _ ","   "," _ "," _ ","   "," _ "," _ "," _ "," _ "," _ "};
    static String[] MID_DIGIT = new String[] {"| |", "  |"," _|", " _|", "|_|","|_ ", "|_ ", "  |", "|_|", "|_|"};
    static String[] BOTTOM_DIGIT = new String[] {"|_|", "  |", "|_ ", " _|", "  |", " _|", "|_|", "  |", "|_|", " _|"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Bank Number Banner: ");
        String topLine = new String(input.nextLine());
        String midLine = new String(input.nextLine());
        String bottomLine = new String(input.nextLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < topLine.length(); i += 3) {
            String top = topLine.substring(i, i+3);
            String mid = midLine.substring(i, i+3);
            String bottom = bottomLine.substring(i, i+3);

            for(int j = 0; j < TOP_DIGIT.length; j++) {
                if(top.equals(TOP_DIGIT[j]) && mid.equals(MID_DIGIT[j]) && bottom.equals(BOTTOM_DIGIT[j]))
                    result.append(j);
            }
        }

        System.out.println(result.toString());

    }

}
