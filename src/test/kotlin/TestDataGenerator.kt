import java.io.File
import java.math.BigInteger
import java.util.*

class TestDataGenerator {
    val inputs = 2
    fun generateBigIntegerInput() {
        val inputBounds = listOf(
            Pair(BigInteger.ONE, BigInteger("1" + "0".repeat(100))),
            Pair(BigInteger.ONE, BigInteger("1" + "0".repeat(100))),
        )
        val file = File("src/test/kotlin/GeneratetInput.txt")
        file.writeText("")
        for (n in 1..20)
            repeat(100) {
                var chosenBound = BigInteger.ZERO
                for (i in 0 until inputs) {
                    val min = inputBounds[i].first
                    val max = inputBounds[i].first * BigInteger("1" + "0".repeat(n))
                    if (max > inputBounds[i].second) {
                        break
                    }
                    val random = randomBigIntegerInRange(min, max).run {
                        if (i == 1) {
                            this.coerceAtLeast(chosenBound)
                        } else {
                            this
                        }
                    }
                    chosenBound = random
                    file.appendText("$random ")
                }
                file.appendText("\n")
            }
        addZeroesToFile(inputs, file)
    }

    private fun randomBigIntegerInRange(a: BigInteger, b: BigInteger): BigInteger {
        val range = b - a + BigInteger.ONE
        val random = Random()
        val result = BigInteger(range.bitLength(), random)
        return result.mod(range) + a
    }

    fun addZeroesToFile(n: Int, file: File) {
        repeat(n) {
            if (it != 0) file.appendText(" ")
            file.appendText("0")
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            TestDataGenerator().generateBigIntegerInput()
        }
    }
}
