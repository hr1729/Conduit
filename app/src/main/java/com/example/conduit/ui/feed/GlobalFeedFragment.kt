package com.example.conduit.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.conduit.databinding.FragmentFeedBinding

class GlobalFeedFragment: Fragment() {
    private var globalbinding:FragmentFeedBinding?=null
    private lateinit var viewmodel: feedViewModel
    private lateinit var articleFeedAdapter: ArticleFeedAdapter
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewmodel=ViewModelProvider(this).get(feedViewModel::class.java)
        articleFeedAdapter= ArticleFeedAdapter()
        globalbinding= FragmentFeedBinding.inflate(inflater,container,false)
        globalbinding?.feedrecycler?.layoutManager=LinearLayoutManager(context)
        globalbinding?.feedrecycler?.adapter=articleFeedAdapter
        viewmodel.FetchGlobalFeed()
        viewmodel.feed.observe({lifecycle}){
            articleFeedAdapter.submitList(it)
        }
        return globalbinding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        globalbinding=null
    }
}