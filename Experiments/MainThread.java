// Experiment 14

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;


class Prime extends Thread {

    Thread primeThread;
    PipedWriter primePipeWriter = new PipedWriter();

    public PipedWriter getWriter() {
        return primePipeWriter;
    }

    public void run() {

        primeThread = Thread.currentThread();
        primeThread.setName("Prime thread");
        System.out.println(primeThread.getName() + " created & started...");

        for (int i = 1; i < 100000; i++) {
            if(isPrime(i)) {

                try {
                    primePipeWriter.write(i);
                }
                catch (IOException e){
                    System.out.println(primeThread.getName() + " thread exiting.");
                    System.exit(0);
                }
            }
        }

        System.out.println(primeThread.getName() + " thread exiting.");

    }

    public boolean isPrime(int n) {
        int m = (int) Math.round(Math.sqrt(n));
        if (n == 1 || n == 2)
            return true;
        for (int i = 2; i <= m; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}

class Fibonacci extends Thread {

    Thread fibThread;
    PipedWriter fibPipeWriter = new PipedWriter();

    public PipedWriter getWriter() {
        return fibPipeWriter;
    }

    public void run() {

        fibThread = Thread.currentThread();
        fibThread.setName("Fibonacci thread");
        System.out.println(fibThread.getName() + " created & started...");

        int fib1 = 0;
        int fib2 = 1;
        int fibSum = 0;

        while (fibSum <= 100000) {

            try {
                fibPipeWriter.write(fibSum);
                sleep(1000);
            }
            catch (Exception e) {
                System.out.println(fibThread.getName() + " thread exiting.");
                System.exit(0);
            }

            fib1 = fib2;
            fib2 = fibSum;

            fibSum = fib1 + fib2;

        }

        System.out.println(fibThread.getName() + " thread exiting");
        

    }
}


class MainThread extends Thread { 
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        mainThread.setName("Main thread");
        System.out.println(mainThread.getName() + " created & started...");

        Fibonacci fib = new Fibonacci();
        Prime pr = new Prime();

        try {

            PipedReader fibPipedReader = new PipedReader(fib.getWriter());
            PipedReader primePipeReader = new PipedReader(pr.getWriter());

            fib.start();
            pr.start();

            int fibNo = fibPipedReader.read();
            int primeNo = primePipeReader.read();

            System.out.println("\nThe numbers common to PRIME and FIBONACCI:");

            while((fibNo != -1 && primeNo != -1)) {
                while (primeNo <= fibNo) {
                    if(fibNo == primeNo) {
                        System.out.println(primeNo);
                    }
                    primeNo = primePipeReader.read();
                }
                fibNo = fibPipedReader.read();
            }

        } catch (Exception e) {}

        System.out.println(mainThread.getName() + " thread exiting");
    }

}

/*
Sample output:
Main thread created & started...
Fibonacci thread created & started...
Prime thread created & started...
The numbers common to PRIME and FIBONACCI:
1
2
3
5
13
89
233
1597
28657
Fibonacci thread thread exiting
Main thread thread exiting
Prime thread thread exiting.
*/
