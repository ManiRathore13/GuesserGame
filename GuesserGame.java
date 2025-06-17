import java.util.Scanner;

class Guesser {
    int guessNum;
    int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number:-");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;
    int guessingNumbner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! Kindly guess the number:-");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
        System.out.println("Guesser has guessed the number: " + numFromGuesser);
    }

    void collectNumFromPlayer1() {
        Player p1 = new Player();
        numFromPlayer1 = p1.guessingNumbner();
        System.out.println("Player 1 has guessed the number: " + numFromPlayer1);
    }

    void collectNumFromPlayer2() {
        Player p2 = new Player();
        numFromPlayer2 = p2.guessingNumbner();
        System.out.println("Player 2 has guessed the number: " + numFromPlayer2);
    }

    void collectNumFromPlayer3() {
        Player p3 = new Player();
        numFromPlayer3 = p3.guessingNumbner();
        System.out.println("Player 3 has guessed the number: " + numFromPlayer3);
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            System.out.println("Player 1 has won the game!");
        } else if (numFromGuesser == numFromPlayer2) {
            System.out.println("Player 2 has won the game!");
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 has won the game!");
        } else {
            System.out.println("No player has won the game.");
        }
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer1();
        u.collectNumFromPlayer2();
        u.collectNumFromPlayer3();
        u.compare();
    }
}