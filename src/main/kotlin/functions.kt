package demo

infix fun Person.mary(other: Person) {
    println("$name and ${other.name} got married!")
}

fun main(args: Array<String>) {
    val person1 = Person("Kolia", 25)
    val person2 = Person("Sveta", 22)

    class A (val context: String = "context") {

        fun a() = person1.let {
            this.context
            it.age == 20
        }

        fun b() = person1.apply {
            mary(person2)
        }.age

        fun c() = with(person1){age == 20}
    }

    val a = A()
    println(a.a())
    println(a.b())
    println(a.c())

}


















