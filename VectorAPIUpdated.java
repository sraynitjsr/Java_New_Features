import java.util.Arrays;
import java.util.stream.IntStream;

public class VectorAPIUpdated {

    public static void main(String[] args) {
        int[] arrayA = IntStream.range(0, 1000).toArray();
        int[] arrayB = IntStream.range(1000, 2000).toArray();
        int[] resultArray = new int[arrayA.length];

        IntVector a = IntVector.fromArray(arrayA, 0);
        IntVector b = IntVector.fromArray(arrayB, 0);
        IntVector result = a.add(b);

        result.intoArray(resultArray, 0);

        System.out.println(Arrays.toString(resultArray));
    }
}
