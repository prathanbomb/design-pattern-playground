package th.co.digio.design_pattern_playground.abstract_factory.factory

import android.content.Context
import th.co.digio.design_pattern_playground.abstract_factory.product.IButton
import th.co.digio.design_pattern_playground.abstract_factory.product.ICheckBox

interface GUIFactory {
    fun createButton(): IButton
    fun createCheckBox(): ICheckBox
}