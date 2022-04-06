//package com.happyplaces
//
//import com.happyplaces.model.User
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//
//import androidx.recyclerview.widget.RecyclerView
//import com.happyplaces.R
//
//import kotlinx.android.synthetic.main.item_happy_place.view.*
//
//class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {
//
//    private var userList = emptyList<User>()
//
//    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {}
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_happy_place, parent, false))
//    }
//
//    override fun getItemCount(): Int {
//        return userList.size
//    }
////
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val currentItem = userList[position]
//        holder.itemView.tvTitle.text = currentItem.title.toString()
//        holder.itemView.tvDescription.text = currentItem.description.toString()
//
//
//        holder.itemView.item_happy_place.setOnClickListener {
////            val action = ListFragmentDirections.actionListFragmentToUpdateFragment(currentItem)
////            holder.itemView.findNavController().navigate(action)
//        }
//    }
//
//    fun setData(user: List<User>){
//        this.userList = user
//        notifyDataSetChanged()
//    }
//}