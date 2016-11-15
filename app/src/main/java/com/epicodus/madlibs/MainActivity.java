package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.button) Button mButton;
    @Bind(R.id.nationality) EditText mNationality;
    @Bind(R.id.crime) EditText mCrime;
    @Bind(R.id.noun1) EditText mNoun1;
    @Bind(R.id.noun2) EditText mNoun2;
    @Bind(R.id.noun3) EditText mNoun3;
    @Bind(R.id.celebrity) EditText mCelebrity;
    @Bind(R.id.bodyPart) EditText mBodyPart;
    @Bind(R.id.familyMember) EditText mFamilyMember;
    @Bind(R.id.verb) EditText mVerb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ArrayList<String> words = new ArrayList<String>();
                words.add(mNationality.getText().toString());
                words.add(mCrime.getText().toString());
                words.add(mNoun1.getText().toString());
                words.add(mNoun2.getText().toString());
                words.add(mNoun3.getText().toString());
                words.add(mCelebrity.getText().toString());
                words.add(mBodyPart.getText().toString());
                words.add(mFamilyMember.getText().toString());
                words.add(mVerb.getText().toString());

                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                intent.putExtra("words", words);
                startActivity(intent);
            }
        });
    }
}
