package com.example.hello_constraint_homework_1_2

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var mCount:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mCount = show_count.text.toString().toInt()
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, "DAROVAAA", Toast.LENGTH_SHORT)
        toast.show()
        mCount++
    }
    fun countUp(view: View) = countSetUpdate()

    fun clear (view: View) {
        mCount = 0
        countSetUpdate()
    }

    private fun countSetUpdate() {
        show_count.text = mCount.toString()
    }
}