class Car(var carName: String, var manYear: Int){
    lateinit var carColor: String
    constructor(_Name: String, _Year: Int, _Color: String) : this(carName=_Name, manYear=_Year) {
        carColor = _Color
    }
    init {
        println("Welcome to $carName $manYear page ")
    }
    fun accelerate(){
        println(" The Accelerate of $carName $manYear is very good")
    }
    fun useBreak(){
        println(" The Break of $carName $manYear is easy to use")
    }
}
fun main() {
    var manYear= Car("GMC",2019, "Black")
    manYear.accelerate()
    manYear.useBreak()
}
