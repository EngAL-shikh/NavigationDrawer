package com.andrious.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class contactFragment : Fragment() {




    private  lateinit var requst: TextView
    companion object{
        fun newInstance(data:String):contactFragment{
            val args=Bundle().apply {
                putSerializable("name",data)
            }
            return  contactFragment().apply {
                arguments=args
            }
        }
    }

    var contact:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        contact=arguments?.getSerializable("name")as String
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view=inflater.inflate(R.layout.fragment_contact, container, false)
        requst= view?.findViewById(R.id.requst) as TextView
        requst.setText(contact)
        if (contact=="profile"){
            requst.setBackgroundResource(R.color.blue)
        }
        if (contact=="messages"){
            requst.setBackgroundResource(R.color.red)
        }
        if (contact=="Frinds"){
            requst.setBackgroundResource(R.color.orange)
        }


        // Inflate the layout for this fragment
        return view
    }


}