import java.util.Arrays;
import java.util.Scanner;

class ClassQuestion {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray()));
    }

    public static int[] createArray () {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];

        for (int i=0;i<a.length;i++) {
            System.out.println("Enter a number: ");
            a[i] = input.nextInt();
        }
        return a;
    }
}

//WAP to print multiples of 3 present in a user defined array of size 10
class A8Question1 {
    public static void main(String[] args) {
        int[] array = multiple3();
        System.out.println("Array: "+Arrays.toString(array));
        System.out.println("Multiples of 3: ");
        for (int j : array) {
            if (j % 3 == 0) {
                System.out.print(j + ", ");
            }
        }
    }

    public static int[] multiple3 () {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];

        for (int i=0;i<a.length;i++) {
            System.out.println("Enter a number: ");
            a[i] = input.nextInt();
        }
        return a;
    }
}

class A8Question2 {
    public static void main(String[] args) {
        System.out.println("Array: "+Arrays.toString(odd()));
        }

    public static int[] odd() {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int j=0;

        for (int i=0;i<a.length;i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num%2!=0) {
                j = j + 1;
            }
            a[i] = num;
        }

        int k=0;
        int[] odd = new int[j];
        for (int value : a) {
            if (value%2!=0) {
                odd[k]=value;
                k++;
            }
        }
        return odd;
    }
}

//WAP to return string array
class A8Question3{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray()));
    }

    public static String[] createArray() {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter a word:");
            String input = scanner.next();
            a[i] = input;

        }
        return a;
    }
}

class ArrayClassQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = 3, col = 2;
        String [][] arr = new String[row][col];

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (j==0) {
                    System.out.println("Enter Name: ");
                } else {
                    System.out.println("Enter Address: ");
                }
                arr[i][j]=input.next();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

class A9Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int j=0;

        for (int i=0;i<a.length;i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            a[i] = num;
        }
        maxMin(a);
    }

    public static void maxMin(int[] a) {
        int min=a[0], max=0;
        for (int j : a) {
            if (j < min) {
                min = j;
            } else if (j > max) {
                max = j;
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }
}

class A9Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = 2, col = 3;
        int[][] arr = new int[row][col];

        for (int k=1; k<=2; k++) {
            System.out.println("For matrix "+k+":");

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println("Enter Number (a" + (i + 1) + (j + 1) + "): ");
                    arr[i][j] += input.nextInt();
                }
            }
        }
        System.out.println("Sum of two matrices: "+Arrays.deepToString(arr));
    }
}

class A9Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = 2, col = 3;
        int[][] arr = new int[row][col];

        for (int k=1; k<=2; k++) {
            System.out.println("For matrix "+k+":");

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println("Enter Number (a" + (i + 1) + (j + 1) + "): ");
                    if (k==1) {
                        arr[i][j]=1;
                    }
                    arr[i][j] *= input.nextInt();
                }
            }
        }
        System.out.println("Multiplication of two matrices: "+Arrays.deepToString(arr));
    }
}