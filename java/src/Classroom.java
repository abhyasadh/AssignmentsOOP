import java.util.Scanner;

class Classroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();

        switch ((a > b && a > c) ? 0 : 1) {
            case 0:
                System.out.println(a + " is greater");
                break;
            case 1:
                switch ((b > c) ? 0 : 1) {
                    case 0 -> System.out.println(b + " is greater");
                    case 1 -> System.out.println(c + " is greater");
                }
                break;
        }
    }
}

class triangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = input.nextInt();
        System.out.print("Enter second side: ");
        int b = input.nextInt();
        System.out.print("Enter third side: ");
        int c = input.nextInt();

        switch ((a==b&&a==c)?0:1) {
            case 0:
                System.out.println("Triangle is equilateral!");
                break;
            case 1:
                switch ((a == b || a == c || b == c) ? 0 : 1) {
                    case 0 -> System.out.println("Triangle is isosceles!");
                    case 1 -> System.out.println("Triangle is scalene!");
                }break;
        }
    }
}

class triangle2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        int a = input.nextInt();
        System.out.print("Enter second angle: ");
        int b = input.nextInt();
        System.out.print("Enter third angle: ");
        int c = input.nextInt();

        switch (a + b + c) {
            case 180 -> System.out.println("Triangle is valid!");
            default -> System.out.println("Triangle is invalid!");
        }
    }
}