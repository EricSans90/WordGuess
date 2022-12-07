import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    public static void main(String[] args) {
        int i, j=0;
        boolean found=false;
        /* I could ask for the words and build a for, but I will try a preset of 5 words to test the program
        int numberWords;
        System.out.println("How many words do you want to play with?");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        numberWords = inputValue.nextInt();
        */
        MagicWord[] Set_words = new MagicWord[5];
        MagicWord w_one = new MagicWord("hello");
        Set_words[0]= w_one;
        MagicWord w_two = new MagicWord("programming");
        Set_words[1]= w_two;
        MagicWord w_three = new MagicWord("cat");
        Set_words[2]= w_three;
        MagicWord w_four = new MagicWord("alcohol");
        Set_words[3]= w_four;
        MagicWord w_five = new MagicWord("vegetables");
        Set_words[4]= w_five;

        MagicWord chosenWord = Set_words[new Random().nextInt(4)];
        chosenWord.printMagicWord();
        //String toPrint = chosenWord.getWord();
        //System.out.println(toPrint);

        while (!found){
            j+=1;
            String input;
            System.out.println("Introduce a letter or try to guess the whole word:");
            Scanner inputValue;
            inputValue = new Scanner(System.in);
            input = inputValue.nextLine();
            if (input.length() == 1){
                for(i=0; i< chosenWord.getLength(); i++){
                    if (chosenWord.getWord().charAt(i) == input.charAt(0)){
                        chosenWord.getBoolean()[i] = true;
                    }
                }
                System.out.println("We did " +j + " attempts and the word is: ");
                chosenWord.printMagicWord();
            } else {
                if(input.equals(chosenWord.getWord())){
                    System.out.println("You got it right! You did it in "+j+" attempts");
                    found=true;
                } else {
                    System.out.println("You got it wrong in your attempt number "+j);
                }
            }
        }

    }
}