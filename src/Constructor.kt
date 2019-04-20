import kotlin.test.todo

fun main(args: Array<String>) {

    /** Types of Kotlin constructors
     * 1.   Primary constructor
     * 2.   Secondary constructor
     */

    //Primary constructor demo.
    println("\nPrimary Constructor Simple Demo")
    val studentObject = Student(1,"Sakib")
    println("Name is ${studentObject.name} and Roll Number is ${studentObject.roll_number}")

    //Primary constructor with initializer block.
    println("\n\nPrimary constructor with initializer block")
    val primContruWithBlock = Student2(2,"Syed")

    /*
    In Secondary constructor, we can create more than one constructor by "constructor" keyword
     */
    val secondaryConstruct = Student3("Najaf",3)
    secondaryConstruct.showData()



}
class Student(val roll_number:Int,val name:String)

class Student2(val roll_number: Int,name: String){
    val rollNumer = roll_number
    val studentName = name;
    init {
        println("Roll Number is ==> $rollNumer  and Name is $studentName")
    }
}

class Student3{
    var name:String = ""
    var roll_number:Int = 0

    constructor(name: String,roll_number: Int){
        this.name = name;
        this.roll_number = roll_number
    }

    fun showData(){
        println("Name is ==> $name Roll Number is $roll_number")
    }
}


