fun main() {
    var a = 1
    // 変数展開
    val s1 = "a is $a"

    a = 2
    // ${}でなんか式とか使える。Pythonのf文字列的な感じ
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}