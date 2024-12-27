fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) //Prints [2, 4, 6, 8, 10]. Original list remains unchanged.
    println(list) //Prints [1,2,3,4,5]

    //Solution 1: Using mapIndexed for in-place modification (requires a mutable list)
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.mapIndexed { index, value -> mutableList[index] = value * 2 }
    println(mutableList) //Prints [2, 4, 6, 8, 10]

    //Solution 2:  Using map and assigning to a new variable
    val newList = list.map { it * 2 }
    println(newList) // Prints [2, 4, 6, 8, 10]. Original list remains unchanged.
    println(list) //Prints [1,2,3,4,5]
} 