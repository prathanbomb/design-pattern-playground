package th.co.digio.design_pattern_playground.abstract_factory.product.win

import th.co.digio.design_pattern_playground.abstract_factory.product.IButton

class WinButton: IButton {
    override fun onClick(): String {
        return "Click WinButton"
    }
}