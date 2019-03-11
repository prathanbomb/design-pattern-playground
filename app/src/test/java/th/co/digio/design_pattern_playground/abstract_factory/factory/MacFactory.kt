package th.co.digio.design_pattern_playground.abstract_factory.factory

import android.content.Context
import th.co.digio.design_pattern_playground.abstract_factory.product.IButton
import th.co.digio.design_pattern_playground.abstract_factory.product.ICheckBox
import th.co.digio.design_pattern_playground.abstract_factory.product.mac.MacButton
import th.co.digio.design_pattern_playground.abstract_factory.product.mac.MacCheckBox

class MacFactory: GUIFactory {
    override fun createButton(): IButton {
        return MacButton()
    }

    override fun createCheckBox(): ICheckBox {
        return MacCheckBox()
    }
}