import java.io.PrintWriter
import java.math.BigInteger
import java.util.*

// val INPUT = File("src/main/kotlin/Input.txt").inputStream()
@JvmField
val INPUT = System.`in`

// val OUTPUT = File("src/main/kotlin/Output.txt").outputStream()
@JvmField
val OUTPUT = System.out

@JvmField
val _reader = INPUT.bufferedReader()
fun readLine(): String? = _reader.readLine()
fun readString() = _reader.readLine()!!

@JvmField
var _tokenizer: StringTokenizer = StringTokenizer("")
fun read(): String {
    while (_tokenizer.hasMoreTokens().not()) _tokenizer = StringTokenizer(_reader.readLine() ?: return "", " ")
    return _tokenizer.nextToken()
}

@JvmField
val _writer = PrintWriter(OUTPUT, false)

fun readStrings(n: Int) = List(n) { read() }

fun main() {
    _writer.run(); _writer.flush()
}

fun PrintWriter.run() {
    while (true) {
        val (a, b) = readStrings(2)
        if (a == "0" && b == "0") break
        println(solve(a, b))
    }
}

fun solve(a: String, b: String): Int {
    val A = a.toBigInteger()
    val B = b.toBigInteger()
    var prev2 = BigInteger.ZERO
    var prev1 = BigInteger.ONE
    var nr = 0
    while (prev2 + prev1 <= B) {
        if (prev2 + prev1 >= A) {
            nr++
        }
        val cur = prev2 + prev1
        prev2 = prev1
        prev1 = cur
    }
    return nr
}
