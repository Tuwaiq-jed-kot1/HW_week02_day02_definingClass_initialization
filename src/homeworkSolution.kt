//## Part II - writing code.
//write a kotlin program with car class that has three property name and color and manufacturing year
//use the primary constructor to ask for the name and manufacturing year and use the secondary constructor to ask for the name and manufacturing year and color
//and print a welcoming message after creating new object from the class that contains the car name
//and give the car ability to accelerate and the ability to use break

class Car(private val _name: String, private val _manufacturingYear: Int) {

    private var color = "white"

    init {
        println("\nwelcome to car class: $_name")
    }

    constructor(_name: String, _manufacturingYear: Int, _color: String) : this(
        _name = _name,
        _manufacturingYear = _manufacturingYear
    ) {
        color = _color
    }

    fun pressAccelerate() {
        println("$_name accelerating in progress..")
    }

    fun pressBreak() {
        println("$_name breaking in progress..")
    }

    override fun toString(): String {
        return "\nCar Info: $_name, $_manufacturingYear, $color"
    }
}

fun main() {
    val car1 = Car("nissan", 2010)
    car1.pressAccelerate()

    val car2 = Car("toyota", 2002, "red")
    car2.pressBreak()
    println(car2.toString())

}