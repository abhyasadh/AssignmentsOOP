import java.util.Random;
import java.util.Scaner;

class A6Question1 {
    public static void main(String[] args) {

        //For loop
        for (int i=1;i<=10;i++) {
            System.out.println(i);
        }

        //While loop
        int j=1;
        while (j<=10) {
            System.out.println(j);
            j++;
        }

        //Do-While loop
        int k=1;
        do {
            System.out.println(k);
            k++;
        } while (k<=10);
    }
}

class A6Question2 {
    public static void main(String[] args) {

        //For loop
        for (int i=10; i<=30; i+=2) {
            System.out.println(i);
        }

        //While loop
        int j=10;
        while (j<=30) {
            System.out.println(j);
            j+=2;
        }

        //Do-While loop
        int k=10;
        do {
            System.out.println(k);
            k+=2;
        } while (k<=30);
    }
}

class A6Question3 {
    public static void main(String[] args) {
        int count1 = 0, count2 = 0, count3 = 0;

        //For loop
        for (int i = 10; i <= 30; i++) {
            if (i % 2 == 0) {
                count1++;
            }
            System.out.println("No. of even: " + count1);

            //While loop
            int j = 10;
            while (j <= 30) {
                if (j % 2 == 0) {
                    count2++;
                }
                j++;
            }
            System.out.println("No. of even: " + count2);

            //Do-While loop
            int k = 10;
            do {
                if (k % 2 == 0) {
                    count3++;
                }
                k++;
            } while (k <= 30);
            System.out.println("No. of even: " + count3);
        }
    }
}

class A6Question4 {
    public static void main(String[] args) {
        int count11=0, count12=0,count21=0, count22=0,count31=0, count32=0;

        //For loop
        for (int i=10; i<=30; i++) {
            if (i%2==0) {
                count11++;
            } else {
                count12++;
            }
        }
        System.out.println("No. of even: "+count11+"\nNo.of odd: "+count12);

        //While loop
        int j=10;
        while (j<=30) {
            if (j%2==0) {
                count21++;
            } else {
                count22++;
            }
            j++;
        }
        System.out.println("No. of even: "+count21+"\nNo.of odd: "+count22);

        //Do-While loop
        int k=10;
        do {
            if (k%2==0) {
                count31++;
            } else {
                count32++;
            }
            k++;
        } while (k<=30);
        System.out.println("No. of even: "+count31+"\nNo.of odd: "+count32);
    }
}

class A6Question5 {
    public static void main(String[] args) {

        //For loop
        for (int n1=1; n1<10; n1++) {
            int product = n1*3;
            System.out.println("3 x "+n1+" = "+product);
            n1++;
        }

        //While loop
        int n2=1;
        while (n2<10) {
            int product = n2*3;
            System.out.println("3 x "+n2+" = "+product);
            n2++;
        }

        //Do-while loop
        int n3=1;
        do {
            int product = n3*3;
            System.out.println("3 x "+n3+" = "+product);
            n3++;
        } while (n3<10);
    }
}

class A6Question6 {
    public static void main(String[] args) {
        int count1 = 0, count2 = 0, count3 = 0;

        //For loop
        for (int i=1; i<=10; i++) {
            count1=count1+i;
        }
        System.out.println("Sum: "+count1);

        //While loop
        int j=1;
        while (j<=10) {
            count2=count2+j;
            j++;
        }
        System.out.println("Sum: "+count2);

        //Do-while loop
        int k=1;
        do {
            count3=count3+k;
            k++;
        } while (k<=10);
        System.out.println("Sum: "+count3);
    }
}

class A6Question7 {
    public static void main(String[] args) {

        //For loop
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        for (int n1=1; n1<=10; n1++) {
            int product = n1*num1;
            System.out.println(num1+" x "+n1+" = "+product);
        }

        //While loop
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num2 = input2.nextInt();

        int n2=1;
        while (n2<=10) {
            int product = n2*num2;
            System.out.println(num2+" x "+n2+" = "+product);
            n2++;
        }

        //Do-while loop
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num3 = input3.nextInt();

        int n3=1;
        do {
            int product = n3*num3;
            System.out.println(num3+" x "+n3+" = "+product);
            n3++;
        } while (n3<=10);
    }
}

