package Adapters

import Models.User
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ilhomjon.viewpagertablelayout.UserFragment

class UserFragmentAdapter(val list: List<User>, fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager,
BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return UserFragment.newInstance(list[position])
    }
}