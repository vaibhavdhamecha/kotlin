fun main()
{
    var num: Int

    println("Enter Num: ")
    num = readLine()?.toInt()!!

    if (num % 2 == 0)
    {
        println("$num is even")
    }
    else
    {
        println("$num is odd")
    }


}