class A6Question8 {
    public static void main(String[] args) {
        int count1 = 1, count2 = 1, count3 = 1;
        Scanner input = new Scanner(System.in);

        //For loop
        System.out.print("Enter a number: ");

        for (int i=input.nextInt(); i>0; i--) {
            count1=count1*i;
        }
        System.out.println("Factorial: "+count1);

        //While loop
        System.out.print("Enter a number: ");

        int j = input.nextInt();
        while (j>0) {
            count2=count2*j;
            j--;
        }
        System.out.println("Factorial: "+count2);

        //Do-while loop
        System.out.print("Enter a number: ");

        int k = input.nextInt();
        do {
            count3=count3*k;
            k--;
        } while (k>0);
        System.out.println("Factorial: "+count3);
    }
}

class A6Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //For loop
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.print("Enter exponent: ");
        int pow=input.nextInt();

        int result=1,result2=1,result3=1;

        for (int i=0; i<pow; i++) {
            result=result*num;
        }
        System.out.println("Result: "+result);

        //While loop
        int j = 0;
        while (j<pow) {
            result2=result2*num;
            j++;
        }
        System.out.println("Result: "+result2);

        //Do-while loop
        int k = 0;
        do {
            result3=result3*num;
            k++;
        } while (k<pow);
        System.out.println("Result: "+result3);
    }
}

class A6Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int digit;
        int i;
        int rev=0;

        //For loop
        for (i=num;i>0;i/=10) {
            digit = i % 10;
            rev = rev * 10 + digit;
        }
        System.out.println(rev);

        //While loop
        i=num;
        rev=0;
        while (i>0) {
            digit = i % 10;
            rev = rev * 10 + digit;
            i/=10;
        }
        System.out.println(rev);

        //Do-while loop
        i=num;
        rev=0;
        do {
            digit = i % 10;
            rev = rev * 10 + digit;
            i/=10;
        } while (i>0);
        System.out.println(rev);
    }
}

class A6Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int i,digit,even=0,odd=0;

        //For loop
        for (i=num;i>0;i/=10) {
            digit = i % 10;
            if (digit%2==0) {
                even=even+digit;
            } else {
                odd=odd+digit;
            }
        }
        System.out.println("Sum of even: "+even);
        System.out.println("Sum of odd: "+odd);

        //While loop
        i=num;
        while (i>0) {
            digit = i % 10;
            if (digit%2==0) {
                even=even+digit;
            } else {
                odd=odd+digit;
            }
            i/=10;
        }
        System.out.println("Sum of even: "+even);
        System.out.println("Sum of odd: "+odd);

        //Do-while loop
        i=num;
        do {
            digit = i % 10;
            if (digit%2==0) {
                even=even+digit;
            } else {
                odd=odd+digit;
            }
            i/=10;
        } while (i>0);
        System.out.println("Sum of even: "+even);
        System.out.println("Sum of odd: "+odd);
    }
}

class A6Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        //For loop
        int j=0;
        for (int i=2; i<num; i++) {
            if (num%i==0) {
                j++;
            }
        }if (j==0) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        //While loop
        j=0;
        int i=2;
        while (i<num) {
            if (num%i==0) {
                j++;
                i++;
            }
        }if (j==0) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        //Do-while loop
        j=0;
        i=2;
        do {
            if (num%i==0) {
                j++;
                i++;
            }
        }while (i<num);
        if (j==0) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}

class A6Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1=input.nextInt();
        System.out.print("Enter another number: ");
        int num2=input.nextInt();

        //For loop
        int i,j=0;
        for (i=1;i<=num1;i++) {
            if(num1%i==0&&num2%i==0) {
                j=i;
            }
        }
        System.out.println("HCF: "+j);

        //While loop
        i=1; j=0;
        while (i<=num1) {
            if(num1%i==0&&num2%i==0) {
                j=i;
                i++;
            }
        }
        System.out.println("HCF: "+j);

        //Do-while loop
        i=1; j=0;
        do {
            if(num1%i==0&&num2%i==0) {
                j=i;
                i++;
            }
        } while (i<=num1);
        System.out.println("HCF: "+j);
    }
}

class A6Question14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char decision;
        do{
            System.out.print("Enter a number: ");
            int num1=input.nextInt();
            System.out.print("Enter another number: ");
            int num2=input.nextInt();

            int sum=num1+num2;
            System.out.println("Sum: "+sum);

            System.out.print("Continue?(y/n): ");
            decision = input.next().charAt(0);
        } while (decision == 'y');
    }
}

