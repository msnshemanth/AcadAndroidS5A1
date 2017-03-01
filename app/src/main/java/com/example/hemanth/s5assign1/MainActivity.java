package com.example.hemanth.s5assign1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    //View someView = findViewById(R.id.screen);


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
//        menu.add("Black");
//        menu.add("Orange");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.red:
                ((TextView) textView).setTextColor(Color.RED);///Change Text Color
                ((TextView) textView).setTextSize(TypedValue.COMPLEX_UNIT_SP, 40);//Increase font size
                Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.green:
                ((TextView) textView).setTextColor(Color.GREEN);
                ((TextView) textView).setTextSize(TypedValue.COMPLEX_UNIT_SP, 40);
                Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.blue:
                ((TextView) textView).setTextColor(Color.BLUE);
                ((TextView) textView).setTextSize(TypedValue.COMPLEX_UNIT_SP, 40);
                Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                ((TextView) textView).setTextColor(Color.BLACK);
                ((TextView) textView).setTextSize(TypedValue.COMPLEX_UNIT_SP, 40);
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                return true;
            default:
            return super.onOptionsItemSelected(item);
        }

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }


    }


}
