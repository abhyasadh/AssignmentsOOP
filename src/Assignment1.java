import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double principle = input.nextDouble();
        System.out.print("Enter Time (In Years): ");
        double time = input.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = input.nextDouble();

        double simpleInterest=(principle*time*rate)/100;
        System.out.println("Simple interest in "+time+" year(s): Rs."+simpleInterest);
    }
}

class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Can Vote!");
        } else {
            System.out.println("Can't Vote!");
        }
    }
}

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = input.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = input.nextInt();
        double AreaOfTriangle = 0.5*length*breadth;

        System.out.println("Area of Triangle = "+AreaOfTriangle+" unit\u00b2");
    }
}

class VolumeCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = input.nextInt();

        System.out.println("Volume of Cube = "+length*length*length+" unit\u00b3");
    }
}

class VotingTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = input.nextInt();
        String eligibility;
        eligibility = (age>=18)?"Can Vote!":"Can't Vote";
        System.out.println(eligibility);
    }
}

class VolumeCuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = input.nextInt();
        System.out.print("Enter Breadth: ");
        int breadth = input.nextInt();
        System.out.print("Enter Height: ");
        int height = input.nextInt();

        System.out.println("Volume of Cuboid: "+length*breadth*height+" unit\u00b3");
    }
}

class Result {
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
/*        String result=(percentage>=70)?"Result: First Class":
//                (percentage>=59&&percentage<70)?"Result: Upper Second Class":
//                        (percentage>=49&&percentage<59)?"Result: Second Class":
//                                (percentage>=40)?"Result: Third Class": "Fail";

        System.out.println(result);

*/
    }
}