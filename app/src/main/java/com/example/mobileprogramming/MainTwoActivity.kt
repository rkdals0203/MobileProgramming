package com.example.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val p = Points(5,5)
        p.x=10
        p.y=20
        p.show()


    }
}

open class Points(open var x: Int, open var y: Int) {
    fun move(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    open fun show(){
        Log.d("HW01","Current Point: ($x, $y)")
    }
}

