/*## Part 1 - writing code.
write a kotlin program with car class that has three property name and color and manufacturing year
use the primary constructor to ask for the name and manufacturing year and use the secondary constructor to ask for the name and manufacturing year and color
and print a welcoming massage after creating new object from the class that contains the car name
and give the car ability to accelerateand the ability to use breake*/

fun main() {

    val Ford = Car("Expedition ", 2013,"Black")
    Ford.Color()
    Ford.accelerate()
    Ford.useBreak()


    val Toyota = Car("Camry", 2017)
    Toyota.Color()
    Toyota.accelerate()
    Toyota.useBreak()

}
class Car (var name : String, var manuFacturingYear : Int){
    lateinit var color :String

    constructor(carName:String ,carManuFacturingYear:Int, carColor:String )
            :this(name = carName, manuFacturingYear = carManuFacturingYear) { color = carColor }

    init {
        println("\n welcome to Motor Vehicle Periodic Inspection:")
    }


    fun Color (){
        if (::color.isInitialized){
            println("\n$name --> model : $manuFacturingYear --> color : $color")
        }else{
            println("\n$name --> model : $manuFacturingYear ")
        }
    }
    fun useBreak(){
        println("$name used the break ")
    }
    fun accelerate(){
        println("$name accelerate from 0 to 100 KM in 7s ")
    }
}

