package demo

val sumOfTwo = { x: Int, y: Int -> x + y }
val mulOfTwo = { x: Int, y: Int -> x * y }

fun calcSum(list: List<Int>, sum: (x: Int, y: Int) -> Int) = list.reduce(sum)

fun main(args: Array<String>) {
    println(calcSum((1..15).toList(), sumOfTwo))
    println(calcSum((1..15).toList(), mulOfTwo))
}
