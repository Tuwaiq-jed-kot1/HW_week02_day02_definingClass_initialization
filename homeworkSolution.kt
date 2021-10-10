


## Part 1 - writing code.
class Car(var carBrand:String, modleYear:Int){
    private lateinit var carColor:String
    private var carScale = 125.5
    constructor(carBrandX: String,modleYearX: Int,carColorX:String) : this
        (carBrand = carBrandX,
        modleYear = modleYearX)
    {
        carColor = carColorX
    }
    init {
        println("Welcome to the $carBrand's Garage")
    }
    fun vehicleColor(modleYear: Int){
        if (!:: carColor.isInitialized){
            println("General Status: $carBrand made an amazing looking car back in $moduleYear")
        }else{
            println("General Status: $carBrand made an amazing $carColor colored looking car back in $moduleYear")
        }
    }
    fun accelerate (){
        if(carScale >= 125.5){
            println("Speed Status: (Over 125.5 Km) You are going over the speed limit!!")
        }else if(carScale > 0.0 && carScale < 125.5){
            println("Speed Status: You are following the rules")
        }else{
            println("Speed Status: Your car is stopped ")
        }
    }
    fun breaks() = println("Breaks Status: Your car have good strong breaks ")
    fun main() {
    }
    fun main(){
        val pathFinder = Car("Toyota",2018)
        pathFinder.vehicleColor(2018)
        val opel = Car("Opel",2019,"black")
        Opel.vehicleColor(2019)
        opel.accelerate()
        opel.breaks()

    }
