import org.apache.http.impl.client.DefaultHttpClient
import org.apache.http.client.HttpClient
import org.apache.http.client.methods._
import org.apache.http.client.HttpClient
import java.io.BufferedReader
import java.io.InputStreamReader

object Test_Scala extends App {
	var client = new DefaultHttpClient()
	val request = new HttpGet("http://google.com/")
	var response = client.execute(request)

	var rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

	var line = rd.readLine()
	while(line != null) {
		println(line)
		line = rd.readLine()
	}
}
