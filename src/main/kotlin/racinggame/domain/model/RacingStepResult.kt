package racinggame.domain.model

@JvmInline
value class RacingStepResult(val racingGameStatusList: List<IndividualRacingStepStatus>) {
    val firstPlaces: List<String>
        get() {
            val firstPlaceLevel = getFirstPlaceLevel()

            return racingGameStatusList
                .filter { racingGameStatus ->
                    racingGameStatus.proceedLevel == firstPlaceLevel
                }.map { racingGameStatus ->
                    racingGameStatus.name
                }
        }

    private fun getFirstPlaceLevel() = racingGameStatusList.maxOf { racingGameStatus ->
        racingGameStatus.proceedLevel
    }
}
