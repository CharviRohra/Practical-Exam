package com.example.Restaurantlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Restaurantlivedata.view.ResAdpater
import com.example.Restaurantlivedata.view.viewmodel.resViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewadapter: RecyclerView.Adapter<*>
    private lateinit var viewModel:resViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init
        recyclerView=findViewById(R.id.recyclerView)
        viewModel=ViewModelProvider(this).get(resViewModel::class.java)
       // creating a viewModel and observing the view model
        viewModel.resListLiveData.observe(this){
            it?.let {
                newreslist ->
                viewadapter=ResAdpater(newreslist)
                recyclerView.adapter=viewadapter
                recyclerView.layoutManager=LinearLayoutManager(this)

            }

        }
        viewModel.populatedata()
    }
}