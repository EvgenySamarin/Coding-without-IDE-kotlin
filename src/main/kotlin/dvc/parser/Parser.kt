package dvc.parser

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody

/**
 * Example local unit main_activity, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

public class Parser {
    val JSON: String = "empty"
    val readToken = "b78b04f34f0b4b7c533607f37795c49ef71b279c"
    val dateFrom = ""
    val dateTo = ""
    val ENDPOINT = "https://api.github.com/repos/archi39/RatingAll/commits"
        
    fun sendCurl() : String{
        return "curl -H \"Authorization: token ${readToken}"
    }

    companion object {
        @JvmStatic public fun main(args: Array<String>) {
            println("---Начинаем парсить GitHub Commits---")

            val parser = Parser()
            val client: OkHttpClient = OkHttpClient()

            // Create request for remote resource.
            val request: Request = Request.Builder()
                            .url(parser.ENDPOINT)
                            .header("Authorization: token b78b04f34f0b4b7c533607f37795c49ef71b279c")
                            .build()

            // Execute the request and retrieve the response.
            val response: Response = client.newCall(request).execute() 
            // Deserialize HTTP response to concrete type.
            val body: ResponseBody? = response.body()
                
            println("${body.toString()}")

            println("")
            println("---End App---")
        }
    }
}