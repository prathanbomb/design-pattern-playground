package th.co.digio.design_pattern_playground.builder

import th.co.digio.design_pattern_playground.builder.car.CarManual
import th.co.digio.design_pattern_playground.builder.engine.AEngine

class CarManualCarBuilder: ICarBuilder {

    private var carManual: CarManual = CarManual()

    override fun reset() {
        this.carManual = CarManual()
    }

    override fun setSeats(int: Int) {
        carManual.seats = int
        print("Set seats $int \n")
    }

    override fun setEngine(engine: AEngine) {
        carManual.engine = engine
        engine.startEngine()
    }

    override fun setWheels(int: Int) {
        carManual.wheels = int
        print("Set wheels $int \n")
    }

    override fun setGPS(boolean: Boolean) {
        carManual.gps = boolean
    }

    fun getBuilder(): CarManual {
        return this.carManual
    }
}