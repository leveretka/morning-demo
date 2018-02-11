package demo

fun main(args: Array<String>) {
    val person = Person("Margo", 23)
    person.sayHello()
}

fun Person.sayHello() = println("Hello, $name!")