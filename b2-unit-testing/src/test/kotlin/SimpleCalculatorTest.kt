import org.junit.Test
import org.junit.jupiter.api.Assertions

internal class SimpleCalculatorTest {

    @Test
    fun add() {
        val result = SimpleCalculator().add(1.0, 1.0)
        Assertions.assertEquals(result, 2.0)
    }

    @Test
    fun subtract() {
        val result = SimpleCalculator().subtract(1.0, 1.0)
        Assertions.assertEquals(result, 0.0)
    }

    @Test
    fun divide() {
        val result = SimpleCalculator().divide(1.0, 2.0)
        Assertions.assertEquals(result, 0.5)
    }

    @Test
    fun multiply() {
        val result = SimpleCalculator().multiply(1.0, 2.0)
        Assertions.assertEquals(result, 2.0)
    }
}