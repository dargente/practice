package DailyProgrammer;

import javax.swing.*;
import java.util.Scanner;

/**
 * Reddit /r/DailyProgrammer Challenge #199 [Easy]
 * http://www.reddit.com/r/dailyprogrammer/comments/2tr6yn/2015126_challenge_199_bank_number_banners_pt_1/
 */
public class Challenge199Easy {

    static String[] TOP_DIGIT = new String[] {" _ ","   "," _ "," _ ","   "," _ "," _ "," _ "," _ "," _ "};
    static String[] MID_DIGIT = new String[] {"| |", "  |"," _|", " _|", "|_|","|_ ", "|_ ", "  |", "|_|", "|_|"};
    static String[] BOTTOM_DIGIT = new String[] {"|_|", "  |", "|_ ", " _|", "  |", " _|", "|_|", "  |", "|_|", " _|"};

    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(null, "Enter account number:");

        StringBuilder topLine = new StringBuilder();
        StringBuilder midLine = new StringBuilder();
        StringBuilder bottomLine = new StringBuilder();

        for(int i = 0; i < input.length(); i++)
        {
            topLine.append(TOP_DIGIT[Character.getNumericValue(input.charAt(i))]);
            midLine.append(MID_DIGIT[Character.getNumericValue(input.charAt(i))]);
            bottomLine.append(BOTTOM_DIGIT[Character.getNumericValue(input.charAt(i))]);
        }

        System.out.println(topLine.toString());
        System.out.println(midLine.toString());
        System.out.println(bottomLine.toString());


    }
}
