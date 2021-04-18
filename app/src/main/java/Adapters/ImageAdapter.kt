package Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.ilhomjon.viewpagertablelayout.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_image.view.*

class ImageAdapter(val imageList: List<String>) : PagerAdapter(){
    override fun getCount(): Int = imageList.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val layoutInflater = LayoutInflater.from(container.context).inflate(R.layout.item_image, container, false)

        Picasso.get().load(imageList[position]).into(layoutInflater.image_item)

        container.addView(layoutInflater, position)

        return layoutInflater
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view= `object` as View
        container.removeView(view)
    }
}