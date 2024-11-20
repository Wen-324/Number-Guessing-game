import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class num_guessing_game {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(0,1000);
        int times = 9;
        Scanner s = new Scanner(System.in);
        int playersNumber = -1;

        boolean inputFormatCorrect = false;
        while(!inputFormatCorrect) {
            try{
                System.out.println("Please enter a number: ");
                playersNumber = s.nextInt();
                inputFormatCorrect =true;
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input.");
                s.nextLine();
            }
        }

        while (true)
        {
            if (playersNumber != secretNumber)
            {
                if (playersNumber <= 0 || playersNumber >= 1000)
                {
                    System.out.println("Invalid Input! Ensure your number is between 1 and 999!");
                    boolean inputFormatCorrect2 = false;
                    while(!inputFormatCorrect2){
                        try{
                            System.out.println("Please enter a number: ");
                            playersNumber = s.nextInt();
                            inputFormatCorrect2 =true;
                        }
                        catch(InputMismatchException e){
                            System.out.println("Input invalid");
                            s.nextLine();
                        }
                    }
                }
                else if (times!=0)
                {
                    if (playersNumber < secretNumber)
                    {
                        System.out.println("Choose a larger number! You have " + times + " guesses left.");
                    }
                    else
                    {
                        System.out.println("Choose a smaller number! You have " + times + " guesses left.");
                    }
                    times--;
                    boolean inputFormatCorrect3 =false;
                    while(!inputFormatCorrect3){
                        try{
                            System.out.println("Please enter a number: ");
                            playersNumber = s.nextInt();
                            inputFormatCorrect3 =true;
                        }
                        catch(InputMismatchException e){
                            System.out.println("Invalid input");
                            s.nextLine();
                        }
                    }


                }
                else
                {
                    System.out.println("Too bad! Try harder next time!");
                    break;
                }
            }
            else
            {
                System.out.println("Congratulations! That is the secret number!");
                break;
            }
        }

    }
}