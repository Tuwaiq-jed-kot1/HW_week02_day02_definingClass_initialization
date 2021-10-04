
// define class + primary conster

class Car(private var name:String, private var manufacturing_Year: String) {

    var color: String ="red"


    //the secondary constructor///
    constructor(c_name: String, c_manufacturing_Year: String , c_color:String) :
            this(name = c_name, manufacturing_Year = c_manufacturing_Year) {
        // teacherDegree = tDegree
        this.color = c_color}

    //print a welcoming massage after creating new object from the class that contains the car name//

    init {
        println("welcome to join us , the car name is $name  ")

    }

    fun car_ability(){
        println("please enter 1 for accelerate and 2 for use breake  ")
        val x = readLine()!!.toInt()
        when (x) {
            1 -> print(" the ability for $name is  ....     ")
            2 -> print(" for ues breake in  $name do that ...  ")
            else -> print("inviled number")
        }
    }

}//end of class


fun main() {
    val Afnan = Car("Porsche", "2020","red")

    //val Alien = Car("Mercedes", "2021","black")

    // println(Afnan)
    //   println(Alien)
    println(Afnan.car_ability())

}



