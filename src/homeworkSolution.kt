class Car(var carName: String, var carManafuctringYear: Int) {

    lateinit var carColor: String

    constructor(cName: String, cYear: Int, cColor: String) : this(carName = cName, carManafuctringYear = cYear) {
        carName = cName
        carManafuctringYear = cYear
        carColor = cColor
    }

    init {
        println("Car name is $carName ")
    }

    fun accelerate(startingVelocity: Double, finalVelocity: Double, time: Int) {
        val accelration = ((finalVelocity - startingVelocity) / time)
        println("Your Car accelration is : $accelration")
    }

    fun useBreack() {
        println("Your Car Stopped !")
    }

    fun printCarInfo() {
        if (::carColor.isInitialized) {
            println("Car name : $carName \nCar year : $carManafuctringYear \nCar Color $carColor")
        } else {
            println("Car name : $carName \nCar year : $carManafuctringYear ")
        }
    }
}

fun main() {
    val yaris = Car("Yaris", 2011, "White")
    println("-------------------")
    yaris.accelerate(0.0, 120.0, 7)
    yaris.useBreack()
    yaris.printCarInfo()
}
