import junit.framework.TestCase
import java.io.File

class TestMain : TestCase() {
    fun testSampleMain() {
        main()
        compareFiles(
            "src/test/kotlin/SampleOutput.txt",
            "src/main/kotlin/ProgramOutput.txt",
        )
    }
/*
    fun testVsMainOutput() {
        generatedVsMain()
    }

    fun testGeneratedMain() {
        main() // Remember to CHANGE the input file in Main.kt
        generatedVsMain()
    }

    private fun generatedVsMain() {
        compareFiles(
            "src/test/kotlin/SampleOutput.txt",
            "src/main/kotlin/ProgramOutput.txt",
        )
    }*/

    private fun compareFiles(path1: String, path2: String) {
        val myAnswer = File(path1).readText().trim()
        val answer = File(path2).readText().trim()
        assertEquals(answer, myAnswer)
    }
}
