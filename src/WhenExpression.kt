fun main(args: Array<String>) {
    //By integer value
    val n = 3
    when(n){
        1-> {
            print("Value is One")
        }
        2-> {
            print("Value is Two")
        }
        3-> {
            print("Value is Three")
        }
    }

    //By String value
    val name = "Hello"
    val address = "Address"

    //Here we can pass [name] and [address]
    when(address ){
        "Hello","Address"->{
            print("\nYou are in Hello world ")
        }
    }

    //Using integer range
    val number = 7
    when(number){
        in 1..7 ->{
            print("\nYou are in One to Seven")
        }
    }

}
