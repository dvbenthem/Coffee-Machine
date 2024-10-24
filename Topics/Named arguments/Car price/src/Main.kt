fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var priсeNewCar = 20000
    var sumCarPrice = priсeNewCar
    val priceDecrease = 2000
    
    sumCarPrice -= old * priceDecrease

    var speedDecreasePrice = 0
    if (maximumSpeed < 120) {
        speedDecreasePrice = (120 - maximumSpeed) * 100
        sumCarPrice -= speedDecreasePrice
    } else {
        speedDecreasePrice = (maximumSpeed - 120) * 100
        sumCarPrice += speedDecreasePrice
    }
    
    val deductionPriceOnKm = (kilometers / 10000) * 200

    sumCarPrice -= deductionPriceOnKm
    
        if (automatic) {
            sumCarPrice += 1500
        }
            
    
    println(sumCarPrice)
}

