package com.shafigh.recycleviewintro

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class PersonRecycleAdapter(private val context: Context,private val persons : List<Person>) : RecyclerView.Adapter<PersonRecycleAdapter.ViewHolder>() {

    //Is used to create a view out of XML layout
    private val layoutInflater = LayoutInflater.from(context)

    //Here view creates
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById<TextView>(R.id.textName)
        val textViewAge = itemView.findViewById<TextView>(R.id.textAge)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //is using inflator to creat a view
        val itemView = layoutInflater.inflate(R.layout.list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = persons.size

    //Here data binds with View
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = persons[position]
        holder.textViewName.text = person.name
        holder.textViewAge.text = person.age.toString()
    }
}