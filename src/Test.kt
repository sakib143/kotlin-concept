
fun main(args: Array<String>) {

    val consCheck = TempClass("Sakib ",1)

    print("Name is ${consCheck.name}")

}
class TempClass{
    var name = ""
    var number = 0


    constructor(name:String, number : Int){
        this.name = name
        this.number = number
    }
}