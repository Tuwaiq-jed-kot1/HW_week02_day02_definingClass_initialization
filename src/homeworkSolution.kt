class Car(var name: String, var manufacturing_year: Int) {

    lateinit var color: String

    constructor(name2: String, manufacturing_year2: Int, color2: String) : this(
        name = name2,
        manufacturing_year = manufacturing_year2
    ) {
        color = color2
    }

    init {
        println("hello, nice $name vehicle \n ")
    }

    fun accelerate() {
        println("*the car speed increase*\n")
    }

    fun carBrake() {
        println("*the car speed decrees*\n")
    }
}

fun main() {
    val ahmed = Car("Mercedes", 1998)
    val mohammed = Car("GMC", 2008, "red")

    ahmed.accelerate()
    mohammed.carBrake()
}