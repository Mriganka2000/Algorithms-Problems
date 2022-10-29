open class Animal {
    var color : String
    var breed : String

    constructor(color: String, breed: String) {
        this.color = color
        this.breed = breed
    }

    fun eat() {
        println("Eats")
    }
}

class Cat(color : String, breed : String) : Animal(color, breed) {
    fun meow() {
        println("Meow")
    }
}

class Dog(color : String, breed : String) : Animal(color, breed) {
    fun bark() {
        println("Barks")
    }
}

fun main(args: Array<String>) {
    var cat = Cat("White", "Normal")
    var dog = Dog("Brown", "Doverman")

    println(cat.color)
    println(cat.breed)
    cat.meow()

    println(dog.color)
    println(dog.breed)
    dog.bark()
}