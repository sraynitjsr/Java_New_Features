import java.util.concurrent.*;

public class OddEvenPrinterUsingLoomFibers {
    public static void main(String[] args) {        
        AtomicInteger counter = new AtomicInteger(1);
        Fiber oddFiber = Fiber.schedule(() -> {
            while (true) {
                int number = counter.getAndIncrement();
                if (number % 2 == 1) {
                    System.out.println("Odd => " + number);
                }
                Fiber.yield();
            }
        });

        Fiber evenFiber = Fiber.schedule(() -> {
            while (true) {
                int number = counter.getAndIncrement();
                if (number % 2 == 0) {
                    System.out.println("Even => " + number);
                }
                Fiber.yield();
            }
        });
        oddFiber.start();
        evenFiber.start();
    }
}
