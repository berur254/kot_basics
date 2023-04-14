fun main(args: Array<String>) {
  addition(12, 23.6)
  addition(1212, 3434.4, 6565)
}

fun addition(x:Int, y:Double){
    var jibu = x + y
    println("Answer from adittion1 is $jibu")
}

fun addition(x:Int, y:Double, z:Int){
    var jibu = x + y + z
    println("Answer from adittion2 is $jibu")
}