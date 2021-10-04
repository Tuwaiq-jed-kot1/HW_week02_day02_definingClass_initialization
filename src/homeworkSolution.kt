class car(var name: String, var manufacturingYear: Int) {
    lateinit var color: String
    private var breake = false
    private var accelerator = false

    constructor(name: String, manufacturingYear: Int, _color: String) : this(
        name = name,
        manufacturingYear = manufacturingYear

    ) {
        color = _color
    }


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
    val tesla = car("Tesla", 2021)

}