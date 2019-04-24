import java.util.concurrent.Executors

fun main() {
    val executor = Executors.newFixedThreadPool(5)
// Java signature: void execute(Runnable command)

    executor.execute { println("This runs in a thread pool") }
}


