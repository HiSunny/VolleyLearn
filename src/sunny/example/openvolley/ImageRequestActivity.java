package sunny.example.openvolley;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
public class ImageRequestActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.image_layout);
		
		final ImageView img = (ImageView)findViewById(R.id.imageView);
		RequestQueue mQueue = Volley.newRequestQueue(getApplicationContext());
		ImageRequest imageRequest = new ImageRequest("http://img.my.csdn.net/uploads/201404/13/1397393290_5765.jpeg", 
				new Response.Listener<Bitmap>() {

					@Override
					public void onResponse(Bitmap response) {
						// TODO Auto-generated method stub
						img.setImageBitmap(response);
					}
				}, 0, 0, Config.RGB_565, new Response.ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError error) {
						// TODO Auto-generated method stub
						img.setImageResource(R.drawable.ic_launcher);
					}
				});
		mQueue.add(imageRequest);
	}
}
