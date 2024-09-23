package id.ac.polbeng.ifdayanti.test_kelas

class InitOrder (name: String) {
    val fisrtProperty = "First property: $name".also  (::println)
    init {
        println("First initializer block that pronts ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main(){
    val initOrder = InitOrder("RPL")
}