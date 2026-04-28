import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testSum() {
        assertEquals(5, Main.sum(2, 3));
    }

    @Test
    void testNegative() {
        assertEquals(-1, Main.sum(2, -3));
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("Equal");
        }

        sc.close();
    }
}
