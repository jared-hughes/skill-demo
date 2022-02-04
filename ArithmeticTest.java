import static org.junit.Assert.*;
import org.junit.*;

public class ArithmeticTest {
  @Test
  public void testSquare() {
    assertEquals("Square 7", 49, Arithmetic.square(7));
  }
}
