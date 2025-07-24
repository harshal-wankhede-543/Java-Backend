package example;
public class ThreadPrintExample {

    public static void main(String[] args) {

        // Thread for printing Alphabets (Turtle)
        Thread turtle = new Thread(new PrintAlphabets(), "Turtle");

        // Thread for printing Numbers (Rabbit)
        Thread rabbit = new Thread(new PrintNumbers(), "Rabbit");

        // Start both threads
        turtle.start();
        rabbit.start();
    }
}

// Class to print Alphabets A to Z
class PrintAlphabets implements Runnable {
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(Thread.currentThread().getName() + " prints: " + c);
            try {
                Thread.sleep(500); // Slower - like Turtle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Class to print Numbers 1 to 26
class PrintNumbers implements Runnable {
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.println(Thread.currentThread().getName() + " prints: " + i);
            try {
                Thread.sleep(200); // Faster - like Rabbit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
