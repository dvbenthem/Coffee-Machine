fun removing(currentMap: MutableMap<Int, String>, value: String): MutableMap<Int, String> {
    // Write your code here. Do not print the result of the function! 
//    return currentMap.filter { entry -> entry.key. }.toMutableMap()

    return currentMap.filter { entry -> entry.value != value }.toMutableMap()
}