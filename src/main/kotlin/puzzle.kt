package demo

fun main(args: Array<String>) {
    println(f ("1", z = 42))
}

fun f (x: String, y: String = "a", z: Int = 1) = "$x$y$z"









