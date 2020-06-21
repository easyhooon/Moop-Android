package soup.movie.home.tab

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.isScrolling
import androidx.recyclerview.widget.isTop
import soup.movie.ui.base.OnBackPressedListener

abstract class HomeTabFragment : Fragment(), OnBackPressedListener {

    abstract fun scrollToTop()

    protected fun RecyclerView.scrollToTopInternal(force: Boolean = false): Boolean {
        if (isTop().not()) {
            if (isScrolling()) {
                stopScroll()
                scrollToPosition(0)
            } else {
                smoothScrollToPosition(0)
            }
            return true
        }
        if (force) {
            stopScroll()
            scrollToPosition(0)
        }
        return false
    }
}
