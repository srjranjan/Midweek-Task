

 class Midweek {
    var number : Int = 0
    var secondNumber : Int = 0
     var c=0
    fun add() {
        c= number.plus(secondNumber)
        println( "sum of two numbers = ${c.toString()}")
    }
     fun subtract()
     {
         c = number.minus(secondNumber)
         println("Difference of two numbers = ${c.toString()}")
     }
     fun multiply(){
         c= number.times(secondNumber)
         println("product of two numbers = ${c.toString()}")
     }
 }
 fun main() {
     val obj = Midweek()
     obj.number = 27
     obj.secondNumber = 93
     obj.add()
     obj.subtract()
     obj.multiply()
 }