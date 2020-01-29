fun getStringLength(obj: Any): Int? {
    // isを使う事で型キャストができる。この場合はStringへキャストしている
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}


fun main() {
    fun printLength(obj: Any) {
        // "?:" なんか三項演算子っぽいやつ。エルビス演算子っていうらしい
        // getStringLengthの値があればそれを返し、nullであれば右辺の値を返す
        println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}