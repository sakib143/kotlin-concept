fun main(args: Array<String>) {

    val array = arrayOf(10,20,30,40,50)

    for (i in array.indices){
        println("array value is [$i] "+ array[i])
    }

    print("\n")

    val arrayTwo = arrayOf<String>("Sakib","John","Smith")
    for (i in arrayTwo){
        println("Name is => "+ i)
    }

}