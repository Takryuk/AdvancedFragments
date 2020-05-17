package com.app1.advancedfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

/**
 * A simple [Fragment] subclass.
 */
class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        println("container:" + container) //container:androidx.viewpager.widget.ViewPager{f258a16 VFED..... ......I. 0,0-0,0 #7f08012f app:id/view_pager}
        val home_layout =  inflater.inflate(R.layout.fragment_home, container, false)
        val btn = home_layout.findViewById<Button>(R.id.home_btn)


        btn.setOnClickListener{

            // not this@Home but activity!!.applicationContext

            println("activity!!.applicationContext:" + activity!!.applicationContext) // activity!!.applicationContext:android.app.Application@cf145f3
            println("this@Home:" +this@Home) // this@Home:Home{2fd02b0 (058ec80f-0b50-4890-b426-251277ae0cde) id=0x7f08012f android:switcher:2131231023:0}
            Toast.makeText(activity!!.applicationContext, "Button was Clicked", Toast.LENGTH_SHORT).show()

        }

        val image = home_layout.findViewById<ImageView>(R.id.home_image)

        return home_layout
    }

}
