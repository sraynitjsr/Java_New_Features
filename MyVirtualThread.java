import java.util.ArrayList;
import java.util.List;

public class MyVirtualThread {

  public static void Start() throws InterruptedException {
    List<Integer> results = new ArrayList<>();

    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
      Thread thread = new Thread(() -> results.add(i));
      thread.start();
      thread.join(); // Wait for the thread to finish before moving on
    }
    long end = System.currentTimeMillis();

    System.out.println("Time taken with traditional threads: " + (end - start) + " ms");

    results.clear();

    start = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      Thread.builder().virtual().task(() -> results.add(i)).start();
    }
    end = System.currentTimeMillis();

    System.out.println("Time taken with Virtual Threads: " + (end - start) + " ms");
    
    for (int i = 0; i < 100000; i++) {
      if (results.get(i) != i) {
        throw new RuntimeException("Results don't match!");
      }
    }
    
    System.out.println("Results are consistent!");
  }
}
