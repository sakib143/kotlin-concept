fun main(args: Array<String>) {

    //Inheritance by "Primary constructor"
    val programmerObject = Programmer("Sakib",35000)
    programmerObject.doProgramming()

    val salesmanObject = SalesMan("Demo",15000)
    salesmanObject.enjoySales()

    //Inheritance by "Secondary Constructor"
    val objectChild = ChildClss("Sakib",786110,"Ahmedabad")
    println("Secondary Constructor demo ==> Name is --> ${objectChild.full_name}  Contact Number is -->${objectChild.contact_number} Address is --> ${objectChild.home_address}")

}

open class Employee(name:String, salary:Int){
    init {
        println("Name is --> $name  Salary is --> $salary")
    }
}

class Programmer (emp_name:String, emp_salary: Int) : Employee(emp_name,emp_salary){
    fun doProgramming(){
        println("Do Programming !!!")
    }
}

class SalesMan(salesman_name:String,salesman_salary: Int) : Employee(salesman_name,salesman_salary){
    fun enjoySales(){
        println("Enjoy Sales !!! ")
    }
}

open class Parent{
    var full_name :String
    var contact_number :Int

    constructor(full_name:String,contact_number:Int){
        this.full_name = full_name
        this.contact_number = contact_number
    }
}

class ChildClss : Parent{
    var home_address = ""
    constructor( full_name :String,contact_number :Int,home_address:String):super(full_name,contact_number){
        this.home_address = home_address
    }
}