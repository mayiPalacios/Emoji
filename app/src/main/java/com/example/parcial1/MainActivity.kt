package com.example.parcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

   val Fragment : fragmentBanana = fragmentBanana.NewInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, Fragment)
                .commitNow()
        }
    }

fun Next(view:View){
   Fragment.viewModel.Next()
}

    fun previous(view: View){
        Fragment.viewModel.Before()
    }


}