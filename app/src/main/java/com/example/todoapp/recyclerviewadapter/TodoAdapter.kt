package com.example.todoapp.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.R


class TodoAdapter(private val todoList : ArrayList<Task>)
    : RecyclerView.Adapter<TodoAdapter.TaskViewHolder>(){

   inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.tvTitile)
        var checkBox : CheckBox = itemView.findViewById(R.id.cbDone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.each_task, parent , false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
       val todo = todoList[position]
        holder.textView.text = todoList[position].task
        holder.checkBox.isChecked = todoList[position].isChecked
    }

    override fun getItemCount(): Int {
       return todoList.size
    }

}