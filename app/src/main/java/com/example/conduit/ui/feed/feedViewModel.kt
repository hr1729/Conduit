package com.example.conduit.ui.feed

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.api.model.response.Article
import com.example.conduit.data.ArticleRepo
import kotlinx.coroutines.launch

class feedViewModel:ViewModel() {
    var feed=MutableLiveData<List<Article>>()


     fun FetchGlobalFeed()=viewModelScope.launch {
         ArticleRepo.getGlobalFeed().body()?.let {
             feed.postValue(it.articles)
             Log.d("FEED","Articles Total${it.articlesCount}")
         }
     }
    //val feed:LiveData<List<Article>>=_feed

}