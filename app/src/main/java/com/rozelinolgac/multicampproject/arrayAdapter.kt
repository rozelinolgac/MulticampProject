package com.rozelinolgac.multicampproject
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.rozelinolgac.multicampproject.model.Article
import com.rozelinolgac.multicampproject.model.arrayResponce
import kotlinx.android.synthetic.main.item_array.view.*

class ArrayAdapter(
    private  val arrayList:MutableList<Article>,
    private val onClick: (Article) -> Unit    ) :
    RecyclerView.Adapter<ArrayViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArrayViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val view =layoutInflater.inflate(R.layout.item_array,parent,false)
        return ArrayViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArrayViewHolder, position: Int) {
        val article=arrayList[position]
        holder.bind(article,onClick) }

    override fun getItemCount(): Int {
        return arrayList.size }
}
class ArrayViewHolder( view: View,) :RecyclerView.ViewHolder(view){
    fun bind(article:Article,onClick:(Article) ->Unit){
        itemView.imageView.load(article.banner)


        itemView.imageView.setOnClickListener {
            onClick(article)
        }


    }



}