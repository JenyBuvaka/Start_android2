package com.android.fundamentals.workshop03.task

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.fundamentals.workshop03.WS03SecondFragment
import com.example.l_60_preferences_code.R

//TODO(WS2:9) Implement interface in Activity
 class WS03AssignmentActivity : AppCompatActivity(),WS03AssignmentFragment.setClickListener {

    //TODO(WS2:9) Create root fragment and set listener
    private val secondFragment = WS03SecondFragment()
    private val rootFragment = WS03AssignmentFragment()//.apply {  setListener(this@WS03AssignmentActivity)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ws02_ws03)

        val fragmentTransaction = supportFragmentManager
            .beginTransaction()

            fragmentTransaction.apply {
                //TODO(WS2:3) Add the Fragment to the R.id.persistent_container FrameLayout
                add(R.id.persistent_container, rootFragment)
                add(R.id.fragments_container, secondFragment)
                commit()
            }

    }

    override fun incrementCount() {
        secondFragment.increaseValue()
    }

    override fun changeBackground() {
        secondFragment.changeBackground()
    }
    //TODO(WS2:10) Change the text in secondFragment
    //TODO(WS2:11) Change fragment text background in secondFragment

}