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
    @Test
    fun everyNegativeItemDivisibleBy3ButNot5IsFizz() {
        val result = playFizzBuzz.fizzBuzz(-6)
        val expected = "Fizz"
        assertEquals(expected, result)
    }
    @Test
    fun everyItemDivisibleBy5ButNot3IsBuzz(){
        val result = playFizzBuzz.fizzBuzz(5)
        val expected = "Buzz"
        assertEquals(expected, result)
    }
    @Test
    fun everyNegativeItemDivisibleBy5Not3IsBuzz(){
        val result = playFizzBuzz.fizzBuzz(-10)
        val expected = "Buzz"
        assertEquals(expected, result)
    }
    @Test
    fun everyItemDivisibleBy3And5IsFizzBuzz(){
        val result = playFizzBuzz.fizzBuzz(15)
        val expected = "FizzBuzz"
        assertEquals(expected, result)
    }
    @Test
    fun everyNegativeItemDivisibleBy3And5IsFizzBuzz(){
        val result = playFizzBuzz.fizzBuzz(-30)
        val expected = "FizzBuzz"
        assertEquals(expected, result)
    }
    @Test
    fun everyItemNotDivisibleBy3And5IsNotFizzBuzz(){
        val result = playFizzBuzz.fizzBuzz(7)
        val expected ="Not Fizz Buzz"
        assertEquals(expected, result)
    }
}
