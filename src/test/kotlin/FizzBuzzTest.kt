import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FizzBuzzTest {
    private val playFizzBuzz: FizzBuzz = FizzBuzz()

    @Test
    fun everyItemDivisibleBy3ButNot5IsFizz() {
        val result = playFizzBuzz.fizzBuzz(3)
        val expected = "Fizz"
        assertEquals(expected, result)
    }

}
