package oop

import java.awt.Color
import javax.print.attribute.standard.MediaSize
import javax.print.attribute.standard.PrinterMakeAndModel


fun main(args: Array<String>) {
    // These are objects
    var f1 = Fruit("Mango", "Yellow", "200g", 30.0)
    var f2 = Fruit("Apple","Red", "250g",50.0)
    println(f1.name)
    println(f2.color)

    var c1 = Car("Toyota", "KDJ 458v",2000000.50)
    var c2 = Car("Mercedes", "KDg 458v",3000000.50)
    c2.accelerate()
    c1.brake()
    println(c2.price)
    println(c1.reg_no)

}

// This is a class
class Fruit(name:String, color:String, size:String, price:Double){
    // Declare the properties to be initialised
    var name:String
    var color:String
    var size:String
    var price:Double
    // Initialised th properties
    init {
        this.name = name
        this.color = color
        this.size = size
        this.price = price
    }
}

class Car(model:String, reg_no:String, price: Double){
    var model:String
    var reg_no:String
    var price:Double
    init {
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    // These are class functions
    fun accelerate(){
        println("Yeah, i can accelerate")
    }
    fun brake(){
        println("i am a $model and i can brake.")
    }
}