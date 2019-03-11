package th.co.digio.design_pattern_playground.abstract_factory.product.win

import th.co.digio.design_pattern_playground.abstract_factory.product.ICheckBox

class WinCheckBox: ICheckBox {
    override fun onCheck(): String {
        return "Check WinCheckBox"
    }
}