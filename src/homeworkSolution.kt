
fun main(){
    val myCar0=Car("Toyota",2017)
    myCar0.accelerate(40.0,120.0,20.0)
    myCar0.printInfo()
    println("-----------------------")
    val myCar1=Car("Jeep",2019,"white")
    myCar1.carBreak(true)
    myCar1.printInfo()

}


class Car(private var name:String ,private var manifacturinYear:Int){

    private lateinit var carColor:String

    constructor( secName:String , secManifacturinYear:Int, color:String):this(name=secName,
        manifacturinYear=secManifacturinYear){
        carColor=color
    }
    init{
        println("***** Welcome $name ***** ")
    }

    fun accelerate( iSpeed:Double ,fSpeed :Double ,accTime:Double){
        val timee =("%.2f".format((accTime/3600))).toDouble()
        val acceleration:Double= (fSpeed-iSpeed)/timee // (v2 - v1)/t time in seconds
        println("the car acceleration is ${"%.2f".format(acceleration)}   km/hour ^2 ")
    }
    fun carBreak( useOfBreak:Boolean){
        if(useOfBreak) println("The car stopped")
        else println("the car continue moving")

    }
    fun printInfo(){
        if(::carColor.isInitialized){
            println("--Info\n-- Car name: $name .\n-- Color: $carColor .\n-- Year of manufacturing: $manifacturinYear . \n" )
        }else println("--Info\n-- Car name: $name .\n-- Year of manufacturing: $manifacturinYear . \n" )
    }

}