fun main(args: Array<String>) {

    val programmerObject = Programmer("Sakib",35000)
    programmerObject.doProgramming()

    val salesmanObject = SalesMan("Demo",15000)
    salesmanObject.enjoySales()

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

