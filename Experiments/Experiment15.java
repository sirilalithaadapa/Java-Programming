/*
Write a java program that implements a multi-threading application that has three threads. First thread generates a random integer every 1
second and if the value is even, second thread computes the sqaure of number and prints.If the value is odd, the third will print the value 
of the cube of the number
*/
import java.util.Random;

class Square extends Thread {
    int x;
    Square (int n) {
        x = n;
    }
    public void run() {
        int sqrx = x * x;
        System.out.println("Square of " + x + " = " + sqrx);
    }
}

class Cube extends Thread {
    int x;
    Cube (int n) {
        x = n;
    }
    public void run() {
        int cubx = x * x * x;
        System.out.println("Cube of " + x + " = " + cubx);
    }
}

class RandomNumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(100);
            System.out.println("Random number generated: " + randNum);

            if (randNum % 2 == 0) {
                System.out.println(randNum + " is even");
                Square sq = new Square(randNum);
                sq.start();
            } else {
                System.out.println(randNum + " is odd");
                Cube cb = new Cube(randNum);
                cb.start();
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


public class Experiment15 {
    public static void main(String[] args) {
        RandomNumberGenerator randNumGen = new RandomNumberGenerator();
        randNumGen.start();
    }
}
