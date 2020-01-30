// 省略記法で書くと違和感がすごい
// 慣れたら便利そうなやつ
fun describe(obj: Any): String =
    // switch文と同じ
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun main() {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}