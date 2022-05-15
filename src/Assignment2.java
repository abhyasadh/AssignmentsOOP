import java.util.Scanner;

class StudentDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Class: ");
        String std = input.nextLine();
        System.out.print("Enter College ID: ");
        String collegeId = input.nextLine();

        System.out.println("Student's Name: "+name);
        System.out.println("Class: "+std);
        System.out.println("College ID: "+collegeId);
    }
}

class SumOf4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b = input.nextInt();
        System.out.print("Enter another number: ");
        int c = input.nextInt();
        System.out.print("Enter another number: ");
        int d = input.nextInt();

        int sum = a+b+c+d;
        System.out.println("Sum: "+sum);
    }
}

class Result2 {
    public static void main(String[] args) {
        String[] subjects = {"Maths", "Software Design", "LED", "Programming"};
        Scanner input = new Scanner(System.in);
        double marks = 0;

        for (String i : subjects) {
            System.out.print("Enter marks in " + i + ": ");
            marks = marks + input.nextDouble();
        }

        double total = marks;
        double percentage = total / 4;
        String validity;
        validity = (percentage > 100) ? "\nInvalid Marks!" : "";
        System.out.println(validity);
        if (validity.equals("")) {
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage);
            if (percentage >= 70) {
                System.out.println("Result: First Class");
            } else if (percentage > 59) {
                System.out.println("Result: Upper Second Class");
            } else if (percentage > 49) {
                System.out.println("Result: Second Class");
            } else if (percentage >= 40) {
                System.out.println("Result: Third Class");
            } else {
                System.out.println("Result: Fail");
            }
        }
    }
}

class SumAndProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        int sum = a+b;
        int product = a*b;

        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
    }
}

class SumProductDivide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        int sum = a+b;
        int product = a*b;
        double division = (double) sum/product;

        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
        System.out.println("Quotient of Sum & Product: "+division);
    }
}

class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = input.nextDouble();

        double area=length*breadth;
        int intArea = (int) area;

        System.out.println("Area of Rectangle: "+intArea+" unit\u00b2");
    }
}

class NameRollInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Roll No.: ");
        int roll = input.nextInt();
        input.nextLine();
        System.out.print("Enter Field of Interest: ");
        String interest = input.nextLine();

        System.out.println("Hey, my name is "+name+" and my roll number is "+roll+". My field of interest is "+interest+".");
    }
}

class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Square: ");
        double length = input.nextDouble();

        double perimeter = 4*length;
        double area = length*length;

        System.out.println("Perimeter of Square: "+perimeter+" unit");
        System.out.println("Area of Square: "+area+" unit\u00b2");
    }
}

class SquareNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sq = num*num;

        System.out.println("Square: "+sq);
    }
}

class SingleLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT: ");
        String inp = input.nextLine();
        String inp2 = input.nextLine();

        System.out.println("OUTPUT: "+inp+inp2);
    }
}

class Equal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        System.out.print("Enter Third Number: ");
        int c = input.nextInt();

        String equality = (a==b&&a==c)?"All are equal":
                (a==b||a==c||b==c)?"Two are equal":"None are equal";
        System.out.println(equality);

    }
}

class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        boolean equality = (a<50&&a<b);
        System.out.println(equality);
    }
}

class Robert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Marks: ");
        double a = input.nextDouble();
        System.out.print("Enter Second Marks: ");
        double b = input.nextDouble();
        System.out.print("Enter Third Marks: ");
        double c = input.nextDouble();

        double total = a+b+c;
        double percentage = total/3;

        if (total<=300&&total>=0) {
        System.out.println("Total: "+total);
        System.out.println("Percentage: "+percentage);
        } else {
            System.out.println("Invalid Marks");
        }
    }
}