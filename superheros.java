import java.util.Scanner;
import java.util.Arrays;
import java.util.Comarator;

public class SuperheroRoster{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String HeroNames[] = {"Thor", "Iron Man", "Captain America"};
        String abilities[] = {"Thunder", "Strength", "Speed"};
        int powerlevels [] = {10,8,6};
        String superhero;
        int index;
       for (int i = 0; i < HeroNames.length; i++) {
    System.out.println("Hero: " + HeroNames[i]);
    System.out.println("Ability: " + abilities[i]);
    System.out.println("Power Level: " + powerlevels[i]);
    System.out.println();
}
            
        }
       System.out.print("Enter your favorite superhero: ");
       superhero = input.nextLine();
       
       index = findName(HeroNames, abilities, powerlevels, superhero);
       
       if (index != -1){
           System.out.println("Hero found.");
       } else {
           System.out.println("Hero not found: ");
       }
       
       int average = averagePower(powerlevels);
       System.out.println("Average power level is: " + average + ".");
    }
    public static int findName(String[] names, String[] abilities, int[] powerLevels, String target) {
    for (int i = 0; i < names.length; i++) {
        if (names[i].equalsIgnoreCase(target)) {
            System.out.println("Hero Found:");
            System.out.println("Name: " + names[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            return i;
        }
    }
    System.out.println("Hero not found.");
    return -1;
    }
class Superhero {
    private String name;
    private String ability;
    private int powerLevel;
 
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }
 
    public void displayHero() {
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
    }
    Superhero[] heroes = {
    new Superhero("Thor", "Thunder", 10),
    new Superhero("Iron Man", "Strength", 8),
    new Superhero("Captain America", "Speed", 6)
}
for (Superhero hero : heroes) {
    hero.displayHero();
    System.out.println();
}
public static void sortHeroesByPower(Superhero[] heroes) {
    Arrays.sort(heroes, Comparator.comparingInt(Superhero::getPowerLevel).reversed());
    System.out.println("Heroes sorted by power level (highest to lowest):");
    for (Superhero hero : heroes) {
        hero.displayHero();
        System.out.println();
    }
}
}
   // Calculated the average power level from the array of power levels//
public static double calculateAveragePower(int[] powerLevels) {
    if (powerLevels.length == 0) {
        System.out.println("No power levels available.");
        return 0.0;
    }
    int sum = 0;
    for (int level : powerLevels) {
        sum += level;
    }
    return (double) sum / powerLevels.length;
}
