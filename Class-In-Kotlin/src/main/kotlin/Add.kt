import java.util.*

class Add {
    init {
        println("Add class called")
    }

    fun get() : Int {
        var read = Scanner(System.`in`)
        print("Enter the 1st number :- ")
        val a: Int = read.nextInt()
        print("Enter the 2nd number :- ")
        val b: Int = read.nextInt()
        val c = a + b
        return c
    }
}