package com.example.parcial1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe


class fragmentBanana : Fragment() {

    companion object {
        fun NewInstance() = fragmentBanana()
    }

    public lateinit var viewModel: MainViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return  inflater.inflate(R.layout.fragment_banana, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.message.observe(this){fruit2 ->
             ImageFruit(fruit2);
            SetTextfruit(fruit2)
        }
    }

private fun ImageFruit(fruit:String?){
    val imagefruit = view!!.findViewById<View>(R.id.imageView5) as ImageView
    imagefruit.setImageResource(0)
    when(fruit){
        "Manzana" -> imagefruit.setImageResource(R.drawable.manzana)
        "Banana" -> imagefruit.setImageResource(R.drawable.banana)
        "Sandia" -> imagefruit.setImageResource(R.drawable.sandia)
    }
}

    private fun SetTextfruit(fruitText:String){
        val textfruit = view!!.findViewById<View>(R.id.textView) as TextView
        textfruit.text = fruitText
    }



}