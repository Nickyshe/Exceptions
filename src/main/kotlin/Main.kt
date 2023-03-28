fun main() {
    val x = try {
        divide(10,5)
    }catch (e: DivisionByZeroException){
        0
    }finally {

    }
    println("the result is $x")




    println("enter a no: ")
    val input = try{
        readLine()?.toInt()

    }catch (e: Exception){
        2

    }finally {
        println("this is from the finally block")
    }

    println("you entered: $input")



}
class DivisionByZeroException: Exception("please you cannot divide by 0")
fun divide(a : Int, b: Int):Int{
    if (b == 0){
        throw DivisionByZeroException()
    }
    return a / b
}

