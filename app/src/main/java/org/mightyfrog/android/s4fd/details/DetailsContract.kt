package org.mightyfrog.android.s4fd.details

import org.mightyfrog.android.s4fd.BaseView
import org.mightyfrog.android.s4fd.data.KHCharacter

/**
 * @author Shigehiro Soejima
 */
interface DetailsContract {

    interface View : BaseView<DetailsPresenter> {
        fun showActivityCircle()

        fun hideActivityCircle()

        fun showCompareDialog(list: List<KHCharacter>, displayNames: List<String>, scrollPosition: Int)

        fun setSubtitle(resId: Int, vararg args: String?)

        fun clearSubtitle()

        fun showVsThumbnail(charToCompare: KHCharacter?)

        fun hideVsThumbnail()

        fun setCharToCompare(charToCompare: KHCharacter?)
    }

    interface Presenter {
        infix fun compareTo(id: Int)

        fun setCharToCompare(ownerId: Int, charToCompare: KHCharacter?)

        fun setCharToCompareIfAny(ownerId: Int)
    }
}