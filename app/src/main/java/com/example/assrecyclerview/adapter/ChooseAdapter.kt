package com.example.assrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assrecyclerview.R
import com.example.assrecyclerview.model.Choose
import kotlinx.android.synthetic.main.item_choose.view.*

class ChooseAdapter (var chooseList: ArrayList<Choose>):
    RecyclerView.Adapter<ChooseAdapter.ChooseViewHolder>(){

    class ChooseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(choose: Choose){
            itemView.txtName.text = choose.name
            itemView.txtPrice.text = choose.price.toString()
            itemView.txtWeight.text = choose.weig
            itemView.imgChoose.setImageResource(choose.image)
           // itemView.imgChoose.setImageResource(choose.add)
            //itemView.imgChoose.setImageResource(choose.sub)


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChooseViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_choose, parent, false)
        return ChooseViewHolder(view)

    }

    override fun getItemCount(): Int = chooseList.size



    override fun onBindViewHolder(holder: ChooseViewHolder, position: Int) {
        holder.bind(chooseList[position])

    }
}
