fun main() {
    println((angka(5)))
    println((angka1(3,5)))

    val (hasil1, hasil2) = angka3(18,3)
    println(hasil1)
    println(hasil2)

    println((angka4(3.0,5.0)))
    println((angka5(3.5,5.3)))
}

fun angka(a: Int) : Int{
    return a
}

fun angka1(a1a: Int, a1b: Int) : Int{
    return a1a * a1b
}

fun angka3(a3a: Int, a3b: Int) : Pair<Int,Int>{
    return Pair(a3a * a3b , a3a / a3b)
}

fun angka4(a4a: Double, a4b: Double) : Double{
    return a4a / a4b
}

fun angka5(a5a: Double, a5b: Double) : Double {
    return a5a + a5b
}