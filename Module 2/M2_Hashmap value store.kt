fun main()
{
    var data = hashMapOf<String,String>()

    data.put("Gujrat","Ahmedabad")
    data.put("Rajsthan","Udaipur")
    data.put("Bihar","Reva")
    data.put("UP","Mirzapur")

    for (i in data.keys)
    {
        println("State: ${data[i]} / City: $i")
    }

}