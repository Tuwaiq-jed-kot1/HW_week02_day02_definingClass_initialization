class car(var name: String, var manufacturingYear: Int) {
    constructor(name: String, manufacturingYear: Int, color: String) : this(
        name = name,
        manufacturingYear = manufacturingYear
    ) {

    }

    private var breake = false
    private var accelerator = false

    init {
        println(" Welcome $name !!")
    }

    fun useBreake() {
        breake = true
    }

    fun accelerateand() {
        accelerator = true
    }
}

fun main() {
val tesla=car("Tesla",2021)

}