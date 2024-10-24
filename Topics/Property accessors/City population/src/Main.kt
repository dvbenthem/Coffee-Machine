class City(val name: String) {
    var population: Int = 0
    set(value) {
        if (value < 0){
            population = 0
        } else if (value > 50_000_000) {
            population = 50_000_000
        } else {
            field = value
        }
    }
}
