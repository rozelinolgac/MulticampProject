package com.rozelinolgac.multicampproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.rozelinolgac.multicampproject.model.arrayResponce
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import android.widget.LinearLayout

class firstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            val response=
                RetrofitProvider.projectApi.getTopCommunities()


//Log.e("Tag",response.size.toString())

            recyclerViewArticles.adapter=
                ArrayAdapter(response.toMutableList()){
                    val directions=firstFragmentDirections.actionFirstFragmentToSecondFragment(it)
                findNavController().navigate(directions)
                }
        }




    }
}