class Car(var NameCar: String, manfacturing_year: Int) {
    lateinit var color: String
    var m1anfacturing_year: Int = manfacturing_year
//constructor(N2ameCar:String,m2anfacturing_Year:Int):this(NameCar=N2ameCar){
//             NameCar=N2ameCar
//

    constructor (NnameCar: String, mmanfacturing_color: String) : this(NameCar = NnameCar, 2019) {
        color = mmanfacturing_color


    }

    init {
        println("Welcome to website Car $NameCar in year ")

    }

    fun accelerate() {

        println("the accelerated $NameCar : 120/km h ")

    }

    fun breake() {

        println("stop $NameCar ")

    }


}


fun main() {


    var nisan = Car("nisan", 2018)
    nisan.accelerate()
    nisan.breake()
    val toyota = Car("Toyota", "black")
    toyota.accelerate()
    toyota.breake()


}