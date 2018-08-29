package soup.movie.util

import android.graphics.drawable.Drawable
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener

/** ViewGroup */

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View =
        LayoutInflater.from(this.context).inflate(layoutRes, this, attachToRoot)

/** ImageView */

fun ImageView.loadAsync(url: String) {
    Glide.with(this.context)
            .load(url)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(this)
}

fun ImageView.loadAsync(url: String, requestListener: RequestListener<Drawable>) {
    Glide.with(this.context)
            .load(url)
            .listener(requestListener)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(this)
}

