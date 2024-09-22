fun main() {
    print("введите m: ")
    val m = readLine()!!.toInt()

    print("введите n: ")
    val n = readLine()!!.toInt()

    // проверка делится ли m нацело на n
    if (m % n == 0) {
        val chastnoe = m / n
        println("частное $chastnoe")
    } else {
        println("m на n нацело не делится;(") // вывод если не кратно
    }
}
