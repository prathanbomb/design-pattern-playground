package th.co.digio.design_pattern_playground.builder

import th.co.digio.design_pattern_playground.builder.engine.EngineA
import th.co.digio.design_pattern_playground.builder.engine.EngineB

class CarDirector {

    fun makeSUV(carBuilder: ICarBuilder) {
        print("Start making SUV\n")
        carBuilder.reset()
        carBuilder.setSeats(6)
        carBuilder.setWheels(4)
        carBuilder.setEngine(EngineA())
        carBuilder.setGPS(false)
    }

    fun makeSportCar(carBuilder: ICarBuilder) {
        print("Start making sport car\n")
        carBuilder.reset()
        carBuilder.setSeats(2)
        carBuilder.setWheels(4)
        carBuilder.setEngine(EngineB())
        carBuilder.setGPS(true)
    }
}