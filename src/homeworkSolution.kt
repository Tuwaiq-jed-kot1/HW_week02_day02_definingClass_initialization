//Part|
class Car(val name:String,val manufacturingYear:String){

    lateinit var color:  String

    init {
        println("Your car name is : $name ")
    }

    constructor(carName:String,carManufacturingYear:String,carColor:String) : this(name=carName,manufacturingYear=carManufacturingYear){
        color=carColor
    }

    fun accelerate(){
        println("The $color $name is accelerating ")
    }

    fun break1(){
        println("The $color $name is stop")
    }

}

fun main() {
    println()
    val car=Car("Mercedes","2021")
    car.color="Black"
    val car2 = Car("BMW","2020","Blue")
    println("\n--------------------------------------------------\n")

    car.accelerate()
    car2.accelerate()
    println("\n--------------------------------------------------\n")
    car.break1()
    car2.break1()


}