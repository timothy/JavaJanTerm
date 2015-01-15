package com.example.brandnew.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;



public class MainActivity extends ActionBarActivity {

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


    public void toggleLabel(View v){

        TextView tv = (TextView)this.findViewById(R.id.iterator_textView);
        int visible = tv.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE;
        tv.setVisibility(visible);
    }

    public static class PlaceholderFragment extends Fragment {

        ArrayList<String> Facts = new ArrayList<String>();
        int curr;


        public PlaceholderFragment() {
            The_Facts();

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_main, container, false);
            initButtons(rootView);
            return rootView;
        }

        private void The_Facts() {
            curr = 0;

            Facts.add("Name: George Washington \n Born: Virginia \n DateServed: 1789-1797 \n FunFact: Teeth were made from elephant and walrus tusks, not wood.");
            Facts.add("Name: John Adams \n Born:Mass \n DateServed: 1797-1801 \n FunFact: First to live in the White House");
            Facts.add("Name: Thomas Jefferson \n Born:Virginia \n DateServed: 1801-1809 \n FunFact:Spoke 6 different languages");
            Facts.add("Name: James Madison \n Born:Virginia \n DateServed:1809-1817 \n FunFact:Smallest President at 5\' 4\", under 100 lbs.");
            Facts.add("Name: John Tyler \n Born: Virginia \n DateServed: 1841-1845 \n FunFact: Loved kids, had 15 children");
            Facts.add("Name: Rutherford B. Hayes \n Born: Ohio \n DateServed: 1877-1881 \n FunFact: First President to use a phone - his phone number was 1");


        }

        private void initButtons(View v) {
            Button btn = (Button) v.findViewById(R.id.go_button);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    curr = (curr + 1) % Facts.size();
                    TextView tv = (TextView) getActivity().findViewById(R.id.iterator_textView);
                    tv.setText(Facts.get(curr));
                }
            });

            btn = (Button) v.findViewById(R.id.back_button);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (curr < 0) {
                        curr = Facts.size() - 1;
                    }

                    TextView tv = (TextView) getActivity().findViewById(R.id.iterator_textView);
                    tv.setText(Facts.get(curr));
                    curr--;
                }
            });
        }
    }

}
