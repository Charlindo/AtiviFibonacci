fun main() {
    var numero: String

    do {
        print("Digite um número acima de 1: ")
        numero = readln()
    } while (!numero.matches(Regex("^(?:[2-9]|\\d{2,})$")))

    fun fibonacci(n: Int): Int {
        if (n <= 1) return n
        return fibonacci(n - 1) + fibonacci(n - 2)
    }

    println("Fibonacci de $numero é: ${fibonacci(numero.toInt())}")
}
