fun main(args: Array<String>) {
    val childObject = Child()
    println("Name is child is " + childObject.getUserName())
}

open class ParentClass{
    val name= "Sakib"
}

class Child : ParentClass(){
    fun getUserName():String{
        return name
    }
}

