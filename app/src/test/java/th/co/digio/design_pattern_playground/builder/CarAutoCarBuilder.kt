package th.co.digio.design_pattern_playground.builder

import th.co.digio.design_pattern_playground.builder.car.CarAuto
import th.co.digio.design_pattern_playground.builder.engine.AEngine

class CarAutoCarBuilder: ICarBuilder {

    private var carAuto: CarAuto = CarAuto()

    override fun reset() {
        this.carAuto = CarAuto()
    }

    override fun setSeats(int: Int) {
        carAuto.seats = int
        print("Set seats $int \n")
    }

    override fun setEngine(engine: AEngine) {
        carAuto.engine = engine
        engine.startEngine()
    }

    override fun setWheels(int: Int) {
        carAuto.wheels = int
        print("Set wheels $int \n")
    }

    override fun setGPS(boolean: Boolean) {
        carAuto.gps = boolean
    }

    fun getBuilder(): CarAuto {
        return this.carAuto
    }

}