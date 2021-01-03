class Fraction(val numerator: Int, denominator: Int) : IFraction {
    val denominator: Int? = null

    private fun reduceFraction(numerator: Int, denominator: Int): Fraction {
        var numerator = numerator
        var denominator = denominator
        val d: Int
        d = greatestCommonDivisor(numerator, denominator)
        numerator = numerator / d
        denominator = denominator / d
        return Fraction(numerator, denominator)
    }

    private fun greatestCommonDivisor(a: Int, b: Int): Int {
        return if (b == 0) a else greatestCommonDivisor(b, a % b)
    }

    operator fun plus(other: IFraction): IFraction {
        return reduceFraction(
            numerator * other.getDenominator() + denominator * other.getNumerator(),
            denominator * other.getDenominator()
        )
    }

    operator fun minus(other: IFraction): IFraction {
        return reduceFraction(
            numerator * other.getDenominator() - denominator * other.getNumerator(),
            denominator * other.getDenominator()
        )
    }

    operator fun times(other: IFraction): IFraction {
        return reduceFraction(numerator * other.getNumerator(), denominator * other.getDenominator())
    }

    fun div(other: IFraction): IFraction {
        return reduceFraction(numerator * other.getDenominator(), denominator * other.getNumerator())
    }

    init {
        if (denominator == 0) {
            throw ArithmeticException("Cannot Divide by 0")
        } else this.denominator = denominator
    }
}