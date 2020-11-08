package com.example.Restaurantlivedata.view.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.Restaurantlivedata.model.Restaurant

class resViewModel:ViewModel(){
    val resListLiveData= MutableLiveData<ArrayList<Restaurant>>()


    fun populatedata(){
        val res1=Restaurant("PIZZITALIA","98-101,Vaishali Nagar,Jaipur","Italian","4/5 stars")
        val res2=Restaurant("CAFE PALLADIO","Bhwani Singh Road,C-scheme,Jaipur","Mediterranean Food","5 / 5 stars")
        val res3=Restaurant("BROWN SUGAR","Maya Mansion,MI Road,Jaipur","Bakery","4.5/5 stars")
        val res4=Restaurant("NIBS CAFE","Mann Upasana Mall,Gopalbari,Jaipur","Italian","3.5/5 stars")
        val res5=Restaurant("CRAZY COFFEE","C-84,Prithviraj Road,Jaipur","Coffee","5/5 stars")
        val res6=Restaurant("AMBRAI","CASA Haveli,Banipark,Jaipur","Kebab Platters","3/5 stars")
        val res7=Restaurant("FORT","256,Tonk Road,Malviya Nagar,Jaipur","Chinese","4/5 stars")
        val res8=Restaurant("INDIQUE","23-Triton Mall,Jagatpura,Jaipur","North Indian","2/5 stars")
        val res9=Restaurant("KEWPIE'S","121/KK Mansion,Model Town,Jaipur","Bengali Food","4/5 stars")

        val reslist=ArrayList<Restaurant>()
        reslist.add(res1)
        reslist.add(res2)
        reslist.add(res3)
        reslist.add(res4)
        reslist.add(res5)
        reslist.add(res6)
        reslist.add(res7)
        reslist.add(res8)
        reslist.add(res9)

        resListLiveData.postValue(reslist)   // Trigger point for the all observe event
    }
}