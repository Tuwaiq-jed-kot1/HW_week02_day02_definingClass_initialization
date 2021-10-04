package HW2.Day1

class  Car(var name : String,var manufacturingYear:String){

    lateinit var color:String

    //the secondary constructor to ask for the name and manufacturing year and color
    constructor(_name: String, _manufacturingYear: String,_color:String) : this(name =_name,manufacturingYear=_manufacturingYear) {
        // manufacturingYear=_manufacturingYear

        color=_color


    }


    //give the car ability to accelerateand the ability to use breake
    fun ability(_ability: Boolean) {

        if (_ability){
            println(" the accelerateand is on")

        }else {
            println(" the brake is on")

        }
    }

    //رسالة ترحيبية
    init {

        println("Welcoming")

        println("Hi i,m init ,  i print this message when you creat new object :)")


        color="blu"
        println("Name: $name")

        //this.name ="sonata"

    }

}

fun main() {
    var car1:Car= Car("sonata","2020")


    car1.ability(true)



    println("------------------------------")


    var car2:Car= Car("camry","2018","red")


    car2.ability(false)



}