import junit.framework.TestCase
import java.io.File

class MainKtTest : TestCase() {
    fun testMain() {
        main()
        val myAnswer = File("src/main/kotlin/Output.txt").readText()
        val answer = File("src/test/kotlin/TestOutput.txt").readText()
        assertEquals(answer, myAnswer)
    }
}
