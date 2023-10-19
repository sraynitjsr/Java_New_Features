import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ProjectLoomDemoUsingFibers {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> result1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task one is running on fiber.");
            return 45;
        });

        CompletableFuture<Integer> result2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task two is running on fiber.");
            return 55;
        });

        int sum = result1.join() + result2.join();

        System.out.println("The sum of results is => " + sum);
    }
}
