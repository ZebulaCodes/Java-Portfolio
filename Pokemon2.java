import java.util.*;

public class Pokemon2 {    
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        String attackOrPass = "";
        int enemyHP = 100;
        int yourHP = 100;
        int hitOrMiss = 0;
        int damage = 0;
        int potion = 3;
        int potionRestore = 0;
        int runAway = 0;
        int crit = 0;

        /* THOUGHT:
            NEED TO FIX DAMAGE TO NOT INCLUDE 0
        */

        do
        {
            System.out.println("Your HP: " + yourHP);
            System.out.println("Enemy HP: " + enemyHP);

            System.out.println(); // New line
    
            System.out.println("(A)ttack, (P)otion " + potion + ", (R)un");
            attackOrPass = in.nextLine();
    
            // Your attack session
            // MAYBE ADD AN IF STATEMENT LIKE 'if hp is not less than or equal to zero, perform attack'
            if (attackOrPass.equalsIgnoreCase("A"))
            {
                System.out.println("You chose to attack.");
                crit = rand.nextInt(10) + 1; // Check for crit. 10% chance
                System.out.println("Crit roll was: " + crit);
                hitOrMiss = rand.nextInt(10) + 1; // Generate hit or miss number. If number '2', miss. All others hit
                System.out.println("Hit or miss: " + hitOrMiss); // Display hit or miss number
                if (hitOrMiss == 2) // If miss
                {
                    System.out.println("Miss");
                }
                else if (crit == 7) // Else if critical hit
                {
                    damage = rand.nextInt(20) + 1;
                    System.out.println("Regular Damage: " + damage);
                    damage = damage * 2;
                    System.out.println("Critical hit!" + damage);
                    enemyHP = enemyHP - damage;
                    System.out.println(); // New line
                }
                else // Else hit
                {
                    damage = rand.nextInt(21);
                    System.out.println(damage + " damage to the enemy.");
                    enemyHP = enemyHP - damage;
                    System.out.println(); // New line
                }
                System.out.println(); // New line
            } // End 'attack if'

            // In case the user wants to use a potion
            else if (attackOrPass.equalsIgnoreCase("P"))
            {
                if (potion <= 0)
                {
                    System.out.println("You have no more potions.");
                }
                else 
                {
                    potionRestore = rand.nextInt(11-5) + 1; // Generate how much HP to be restored.
                    System.out.println("Restored " + potionRestore + " HP.");
                    yourHP = Math.min(yourHP + potionRestore, 100); // Add HP back to your health
                    potion = potion - 1;
                    System.out.println(); // New line
                }
            } // End 'potion if'

            // In case user wants to run
            else if (attackOrPass.equalsIgnoreCase("R"))
            {
                runAway = rand.nextInt(10) + 1; // 90% chance to get away
                if (runAway == 2)
                {
                    System.out.println("You tripped, could not get away.");
                    System.out.println(); // New line
                }
                else 
                {
                    System.out.println("Got away safely.");
                    break;
                }
            }

            hitOrMiss = 0; // Reset number
            damage = 0; // Reset number

            // Enemy attack session
            // MAYBE ADD AN IF STATEMENT LIKE 'if hp is not less than or equal to zero, perform attack'
            hitOrMiss = rand.nextInt(10) + 1;
            System.out.println("Enemy hit or miss: " + hitOrMiss);
            if (hitOrMiss == 2)
            {
                System.out.println("Enemy miss");
            }
            else
            {
                damage = rand.nextInt(20) + 1;
                System.out.println(damage + " damage to you.");
                yourHP = yourHP - damage;
                System.out.println();
            }
        
        } while (yourHP >= 1 && enemyHP >= 1);

        // Display results 
        if (enemyHP <= 0)
        {
            System.out.println("You Win!");
        }
        else if (yourHP <= 0)
        {
            System.out.println("You lose.");
        }

    } // End main
    
}
