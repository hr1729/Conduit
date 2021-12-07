package apitests

import com.example.api.Client
import junit.framework.Assert.assertNotNull
import org.junit.Test

class ConduitClientTests {
    private val Client=Client()

    @Test
    fun articles(){
        val articles=Client.api.getArticles().execute()
        assertNotNull(articles.body()?.articles)
    }
}