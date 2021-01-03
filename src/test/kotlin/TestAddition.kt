import org.junit.Assert
import org.junit.Test

class TestAddition {
    @Test
    fun testSimple() {
        val fraction: Unit = TestUtils.createFraction(3, 5)
        val result: Unit = fraction.plus(NotImplementedFraction(3, 5))
        Assert.assertEquals(6, result.getNumerator())
        Assert.assertEquals(5, result.getDenominator())
    }

    @Test
    fun testNormalisation() {
        val fraction: Unit = TestUtils.createFraction(1, 2)
        val result: Unit = fraction.plus(NotImplementedFraction(1, 2))
        Assert.assertEquals(1, result.getNumerator())
        Assert.assertEquals(1, result.getDenominator())
    }

    @Test
    fun testDividedBySimple() {
        val fraction: Unit = TestUtils.createFraction(4, 1)
        val result: Unit = fraction.dividedBy(NotImplementedFraction(3, 1))
        Assert.assertEquals(4, result.getNumerator())
        Assert.assertEquals(3, result.getDenominator())
    }

    @Test
    fun testDividedByNormalisation() {
        val fraction: Unit = TestUtils.createFraction(4, 6)
        val result: Unit = fraction.dividedBy(NotImplementedFraction(7, 5))
        Assert.assertEquals(10, result.getNumerator())
        Assert.assertEquals(21, result.getDenominator())
    }

    @Test
    fun testTimesSimple() {
        val fraction: Unit = TestUtils.createFraction(2, 3)
        val result: Unit = fraction.times(NotImplementedFraction(5, 7))
        Assert.assertEquals(10, result.getNumerator())
        Assert.assertEquals(21, result.getDenominator())
    }

    @Test
    fun testTimesNormalisation() {
        val fraction: Unit = TestUtils.createFraction(4, 6)
        val result: Unit = fraction.times(NotImplementedFraction(5, 7))
        Assert.assertEquals(10, result.getNumerator())
        Assert.assertEquals(21, result.getDenominator())
    }

    @Test
    fun testMinusSimple() {
        val fraction: Unit = TestUtils.createFraction(7, 9)
        val result: Unit = fraction.minus(NotImplementedFraction(2, 5))
        Assert.assertEquals(17, result.getNumerator())
        Assert.assertEquals(45, result.getDenominator())
    }

    @Test
    fun testMinusNormalisation() {
        val fraction: Unit = TestUtils.createFraction(6, 4)
        val result: Unit = fraction.minus(NotImplementedFraction(1, 2))
        Assert.assertEquals(1, result.getNumerator())
        Assert.assertEquals(1, result.getDenominator())
    }
}

private fun Unit.dividedBy(notImplementedFraction: NotImplementedFraction) {

}

private fun Unit.plus(notImplementedFraction: NotImplementedFraction) {

}

private fun Unit.getDenominator(): Long {

}

private fun Unit.getNumerator(): Long {

}
