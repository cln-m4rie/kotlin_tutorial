// 一般的な比較
fun maxOf1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// 省略記法の場合
fun maxOf2(a: Int, b: Int) = if (a > b) a else b

// Kotlinはifを式として使える
fun maxOf3(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun main() {
    println("max of 0 and 42 is ${maxOf1(0, 42)}")
    println("max of 0 and 21 is ${maxOf2(0, 21)}")
    println("max of 0 and 33 is ${maxOf3(0, 33)}")
}