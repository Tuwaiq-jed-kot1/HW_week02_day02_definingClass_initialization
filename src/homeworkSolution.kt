//Part|
class Car(name:String,manufacturingYear:Int){
    lateinit var name:String
    lateinit var color:String
    lateinit var manufacturingYear:String
    init {
        println("The name of the car is : $name")
    }

    constructor(carName:String,carManufacturingYear:Int,carColor:String) : this(name=carName,manufacturingYear=carManufacturingYear){
        color=carColor
    }

    fun accelerate(){
        println("The $name is still going")
    }

    fun breake(){
        println("The $name is stop")
    }

}

fun main (){
    val carNO1=Car("Dodge",2021)
    carNO1.name="Toyota"
    carNO1.accelerate()
    carNO1.breake()
}