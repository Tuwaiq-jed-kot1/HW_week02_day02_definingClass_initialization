class Car (var name : String, var manuFacturingYear : Int){
    lateinit var color :String

    constructor(cName:String ,cmanuFacturingYear:Int, cColor:String ):this(
        name = cName, manuFacturingYear = cmanuFacturingYear){
        color = cColor
    }

    init {
        println("welcome... \nyour choice is:")
    }

    fun gitCollor (){
        if (::color.isInitialized){
            println("$name a greet car .. made in $manuFacturingYear and the collor is $color")
        }else{
            println("$name a greet car .. made in $manuFacturingYear ")
        }
    }
    fun break_(){
        println("auto break")
    }
    fun accelerate(){
        println("inside color will be white ")
    }
}

fun main() {
    val tayota = Car("camry", 2020)
    tayota.gitCollor()
    val mazda = Car("mazda6", 2021,"black")
    mazda.gitCollor()
    mazda.accelerate()
    mazda.break_()
}