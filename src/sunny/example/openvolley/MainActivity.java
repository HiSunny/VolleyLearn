package sunny.example.openvolley;

import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;

import android.widget.Button;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button btn = (Button)findViewById(R.id.volley);
		btn.setOnClickListener(new OnClickListener(){
			TextView tv = (TextView)findViewById(R.id.tv);
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RequestQueue mQueue = Volley.newRequestQueue(getApplicationContext());
				StringRequest stringRequest = new StringRequest("http://www.baidu.com",
						new Response.Listener<String>() {
					@Override
					public void onResponse(String response){
						tv.setText(response);
						//Log.i("TAG",response);
					}
						},new Response.ErrorListener() {
							@Override
							public void onErrorResponse(VolleyError error){
								Log.e("TAG", error.getMessage(),error);
							}
						});
				
				mQueue.add(stringRequest);
			}
			
		});
		
		Button json_btn = (Button)findViewById(R.id.json);
		json_btn.setOnClickListener(new OnClickListener(){

			//View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.jsonlayout, null);
			//TextView textView = (TextView)view.findViewById(R.id.textView);
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,JsonActivity.class);
				startActivity(intent);
			}
		        });  
		
		Button image_btn = (Button)findViewById(R.id.image);
		image_btn.setOnClickListener(new OnClickListener(){

			//View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.jsonlayout, null);
			//TextView textView = (TextView)view.findViewById(R.id.textView);
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ImageRequestActivity.class);
				startActivity(intent);
			}
		        });  
		
		Button imageloader_btn = (Button)findViewById(R.id.imageloader);
		imageloader_btn.setOnClickListener(new OnClickListener(){

			//View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.jsonlayout, null);
			//TextView textView = (TextView)view.findViewById(R.id.textView);
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ImageLoaderActivity.class);
				startActivity(intent);
			}
		        }); 
		
		Button NetworkImageView_btn = (Button)findViewById(R.id.netWorkimageView);
		NetworkImageView_btn.setOnClickListener(new OnClickListener(){

			//View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.jsonlayout, null);
			//TextView textView = (TextView)view.findViewById(R.id.textView);
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,NetworkImageViewActivity.class);
				startActivity(intent);
			}
		        });
				
		}
	}


