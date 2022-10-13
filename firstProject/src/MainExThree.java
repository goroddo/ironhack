public class MainExThree {
    public static void main(String[] args) throws InterruptedException {
        timer(5);

        String[] menu=  {"Entrants", "Mains", "Desserts", "Wines"};
        printMenu(menu);

        spellString("Acidodesoxiribonucleico");
    }

    public static void timer(int maxTime) throws InterruptedException {
        Integer sleep = 1;
        for (int i = maxTime; i >= 0; i--) {
            Thread.sleep(1000);
            if (i == 0) {
                System.out.println("Time out!!!");
            } else {
                System.out.printf("%s seconds remaining...\n",i);
            }
        }
    }

    public static void printMenu(String ... dishes){
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }

    public static void spellString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + ": " + str.charAt(i));
        }
        System.out.println(str);
    }
}
/*
Create a program that simulate an alarm. Use while or  for loop;
Based on a menu of a restaurant ( poner six elements), create a program that prints the list of dishes in the menu.
20:37
Create a program that based on a String, spells it by printing the character and it's position in the string . At the end print the full string!
 */
