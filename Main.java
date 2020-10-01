import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer to count down to");
    int num = input.nextInt();
    System.out.println("Count Down:");
    for(int i = 100; i >= num; i -= 5){
      System.out.println(i);
    }
    
  }
}
