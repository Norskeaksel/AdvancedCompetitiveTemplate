import junit.framework.TestCase
import java.io.File

class TestMain : TestCase() {
    fun testMain() {
        main() // Main.main(arrayOf()) for testing Java file
        val myAnswer = File("src/main/kotlin/Output.txt").readText()
        val answer = File("src/test/kotlin/TestOutput.txt").readText()
        assertEquals(answer, myAnswer)
    }
}
