fun main() {
    val ans1 = sum1(1, 1)
    println(ans1)
    val ans2 = sum2(2, 2)
    println(ans2)
    printSum1(3, 3)
    printSum2(4, 4)
}

// よくある関数定義
fun sum1(a: Int, b: Int): Int {
    return a + b
}

// 省略記法。なんかちょっと慣れない
fun sum2(a: Int, b: Int) = a + b

// returnしない場合はUnitクラスを返り値の型として設定
fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unitは省略できる
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}