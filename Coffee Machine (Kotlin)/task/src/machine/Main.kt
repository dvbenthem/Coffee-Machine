package machine

//    val waterForOneCupCoffee = 200
//    val milkForOneCupCoffee: Int = 50
//    val coffeeBeansForOneCupCoffee: Int = 15



fun main() {
    val coffeeMachineOn = CoffeeMachine()

    while (true) {
        coffeeMachineOn.userInput()

    }
}
class CoffeeMachine {

    var espressoWater = 250
    var espressoGramOfBeans = 16
    var espressoCost = 4

    var latteWater = 350
    var latteMilk = 75
    var latteGramOfBeans = 20
    var latteCost = 7

    var cappuccinoWater = 200
    var cappuccinoMilk = 100
    var cappuccinoGramOfBeans = 12
    var cappuccinoCost = 6

    var waterToAdd = 0
    var milkToAdd = 0
    var gramsOfCoffeeBeansToAdd = 0
    var disposableCupsToAdd = 0

    var waterInMachine = 400
    var milkInMachine = 540
    var gramsOfCoffeeBeansInMachine = 120
    var disposableCupsInMachine = 9
    var moneyInMachine = 550

    var coffeeMachineOn = true

    val minWater = waterInMachine / cappuccinoWater
    val minMilk = milkInMachine / cappuccinoMilk
    val minCoffeeBeans = gramsOfCoffeeBeansInMachine / cappuccinoGramOfBeans
    val minProduct = minOf(minWater, minMilk, minCoffeeBeans)


fun coffeeMachineHas(){
    println("The coffee machine has:")
    println("$waterInMachine ml of water")
    println("$milkInMachine ml of milk")
    println("$gramsOfCoffeeBeansInMachine g of coffee beans")
    println("$disposableCupsInMachine disposable cups")
    println("\$$moneyInMachine of money")
    println("")
}

fun checkIfCanMakeCoffeeType(){
    println("I have enough resources, making you a coffee!")
    println("Sorry, not enough water!!")
}

fun userInput() {
    println("Write action (buy, fill, take, remaining, exit): ")
    val machineOptions = readln().lowercase()

    when (machineOptions) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                val typeOfCoffee = readln()
                if (typeOfCoffee == "back") {
                    userInput()
                } else {
                    when (typeOfCoffee.toInt()) {
                        1 -> {
                            if (espressoWater > waterInMachine) {
                                println("Sorry, not enough water!")
                            } else {
                                waterInMachine -= espressoWater
                                gramsOfCoffeeBeansInMachine -= espressoGramOfBeans
                                disposableCupsInMachine--
                                moneyInMachine += espressoCost
                                println("I have enough resources, making you a coffee!")
                            }
                        }


                        2 -> {
                            if (latteWater > waterInMachine) {
                                println("Sorry, not enough water!")
                            } else {
                                waterInMachine -= latteWater
                                milkInMachine -= latteMilk
                                gramsOfCoffeeBeansInMachine -= latteGramOfBeans
                                disposableCupsInMachine--
                                moneyInMachine += latteCost
                                println("I have enough resources, making you a coffee!")
                            }
                        }

                        3 -> {
                            if (cappuccinoWater > waterInMachine) {
                                println("Sorry, not enough water!")
                            } else {
                                waterInMachine -= cappuccinoWater
                                milkInMachine -= cappuccinoMilk
                                gramsOfCoffeeBeansInMachine -= cappuccinoGramOfBeans
                                disposableCupsInMachine--
                                moneyInMachine += cappuccinoCost
                                println("I have enough resources, making you a coffee!")

                            }
                        }

                        else -> println("invalid input")
                    }
                }
            }

            "fill" -> {
                fillCoffeeMachine()
                waterInMachine += waterToAdd
                milkInMachine += milkToAdd
                gramsOfCoffeeBeansInMachine += gramsOfCoffeeBeansToAdd
                disposableCupsInMachine += disposableCupsToAdd
                println("")
            }

            "take" -> {
                println("I gave you \$$moneyInMachine")
                moneyInMachine = 0
                println("")
            }
            "remaining" -> coffeeMachineHas()
            "exit" -> {
                coffeeMachineOn = false
            }

            else -> println("Invalid input")
        }
}


fun fillCoffeeMachine() {
    println("Write how many ml of water you want to add:")
    waterToAdd = readln().toInt()
    println("Write how many ml of milk you want to add:")
    milkToAdd = readln().toInt()
    println("Write how many grams of coffee beans you want to add:")
    gramsOfCoffeeBeansToAdd = readln().toInt()
    println("Write how many disposable cups you want to add:")
    disposableCupsToAdd = readln().toInt()
}
}
