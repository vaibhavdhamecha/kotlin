fun main()
{
    var num1: Int
    var num2: Int

    println("Enter num 1: ")
    num1 = readLine()?.toInt()!!

    println("Enter num 2: ")
    num2 = readLine()?.toInt()!!

   express(num1,num2)
}

fun express(num1: Int, num2: Int)
{
    if (num1>num2)
    {
        println("Max value is num 1: $num1")
    }
    else
    {
        println("Max value is num 2: $num2")
    }
}