package apitests

import com.example.api.Client
import com.example.api.model.requests.UserCredential
import com.example.api.model.requests.signUpReqest
import junit.framework.TestCase.assertEquals
import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.random.Random

class ConduitClientTests {
    private val Client = Client()

    @Test
    fun articles() {
        runBlocking {
            val articles = Client.api.getArticles()
            assertNotNull(articles.body()?.articles)
        }
    }
        @Test
        fun getarticles() {
            runBlocking {
                val articles = Client.api.getArticles(author = "Gerome")
                assertNotNull(articles.body()?.articles)
            }


        }
    @Test
    fun `POST users - create user`(){
       val usersisOk= UserCredential(
            "testemail${122}@test.com",
            "pass${1234}",
        "rand_user_${12}"
            )
        runBlocking {
            val user1=Client.api.signupuser(signUpReqest(usersisOk))
            assertEquals(usersisOk.username,user1.body()?.user?.username)
        }
    }
    }
