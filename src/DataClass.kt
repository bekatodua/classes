data class Student(val name: String, val age: Int)

fun main(args: Array<String>) {
    val student = Student("Bob", 20)
    val student2 = Student("Bob", 20)
    val student3 = Student("Alex", 19)
    if (student.equals(student2) == true)
        println("student is equal to student2.")
    else
        println("student is not equal to student2.")

    if (student.equals(student3) == true)
        println("student is equal to stu3.")
    else
        println("student is not equal to stu3.")


}