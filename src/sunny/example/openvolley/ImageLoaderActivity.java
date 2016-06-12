package sunny.example.openvolley;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageCache;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.android.volley.toolbox.Volley;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
public class ImageLoaderActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imageloader_layout);
		
		ImageView img = (ImageView)findViewById(R.id.imageV);
		RequestQueue mQueue = Volley.newRequestQueue(getApplicationContext());
		ImageLoader imageLoader = new ImageLoader(mQueue,new BitmapCache());
		
		ImageListener listener = ImageLoader.getImageListener(img, R.drawable.ic_launcher, R.drawable.ic_empty);
		imageLoader.get("https://raw.githubusercontent.com/nostra13/Android-Universal-Image-Loader/master/UniversalImageLoader.png", listener);
	}
}
