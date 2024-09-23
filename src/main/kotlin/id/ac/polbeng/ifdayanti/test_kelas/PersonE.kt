package id.ac.polbeng.ifdayanti.test_kelas

class PersonE {
    var firstName: String
    var lastname: String
    var age: Int = 25
    constructor(_firstName: String, _lastName: String,){
        firstName = _firstName
        lastname=_lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastname}")
        println("Age : ${age}")
    }
}
fun main(){
    val anton = PersonE("Frank", "Lampard")
    anton.cetakInfo()
    println()
    val budi = PersonE("Budi", "Gunawan", 21)
    budi.cetakInfo()
}