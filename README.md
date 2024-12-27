# Kotlin map() Function Unexpected Behavior

This repository demonstrates a common misunderstanding regarding the Kotlin `map()` function. The `map()` function in Kotlin, unlike some other languages' `map` functions, does *not* modify the original list. Instead, it returns a *new* list containing the transformed elements. 

This can lead to bugs if developers expect the original list to be modified in place. The example code shows this behavior and provides a corrected solution using `mapIndexed` for in-place modification or using a `mutableListOf` with `map` for creating a new list.