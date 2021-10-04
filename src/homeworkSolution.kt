
class Car constructor(var name:String, var year:Int) {

    lateinit var cColor1: String

    lateinit var Action: String

    constructor(cName: String, cColor: String, cYear: Int) : this(name = cName, year = cYear) {
        cColor1 = cColor
        Action = cName
    }

    init {
        println("Welcome in your $name $year car")
    }

    fun accelerator(){
        println("$Action accelerator is On")
    }

    fun brake(){
        println("$Action brake is On")
    }}

fun main() {
    val bmw : Car = Car ("bmw","black", 1993)
    println("The car color is black")
    bmw.accelerator()
    bmw.brake()
}
