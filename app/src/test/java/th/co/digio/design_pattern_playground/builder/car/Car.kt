package th.co.digio.design_pattern_playground.builder.car

import th.co.digio.design_pattern_playground.builder.engine.AEngine

open class Car {
    var seats: Int = 0
    var wheels: Int = 4
    lateinit var engine: AEngine
    var gps: Boolean = false

    override fun toString(): String {
        return "Car(seats=$seats, wheels=$wheels, engine=$engine, gps=$gps)"
    }
}