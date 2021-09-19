package gameoflife;
import java.util.Scanner;
public class GameOfLife extends Example {
    public static void main(String[] args) {
        //create example class to store models
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick example");
        System.out.println("1. Oscillator");
        int answer = scan.nextInt();
        if (answer == 1) {
           Example e1 = new Example();
           e1.Oscillator();
        }
       
    }   
}