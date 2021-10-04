//## Part II - writing code.
//write a kotlin program with car class that has three property name and color and manufacturing year
//use the primary constructor to ask for the name and manufacturing year and use the secondary constructor
// to ask for the name and manufacturing year and color
//and print a welcoming massage after creating new object from the class that contains the car name
//and give the car ability to accelerateand the ability to use breake
class Car(carName: String, manufacYear: Int){
    lateinit var color: String
    lateinit var carModel: String
    constructor(cName: String, cColor: String, cManufacYear: Int): this(carName = cName, manufacYear = cManufacYear){
        color = cColor
        carModel = cName
    }
    init {
        println("Hello there!! Your car model is $carName")
    }
    fun accelerate(){
        println("$carModel is accelerating")
    }
    fun useBrakes(){
        println("$carModel is slowing down")
    }
}

fun main(){
    val myCar: Car = Car("Lamborghini Urus", "Yellow", 2021)
    myCar.accelerate()
    myCar.useBrakes()
}