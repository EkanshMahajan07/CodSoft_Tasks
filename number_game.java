import java.util.Random;
import java.util.Scanner;

    class Game{

        Scanner sc = new Scanner(System.in);
        int userNumber,computerNumber;
        int numberOfGuesses=0; int flag = 0;
        public Game(){
            Random randomNumber = new Random();
            computerNumber = randomNumber.nextInt(100);
        }
        public int takeUserInput() {
            System.out.println("Guess the number (1-99)");
            userNumber = sc.nextInt();
            return userNumber;
        }

        //method overloading
        public int takeUserInput(int userNumber) {
            userNumber = sc.nextInt();
            return userNumber;
        }

        public void printInput(){
            System.out.println("Your guess was "+userNumber);
        }
        public boolean isCorrectNumber(int userInput) {

            if (0<=userNumber && userNumber<100){

                if (userNumber == computerNumber) {
                    System.out.println("You Guessed it right");
                    System.out.println("The number was " + computerNumber);
                    flag = 1;

                } else if (userNumber > computerNumber) {
                    System.out.println("You guessed a Greater Number");

                } else if (userNumber < computerNumber) {
                    System.out.println("You guessed a Smaller Number");
                }
                setNumberOfGuesses();
            }
            else {
                System.out.println("Guess a valid number");
            }
            if (flag==1){
                return true;
            }
            else return false;
        }

        public void setNumberOfGuesses() {
            numberOfGuesses++;
        }
        public void getNumberOfGuesses() {
            System.out.print(numberOfGuesses);
        }
    }

    public class number_game {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            {
                int userInput;
                boolean gameRunning = true;
                Game g1 = new Game();
                while (gameRunning == true) {
                    if (g1.numberOfGuesses <= 4) {
                        System.out.println("Total chances available: " + (5 - g1.numberOfGuesses));
                        userInput = g1.takeUserInput();
                        boolean resultAfterCheck = g1.isCorrectNumber(userInput);
                        if (resultAfterCheck == true) {
                            System.out.print("Guessed in ");
                            g1.getNumberOfGuesses();
                            System.out.print(" Guesses");
                            System.out.println("");
                            gameRunning = false;
                            break;
                        } else {
                            gameRunning = true;
                        }
                    } else {
                        System.out.println("Game Over");
                        break;
                    }
                }
            }
        }
}

