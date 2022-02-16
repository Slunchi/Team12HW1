package model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Animal(@StringRes val qNumber: Int, @StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int) {
}