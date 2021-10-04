//write a kotlin program with car class that has three property name and color and manufacturing year
//use the primary constructor to ask for the name and manufacturing year and use the secondary constructor to ask for the name and manufacturing year and color
//and print a welcoming message after creating new object from the class that contains the car name
//and give the car ability to accelerate and the ability to use break

//------------------------Creating Class and Primary Constructor-----------------------------//
class Car(var carBrand:String, moduleYear:Int){
    private lateinit var carColor:String
    private var carGauge = 120.5

    //------------------------Creating Secondary Constructor With Car Color-----------------------------//
    constructor(carBrandX: String,moduleYearX: Int,carColorX:String) : this
        (carBrand = carBrandX,
        moduleYear = moduleYearX)
    {
        carColor = carColorX
    }
    //------------------------This message will always print first-----------------------------//
    init {
        println("Welcome to $carBrand's Garage")

    }
    //------------------------Creating Ability 1 for Color-----------------------------//
    fun vehicleColor(moduleYear: Int){
        if (!:: carColor.isInitialized){
            println("General Status: $carBrand made an amazing looking car back in $moduleYear")
        }else{
            println("General Status: $carBrand made an amazing $carColor colored looking car back in $moduleYear")
        }
    }
    //------------------------Creating Ability 2 for Acceleration-----------------------------//
    fun accelerate (){
        if(carGauge >= 120.5){
            println("Speed Status: (Over 120.5 Km) You are going over the speed limit!!")
        }else if(carGauge > 0.0 && carGauge < 120.5){
            println("Speed Status: You are following the rules")
        }else{
            println("Speed Status: Your car is immobile for now")
        }
    }
    //------------------------Creating Ability 3 for Breaks-----------------------------//
    fun breaks() = println("Breaks Status: Your car have strong breaks ")



}
//------------------------Calling the class with its parameter -----------------------------//
fun main(){
    val pathFinder = Car("Nissan",2019)
    pathFinder.vehicleColor(2019)
    val benz = Car("Mercedes",2017,"Cyan")
    benz.vehicleColor(2017)
    benz.accelerate()
    benz.breaks()

}