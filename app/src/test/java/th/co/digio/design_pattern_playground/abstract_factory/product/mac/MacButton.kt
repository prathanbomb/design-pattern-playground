package th.co.digio.design_pattern_playground.abstract_factory.product.mac

import th.co.digio.design_pattern_playground.abstract_factory.product.IButton

class MacButton: IButton {
    override fun onClick(): String {
        return "Click MacButton"
    }
}