package study.step4.view

import study.step4.model.Car

object ResultView {

    fun resultRacingCar(cars: List<Car>, racingTimes: Int) {
        println("실행 결과")
        (0 until racingTimes).forEach { times ->
            printCarHistory(cars, times)
        }
    }

    private fun printCarHistory(cars: List<Car>, times: Int) {
        cars.forEach {
            val i = it.getHistory()[times]
            println("${it.name} : " + "-".repeat(i))
        }
        println()
    }
}
