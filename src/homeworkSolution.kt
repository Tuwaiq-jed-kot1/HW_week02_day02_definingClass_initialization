class Car(inputName: String, inputYear: Int) {
    var manufactringYear: Int = 0
    lateinit var name: String
    lateinit var color: String

    constructor(inputName2: String, inputYear2: Int, inputColor: String) : this(inputName2, inputYear2) {
        color = inputColor
    }

    init {
        //accept only primary constrector
        name = inputName
        manufactringYear = inputYear
        println("hi  welcome to our company")
    }

    fun accelerate() {
        println("car accelerated")

    }

    fun breake() {
        println("car stopped")
    }
}

fun main() {
    var car1 = Car("BNW", 1999)
    var car2 = Car("toyota", 1976, "black")
    println(car2.color)
    car1.breake()
    car2.accelerate()
}



