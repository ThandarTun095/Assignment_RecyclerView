package com.example.assrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assrecyclerview.R
import com.example.assrecyclerview.adapter.ChooseAdapter
import com.example.assrecyclerview.model.Choose
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chooseList = ArrayList<Choose>()
        /*
        chooseList.add(Choose("Fine Grain Sugar" ,20.0 ,R.drawable.sugar, R.drawable.minus, R.drawable.add,"1Kg"))
        chooseList.add(Choose("Penuts", 20.00, R.drawable.peanut, R.drawable.minus,R.drawable.add,"3Kg"))
        chooseList.add(Choose("Dawat Rice", 80.00, R.drawable.rice,R.drawable.minus,R.drawable.add,"2Kg"))

         */

        chooseList.add(Choose("Grain Sugar",20.00, R.drawable.sugar,"1Kg"))
        chooseList.add(Choose("Penuts", 20.00, R.drawable.peanut,"3Kg"))
        chooseList.add(Choose("Dawat Rice", 80.00, R.drawable.rice,"2Kg"))

        var chooseAdapter = ChooseAdapter(chooseList)
        chooseRecycler.layoutManager = LinearLayoutManager(this)
        chooseRecycler.adapter = chooseAdapter

        //chooseRecycler.layoutManager = GridLayoutManager(this, 2)

    }
}