import java.util.*;
 class Number_Game 
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int flag,i,guess,x,score;
        double no=Math.random();
        no=no*100; 
        x=(int)no;
        System.out.println("Welcome to the guessing game!!");
        System.out.println("You will get 10 chances to guess the correct number");
        System.out.println("The number will be in th range of 1 to 100");
        System.out.println("You will be scored out of 100");
        System.out.println("Lets start!!");
        flag=0;
        score=100;
        for(i=1;i<=10;i++)
        {
            System.out.print("Chance "+i+":");
            guess=in.nextInt();
            if(guess > x){
                System.out.println("Too High");
                score-=10;
            }
            else if(guess<x){
                System.out.println("Too low");
                score-=10;
            }
            else{
                flag=1;
                System.out.println("Yes you guessed the number right!!!");
                break;
            }
        }
        if(flag==0){
            System.out.println("Your chances are over, Game over.");
            System.out.println("The number was "+x);
        }
        System.out.println("Your Score is :"+score);
        in.close();
    }    
}