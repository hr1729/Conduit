package com.example.conduit.ui.feed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.api.model.response.Article
import com.example.conduit.R
import com.example.conduit.databinding.ListItemArticlesBinding

class ArticleFeedAdapter:ListAdapter<Article,ArticleFeedAdapter.ArticleFeedViewHolder>(
    object:DiffUtil.ItemCallback<Article>(){
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem==newItem
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.toString()==newItem.toString()
        }

    }
) {
    inner class ArticleFeedViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleFeedAdapter.ArticleFeedViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.list_item_articles, parent, false)
        // Return a new holder instance
        return ArticleFeedViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ArticleFeedViewHolder, position: Int) {
        ListItemArticlesBinding.bind(holder.itemView).apply {
            val articles=getItem(position)
            authorTextView.text=articles.author.username
            titleTextView.text=articles.title
            bodySnippetTextView.text=articles.body
        }
    }
}