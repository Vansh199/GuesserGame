import java.util.Scanner;

class Guesser{
    int guessNum;

    int guessingNumber(){
        System.out.println("Guesser! kindly guess a number:");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player1{
    int guessNum;

    int guessingNumber(){
        System.out.println("Player1! kindly guess a number");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player2{
    int guessNum;

    int guessingNumber(){
        System.out.println("Player2! kindly guess a number");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player3{
    int guessNum;

    int guessingNumber(){
        System.out.println("Player3! kindly guess a number");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player4{
    int guessNum;

    int guessingNumber(){
        System.out.println("Player4! kindly guess a number");
        Scanner sc = new Scanner(System.in);
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromPlayer4;

    void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser=g.guessingNumber();
    }

    void collectNumFromPlayers(){
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Player3 p3 = new Player3();
        Player4 p4 = new Player4();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
        numFromPlayer4=p4.guessingNumber();
    }

    void compare(){

        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4){
                System.out.println("All players won the game:");
            }
            else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("Player1! and Player2! and Player3! won the game:");
            }
            else if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4){
                System.out.println("Player1! and Player3! and Player4! won the game:");
            }
            else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer4){
                System.out.println("Player1! and Player2! and Player4! won the game:");
            }
            else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player1! and Player2! won the game:");
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player1! and Player3! won the game:");
            }
            else if(numFromGuesser==numFromPlayer4){
                System.out.println("Player1! and Player4! won the game:");
            }
            else{
                System.out.println("Player1! won the game:");
            }
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4){
                System.out.println("Player2! and Player3! and Player4! won the game:"); 
            }
            else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player2! and Player3! won the game:");
            }
            else if(numFromGuesser==numFromPlayer4){
                System.out.println("Player2! and Player4! won the game:");
            }
            else{
                System.out.println("Player2! won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer3){
            if(numFromGuesser==numFromPlayer4){
                System.out.println("Player3! and Player4! won the game:");
            }
            else{
                System.out.println("Player3! won the game:");
            }
        }
        else if(numFromGuesser==numFromPlayer4){
            System.out.println("Player4! won the game:");
        }
        else{
            System.out.println("All players loss the game:");
        }
    }
}
public class LaunchGame1 {
    public static void main(String[] args) {
        
        System.out.println("Game started");
        System.out.println("Minimum age should be 18 to play the game\n \tEnter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
          System.out.println("you can play the game:");
          Umpire u = new Umpire();
          u.collectNumFromGuesser();
          u.collectNumFromPlayers();
          u.compare();
        }
        else{
            System.out.println("You are Not 18:");
        }
    }
}
