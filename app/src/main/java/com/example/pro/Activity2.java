package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

public class Activity2 extends AppCompatActivity {
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button submit = (Button) findViewById(R.id.submit );
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText emaileditText = (EditText) findViewById(R.id.emaileditText  );
                EditText revieweditText = (EditText) findViewById(R.id.revieweditText  );

                emaileditText.setText("");
                revieweditText.setText("");
                Toast.makeText(getApplicationContext(),"THANK YOU! we got your review",Toast.LENGTH_SHORT).show();

            }
        });




        final SmileRating smileRating = (SmileRating)findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley) {
                switch (smiley)
                {
                    case SmileRating.BAD :
                        Toast.makeText(getApplicationContext(),"BAD",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GOOD :
                        Toast.makeText(getApplicationContext(),"Good",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.OKAY :
                        Toast.makeText(getApplicationContext(),"Okay",Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GREAT :
                        Toast.makeText(getApplicationContext(),"Great",Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.TERRIBLE  :
                        Toast.makeText(getApplicationContext(),"Terrible",Toast.LENGTH_SHORT).show();
                        break;


                }
            }
        });

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }
}
