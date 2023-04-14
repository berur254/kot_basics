fun main(args: Array<String>) {
    var x = 10
    var y = 20
    println(x + y) //30 as output

    var a = x.toString()
    var b = y.toString()
    println(a + b) // 1020 as output

    var c = x.toDouble()
    var d = y.toDouble()
    println(c + d) // 30.0 as output

    var e = a.toInt()
    var f = b.toInt()
    println(e + f) // 30 as output
}