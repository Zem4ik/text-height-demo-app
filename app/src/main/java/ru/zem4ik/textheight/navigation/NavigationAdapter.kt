package ru.zem4ik.textheight.navigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.recyclerview.widget.RecyclerView
import ru.zem4ik.textheight.databinding.NavigationItemBinding

class NavigationAdapter(
    private val navigationItems: List<Item>,
) : RecyclerView.Adapter<NavigationAdapter.NavigationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NavigationViewHolder =
        NavigationViewHolder(
            NavigationItemBinding.inflate(LayoutInflater.from(parent.context), parent, false).root
        )

    override fun getItemCount(): Int = navigationItems.size

    override fun onBindViewHolder(holder: NavigationViewHolder, position: Int) {
        val item = navigationItems[position]
        holder.navigationItem.apply {
            setText(item.titleRes)
            setOnClickListener { item.onClick() }
        }
    }

    data class Item(@StringRes val titleRes: Int, val onClick: () -> Unit)

    class NavigationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val navigationItem = itemView as TextView
    }
}