package id.ac.polbeng.ifdayanti.test_kelas

open class Rectangle {
    open fun draw(){
        println("From Base Class Rectangle")
    }
}
interface Polygon{
    fun draw(){
        println("From interface polygon")
    }
}
class Squre(): Rectangle(), Polygon{
    // the compiler requires draw() to be overriden:
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}

fun main() {
    val squre = Squre()
    squre.draw()
}