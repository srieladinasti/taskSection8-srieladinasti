fun main() {
    println(hasil("Hi World"))
    println(hasil(3,5))
    println(hasil(3.0))
    println(hasil(5F))
    println(hasil('A'))
}

fun hasil(h: String) : String{
    return h
}

fun hasil(h1: Int, h2: Int) : Int{
    return h1 * h2
}

fun hasil(h1: Double) : Double{
    return h1 / 0.5
}

fun hasil(h: Float) : Float{
    return h * 1.8F
}

fun hasil(h: Char) : Char{
    return h
}