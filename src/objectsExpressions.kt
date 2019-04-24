import java.util.*
import java.util.Collections.sort

open class A(x: Int) {
    public open val y: Int = x

}

interface B

val ab: A = object : A(1), B {
    override val y = 15
}

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }

    // companion object { } // tylko 1 companion dozwolony

}

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    sort(arrayList, object : Comparator<Int> {
        override fun compare(p0: Int?, p1: Int?) = p0!! - p1!!
    })
    return arrayList
}

fun main() {
    println(ab is A)
    println(ab is B)
    println(ab.y)

    println(MyClass.create())
}


