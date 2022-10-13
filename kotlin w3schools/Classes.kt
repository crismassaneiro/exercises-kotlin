// Exercise 1
//Create a class named "MyClass"

class MyClass

// Exercise 2
//Create an object of MyClass called myObj
//val

    val myObj = MyClass()

// Exercise 3
// Look at the following code. Insert the missing part to output "Ford":
//class Car(var brand: String, var model: String, var year: Int)
//
//fun main() {
//    val c1 = Car("Ford", "Mustang", 1969)
//
//    println(
//        .
//    )
//}

class Car(var brand: String, var model: String, var year: Int)

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)

    println(c1.brand)
}

