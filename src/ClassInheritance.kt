open class Person(person: String, age: Int, name: String) {
    init {
        println("I am a $person")
        println("My name is $name.")
        println("My age is $age")
    }
}

class Teacher(person: String, age: Int, name: String): Person(person, age, name) {
    fun teacher() {
        println("I am a teacher.")
    }
}

class Footballer(person: String, age: Int, name: String): Person(person, age, name) {
    fun playFootball() {
        println("I am a footballer.")
    }
}

fun main(args: Array<String>) {

    val teacher = Teacher("Person",25, "Jack")
    teacher.teacher()
    println()
    val football = Footballer("Person", 28, "Bob")
    football.playFootball()

}