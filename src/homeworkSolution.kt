
class a(var cName:String="",var manufacturing:String=""){

    var cColor="white"

    init {
        print("welcome to $cName")
    }


    constructor(name:String,color:String,manu:String) : this(cName=name){
        cName=name
        cColor=color
        manufacturing= manu



        fun info1(){
            print("car name is $cName")
            print("manufacturing has $manufacturing")
            print("car color is $cName")

        }

    }
}
fun accelerate(){}
fun useBreake(){}


fun main(){
    val aaa = a("toyota")

}