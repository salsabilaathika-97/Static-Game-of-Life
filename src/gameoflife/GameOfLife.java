package gameoflife;
import java.util.Scanner;
public class GameOfLife extends Example {
    public static void main(String[] args) {
        //create example class to store models
        Scanner scan = new Scanner(System.in);
        Example ex = new Example();
        System.out.println("Pick example");
        System.out.println("1. Oscillator");
        System.out.println("2. Reverse Oscillator");
        System.out.print("Your answer: ");
        int answer = scan.nextInt();
        if (answer == 1) {
           ex.Oscillator();
        } else if (answer == 2) {
           ex.ReverseOscillator();
        }
    }   
}