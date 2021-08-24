import java.util.*;

public class Letters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Variables
        int years = 0;
        String firstName;
        String happy;
        String currentGoals;
        String futureGoals;
        String life;
        String time;
        String future;

        System.out.println(
                "This program will allow you to write a letter to your future self. Press [Enter] to continue.");
        in.nextLine(); // Press enter

        System.out.println("We will ask some questions to help get you going. Press [Enter] to continue.");
        in.nextLine(); // Press enter

        // Get name to sign the end
        System.out.println("What is your first name?");
        firstName = in.nextLine();

        // Get date
        System.out.print("How many years before you can open this letter: ");
        years = in.nextInt();

        in.nextLine(); // Flush buffer

        // Ask about current happiness
        System.out.println("Are you currently happy? Why or why not?");
        happy = in.nextLine();

        // Ask about current goals
        System.out.println("What goals have you achieved? Who helped along the way?");
        currentGoals = in.nextLine();

        // Future goals
        System.out.println("What are your future goals? What do you hope to achieve?");
        futureGoals = in.nextLine();

        // Living for yourself
        System.out.println("Are you living life true to yourself?");
        life = in.nextLine();

        // Spending time on certain things
        System.out.println("Are you spending time on things that matter?");
        time = in.nextLine();

        // Shape your future
        System.out.println("Define things you want to change in the future? Maybe these will come true. ");
        future = in.nextLine();
        System.out.println("\n"); // New line

        // Print results of letter
        System.out.println("Here is your letter: \n");
        System.out.println("Dear Self, ");
        System.out.println(happy + "\n");
        System.out.println(currentGoals + "\n");
        System.out.println(futureGoals + "\n");
        System.out.println(life + "\n");
        System.out.println(time + "\n");
        System.out.println(future + "\n");
        System.out.println("Signed, your past self, " + firstName);
        System.out.println("This letter will be available to open in " + years + " years.");
    } // End main
} // End program