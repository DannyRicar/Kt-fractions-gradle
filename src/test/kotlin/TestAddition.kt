import org.junit.Assert
import org.junit.Test

class TestAddition {
    @Test
    fun testSimple() {
        val fraction = TestUtils.createFraction(3, 5)
        val result = fraction + (NotImplementedFraction(3, 5))
        Assert.assertEquals(6, result.numerator)
        Assert.assertEquals(5, result.denominator)
    }

    @Test
    fun testNormalisation() {
        val fraction = TestUtils.createFraction(1, 2)
        val result = fraction + (NotImplementedFraction(1, 2))
        Assert.assertEquals(1, result.numerator)
        Assert.assertEquals(1, result.denominator)
    }

    @Test
    fun testDividedBySimple() {
        val fraction = TestUtils.createFraction(4, 1)
        val result = fraction / (NotImplementedFraction(3, 1))
        Assert.assertEquals(4, result.numerator)
        Assert.assertEquals(3, result.denominator)
    }

    @Test
    fun testDividedByNormalisation() {
        val fraction = TestUtils.createFraction(4, 6)
        val result = fraction / (NotImplementedFraction(7, 5))
        Assert.assertEquals(10, result.numerator)
        Assert.assertEquals(21, result.denominator)
    }

    @Test
    fun testTimesSimple() {
        val fraction = TestUtils.createFraction(2, 3)
        val result = fraction * (NotImplementedFraction(5, 7))
        Assert.assertEquals(10, result.numerator)
        Assert.assertEquals(21, result.denominator)
    }

    @Test
    fun testTimesNormalisation() {
        val fraction = TestUtils.createFraction(4, 6)
        val result = fraction * (NotImplementedFraction(5, 7))
        Assert.assertEquals(10, result.numerator)
        Assert.assertEquals(21, result.denominator)
    }

    @Test
    fun testMinusSimple() {
        val fraction = TestUtils.createFraction(7, 9)
        val result = fraction - (NotImplementedFraction(2, 5))
        Assert.assertEquals(17, result.numerator)
        Assert.assertEquals(45, result.denominator)
    }

    @Test
    fun testMinusNormalisation() {
        val fraction = TestUtils.createFraction(6, 4)
        val result = fraction - (NotImplementedFraction(1, 2))
        Assert.assertEquals(1, result.numerator)
        Assert.assertEquals(1, result.denominator)
    }
}
