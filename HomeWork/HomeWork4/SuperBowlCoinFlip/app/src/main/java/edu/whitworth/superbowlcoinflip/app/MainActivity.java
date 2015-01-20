package edu.whitworth.superbowlcoinflip.app;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void coinFlip(){
        ImageView iv = (ImageView)this.findViewById(R.id.imageView);
        Drawable s = getResources().getDrawable(R.drawable.sea_two);
        Drawable p = getResources().getDrawable(R.drawable.patriot_three);
        Random r = new Random();

        if (r.nextBoolean()){
            iv.setImageDrawable(s);
        }else{
            iv.setImageDrawable(p);
        }


    }

}
