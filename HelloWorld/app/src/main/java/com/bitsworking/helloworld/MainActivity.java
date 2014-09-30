package com.bitsworking.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText myAwesomeEditText;
    Button myAwesomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAwesomeEditText = (EditText) findViewById(R.id.myFancyInput);
        myAwesomeButton = (Button) findViewById(R.id.myFancyButton);
        myAwesomeButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String textInput = myAwesomeEditText.getText().toString();
                Toast.makeText(getBaseContext(),"Hallo "+ textInput +"!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });



        myAwesomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInput = myAwesomeEditText.getText().toString();
                Toast.makeText(getBaseContext(), "New Input: " + textInput, Toast.LENGTH_LONG).show();
            }
        });
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
}
