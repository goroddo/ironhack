
public class MainDayTwo {
    public static void main(String[] args) {
        // Conditions
        int statusCode = 7;
        if (statusCode > 10) {
            System.out.println("Poh claro");
        } else if (statusCode <= 10 && statusCode > 5) {
            System.out.println("Maybe");
        } else {
            System.out.println("Poh no");
        }

        switch (statusCode) {
            case 1 -> System.out.println("Only 1?");
            case 2 -> System.out.println("So greedy");
            default -> System.out.println("nothing");
        };

        // Iterate

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }
        // Methods
        // Git

    }
}
