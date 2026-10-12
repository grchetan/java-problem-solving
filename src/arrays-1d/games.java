import java.util.Scanner;

public class games {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int secretNumber = (int)(Math.random() * 100) + 1;
  int guess = 0;
  int attempts = 0;
  
  System.out.println("\n--- Number Guessing Game ---");
  System.out.println("Guess a number between 1 and 100:");
  
  while(guess != secretNumber) {
    guess = sc.nextInt();
    attempts++;
    
    if(guess < secretNumber) {
      System.out.println("Too low! Try again.");
    } else if(guess > secretNumber) {
      System.out.println("Too high! Try again.");
    } else {
      System.out.println("Correct! You won in " + attempts + " attempts!");
    }



  }

  sc.close();
}
  
}

