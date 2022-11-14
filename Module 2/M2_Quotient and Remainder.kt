fun main()
{
    var num1: Int
    var num2: Int

    var quotitent: Int
    var reminer: Int

    println("Enter value of num1: ")
    num1 = readLine()?.toInt()!!

    println("Enter value of num2: ")
    num2 = readLine()?.toInt()!!

    quotitent = num1 / num2
    reminer = num1 % num2

    println("Quotitent of $num1 / $num2 = $quotitent")
    println("Reminder of $num1 % $num2 = $reminer")
}