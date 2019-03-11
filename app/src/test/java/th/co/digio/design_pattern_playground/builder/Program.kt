package th.co.digio.design_pattern_playground.builder

import org.junit.Test

class Program {

    @Test
    fun main() {
        val carAutoCarBuilder = CarAutoCarBuilder()
        CarDirector().makeSUV(carAutoCarBuilder)

        val carManualCarBuilder = CarManualCarBuilder()
        CarDirector().makeSportCar(carManualCarBuilder)
    }

}