// Exercise 1
// Print "Hello World" if a is greater than b.
// val a = 50
// val b = 10
// (a b) { println("Hello World!")}
    if (a > b) { println("Hello World!")}

// Exercise 2
// Print "Hello World" if a is equal to b.
// val a = 50
// val b = 50
// (a  b) { println("Hello World!") }
    if (a == b){
        println("Hello World!")
    }

// Exercise 3
// Fill in the missing part to create an if..else expression:
//  val time = 20
//       =      (time < 18) {
//      "Good day."
//  } else {
//      "Good evening."
//  }
//  println(greeting)
      val time = 20
       val greeting = if (time < 18) {
          "Good day."
      } else {
          "Good evening."
      }
    println(greeting)
