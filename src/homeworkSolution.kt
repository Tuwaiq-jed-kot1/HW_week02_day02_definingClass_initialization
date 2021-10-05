/*

## Part 1 - writing code.
---
### write a kotlin program with `car` class that has three property `name` and `color` and `manufacturing year`
### use the primary constructor to ask for the `name` and `manufacturing year` and use the secondary constructor to ask for the
### `name` and `manufacturing year` and `color`
### and print a welcoming massage after creating new object from the class that contains the car name
### and give the car ability to `accelerate`and the ability to `use breake`

*/

// 'car' class
// use the primary constructor to ask for the `name` and `manufacturing year`
class Car(var modelName: String, var modelYear: Int) {
    lateinit var color: String
    lateinit var registeredCarModels:MutableSet<String>

    //use the secondary constructor to ask for the `name` and `manufacturing year` and `color`
    constructor(modName: String, modYear: Int, col: String) : this(modelName = modName, modelYear = modYear) {
        color = col
    }

    //print a welcoming massage after creating new object from the class that contains the car name
    init {
        println("A new model has been initiated in the system by the name: $modelName")
    }

    fun accelerate(modelName: String) {
        if (:: registeredCarModels.isInitialized) {
            registeredCarModels.add(modelName)
            println("$modelName is accelerating")
        }
        else
            println("$modelName is not registered in the system")
    }
    fun useBrakes() {
        println("$modelName used the brakes to stop!")
    }
    /*fun printInfo(){
        println("The registered car models are: $registeredCarModels")
    }*/
}


fun main() {
    val car1Tucson = Car("Hyundai Tucson",2017)
    val car2Sx4 = Car("Suzuki Sx4",2011)
    val car3Elantra = Car("Hyundai Elantra",2007)
    val car4EC7 = Car("Geely EC7",2013)

    val car1WhiteNissanSunny = Car("Nissan Sunny", 2016,"White")

    car1Tucson.accelerate(car1Tucson.modelName)
    car1Tucson.useBrakes()
    //car1Tucson.printInfo()

}