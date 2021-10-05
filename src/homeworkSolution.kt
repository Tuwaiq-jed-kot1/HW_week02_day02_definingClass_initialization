class Car(cName:String,manufacturingYear:Int) {

      private var cName:String ="bmw"
     var manufacturingYear:Int =2000

    constructor (name: String, maYear: Int, color: String) : this() {
        cName=name
        manufacturingYear=maYear
        var carColor = color
    }
    var carSpeed = 1
    var accelerate = 1
    var breakcar=0

    fun accelerate() {
        println("car accelerate = $carSpeed + $accelerate")
    }

    fun Break() {

    println("car accelerate = $carSpeed- $breakcar")
}
    }

fun main(){
    var welcome = Car("Toyota", 2007, "blue")
    println("Hello, welcome $welcome")
    Car().accelerate()
}