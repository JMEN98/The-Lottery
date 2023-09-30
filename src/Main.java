import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List <Integer> winningNumbers = new ArrayList<>();

        Random random = new Random();

        for (int i =0;i<6;i++){
            while (true){
                int  winningNumber = random.nextInt(49)+1;
                if (!winningNumbers.contains(winningNumber)){
                    winningNumbers.add(winningNumber);
                    break;
                }
            }

        }

       // System.out.println(winningNumbers);
        System.out.println("Ready player 1");
        System.out.println("Please enter your 6 number between 1 and 49 ");

        Scanner scanner = new Scanner(System.in);
        List<Integer> guessedNumber = new ArrayList<>();

        for (int i =0;i<6;i++){
            System.out.println("Your current number are "+guessedNumber);
            System.out.println("keep going player 1");
            while (true){
                try {
                    String numberString = scanner.nextLine();
                    int number = Integer.parseInt(numberString);
                    if(number>=1&&number<=49){
                        guessedNumber.add(number);
                        break;
                    }
                    else { System.out.println(number+"is not between 1 and 49 ");}
                } catch (NumberFormatException nfe){
                    System.out.println("Men that,s not even a number. please enter a number betwwen 1 and 49 ");
                }


            }
            }

          System.out.println("the winning number are"+winningNumbers);
        System.out.println("Your number are"+guessedNumber);
        guessedNumber.retainAll(winningNumbers);
        System.out.println("Your match numbers are "+guessedNumber);
        if(guessedNumber.containsAll(winningNumbers)){
            System.out.println("you have beating me player 1 ");
        }
        else {System.out.println("You loser Player 1");}
        }

    }

