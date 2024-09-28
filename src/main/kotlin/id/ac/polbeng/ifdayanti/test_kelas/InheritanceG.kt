package id.ac.polbeng.ifdayanti.test_kelas

import java.util.*

open class Base(val name: String){
    init {
        println("Initializing Base")
    }
    open val size : Int = name.length.also {
        println("Initializing size in Base: $it")
    }
}
class Derived(name: String, val lastName: String):
        Base(name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }.also { println("Argument for Base: $it") }){
            init {
                println("Initializing Derived")
            }
    override val size: Int = (super.size + lastName.length).also {
        println("Initializing size in Derived: $it")
    }
        }

fun main() {
    val turunan = Derived("Nur","Ifdayanti")
    turunan.size
}