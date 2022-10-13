// Exercise 1
// Print i as long as i is less than 5.
// var i = 0
// (i < 5) {
//    println(i)
//
//
// }

    var i = 0
    while (i < 5) {
        println(i)
     i++
    }

// Exercise 2
// Use the correct keyword to exit the loop if i is equal to 4.

//    var i = 0
//    while (i < 10) {
//        println(i)
//        i++
//        if (i == 4) {
//
//
//        }
//    }

    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {

            break

        }
    }

// Exercise 3
// Use the correct keyword to skip the value of 4 in a loop.

//var i = 0
//while (i < 10) {
//    if (i == 4) {
//        i++
//
//
//    }
//    println(i)
//    i++
//}

    var i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }