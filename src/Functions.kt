fun main(args: Array<String>) {

    setData()
    val ans = setData(5, 7)
    print("Answer is ==> " + ans)

    setValue(5) // Passing default argument into y


}

fun setData() {
    print("Hello world !!!")
}

fun setData(x: Int, y: Int): Int { // return functions
    val add = x + y
    return add
}

fun setValue(x: Int , y: Int = 5) {
    print("\nValue of x is =>" + x + "Value of y is ==> " + y)
}