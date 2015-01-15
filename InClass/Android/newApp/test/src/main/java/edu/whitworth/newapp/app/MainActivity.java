package edu.whitworth.newapp.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;

public class MainActivity extends Activity {
    private ArrayList<Integer> colors = new ArrayList<Integer>();
    private int curr;

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

    public void timsButton(View v){
        EditText et = (EditText)this.findViewById(R.id.editText);
        TextView tv = (TextView)this.findViewById(R.id.tvOne);

        tv.setText(et.getText());
    }

    public void ChangeC(View v){
        EditText et = (EditText)this.findViewById(R.id.editText);
        TextView tv = (TextView)this.findViewById(R.id.tvOne);
        colors.add(Color.BLACK);
        colors.add(Color.BLUE);
        colors.add(Color.GREEN);
        colors.add(Color.CYAN);
        curr = (curr + 1) % colors.size();

        tv.setTextColor(colors.get(curr));
    }

    public void toggleLabel(View v){

        TextView tv = (TextView)this.findViewById(R.id.tvOne);
        int visible = tv.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE;
        tv.setVisibility(visible);
    }

}
