class Fraction(
    override val numerator: Int,
    override val denominator: Int,

    ) : IFraction {

    init {
        if (denominator == 0) {
            throw ArithmeticException("Cannot Divide by 0")
        }
    }

    override operator fun plus(other: IFraction): IFraction {
        return reduceFraction(
            numerator * other.denominator + denominator * other.numerator,
            denominator * other.denominator
        )
    }

    override operator fun minus(other: IFraction): IFraction {
        return reduceFraction(
            numerator * other.denominator - denominator * other.numerator,
            denominator * other.denominator
        )
    }

    override operator fun times(other: IFraction): IFraction {
        return reduceFraction(numerator * other.numerator, denominator * other.denominator)
    }

    override fun div(other: IFraction): IFraction {
        return reduceFraction(numerator * other.denominator, denominator * other.numerator)
    }

    companion object{

        private fun reduceFraction(numerator: Int, denominator: Int): Fraction {
            val d: Int = greatestCommonDivisor(numerator, denominator)
            return Fraction(numerator / d, denominator / d)
        }

        private fun greatestCommonDivisor(a: Int, b: Int): Int {
            return if (b == 0) a else greatestCommonDivisor(b, a % b)
        }
    }

}