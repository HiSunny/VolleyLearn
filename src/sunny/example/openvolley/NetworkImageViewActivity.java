package sunny.example.openvolley;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

import android.app.Activity;
import android.os.Bundle;
public class NetworkImageViewActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.network_image);
		
		NetworkImageView networkImageView = (NetworkImageView)findViewById(R.id.netImage);
		
		RequestQueue mQueue = Volley.newRequestQueue(getApplicationContext());
		ImageLoader imageLoader = new ImageLoader(mQueue,new BitmapCache());
		
		networkImageView.setDefaultImageResId(R.drawable.ic_launcher);
		networkImageView.setErrorImageResId(R.drawable.ic_empty);
		networkImageView.setImageUrl("https://raw.githubusercontent.com/nostra13/Android-Universal-Image-Loader/master/UniversalImageLoader.png",imageLoader);
	}
	
}
