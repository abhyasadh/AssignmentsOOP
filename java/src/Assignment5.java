import java.util.Scanner;

class A5Question1 {
    public static void main(String[] args) {
        String[] subjects = {"Physics", "Chemistry", "Biology", "Maths", "Computer"};
        Scanner input = new Scanner(System.in);
        double marks = 0;

        for (String i : subjects) {
            System.out.print("Enter marks in " + i + ": ");
            marks = marks + input.nextDouble();
        }

        double total = marks;
        double percentage = total / 5;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        double percentage10=percentage/10;
        int intPer= (int) percentage10;

        switch (intPer) {
            case 9 -> System.out.println("Grade: A");
            case 8 -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            case 6 -> System.out.println("Grade: D");
            case 4 -> System.out.println("Grade: E");
            default -> System.out.println("Grade: F");
        }
    }
}

//class A5Question2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num1 = input.nextInt();
//        System.out.print("Enter another number:");
//        int num2 = input.nextInt();
//
//        switch (num1 > num2) {
//            case 1 -> System.out.println(num1 + " is greater!");
//            case 0 -> System.out.println(num2 + " is greater!");
//            default -> System.out.println("Both are equal!");
//        }
//    }
//}

class A5Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();

        switch (year%4) {
            case 0 : switch (year%100) {
                case 0 :
                    switch (year % 400) {
                        case 0 -> System.out.println("Leap Year");
                        default -> System.out.println("Normal Year");
                    }
                    break;
                default:
                    System.out.println("Leap Year");
                    break;
            }break;
            default:
                System.out.println("Normal Year");
                break;
        }
    }
}

class A5Question10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the week number:");
        int day= input.nextInt();

        switch (day) {
            case 1 -> System.out.println("It is Sunday");
            case 2 -> System.out.println("It is Monday");
            case 3 -> System.out.println("It is Tuesday");
            case 4 -> System.out.println("It is Wednesday");
            case 5 -> System.out.println("It is Thursday");
            case 6 -> System.out.println("It is Friday");
            case 7 -> System.out.println("It is Saturday");
            default -> System.out.println("Invalid Number!");
        }
    }
}

class A5Question11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month number:");
        int day= input.nextInt();

        switch (day) {
            case 1,3,5,7,8,10,12 -> System.out.println("No. of Days: 31");
            case 4,6,9,11 -> System.out.println("No. of Days: 30");
            case 2 -> System.out.println("No. of Days: 28");
            default -> System.out.println("Invalid Number!");
        }
    }
}

class A5Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary = input.nextInt();

        double hra, da, grossSalary;
        int salaryInt = (salary-1)/10000;

        switch (salaryInt) {
            case 0:
                hra = 0.2*salary;
                da = 0.8*salary;
            case 1:
                hra = 0.25*salary;
                da = 0.9*salary;
            default:
                hra = 0.3*salary;
                da=0.95*salary;
        }

        grossSalary=salary+hra+da;

        System.out.println("Gross salary:  Rs."+grossSalary);
    }
}

class A5Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units: ");
        int units = input.nextInt();
        double price;

        int unitsInt = units/50;
        switch (unitsInt) {
            case 0 -> price=units*0.5;
            case 1,2 -> price=25+(units-50)*0.75;
            case 3,4 -> price=25+75+(units-150)*1.2;
            default -> price=25+75+180+(units-250)*1.5;
        }
        double total=price+0.2*price;
        System.out.println("Total price: "+total);
    }
}

class A5Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = input.nextInt();
        hours = hours%24;
        System.out.println("Enter minutes: ");
        input.nextInt();

        switch (hours) {
            case 0,1,2,3,4,5,6,7,8,9,10,11 -> System.out.println("AM");
            case 13,14,15,16,17,18,19,20,21,22,23 -> System.out.println("PM");
            }
    }
}

class A5Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(-num);
    }
}