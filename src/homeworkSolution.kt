class Car (var cName:String,cManufacturingYear:Int){
    lateinit var color : String
    init {
        println("Hello your car name is $cName")
    }
    constructor(newName:String,cManufacturingYear:Int,newColor:String) : this ( cName = newName,2000 ){
        var color = newColor
        println("your $cName color is $color")

    }
    fun acceleration(){
        println("your car $cName is accelerating")
    }
    fun breake() {
        println("your car $cName is stopped")
    }

}




fun main() {
    val toyota = Car("Camry",2002)

    toyota.acceleration()
    toyota.breake()
    val nissan = Car("Altima",2011,"white")


}