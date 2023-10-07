import junit.framework.TestCase
import java.io.File

class TestMain : TestCase() {
    fun testVsMainOutput() {
        generatedVsMain()
    }

    fun testSampleMain() {
        main() // Main.main(arrayOf()) for testing Java file
        compareFiles(
            "src/test/kotlin/TestOutput.txt",
            "src/main/kotlin/Output.txt",
        )
    }

    fun testGeneratedMain() {
        main() // Remember to CHANGE the input file in Main.kt
        generatedVsMain()
    }

    private fun generatedVsMain() {
        compareFiles(
            "src/test/kotlin/GeneratedOutput.txt",
            "src/main/kotlin/Output.txt",
        )
    }

    fun compareFiles(path1: String, path2: String) {
        val myAnswer = File(path1).readText()
        val answer = File(path2).readText()
        assertEquals(answer, myAnswer)
    }
}
