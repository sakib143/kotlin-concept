fun main(args: Array<String>) {

    var myMap : Map<Int,String> = mutableMapOf(1 to "Sakib", 2 to "Joh")

    for (i in myMap){
        println("Map value is ==> "+i)
    }

    val hashMap : HashMap<Int,String> = HashMap<Int,String>() //define empty hashmap
    hashMap.put(1,"Ajay")
    hashMap.put(3,"Vijay")
    hashMap.put(4,"Praveen")
    hashMap.put(2,"Ajay")

    for (i in hashMap){
        println("Hash Map value is ==> "+i)
    }

    if(hashMap.containsValue("Ajay")){
        println("Valkue is found !!!")
    }

}