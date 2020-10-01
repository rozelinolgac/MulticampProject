package com.rozelinolgac.multicampproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.coroutines.launch



class firstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            val response=
                RetrofitProvider.projectApi.getTopCommunities()


            recyclerViewArticles.adapter=
                ArrayAdapter(response.articles.orEmpty().toMutableList()){
                    val directions=firstFragmentDirections.actionFirstFragmentToSecondFragment(it)
                findNavController().navigate(directions)
                }



            }




    }
}