fun makeMyWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {
    // write here

//    val wishListMap = mutableMapOf<String, Int>()
    return wishList.filter {entry -> entry.value <= limit }.toMutableMap()




}