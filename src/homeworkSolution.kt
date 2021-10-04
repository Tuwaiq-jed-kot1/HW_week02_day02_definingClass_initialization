class Car(private val name: String, private val manufacturingYear: Int) {

    private lateinit var color: String
    // The Two variables are Extra just to make sense when using Acceleration , SlowDown and Break
    private val maxSpeed: Int = 180
    private var speed: Int = 0

    constructor(name: String, manufacturingYear: Int, color: String) : this(name, manufacturingYear) {
        this.color = color
    }

    init {
        println("Welcome to ($name) ready to drive , ...Engine Started...")
    }

    fun accelerate() {
        if (speed < maxSpeed) {
            speed += 20
            println("$name current speed after Acceleration = $speed")
        } else {
            println("$name reached max speed $maxSpeed")
        }
    }

    fun slowdown() {
        speed -= 20
        if (speed < 0)
            speed = 0
        println("$name Current speed after Slow Down = $speed")
    }

    fun breake() {
        println("$name car Stopped !!")
        speed = 0
    }

    fun printCarInfo() {
        var str = "Car = $name , Manufacturing Year = $manufacturingYear "
        if (!::color.isInitialized) println(str) else println("$str, Color = $color")
    }

}

fun main() {
    val car1 = Car("Camry", 2021)
    car1.printCarInfo()
    car1.accelerate()
    car1.accelerate()
    car1.slowdown()
    car1.accelerate()
    car1.breake()
    println()
    val car2 = Car("Sonata", 2015, "Blue")
    car2.printCarInfo()
    car2.accelerate()
    car2.breake()

}