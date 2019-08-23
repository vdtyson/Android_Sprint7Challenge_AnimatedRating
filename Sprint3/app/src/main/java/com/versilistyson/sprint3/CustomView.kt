package com.versilistyson.sprint3

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.RatingBar
import kotlinx.android.synthetic.main.customview_layout.view.*

class CustomView: LinearLayout {

    constructor(context: Context): super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defstyleRes: Int) : super(context, attrs, defStyleAttr, defstyleRes)


    init {
        val view = LayoutInflater.from(context).inflate(R.layout.customview_layout, this, false) as LinearLayout
        view.rating_bar.max = 5
    }
}

