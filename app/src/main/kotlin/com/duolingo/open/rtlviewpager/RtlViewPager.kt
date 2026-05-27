package com.duolingo.open.rtlviewpager

import android.content.Context
import android.util.AttributeSet
import androidx.viewpager.widget.ViewPager

open class RtlViewPager : ViewPager {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
}
