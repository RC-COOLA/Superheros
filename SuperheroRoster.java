import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class SuperheroRoster {

    public static void main(String[] args) {
        // This is the superhero data
        Superhero[] heroes = {
            new Superhero("Thor", "Thunder", 10),
            new Superhero("Iron Man", "Strength", 8),
            new Superhero("Captain America", "Speed", 6),
        };

        // superhero roster
        System.out.println("Superhero Roster:");
        for (Superhero hero : heroes) {
            hero.displayHero();
            System.out.println();
        }

        // Input favorite superhero
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite superhero: ");
        String superhero = input.nextLine();

        // Search for a superhero by name
        int index = findName(heroes, superhero);
        if (index != -1) {
            System.out.println("Hero found.");
        } else {
            System.out.println("Hero not found.");
        }

        // Calculate the average power level
        double averagePower = calculateAveragePower(heroes);
        System.out.println("Average power level is: " + averagePower);

        // Sort heroes by power level and display sorted list
        sortHeroesByPower(heroes);
    }

    // Find a hero by name
    public static int findName(Superhero[] heroes, String target) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getName().equalsIgnoreCase(target)) {
                System.out.println("Hero Found");
                heroes[i].displayHero();
                return i;
            }
        }
        return -1;
    }

    // Calculate the average power level
    public static double calculateAveragePower(Superhero[] heroes) {
        if (heroes.length == 0) {
            System.out.println("Hero not found.");
            return 0.0;
        }
        int sum = 0;
        for (Superhero hero : heroes) {
            sum += hero.getPowerLevel();
        }
        return (double) sum / heroes.length;
    }

    // Sorted superheroes power level highest to lowest
    public static void sortHeroesByPower(Superhero[] heroes) {
        Arrays.sort(heroes, Comparator.comparingInt(Superhero::getPowerLevel).reversed());
        System.out.println("\nHeroes sorted by power level (highest to lowest):");
        for (Superhero hero : heroes) {
            hero.displayHero();
            System.out.println();
        }
    }
}

// Superhero class
class Superhero {
    private String name;
    private String ability;
    private int powerLevel;

    // Constructor to initialize attributes
    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter power level
    public int getPowerLevel() {
        return powerLevel;
    }

    // Display hero details
    public void displayHero() {
    System.out.println("Name: " + name);
    System.out.println("Ability: " + ability);
    System.out.println("Power Level: " + powerLevel);
    }
}