class A6Question15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char decision;
        int p=0,n=0,z=0,num;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num>0) {
                p++;
            } else if (num<0) {
                n++;
            } else {
                z++;
            }
            System.out.print("Continue?(y/n): ");
            decision = input.next().charAt(0);
        } while (decision == 'y');
        System.out.println("Positive: "+p);
        System.out.println("Negative: "+n);
        System.out.println("Zero: "+z);
    }
}

class A6Question16{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char decision;
        int num,greatest=0,least=0,j=0;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num>greatest) {
                greatest=num;
            } else if (least==0&&num!=0) {
                least = num;
                j=1;
            } else if (num<least&&j>0) {
                least = num;
            } else {
                assert true;
            }
            System.out.print("Continue?(y/n): ");
            decision = input.next().charAt(0);
        } while (decision == 'y');
        System.out.println("Greatest: "+greatest);
        System.out.println("Least: "+least);
    }
}

class A6Question17 {
    public static void main(String[] args) {

        int digit,i;

       //For loop
        for (i=1;i<=500;i++) {
            int cube=0;
            for (int j=i;j>0;j/=10) {
                digit=j%10;
                cube+=digit*digit*digit;
            }
            if (cube==i) {
                System.out.println(i);

            }
        }

        //While loop
        i=1;
        while (i<=500) {
            int cube=0, j=i;
            while (j>0) {
                digit=j%10;
                cube+=digit*digit*digit;
                j/=10;
            }
            if (cube==i) {
                System.out.println(i);
            }
            i++;
        }

        //Do-while loop
        i=1;
        do {
            int cube=0, j=i;
            while (j>0) {
                digit=j%10;
                cube+=digit*digit*digit;
                j/=10;
            }
            if (cube==i) {
                System.out.println(i);
            }
            i++;
        } while (i<=500);
    }
}

class A6Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int terms = input.nextInt();

        //For loop
        int i, x=0, y=1, z=1;
        for (i=1;i<=terms;i++) {
            System.out.println(x);
            x=y;
            y=z;
            z=x+y;
        }

        //While loop
        x=0; y=1; z=1; i=1;
        while (i<=terms) {
            System.out.println(x);
            x=y;
            y=z;
            z=x+y;
            i++;
        }

        //Do-while loop
        x=0; y=1; z=1; i=1;
        do {
            System.out.println(x);
            x=y;
            y=z;
            z=x+y;
            i++;
        } while (i<=terms);
    }
}

class A6Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int terms = input.nextInt();

        //For loop
        double i;
        double sum=0;
        for (i=1;i<=terms;i++) {
            sum=sum+1/i;
        }
        System.out.println(sum);

        //While loop
        i=1; sum=0;
        while (i<=terms) {
            sum=sum+1/i;
            i++;
        }
        System.out.println(sum);

        //Do-while loop
        i=1; sum=0;
        do {
            sum=sum+1/i;
            i++;
        } while (i<=terms);
        System.out.println(sum);
    }
}

class A6Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int terms = input.nextInt();

        //For loop
        double i;
        double sum=0;
        for (i=1;i<=terms;i++) {
            if (i % 2 != 0) {
                sum = sum + 1 / i;
            } else {
                sum = sum - 1 / i;
            }
        }
        System.out.println(sum);

        //While loop
        i=1; sum=0;
        while (i<=terms) {
            if (i % 2 != 0) {
                sum = sum + 1 / i;
            } else {
                sum = sum - 1 / i;
            }
            i++;
        }
        System.out.println(sum);

        //Do-while loop
        i=1; sum=0;
        do {
            if (i % 2 != 0) {
                sum = sum + 1 / i;
            } else {
                sum = sum - 1 / i;
            }
            i++;
        } while (i<=terms);
        System.out.println(sum);
    }
}

class A6Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1,100);

        System.out.print("Enter a number to begin: ");
        int userInput=input.nextInt();

//        //For loop
//        for (int i=0; i<=100; i++) {
//            if (userInput>num) {
//                System.out.println("Too high, try again!");
//                userInput=input.nextInt();
//            } else if (userInput<num) {
//                System.out.println("Too low, try again!");
//                userInput = input.nextInt();
//            } else {
//                System.out.println("Congratulations! You guessed the number!");
//                break;
//            }
//        }

