package th.co.digio.design_pattern_playground.abstract_factory.factory

import th.co.digio.design_pattern_playground.abstract_factory.product.IButton
import th.co.digio.design_pattern_playground.abstract_factory.product.ICheckBox
import th.co.digio.design_pattern_playground.abstract_factory.product.win.WinButton
import th.co.digio.design_pattern_playground.abstract_factory.product.win.WinCheckBox

class WinFactory: GUIFactory {
    override fun createButton(): IButton {
        return WinButton()
    }

    override fun createCheckBox(): ICheckBox {
        return WinCheckBox()
    }
}