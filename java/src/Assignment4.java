import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number:");
        int num2 = input.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " is greater.");
        } else if (num1<num2) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}

class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        if (num1>num2&&num1>num3) {
            System.out.println(num1+" is greatest.");
        } else if (num2>num1&&num2>num3) {
            System.out.println(num2+" is greatest.");
        }
        else if (num3>num1&&num3>num2) {
            System.out.println(num3+" is greatest.");
        } else {
            System.out.println("Numbers are equal.");
        }
    }
}

class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();

        if (num1>0) {
            System.out.println("Positive Number!");
        } else if (num1<0) {
            System.out.println("Negative Number!");
        } else {
            System.out.println("Zero!");
        }
    }
}

class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        if (num1%5==0&&num1%11==0) {
                System.out.println("Divisible by 5 and 11!");
        } else {
            System.out.println("Not divisible by 5 and 11!");
        }
    }
}

class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        if (num1%2==0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        if ((year%4==0&&year%100!=0)||year%400==0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Normal Year");
        }
    }
}

class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char str = input.next().charAt(0);
        boolean result = Character.isDigit(str);
        if(result) {
            System.out.println("'"+ str+"' is a number");
        }
        else {
            System.out.println("'"+ str+"' is a letter");
        }
    }
}

class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String str = input.next();
        if (str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u")) {
            System.out.println("'"+ str+"' is a vowel!");
        }
        else {
            System.out.println("'"+ str+"' is a consonant!");
        }
    }
}

class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char str = input.next().charAt(0);
        boolean result = Character.isDigit(str);
        boolean result2 = Character.isAlphabetic(str);
        if(result) {
            System.out.println("'"+ str+"' is a number");
        }
        else if (result2) {
            System.out.println("'"+ str+"' is a letter");
        } else {
            System.out.println("'"+ str+"' is a special character");
        }
    }
}

class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char str = input.next().charAt(0);
        boolean result = Character.isUpperCase(str);
        if(result) {
            System.out.println("'"+ str+"' is uppercase");
        }
        else {
            System.out.println("'"+ str+"' is lowercase");
        }
    }
}

class Question11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the week number:");
        int day= input.nextInt();
        if (day==1){
            System.out.println("It is Sunday");
        }
        else if (day==2){
            System.out.println("It is Monday");
        }
        else if (day==3){
            System.out.println("It is Tuesday");
        }
        else if (day==4){
            System.out.println("It is Wednesday");
        }
        else if (day==5){
            System.out.println("It is Thursday");
        }
        else if (day==6){
            System.out.println("It is Friday");
        }
        else if (day==7){
            System.out.println("It is Saturday");
        }
        else{
            System.out.println("Invalid Number!");
        }
    }
}

class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = input.nextInt();
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            System.out.println("No. of Days: 31");
        } else if (month==4||month==6||month==9||month==11) {
            System.out.println("No. of Days: 30");
        } else if (month==2) {
            System.out.println("No. of Days: 28");
        } else {
            System.out.println("Invalid month number!");
        }
    }
}

class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first angle: ");
        int angle1 = input.nextInt();
        System.out.println("Enter second angle: ");
        int angle2 = input.nextInt();
        System.out.println("Enter third angle: ");
        int angle3 = input.nextInt();

        if (angle1+angle2+angle3==180) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}

class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        int side1 = input.nextInt();
        System.out.println("Enter second side of triangle: ");
        int side2 = input.nextInt();
        System.out.println("Enter third side of triangle: ");
        int side3 = input.nextInt();

        if (side1+side2>=side3&&side1-side2<=side3) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}

class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first angle: ");
        int angle1 = input.nextInt();
        System.out.println("Enter second angle: ");
        int angle2 = input.nextInt();
        System.out.println("Enter third angle: ");
        int angle3 = input.nextInt();

        if (angle1==angle2&&angle1==angle3) {
            System.out.println("Triangle is equilateral.");
        } else if (angle1==angle2||angle2==angle3||angle1==angle3){
            System.out.println("Triangle is isosceles.");
        } else {
            System.out.println("Triangle is scalene.");
        }
    }
}

class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient of x\u00b2: ");
        int a = input.nextInt();
        System.out.println("Enter coefficient of x: ");
        int b = input.nextInt();
        System.out.println("Enter constant: ");
        int c = input.nextInt();

        double d = Math.sqrt((b*b)-(4*a*c));

        double root1 = (d-b)/(2*a);
        double root2 = -(b+d)/(2*a);

        System.out.println("Solution 1: "+root1+"\nSolution 2: "+root2);
    }
}

class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int cp = input.nextInt();
        System.out.print("Enter SP:");
        int sp = input.nextInt();

        if (sp>cp) {
            System.out.println("Profit");
        } else if (sp<cp) {
            System.out.println("Loss");
        } else {
            System.out.println("Neither profit nor loss");
        }
    }
}

class Question19 {
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
        String validity;
        validity = (percentage>100||percentage<0) ? "\nInvalid Marks!" : "";
        if (validity.equals("")) {
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage);
            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 60) {
                System.out.println("Grade: D");
            } else if (percentage >= 40) {
                System.out.println("Grade: E");}
            else {
                System.out.println("Grade: F");
            }
        }else {
            System.out.println(validity);
        }
    }
}

class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary = input.nextInt();

        double hra, da, grossSalary;

        if (salary<10000) {
            hra = 0.2*salary;
            da = 0.8*salary;
        } else if (salary<=20000) {
            hra = 0.25*salary;
            da = 0.9*salary;
        } else {
            hra = 0.3*salary;
            da=0.95*salary;
        }

        grossSalary=salary+hra+da;

        System.out.println("Gross salary:  Rs."+grossSalary);
    }
}

class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units: ");
        int units = input.nextInt();
        double price;

        if (units<=50) {
            price=units*0.5;
        } else if (units<=150) {
            price=25+(units-50)*0.75;
        } else if (units<=250) {
            price=25+75+(units-150)*1.2;
        } else {
            price=25+75+180+(units-250)*1.5;
        }
        double total=price+0.2*price;
        System.out.println("Total price: "+total);
    }
}