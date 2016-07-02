object MalCompiler {
    def main(args: Array[String]) = {
        repl()
    }

    def repl() = {
        replRead("user> ", replEval)
    }

    def replRead(prompt: String, handler: (String) => Unit) = {
        var ok = true
        while (ok) {
            print(prompt)

            val line = readLine()
            if (line == null) {
                ok = false
            } else {
                handler(line)
            }
        }
    }

    def replEval(expr: String) = {
        replPrint(expr)
    }

    def replPrint(result: String) = {
        println(result)
    }
}
