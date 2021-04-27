package com.example.parcial1

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var TextFruit = MutableLiveData<String>();
  private var ViewFruit  = MutableLiveData<Drawable>();
    private var IndiceButtom = 0

    val message : LiveData<String>


    get() = TextFruit
    fun setMessage (message:String){
        TextFruit.value = message
    }
    init {
        TextFruit.value = ""
    }
    fun Next(){

        if(IndiceButtom < 4 ){
            IndiceButtom ++;
            if(IndiceButtom == 4){
                IndiceButtom = 1
            }
        }
         update()

    }
    fun Before(){
        if(IndiceButtom > 0){
            IndiceButtom--;
            if(IndiceButtom == 0){
                IndiceButtom = 3
            }
        }
        update()
    }




    fun update(){
        when(IndiceButtom){
           1 -> { TextFruit.value = "Banana";}
            2 -> TextFruit.value = "Manzana";
            3 -> TextFruit.value = "Sandia";
            else -> { // Note the block

            }
        }

    }






}