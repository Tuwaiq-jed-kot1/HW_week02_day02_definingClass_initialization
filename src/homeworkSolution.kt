class Car ( val name:String, val manufacturingYear:Int) {
    var color: String ="Black"


    constructor(name: String, colorr: String, manufacturingYear: Int) : this(
        name = name, manufacturingYear =manufacturingYear) {

        color = colorr
    }

    init {
        println("Welcom the car * $name *")
        println("Informaqtion about it is :\n the manufacturingYear _ $manufacturingYear _  \n and the color _ $color _ ")
    }

    fun accelerate (){


        println("accelerate of the car $name was very good and conforte ")

    }
    fun useBreake (){
        println("useBreake of the car $name was very easy with no issue")
    }
}




fun main() {
    var carName=Car("Marceds",1990,)
    carName.accelerate()
    carName.useBreake()


}