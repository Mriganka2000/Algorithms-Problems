class Person {

    var userName : String
    var number : String

    constructor(userName : String, number: String) {
        this.userName = userName
        this.number = number
    }

    fun addNumbers(a : Int, b : Int) : Int {
        return a + b
    }
}

class User(name : String) {
    private var userName : String = name

    fun getUseName() : String {
        return userName
    }
}

fun main(args: Array<String>) {
    var person = Person("ABCD", "123456789")

    println(person.userName)
    println(person.number)
    println(person.addNumbers(4, 5))

    var user = User("ABCD")
    println(user.getUseName())
}