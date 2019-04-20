fun main(args: Array<String>) {

    val childObject = ChildClass()
    childObject.getNumber()

    /*
    By default all Kolin class is final class so if we want to inherit then it must be use "open" Keyword
     */
}
open class Base{
    protected val rollNumber = 10
}

class ChildClass : Base(){
    fun getNumber():Int{
        return rollNumber
    }
}

class Derived: Base() {
    fun foo() {
        println("Roll Number is " + rollNumber)
    }
}