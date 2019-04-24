

fun Int.r(): RationalNumber = RationalNumber(this.dec(), 0)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first.dec(), second.dec())




data class RationalNumber(val numerator: Int, val denominator: Int)