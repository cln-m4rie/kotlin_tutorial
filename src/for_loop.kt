fun list1() {
    // List<String>型
    val items = listOf("apple", "banana", "kiwifruit")
    // リストの要素を直接取り出すやり方
    for (item in items) {
        println(item)
    }
}

fun list2() {
    val items = listOf("apple", "banana", "kiwifruit")
    // リストの長さを取ってループさせるやり方
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun main() {
    list1()
    list2()
}

