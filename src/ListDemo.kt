fun main(args: Array<String>) {


    val listStudent = listOf("One","Two","Three")//read only, fix-size

    for (i in listStudent){
        println("Data is ==> "+ i)
    }


    val listStudentTwo : List<String> =listOf<String>("Jeff","Jack","Smith")
    for (i in listStudentTwo){
        println("List two is  ==> "+ i)
    }

    //Mutable List allow to add dynamic value into list
    var muteList = mutableListOf<String>()
    muteList.add("First data")
    muteList.add("Second data")
    muteList.add("Third data")

    for (i in muteList){
        println("List two is  ==> "+ i)
    }

    //ArrayList example
    val arrayList : ArrayList<String> = ArrayList<String>()
    arrayList.add("First Arraylist")
    arrayList.add("Second Arraylist")
    arrayList.add("Third Arraylist")

    for (i in arrayList){
        println("Arraylist data  ==> "+ i)
    }

    //All type of input param
    val arrayListTwo : ArrayList<Any> = arrayListOf<Any>(1,2,3,"First","Second","Third")
    for (i in arrayListTwo){
        println("All Types of data  ==> "+ i)
    }


    //Adding custom object into arraylist.
    class Student(var name:String, var address:String)

    val customArray:ArrayList<Student> = arrayListOf();
    customArray.add(Student("Sakib","Ahmedabad"))
    customArray.add(Student("Stecy","USA"))
    customArray.add(Student("Test","Ahmedabad"))

    for (i in customArray){
        println("Custom array Name ==>" + i.name)
        println("Custom array Address ==>" + i.address)
    }




}