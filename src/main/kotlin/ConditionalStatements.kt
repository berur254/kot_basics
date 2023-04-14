fun main(args: Array<String>) {
    // IF STATEMENTS
    var age = 20
    if (age < 18){
        println("You are underage")
    }else{
        println("Welcome to the party")
    }

    var weight = 80
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")
    }else if (bmi <= 34){
        println("Overweight")
    }else{
        println("Obese")
    }
    var english = 70
    var kiswahili = 90
    var maths = 60
    var science = 100
    var IRE = 80
    var average = (english + kiswahili + maths + science + IRE) /5
    if (average <= 50){
        println('C')
    }else if (average <= 75){
        println('B')
    }else{
        println('A')
    }

    // WHEN STATEMENTS
    var bettingNumber = 3
    when(bettingNumber){
        1 ->{
            println("You lost")
        }
        2 ->{
            println("You lost")
        }
        3 ->{
            println("You won")
        }
        4 ->{
            println("You lost")
        }
        else ->{
            println("Enter a number from 1-4 to bet")
        }

    }
}