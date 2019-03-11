package th.co.digio.design_pattern_playground.abstract_factory

import org.junit.Test
import th.co.digio.design_pattern_playground.abstract_factory.factory.GUIFactory
import th.co.digio.design_pattern_playground.abstract_factory.factory.MacFactory
import th.co.digio.design_pattern_playground.abstract_factory.factory.WinFactory

class Program {

    @Test
    fun main() {
        print("Creating Windows Factory ...\n")
        createApplication(WinFactory())
        print("Creating MacOS Factory ...\n")
        createApplication(MacFactory())
    }

    private fun createApplication(factory: GUIFactory) {
        val button = factory.createButton()
        val checkBox = factory.createCheckBox()
        print(button.onClick() + "\n")
        print(checkBox.onCheck() + "\n")
    }

}