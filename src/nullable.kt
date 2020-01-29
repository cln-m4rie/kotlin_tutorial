// Kotlinはnullの可能性がある場合の引数や返り値は "?" をつけることで扱える
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}


fun main() {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}