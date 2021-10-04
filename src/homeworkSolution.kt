package HW2.Day1

class  Car(var name : String,var manufacturingYear:String){

    lateinit var color:String

    //the secondary constructor to ask for the name and manufacturing year and color
    constructor(_name: String, _manufacturingYear: String,_color:String) : this(name =_name,manufacturingYear=_manufacturingYear) {
        // teacherDegree = tDegree
        manufacturingYear=_manufacturingYear
    }


    /* constructor(tName: String, tDegree: String) : this(name = tName) {//المقصود هنا يشير الى البرايمري في الكونستركتر
         teacherDegree = tDegree

     }*/


    /*   fun delCourse(coursesName: String) {
           if (!::registeredCourses.isInitialized) {
               println("you did not  register any course")

           } else {
               //contains  ابحث
               if (registeredCourses.contains(coursesName)) {
                   registeredCourses.remove(coursesName)
               } else {
                   println("you did not register  ")
               }

           }

       }*/


    //رسالة ترحيبية
    init {

        println("Welcoming")

        println("Hi i,m init ,  i print this message when you creat new object :)")

        println("Name: $name")

        this.name ="basil"

        println(name)
    }

}

fun main() {
    var car1:Car= Car("sonata","2020")

    //println(car1.color)



    println("------------------------------")


    var car2:Car= Car("camry","2018","red")



}