import java.util.Scanner;
public class SuperheroRoster{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String HeroNames[] = {"Thor", "Iron Man", "Captain America"};
        String abilities[] = {"Thunder", "Strength", "Speed"};
        int powerlevels [] = {10,8,6};
        String superhero;
        int index;
        for (int i = 0; i < HeroNames.length; i++) {
            System.out.println(HeroNames[i]);
            
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
    public static int findName (String arr[], String arr2[], int arr3[], String key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].compareToIgnoreCase(key) == 0){
                System.out.println(arr[i] + " Abilities: " + arr2[i] + " Power Level: " + arr3[i]);
                return i;
            }
        }
        return -1;
    }
    public static int averagePower(int arr3[]){
        int sum = 0, quantity = arr3.length;
        for(int i = 0; i < quantity; i++){
            sum = sum + arr3[i];
        }
        int avg = sum / quantity;
        return avg;
    }    
}