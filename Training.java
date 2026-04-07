package training;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Do you wish to continue? (True/False): ");
        boolean isContinue = scanner.nextBoolean();
        System.out.println("You choose " + isContinue);


        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("your age is " + age + " years old");

        System.out.print("how much is the price: ");
        double price = scanner.nextDouble();
        System.out.println("the price is " + price);
        
                if (isContinue) {
            System.out.println("Welcome Role Player");
        } else {
            System.out.println("404 ERROR");
        }

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        System.out.println("Your score is" + score);
        scanner.nextLine(); // without this it wont continue to the color

        System.out.print("Enter your color: ");
        String color = scanner.nextLine();
        System.out.println("your favorite color is " + color);


        double width = 0; 
        double area = 0;
        double height = 0;

        System.out.println("Enter the width: ");
        width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("the area is " + area + "cm"); //numlock + alt +0178

        scanner.close();

    }
}

class Story {
    public static void main(String[] happy) {
        Scanner scanner = new Scanner (System.in);

        String story1, story2, story3, story4, story5;

        System.out.print("Enter what are you doing: ");
        story1 = scanner.nextLine();
        System.out.print("Enter when do you start coding: ");
        story2 = scanner.nextLine();
        System.out.print("Who is your trainer: ");
        story3 = scanner.nextLine();
        System.out.print("what nc are you taking? ");
        story4 = scanner.nextLine();
        System.out.print("What school are you in: ");
        story5 = scanner.nextLine();

        System.out.println("I'm doing " + story1);
        System.out.println("I start coding in " + story2);
        System.out.println("My trainer name is " + story3);
        System.out.println("I'm taking " + story4);
        System.out.println("Thank you tesda and " + story5);

        scanner.close();
    }
    
}

class Variable {
    public static void main(String[] args) {
        
        String name = "Mark";
        String email = "mark123@gmail.com";
        String color = "blue";
        String food = "hotdog";
        int age = 24;
        char grade = 'A';
        double tempereture = 35.2;
        boolean isRpw = true;
        boolean notRpw = false;
        
        System.out.println("Your name is " + name);
        System.out.println("Your name is " + name + " " + color + " " + isRpw);
        System.out.println("Your name is " + name + " " + color + " " + notRpw);
        System.out.println("Your name is " + email + " " + food + " " + tempereture);


    }
}

class Aritmethic {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 13;
        int z;
        
        /*
        z = y + x;
        z = y * x;
        z = y - x;
        z = y / x;
        z = y % x;
        */
        z = y + x;

        System.out.println(z);

        // augmented assingment operators

        /*
        x += y;
        x *=y;
        x -= y;
        x /= y;
        x %= y;
        */

        x += y;

        System.out.println(x);

    // Increment and decrement operators

        int a = 1;
    a++;
    a++;
    a--;

    System.out.println(a);

    //order of operator [P.E.M.D.A.S]

    double result = 3 + 4 * (7 - 5) / 2.0;

    System.out.println(result);

    }


}
