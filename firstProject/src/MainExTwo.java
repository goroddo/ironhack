public class MainExTwo {
    public static void main(String[] args) {
        int userAge = 18;

        String notEnter = "You cannot enter";
        String enter = "You can enter";
        String enterLimited = "You can enter with limited power";

        int userType;

        if (userAge >= 21) {
            userType = 1;
            System.out.println(enter);
        } else if (userAge < 21 && userAge >= 18) {
            userType = 2;
            System.out.println(enterLimited);
        } else {
            userType = 3;
            System.out.println(notEnter);
        }

        switch (userType) {
            case 1 -> System.out.println(enter);
            case 2 -> System.out.println(enterLimited);
            default -> System.out.println(notEnter);
        }


        /*
        boolean boolEnter = userAge >= 21;
        switch (boolEnter) {
            case true -> System.out.println(enter);
            case false ->
        }

         */
    }
}

/*
Create a program that based on user age print a message:
> 21 -> you can enter,
<21 y > 18 you can enter with limited power,
< 18 -> you cannot enter. Use both if else and switch
 */