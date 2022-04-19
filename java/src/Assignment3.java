import javax.swing.JOptionPane;

class StudentDetails2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Enter Your Name: ");
        String address = JOptionPane.showInputDialog(null,"Enter Address: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Age: "));
        JOptionPane.showMessageDialog(null, "Name: "+name+"\nAddress: "+address+"\nAge: "+age);
        System.exit(0);
    }
}

class SumOfFour {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter another number: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter another number: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter another number: "));

        int sum = a+b+c+d;
        JOptionPane.showMessageDialog(null, "Sum of Numbers: "+sum);
        System.exit(0);
    }
}

class Result3 {
    public static void main(String[] args) {
        String[] subjects = {"Maths", "Software Design", "LED", "Programming"};
        double marks = 0;

        for (String i : subjects) {
            int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter marks in " + i + ": "));
            marks=marks+mark;
        }

        double total = marks;
        double percentage = total / 4;
        String res;
        if (percentage >= 70) {
            res=("Result: First Class");
        } else if (percentage > 59) {
            res=("Result: Upper Second Class");
        } else if (percentage > 49) {
            res=("Result: Second Class");
        } else if (percentage >= 40) {
            res=("Result: Third Class");
        } else {
            res=("Result: Fail");
        }
        JOptionPane.showMessageDialog(null,"Total Marks: " + total + "\nPercentage: " + percentage + "\u0025\n"+res);
    }
}

class SumAndProduct2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter another number: "));
        int sum = a+b;
        int product = a*b;

        JOptionPane.showMessageDialog(null,"Sum: "+sum+"\nProduct: "+product);
    }
}

class SumProductDivide2 {
    public static void main(String[] args) {
        int a= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter First Number: "));
        int b= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Second Number: "));

        int sum = a+b;
        int product = a*b;
        double division = (double) sum/product;

        JOptionPane.showMessageDialog(null, "Sum: "+sum+"\nProduct: "+product+"\nQuotient of Sum & Product: "+division);
    }
}

class AreaOfRectangle2 {
    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter length: "));
        double breadth = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter breadth: "));

        double area=length*breadth;
        int intArea = (int) area;

        JOptionPane.showMessageDialog(null,"Area of Rectangle: "+intArea+" unit\u00b2");
    }
}

class NameRollInterest2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null,"Enter Name: ");
        int roll = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Roll No.: "));
        String interest = JOptionPane.showInputDialog(null,"Enter Field of Interest: ");

        JOptionPane.showMessageDialog(null,"Hey, my name is "+name+" and my roll number is "+roll+". My field of interest is "+interest+".");
    }
}

class Square2 {
    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length of Square: "));

        double perimeter = 4*length;
        double area = length*length;

        JOptionPane.showMessageDialog(null,"Perimeter of Square: "+perimeter+" unit"+"Area of Square: "+area+" unit\u00b2");
    }
}

class SquareNum2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));

        int sq = num*num;

        JOptionPane.showMessageDialog(null,"Square: "+sq);
    }
}

class SingleLine2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"INPUT: ");
        String input2 = JOptionPane.showInputDialog(null,"SECOND INPUT: ");

        JOptionPane.showMessageDialog(null,"OUTPUT: "+input+input2);
    }
}

class Equal2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter First Number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Second Number: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Third Number: "));

        String equality = (a==b&&a==c)?"All are equal":
                (a==b||a==c||b==c)?"Two are equal":"None are equal";
        JOptionPane.showMessageDialog(null,equality);
    }
}

class Conditions2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter another number: "));

        boolean equality = (a<50&&a<b);
        JOptionPane.showMessageDialog(null,equality);
    }
}

class Robert2 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter First Marks: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter Second Marks: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter Third Marks: "));

        double total = a+b+c;
        double percentage = total/3;

        if (total<=300&&total>=0) {
            JOptionPane.showMessageDialog(null,"Total: "+total+"\nPercentage: "+percentage);
        } else {
            JOptionPane.showMessageDialog(null,"Invalid Marks");
        }
    }
}