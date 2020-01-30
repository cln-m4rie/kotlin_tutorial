fun getStringLength1(obj: Any): Int? {
    // isを使う事で型キャストができる。この場合はStringへキャストしている
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

fun getStringLength2(obj: Any): Int? {
    // 先にString型か確認するやり方
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}

fun getStringLength3(obj: Any): Int? {
    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    // obj is Stringが評価された時点でキャストされるので、後ろの式でlengthが使える
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}

fun main() {
    fun printLength(obj: Any) {
        // "?:" なんか三項演算子っぽいやつ。エルビス演算子っていうらしい
        // getStringLengthの値があればそれを返し、偽であれば右辺の値を返す
        println("'$obj' string length is ${getStringLength1(obj) ?: "... err, not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}