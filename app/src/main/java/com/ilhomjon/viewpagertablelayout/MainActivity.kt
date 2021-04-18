package com.ilhomjon.viewpagertablelayout

import Adapters.ImageAdapter
import Adapters.UserFragmentAdapter
import Animation.DepthPageTransformer
import Models.User
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import com.ToxicBakery.viewpager.transforms.RotateUpTransformer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var imageList: ArrayList<String>
    lateinit var imageAdapter: ImageAdapter


    lateinit var userList:ArrayList<User>
    lateinit var  userFragmentAdapter: UserFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()


//      //  PagerAdapter
//        imageAdapter = ImageAdapter(imageList)
//
//        view_pager.adapter = imageAdapter


//        //Animation link: https://developer.android.com/training/animation/screen-slide
//        view_pager.setPageTransformer(true, DepthPageTransformer())


        //kutubxona yuklab olish
        // link: https://github.com/ToxicBakery/ViewPagerTransforms
        view_pager.setPageTransformer(true, RotateUpTransformer())

        //FragmentPagerAdapter uchun
        userFragmentAdapter = UserFragmentAdapter(userList, supportFragmentManager)

        view_pager.adapter = userFragmentAdapter
    }

    private fun loadData() {

//        //PageAdapter uchun
//        imageList = ArrayList()
//        imageList.add("https://storage.kun.uz/source/thumbnails/_medium/7/nQOjIed8GxqA0TgQDRG0Cyd5tVtZBwqE_medium.jpg")
//        imageList.add("https://storage.kun.uz/source/thumbnails/_medium/7/9UA1uQqtVq0fYas_ZPL7PegSXpCjcTk2_medium.jpg")
//        imageList.add("https://storage.kun.uz/source/thumbnails/_medium/7/p4642Usfi9DwqdYGEbf4qifXJTs9fKYt_medium.jpg")


        //FragmentPagerAdapter uchun
        userList = ArrayList()
        userList.add(User("Ilhomjon Ibragimov", "https://196034-584727-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2019/04/Dan-Clark-Software-Engineer-Round.jpg"))
        userList.add(User("Ilhomjon Ibragimov", "https://196034-584727-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2019/04/Dan-Clark-Software-Engineer-Round.jpg"))
        userList.add(User("Ilhomjon Ibragimov", "https://196034-584727-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2019/04/Dan-Clark-Software-Engineer-Round.jpg"))
    }
}