import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chances = 6;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Welcome Mate!");
        System.out.println("Hey Mate you have "+chances+" chances to guess the number and won it.");
        while (playAgain) {
            int rand=getrandN(1,100);
            boolean guess = false;
            for(int i=0; i<chances;i++){
                System.out.println("Chance"+(i+1)+" Enter your guess:");
                int user = sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You won the game.");
                    break;
                }else if(user>rand){
                    System.out.println("Guess is too high.");
                }else{
                    System.out.println("Guess is too low.");
                }
            }
            if (guess==false) {
                System.out.println("Sorry mate.You lost the chances.The correct guess is"+rand);
            }
            System.out.println("Mate you want to play again(yes/no)");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("yes");
        }
        System.out.println("That's it Mate, Hopye you enjoyed it.");
        System.out.println("Here is your score"+finals);
    }

    public static int getrandN(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    
}