//        //While loop
//        while (num!=userInput) {
//            if (userInput > num) {
//                System.out.println("Too high, try again!");
//                userInput = input.nextInt();
//            } else if (userInput < num) {
//                System.out.println("Too low, try again!");
//                userInput = input.nextInt();
//            } else {
//                break;
//            }
//        }
//        System.out.println("Congratulations! You guessed the number!");

        //Do-while loop
        do {
            if (userInput > num) {
                System.out.println("Too high, try again!");
                userInput = input.nextInt();
            } else if (userInput < num) {
                System.out.println("Too low, try again!");
                userInput = input.nextInt();
            } else {
                break;
            }
        } while (num!=userInput);
        System.out.println("Congratulations! You guessed the number!");
    }
}

class A6Question22i {
    public static void main(String[] args) {

//        //For loop
//        for (int i=1; i<=4; i++) {
//            for (int j=1; j<=10; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //While loop
//        int i=1;
//        while (i<=4) {
//            int j=1;
//            while (j<=10) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        int i=1;
        do {
            int j=1;
            do {
                System.out.print("*");
                j++;
            } while (j<=10);
            System.out.println();
            i++;
        } while (i<=4);
    }
}

class A6Question22ii {
    public static void main(String[] args) {

//        //For loop
//        for (int i=1; i<=5; i++) {
//            for (int j=i; j>=1; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //While loop
//        int i=1;
//        while (i<=5) {
//            int j=i;
//            while (j>=1) {
//                System.out.print("*");
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

        int i=1;
        do {
            int j=i;
            do {
                System.out.print("*");
                j--;
            } while (j>=1);
            System.out.println();
            i++;
        } while (i<=5);
    }
}

class A6Question22iii {
    public static void main(String[] args) {

//        //For loop
//        for (int i=5; i>=1; i--) {
//            for (int j=i; j>1; j--) {
//                System.out.print(" ");
//            }
//            for (int k=(5-i); k>=0; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //While loop
//        int i=5;
//        while (i>=1) {
//            int j = i;
//            while (j > 1) {
//                System.out.print(" ");
//                j--;
//            }
//            int k = (5 - i);
//            while (k >= 0) {
//                System.out.print("*");
//                k--;
//            }
//            i--;
//            System.out.println();
//        }

        //Do-while loop
        int i = 5;
        do {
            int j = i;
            do {
                System.out.print(" ");
                j--;
            } while (j > 0);

            int k = (5 - i);
            do {
                System.out.print("*");
                k--;
            } while (k >= 0);
            i--;
            System.out.println();
        } while (i >= 1);
    }
}

class A6Question22iv {
    public static void main(String[] args) {

//        //For loop
//        for (int i=5; i>=1; i--) {
//            for (int j=i; j>1; j--) {
//                System.out.print(" ");
//            }
//            for (int k=(10-2*i); k>=0; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //While loop
//        int i=5;
//        while (i>=1) {
//            int j = i;
//            while (j > 1) {
//                System.out.print(" ");
//                j--;
//            }
//            int k = (10 - 2*i);
//            while (k >= 0) {
//                System.out.print("*");
//                k--;
//            }
//            i--;
//            System.out.println();
//        }

        //Do-while loop
        int i = 5;
        do {
            int j = i;
            do {
                System.out.print(" ");
                j--;
            } while (j > 0);

            int k = (10 - 2*i);
            do {
                System.out.print("*");
                k--;
            } while (k >= 0);
            i--;
            System.out.println();
        } while (i >= 1);
    }
}

class A6Question22v {
    public static void main(String[] args) {

//        //For loop
//        for (int i=1; i<=5; i++) {
//            for (int j=5-i; j>0; j--) {
//                System.out.print(" ");
//            }
//            for (int k=(i*2)-1; k>=1; k--) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

//        //While loop
//        int i=1;
//        while (i<=5) {
//            int j = 5-i;
//            while (j > 0) {
//                System.out.print(" ");
//                j--;
//            }
//            int k = ((2*i)-1);
//            while (k >= 1) {
//                System.out.print(i);
//                k--;
//            }
//            i++;
//            System.out.println();
//        }

        //Do-while loop
        int i = 1;
        do {
            int j = 5-i;
            do {
                System.out.print(" ");
                j--;
            } while (j >= 0);

            int k = (2*i)-1;
            do {
                System.out.print(i);
                k--;
            } while (k >= 1);
            i++;
            System.out.println();
        } while (i <= 5);
    }
}

class A6Question22vi {
    public static void main(String[] args) {

        //For loop
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }

            for(int j=-i; j<=i; j++) {
                if (j==0||j==1) {
                    continue;
                }
                System.out.print(Math.abs(j));
            }
            System.out.println();
        }
    }
}