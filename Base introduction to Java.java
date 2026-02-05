class Hello{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

}

class Hello2 {
    public static void main(String[] arguments) {
        System.out.println("Hello world."); // Print once
        System.out.println("Line number 2"); // Again!
    }
}

class The_New_Function {
    public static void main(double[] args) {
        double newNum = 9.99;
        System.out.println(newNum);
        newNum = 8.99;
        newNum = newNum * 55;
        System.out.println(newNum);
    }
}

class DoMath {
    public static void main(String[] arguments) {
        double score = 1.0 + 2.0 * 3.0;
        System.out.println(score);
        score = score / 2.0;
        System.out.println(score);
    }
}

class GravityCalculator {
    public static void main(String[] args) {
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = .5 * gravity * fallingTime *
        fallingTime;

        finalPosition = finalPosition +

        initialVelocity * fallingTime;
        finalPosition = finalPosition + initialPosition;
        System.out.println("An object's position after " +
        fallingTime + " seconds is " +
        finalPosition + " m."); 
    }
}

class NewLine{
    public static void newLine() {
        System.out.println("");
    }

    public static void threeLines() {
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        System.out.println("Line 1");
        threeLines();
        System.out.println("Line 2");
    }
}

class Multiply {
    public static void times (double a, double b){
        System.out.println(a * b);
    }
    public static void main(String[] arguments){
        times (2, 2);
        times (3, 4);
    }
}

class Square {
    public static void printSquare(int x) {
        System.out.println(x*x);  // WARNING: Only ints allowed here!!!!!!
    }

    public static void main(String[] args) {
        printSquare(5);  // can only input integers
        printSquare(10);
        printSquare(2);
        int num = 22;
        printSquare(num);
    }
}

class Square3 {
    public static void printSquare(double x){
        System.out.println(x*x);
    }
    public static void main(String[] arguments){
        printSquare(5.0);
    }
}

class Square4 {
    public static double square(double x){
        return x*x;
    }
    public static void main(String[] arguments){
        System.out.println(square(5));
        System.out.println(square(2));
    }
} 
class SquareChange {
    public static void printSquare(int x){
        System.out.println("printSquare x = " + x);
        x = x * x;
        System.out.println("printSquare x = " + x);
        }
    public static void main(String[] arguments){
        int x = 5;
        System.out.println("main x = " + x);
        printSquare(x);
        System.out.println("main x = " + x);
        }
} 

class test {
    public static void test(int x   ){
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
    }

    public static void main(String[] args) {
        test(10);
        test(3);
        test(7);
        test(5);
    }
}

class Salary {
    public static int pay(double basepay, int hours){
        if (basepay < 8.00){
            System.out.println("Error: basepay less than minimum wage");
            return 0;
        } else if (hours > 60) {
            System.out.println("Error: hours worked greater than 60");
            return 0;
        } else {
            if (hours <= 40){
                return (int)(basepay * hours);
            } else {
                return (int)(basepay * 40 + (hours - 40) * basepay * 1.5);
            }
        }

        
    }
    public static void main(String[] args) {
        System.out.println("Salary is: $" + pay(7.50, 35));
        System.out.println("Salary is: $" + pay(8.20, 47));
        System.out.println("Salary is: $" + pay(10.00, 73));
    }
}   