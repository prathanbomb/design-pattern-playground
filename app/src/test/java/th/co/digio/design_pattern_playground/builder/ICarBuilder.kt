package th.co.digio.design_pattern_playground.builder

import th.co.digio.design_pattern_playground.builder.engine.AEngine

interface ICarBuilder {
    fun reset()
    fun setSeats(int: Int)
    fun setEngine(engine: AEngine)
    fun setWheels(int: Int)
    fun setGPS(boolean: Boolean)
}