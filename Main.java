public class Main {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 55;
        int b = -15;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 110;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 25;
        int b = -15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean compareSum(int a, int b) {

        int sum = (a + b);
        return sum >= 10 && sum <= 20;

    }

    public static void compareWithZero(int a)
    {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }
    public static boolean compareWithZero2 (int a) {
        return a < 0;

    }
    public static void printStringMultipleTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void changeArr() {
        int[] a = {0,1,0,1,1,1,1,0,0,0};
        for (int i = 0; i < a.length; i++) {

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                a[i] = 1;
            else
                a[i] = 0;
        }
        System.out.println("Стало:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void fillArrayWithNumbers() {
        int[] a = new int[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        System.out.println();

        for (int value : a) {
            System.out.print(value + " ");
        }
    }
    public static void changeNumbersLessSix() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] <6) {
                a[i] *= 2;
            }
        }
        System.out.println();
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    public static void fillDiagonal(int size) {
        int[][] a = new int[size][size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][i] = 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] CreateLenArray (int len, int initialValue){
        int [] a = new int[len];
        for (int i = 0; i < a.length; i++){
            a[i] = initialValue;
        }
        return a;
    }


    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();

        compareNumbers();

        if(compareSum(100, -90))
            System.out.println("method returned true");
        else
            System.out.println("method returned false");

        compareWithZero(15);

        if(compareWithZero2(-10))
            System.out.println("число отрицательное: true");
        else
            System.out.println("число >=0: false");

        printStringMultipleTimes("Hello, Dolly", 4);

        if(isLeapYear(2020))
            System.out.println("високосный");
        else
            System.out.println("невисокосный");

        changeArr();

        fillArrayWithNumbers();
        changeNumbersLessSix();
        fillDiagonal(5);

        int[] resultArray = CreateLenArray(7, 5);
        System.out.println();
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
        System.out.println();

    }
}