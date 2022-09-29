package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.recyclerview.Task
import com.example.todoapp.recyclerview.TodoAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val etTask = findViewById<EditText>(R.id.etTask)
        val recyclerView = findViewById<RecyclerView>(R.id.rvTaskList)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        var todoAdapter : TodoAdapter
        var todoList : ArrayList<Task>

        todoList = ArrayList()



          todoList.add( Task("Take dog for a Walk" , false))



        todoAdapter = TodoAdapter(todoList)
        recyclerView.adapter = todoAdapter




      btnAdd.setOnClickListener{
          val string = etTask.text
          val newTask = Task("$string", false)

          todoList.add(newTask)
          etTask.setText("")
          recyclerView.adapter = todoAdapter
      }

    }
}