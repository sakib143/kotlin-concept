fun main(args: Array<String>) {
    val parrotObject = Parrot()
    parrotObject.fly()
    //Note:- Here we have executed child and parent class method.
}
open class Bird{
    open fun fly(){
        println("Bird is flying ")
    }
}

class Parrot : Bird(){
    override fun fly(){
        println("Parrot is flying ")
        super.fly()
    }
}