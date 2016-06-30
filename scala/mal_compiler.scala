object MalCompiler {
    def main(args: Array[String]) = {
        repl()
    }

    def repl() = {
        var ok = true
        while (ok) {
            printf("user> ")

            val line = readLine()
            if (line == null) {
                ok = false
            }
            println(line)
        }
    }
}
