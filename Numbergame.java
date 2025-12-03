import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int ActualNumber = (int) (Math.random()*100)+1;
        System.out.println(ActualNumber);
        Scanner sc = new Scanner(System.in);
        int attempts = 5;
        boolean guessedCorrectly = false;
        int score=0;
        long startTime = System.currentTimeMillis();
        for(int i = 1;i<=attempts;i++) {
            System.out.println("Enter Number From 1-100: ");
            int inputNumber = sc.nextInt();

            if (inputNumber == ActualNumber) {
                System.out.println("The Number Matches Correctly");
                guessedCorrectly = true;
                if(i==1){
                    score=100;
                    System.out.println("Score = " + score);
                }
                else if(i==2){
                    score=70;
                    System.out.println("Score = " + score);
                }
                else if(i==3){
                    score=50;
                    System.out.println("Score = " + score);
                }
                else if(i==4){
                    score=30;
                    System.out.println("Score = " + score);
                }
                else if(i==5){
                    score=10;
                    System.out.println("Score = " + score);
                }
                System.out.println("Total Score: " +score);

                long endTime = System.currentTimeMillis();
                double seconds = (endTime - startTime) / 1000.0;
                System.out.println("Time taken: " + seconds + " seconds");
                break;
            } else if (inputNumber > ActualNumber) {
                System.out.println("High");
            } else {
                System.out.println("Low");
            }
        }
        if (!guessedCorrectly) {   // modified
            System.out.println("You have Exceeded Attempts");
            long endTime = System.currentTimeMillis();
            double seconds = (endTime - startTime) / 1000.0;
            System.out.println("Time taken: " + seconds + " seconds");
        }
    }
}
