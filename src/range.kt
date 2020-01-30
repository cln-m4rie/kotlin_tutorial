fun main() {
    val x = 10
    val y = 9
    // 1 <= x && x <= 10
    if (x in 1..y + 1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}