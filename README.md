# Java-Portfolio
A portfolio containing most of my academic and personal projects

# Pokemon2.java
This was my attempt at recreating a primitive classic Pokemon battle sequence. 
Each player (you and the CPU) start with 100 health. You can choose to either Attack, use a Potion, or Run.
If you attack, you will have a 10% chance for a critical hit which will double your damage, and a 10% chance to miss entirely.
If you successfully land a hit without critical damage, you will deal between 1-20 damage to your opponent.
Likewise, your opponent can deal between 1-20 damage, miss, but cannot deal critical damage.

If the user decides to use a potion, you will be granted up to 10 HP back. You only have 3 potions, and if you run out and try to use it, it uses a turn

If the user decides to run, the user has a 90% chance to get away. 
If you fail to get away, your opponent will attack.


========================================================================================================================================================

# Movies.java
A simple movie selector.

There are five categories of movies, Action, Comedy, Drama, Horror, and Romance.
Each category contains an array of movies, five each.
Based on the users selection, you can navigate into each category, list the movie and choose which one you would like to watch.
If you navigate into a category, you have the option to go 'back' to the prior screen.

There also exists a "shuffle" button that will randomly select a movie from a 'master array' for the user to watch.

After selecting a movie, the nested do/while loop will break out and also break the labelled do/while to end the program.
There also exists the option to press "Q" to quit and end the program.
