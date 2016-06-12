package sunny.example.openvolley;

import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
public class JsonActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jsonlayout);
		
		final TextView textView = (TextView)findViewById(R.id.textView);
		RequestQueue mQueue = Volley.newRequestQueue(getApplicationContext());
		JsonObjectRequest jsonObjectRequest = new JsonObjectRequest("http://php.weather.sina.com.cn/xml.php?city=%D1%CC%CC%A8&password=DJOYnieT8234jlsK&day=0", null,  
		        new Response.Listener<JSONObject>() {  
		            @Override  
		            public void onResponse(JSONObject response) {  
		              textView.setText(response.toString()); 
		            }  
		        }, new Response.ErrorListener() {  
		            @Override  
		            public void onErrorResponse(VolleyError error) {  
		                Log.e("TAG", error.getMessage(), error);  
		            }  
		        });  
		mQueue.add(jsonObjectRequest); 
	}
}
