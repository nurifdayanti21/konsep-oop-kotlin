package id.ac.polbeng.ifdayanti.test_kelas

class PersonB (_firstName: String, _lastName: String, _Age: Int){
    var firstName : String = _firstName
    var lastName: String = _lastName
    var age : Int = _Age
}

fun main() {
    val budi = PersonB("Budi", "Gunawan",21)
    println("Name : ${budi.firstName}${budi.lastName}")
    println("Age ${budi.age}")
}