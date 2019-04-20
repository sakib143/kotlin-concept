fun main(args: Array<String>) {

    print("Value is ==> "+ setValue())

}

fun setValue():Int{
val number = 50
    return try {
        number
    } catch (e: ArithmeticException) {
        0
    }

}