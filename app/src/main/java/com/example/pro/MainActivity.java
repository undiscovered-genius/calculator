package com.example.pro;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public  class MainActivity extends AppCompatActivity {
    private Button fabbutton;
    private Configuration configuration;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button addbutton = findViewById(R.id.addbutton );
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view ) {

                EditText firstnumEditText = findViewById(R.id.firstnumeditText );
                EditText secondnumEditText = findViewById(R.id.secondnumeditText );
                TextView resultTextView = findViewById(R.id.resulttextView);

                int num1 = Integer.parseInt(firstnumEditText.getText().toString());
                int num2 = Integer.parseInt(secondnumEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(""+ result );
            }

        });
        Button subbutton = findViewById(R.id.subbutton );
        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnumEditText = findViewById(R.id.firstnumeditText );
                EditText secondnumEditText = findViewById(R.id.secondnumeditText );
                TextView resultTextView = findViewById(R.id.resulttextView);

                int num1 = Integer.parseInt(firstnumEditText.getText().toString());
                int num2 = Integer.parseInt(secondnumEditText.getText().toString());
                int result = num1 - num2;
                resultTextView.setText(""+ result );
            }
        }) ;
        Button multbutton = findViewById(R.id.multbutton );
        multbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnumEditText = findViewById(R.id.firstnumeditText );
                EditText secondnumEditText = findViewById(R.id.secondnumeditText );
                TextView resultTextView = findViewById(R.id.resulttextView);

                int num1 = Integer.parseInt(firstnumEditText.getText().toString());
                int num2 = Integer.parseInt(secondnumEditText.getText().toString());
                int result = num1 * num2;
                resultTextView.setText(""+ result );
            }
        });
        Button divbutton = findViewById(R.id.divbutton );
        divbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnumEditText = findViewById(R.id.firstnumeditText );
                EditText secondnumEditText = findViewById(R.id.secondnumeditText );
                TextView resultTextView = findViewById(R.id.resulttextView);

                double num1 = Double.parseDouble(firstnumEditText.getText().toString()) ;
                double num2 = Double.parseDouble(secondnumEditText.getText().toString()) ;
                double  result = num1 / num2;
                resultTextView.setText(""+ result );
            }
        });
        Button clearbutton = findViewById(R.id.clearbutton );
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstnumEditText = findViewById(R.id.firstnumeditText );
                EditText secondnumEditText = findViewById(R.id.secondnumeditText );
                TextView resultTextView = findViewById(R.id.resulttextView);
                firstnumEditText.setText("");
                secondnumEditText.setText("");
                resultTextView.setText("");
            }
        });


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        
        



        FloatingActionButton fab = findViewById(R.id.fabbutton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    openActivity2();
                }
            }
        );




    }



    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class );
        startActivity(intent );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
