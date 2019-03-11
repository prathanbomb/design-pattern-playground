package th.co.digio.design_pattern_playground.abstract_factory.product.mac

import th.co.digio.design_pattern_playground.abstract_factory.product.ICheckBox

class MacCheckBox: ICheckBox {
    override fun onCheck(): String {
        return "Check MacCheckBox"
    }
}