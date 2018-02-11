package demo

fun main(args: Array<String>) {
    Thread {
        for (i in 1..100)
            println(i)
    }.start()

//    MyThread { ->
//        for (i in 1..100)
//            print(i)
//    }.start()

    Thread.sleep(2000)
}

class MyThread(val r: Runnable) {
    fun start() = Thread(r).start()
}
