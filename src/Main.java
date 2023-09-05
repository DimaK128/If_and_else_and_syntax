import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();

            if (time >= 5 && time <= 11) {
                System.out.println("Good morning.");
            } else if (time >= 12 && time <= 17) {
                System.out.println("Good day.");
            } else if (time <= 17 && time >= 22) {
                System.out.println("Good evening.");
            } else {
                System.out.println("Good night");
            }
        }
    }