import scala.io.StdIn.readLine

object step0_repl {
    val prompt = "user> "

    def main(args: Array[String]) = {
        repl()
    }

    def repl() = {
        var continue = true
        while (continue) {
            print(prompt)

            val line = readLine()
            if (line == null) {
                continue = false
            } else {
                rep(line)
            }
        }
    }

    def rep(str: String) = {
        PRINT(EVAL(READ(str)))
    }


    def READ(str: String) : String = {
        str
    }

    def EVAL(str: String) : String = {
        str
    }

    def PRINT(result: String) = {
        println(result)
    }
}
