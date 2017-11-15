package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;
    String newState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView)findViewById(R.id.storyTextView);
        buttonTop = (Button)findViewById(R.id.buttonTop);
        buttonBottom = (Button)findViewById(R.id.buttonBottom);

        newState = "T1";
        storyTextView.setText(R.string.T1_Story);
        buttonTop.setText(R.string.T1_Ans1);
        buttonBottom.setText(R.string.T1_Ans2);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newState == "T1")
                {
                    newState = "T3";
                    setControlsText(newState);
                }
                else if (newState == "T2")
                {
                    newState = "T3";
                    setControlsText(newState);
                }
                else if (newState == "T3")
                {
                    newState = "T6";
                    setControlsText(newState);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newState == "T1")
                {
                    newState = "T2";
                    setControlsText(newState);
                }
                else if (newState == "T2")
                {
                    newState = "T4";
                    setControlsText(newState);
                }
                else if (newState == "T3")
                {
                    newState = "T5";
                    setControlsText(newState);
                }
            }
        });

    }

    private void setControlsText(String state)
    {
        if (state == "T1")
        {
            storyTextView.setText(R.string.T1_Story);
            buttonTop.setText(R.string.T1_Ans1);
            buttonBottom.setText(R.string.T1_Ans2);
            buttonTop.setVisibility(View.VISIBLE);
            buttonBottom.setVisibility(View.VISIBLE);
        }
        else if (state == "T2")
        {
            storyTextView.setText(R.string.T2_Story);
            buttonTop.setText(R.string.T2_Ans1);
            buttonBottom.setText(R.string.T2_Ans2);
            buttonTop.setVisibility(View.VISIBLE);
            buttonBottom.setVisibility(View.VISIBLE);
        }
        else if (state == "T3")
        {
            storyTextView.setText(R.string.T3_Story);
            buttonTop.setText(R.string.T3_Ans1);
            buttonBottom.setText(R.string.T3_Ans2);
            buttonTop.setVisibility(View.VISIBLE);
            buttonBottom.setVisibility(View.VISIBLE);
        }
        else if (state == "T4")
        {
            storyTextView.setText(R.string.T4_End);
            buttonTop.setVisibility(View.GONE);
            buttonBottom.setVisibility(View.GONE);
        }
        else if (state == "T5")
        {
            storyTextView.setText(R.string.T5_End);
            buttonTop.setVisibility(View.GONE);
            buttonBottom.setVisibility(View.GONE);
        }
        else if (state == "T6")
        {
            storyTextView.setText(R.string.T6_End);
            buttonTop.setVisibility(View.GONE);
            buttonBottom.setVisibility(View.GONE);
        }
    }
}
