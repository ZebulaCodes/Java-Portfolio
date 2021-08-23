import java.util.*;

public class Movies {
    public static void main(String[] args) {
        // Create scanner
        Scanner in = new Scanner(System.in);

        // Create other variables
        String movieCategory;
        String actionSelection = "";
        String comedySelection = "";
        String dramaSelection = "";
        String horrorSelection = "";
        String romanceSelection = "";

        // Arrays for movie categories
        String[] action = { "Black (W)idow", "(S)nake Eyes", "(W)rath of Man", "(N)obody", "(F)9" };
        String[] comedy = { "(C)aptain Ron", "The (H)angover", "(P)alm Springs", "(L)uca", "(F)reaky" };
        String[] drama = { "(J)oe Bell", "(G)reyhound", "(D)evil Time", "(C)ity of Lies", "(1)917" };
        String[] horror = { "The (R)esort", "Things (H)eard & Seen", "The (E)mpty Man", "The (C)onjuring",
                "(W)rong Turn" };
        String[] romance = { "(3)65 Days", "(F)ive Feet Apart", "(I)n The Heights", "(L)et Him Go", "(A)fter" };
        String[] shuffle = { "Black Widow", "Snake Eyes", "Wrath of Man", "Nobody", "F9", "Captain Ron", "The Hangover",
                "Palm Springs", "Luca", "Freaky", "Joe Bell", "Greyhound", "Devil Time", "City of Lies", "1917",
                "The Resort", "Things Heard & Seen", "The Empty Man", "The Conjuring", "Wrong Turn", "365 Days",
                "Five Feet Apart", "In The Heights", "Let Him Go", "After" };

        // Do while
        outerBreak: do {
            System.out.println(
                    "Pick a movie category: (A)ction, (C)omedy, (D)rama, (H)orror, (R)omance, 'S' for Shuffle, or 'Q' to quit.");
            movieCategory = in.nextLine();

            // If user chooses Action, display movies and have option to go back to main
            // screen
            if (movieCategory.equalsIgnoreCase("a")) {
                do {
                    System.out.println("Please select an action movie or press 'B' to go back: ");
                    for (String movie : action) {
                        System.out.println(movie);
                    } // End for
                    actionSelection = in.nextLine();

                    // Black Widow
                    if (actionSelection.equalsIgnoreCase("W")) {
                        System.out.println("Now watching Black Widow. Enjoy!");
                        break outerBreak;
                    }

                    // Snake Eyes
                    if (actionSelection.equalsIgnoreCase("S")) {
                        System.out.println("Now watching Snake Eyes. Enjoy!");
                        break outerBreak;
                    }

                    // Wrath of Man
                    if (actionSelection.equalsIgnoreCase("W")) {
                        System.out.println("Now watching Wrath of Man. Enjoy!");
                        break outerBreak;
                    }

                    // Nobody
                    if (actionSelection.equalsIgnoreCase("N")) {
                        System.out.println("Now watching Nobody. Enjoy!");
                        break outerBreak;
                    }

                    // F9
                    if (actionSelection.equalsIgnoreCase("F")) {
                        System.out.println("Now watching F9. Enjoy!");
                        break outerBreak;
                    }
                } while (!actionSelection.equalsIgnoreCase("b"));
            } // End action 'if'

            // If user chooses Comedy, display comedy movies and give option to go back to
            // main screen
            if (movieCategory.equalsIgnoreCase("c")) {
                do {
                    System.out.println("Please select a comedy movie or press 'B' to go back: ");
                    for (String movie : comedy) {
                        System.out.println(movie);
                    } // End for
                    comedySelection = in.nextLine();

                    // Captain Ron
                    if (comedySelection.equalsIgnoreCase("c")) {
                        System.out.println("Now watching Captain Ron. Enjoy!");
                        break outerBreak;
                    }

                    // The Hangover
                    if (comedySelection.equalsIgnoreCase("h")) {
                        System.out.println("Now watching The Hangover. Enjoy!");
                        break outerBreak;
                    }

                    // Palm Springs
                    if (comedySelection.equalsIgnoreCase("p")) {
                        System.out.println("Now watching Palm Springs. Enjoy!");
                        break outerBreak;
                    }

                    // Luca
                    if (comedySelection.equalsIgnoreCase("l")) {
                        System.out.println("Now watching Luca. Enjoy!");
                        break outerBreak;
                    }

                    // Freaky
                    if (comedySelection.equalsIgnoreCase("f")) {
                        System.out.println("Now watching Freaky. Enjoy!");
                        break outerBreak;
                    }

                } while (!comedySelection.equalsIgnoreCase("b"));
            } // End Comedy 'if'

            // If user chooses Drama, display drama movies and give option to go back to
            // main screen
            if (movieCategory.equalsIgnoreCase("d")) {
                do {
                    System.out.println("Please select a drama movie or press 'B' to go back: ");
                    for (String movie : drama) {
                        System.out.println(movie);
                    } // End for
                    dramaSelection = in.nextLine();

                    // Joe Bell
                    if (dramaSelection.equalsIgnoreCase("j")) {
                        System.out.println("Now watching Joe Bell. Enjoy!");
                        break outerBreak;
                    }

                    // Greyhound
                    if (dramaSelection.equalsIgnoreCase("g")) {
                        System.out.println("Now watching Greyhound. Enjoy!");
                        break outerBreak;
                    }

                    // Devil Time
                    if (dramaSelection.equalsIgnoreCase("d")) {
                        System.out.println("Now watching Devil Time. Enjoy!");
                        break outerBreak;
                    }

                    // City of Lies
                    if (dramaSelection.equalsIgnoreCase("c")) {
                        System.out.println("Now watching City of Lies. Enjoy!");
                        break outerBreak;
                    }

                    // 1917
                    if (dramaSelection.equalsIgnoreCase("1")) {
                        System.out.println("Now watching 1917. Enjoy!");
                        break outerBreak;
                    }

                } while (!dramaSelection.equalsIgnoreCase("b"));
            } // End Drama 'if'

            // If user chooses Horror, display horror movies and give option to go back to
            // main screen
            if (movieCategory.equalsIgnoreCase("h")) {
                do {
                    System.out.println("Please select a horror movie or press 'B' to go back: ");
                    for (String movie : horror) {
                        System.out.println(movie);
                    } // End for
                    horrorSelection = in.nextLine();

                    // The Resort
                    if (horrorSelection.equalsIgnoreCase("R")) {
                        System.out.println("Now watching The Resort. Enjoy!");
                        break outerBreak;
                    }

                    // Things Heard & Seen
                    if (horrorSelection.equalsIgnoreCase("H")) {
                        System.out.println("Now watching Things Heard & Seen. Enjoy!");
                        break outerBreak;
                    }

                    // The Empty Man
                    if (horrorSelection.equalsIgnoreCase("E")) {
                        System.out.println("Now watching The Empty Man. Enjoy!");
                        break outerBreak;
                    }

                    // The Conjuring
                    if (horrorSelection.equalsIgnoreCase("C")) {
                        System.out.println("Now watching The Conjuring. Enjoy!");
                        break outerBreak;
                    }

                    // Wrong Turn
                    if (horrorSelection.equalsIgnoreCase("W")) {
                        System.out.println("Now watching Wrong Turn. Enjoy!");
                        break outerBreak;
                    }

                } while (!horrorSelection.equalsIgnoreCase("b"));
            } // End Horror 'if'

            // If user chooses Romance, display romance movies and give option to go back to
            // main screen
            if (movieCategory.equalsIgnoreCase("r")) {
                do {
                    System.out.println("Please select a romance movie or press 'B' to go back: ");
                    for (String movie : romance) {
                        System.out.println(movie);
                    } // End for
                    romanceSelection = in.nextLine();

                    // 265 Days
                    if (romanceSelection.equalsIgnoreCase("3")) {
                        System.out.println("Now watching 365 Days. Enjoy!");
                        break outerBreak;
                    }

                    // Five Feet Apart
                    if (romanceSelection.equalsIgnoreCase("F")) {
                        System.out.println("Now watching Five Feet Apart. Enjoy!");
                        break outerBreak;
                    }

                    // In The Heights
                    if (romanceSelection.equalsIgnoreCase("I")) {
                        System.out.println("Now watching In The Heights. Enjoy!");
                        break outerBreak;
                    }

                    // Let Him Go
                    if (romanceSelection.equalsIgnoreCase("L")) {
                        System.out.println("Now watching Let Him Go. Enjoy!");
                        break outerBreak;
                    }

                    // After
                    if (romanceSelection.equalsIgnoreCase("A")) {
                        System.out.println("Now watching After. Enjoy!");
                        break outerBreak;
                    }

                } while (!horrorSelection.equalsIgnoreCase("b"));
            } // End Horror 'if'

            // Random movie
            if (movieCategory.equalsIgnoreCase("S")) {
                Random rand = new Random();
                int randomMovie = rand.nextInt(shuffle.length);
                System.out.println("Now watching " + shuffle[randomMovie] + ". Enjoy!");
                break outerBreak;
            }

        } while (!movieCategory.equalsIgnoreCase("q"));
    } // End main
} // End program