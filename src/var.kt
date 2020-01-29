/**
 * Read-Onlyな変数はvalで定義
 */
fun values() {
    val a: Int = 1      // 通常の変数宣言
    val b = 2           // 型推論
    val c: Int          // 初期化は型を与えれば初期値は書かなくても平気。IntelliJ IDEAでは推奨されない書き方っぽい
    c = 3
    // 値を書かない初期化は関数内部でのみ可能？
}

/**
 * 変更可能な変数はvarで定義
 */
fun variables() {
    var x = 5           // 型推論
    x += 1              // 変更可能
}

/**
 * 関数外(Top-level)の変数
 */
val PI = 3.14
var x = 0

fun incrementX() {
    x += 1              // アクセス可能
}

// 一行コメント
/*
複数行コメント
 */

/* 外側
    /* コメントのネスト(使い道は不明) */
 */
