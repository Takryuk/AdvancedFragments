package com.app1.advancedfragments.ui.main

import android.content.Context
import android.provider.Settings
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.app1.advancedfragments.Account
import com.app1.advancedfragments.Home
import com.app1.advancedfragments.R

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        var Main_fragment:Fragment? = null
        val home = Home()
        val account = Account()
        val settings = com.app1.advancedfragments.Settings()

        // 実は次のpositionも呼んで高速化している
        println("Called getItem!(position" + position + ")")

        when(position){
            0 ->{
                Main_fragment =home
            }

            1->{

                Main_fragment = account

            }

            2->{

                Main_fragment = settings

            }
        }

        return Main_fragment!!
    }

    override fun getPageTitle(position: Int): CharSequence? {
        println("Called getPageTitle!!(position" + position + ")")

        print("context:"+context) // context:com.app1.advancedfragments.Tapped@8856ded    context:com.app1.advancedfragments.Tapped@8856ded
        println("context.resources:"+context.resources) // context.resources:android.content.res.Resources@cd3f0cb   context.resources:android.content.res.Resources@cd3f0cb
        print("position:"+position) // position:0   position:1
        println("TAB_TITLES[position]:"+TAB_TITLES[position]) //TAB_TITLES[position]:2131624019   TAB_TITLES[position]:2131624020
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        println("Called getCount!!")
        return 3
    }
}