class Car(var name:String, var manufacturingYear:Int){
    fun printInfo():String{
        return "The car model is: '$name' and made at '$manufacturingYear'"
    }
    constructor(carName:String,carColor:String, carManufacturingYear:Int):
            this(name = carName, manufacturingYear = carManufacturingYear){
        println("The car model is: '$carName' and have a '$carColor' color and made at '$carManufacturingYear'")
    }
    init {
        println("Welcome to cars world !  The car brand is $name ")
    }
    fun accelerate():String{
        return "$name car has the ability to accelerate."
    }

    fun useBreak():String{
        return "$name car has the ability to use the break."

    }

}

fun main() {
    val audi = Car("Audi","Red",2019)
    println(audi.accelerate())
    println(audi.useBreak())

    val mercedes = Car("Mercedes", 2017)
    println(mercedes.accelerate())
    println(mercedes.useBreak())

}