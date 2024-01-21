package com.eneskoc.imagecardview

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide


class ImageCardView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val titleTextView by lazy { findViewById<TextView>(R.id.tvTitle) }
    private val contentTextView by lazy { findViewById<TextView>(R.id.tvContent) }
    private val contentLayout by lazy { findViewById<ConstraintLayout>(R.id.lytContent) }
    private val imageView by lazy { findViewById<ImageView>(R.id.iv) }
    private val button by lazy { findViewById<AppCompatButton>(R.id.btnDetail) }

    var setImageSrc: String? = null
        set(value) {
            field = value
            if (!value.isNullOrEmpty()) {
                Glide.with(context)
                    .load(value)
                    .centerCrop()
                    .placeholder(R.drawable.no_available)
                    .into(imageView)

            }
        }

    var setTitleText: String? = null
        set(value) {
            field = value
            titleTextView.text = value
        }

    @ColorInt
    var setTitleTextColor: Int? = null
        set(value) {
            field = value
            if (value != 0) titleTextView.setTextColor(value!!)
        }

    var setContentText: String? = null
        set(value) {
            field = value
            contentTextView.text = value
        }

    @ColorInt
    var setContentTextColor: Int? = null
        set(value) {
            field = value
            if (value != 0) contentTextView.setTextColor(value!!)
        }


    var setButtonVisibility: Int? = null
        set(value) {
            field = value
            if (value == 1) button.visibility = View.GONE
        }

    var setButtonText: String? = null
        set(value) {
            field = value
            button.text = value
            button.visibility = if (value != null) View.VISIBLE else View.GONE
        }

    var setButtonColor: Int? = null
        set(value) {
            field = value
            if (value != 0) {
                button.background = (resources.getDrawable(R.drawable.round_outline))
                button.backgroundTintList = ColorStateList.valueOf(value!!);

            }


        }

    @ColorInt
    var setButtonTextColor: Int? = null
        set(value) {
            field = value
            if (value != 0) button.setTextColor(value!!)
        }

    var setButtonAction: OnClickListener? = null
        set(value) {
            field = value
            button.setOnClickListener(value)
        }

    @ColorInt
    var setContentLayoutColor: Int? = null
        set(value) {
            field = value
            if (value != 0) {
                contentLayout.backgroundTintList = ColorStateList.valueOf(value!!);

                contentLayout.background = (resources.getDrawable(R.drawable.shadow_background))

            }
        }


    init {
        View.inflate(context, R.layout.image_card_view, this)

        context.obtainStyledAttributes(attrs, R.styleable.ImageCardView).apply {
            setImageSrc = getString(R.styleable.ImageCardView_contentImageSrc)
            setTitleText = getString(R.styleable.ImageCardView_titleText)
            setTitleTextColor =
                getInt(R.styleable.ImageCardView_titleColor, context.getColor(R.color.black))
            setContentText = getString(R.styleable.ImageCardView_contentText)
            setContentTextColor = getInt(R.styleable.ImageCardView_contentTextColor, 0)
            setButtonVisibility = getResourceId(R.styleable.ImageCardView_buttonVisibility, 0)
            setButtonText = getString(R.styleable.ImageCardView_buttonText)
            setButtonColor = getInt(R.styleable.ImageCardView_buttonColor, 0)
            setButtonTextColor = getInt(R.styleable.ImageCardView_buttonTextColor, 0)
            setContentLayoutColor = getInt(R.styleable.ImageCardView_contentViewColor, 0)
        }
    }

}

