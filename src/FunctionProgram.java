import java.util.Scanner;

class FunctionProgram {
    public static void main(String[] args) {
        System.out.println("Sum: "+addition(5,10));
        subtraction();
        division(5,10);
        System.out.println("Product: "+multiplication());
    }

    public static int addition (int a, int b) {
        return a+b;
    }

    public static void subtraction () {
        int a=5;
        int b=10;
        int c=b-a;
        System.out.println("Difference: "+c);
    }

    public static void division (int a, int b) {
        int c=b/a;
        System.out.println("Quotient: "+c);
    }

    public static int multiplication () {
        int a=5, b=10;
        return a*b;
    }
}

class Multiplication {
    public static void main(String[] args) {
        System.out.println(product(5,10,15));
    }

    public static int product (int a, int b, int c) {
        return a*b*c;
    }
}

class SI {
    public static void main(String[] args) {
        sI();
    }
    public static void sI() {
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

class AreaCircle {
    public static void main(String[] args) {
        System.out.println("Area: "+areaCircle());
    }
    public static double areaCircle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = input.nextDouble();

        return (22.0/7.0)*r*r;
    }
}

class PrimeComposite {
    public static void main(String[] args) {
        System.out.println(primeComposite());
    }

    public static String primeComposite() {
        String b="";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int j=0;
        for (int i=2; i<num; i++) {
            if (num%i==0) {
                j++;
                break;
            }
        }if (j==0) {
            return "Prime";
        } else {
            return "Composite";
        }
    }
}