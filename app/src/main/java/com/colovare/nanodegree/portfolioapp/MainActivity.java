package com.colovare.nanodegree.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // common event handler for all six buttons
    public void onButtonClick(View v) {
        String defText = "This button will launch my %s app!";

        switch (v.getId()) {

            case  R.id.button: {
                Toast.makeText(this, getToastMessage(defText, R.string.popular_movies), Toast.LENGTH_SHORT).show();
                break;
            }

            case  R.id.button2: {
                Toast.makeText(this, getToastMessage(defText, R.string.stock_hawk), Toast.LENGTH_SHORT).show();
                break;
            }

            case  R.id.button3: {
                Toast.makeText(this, getToastMessage(defText, R.string.build_it_bigger), Toast.LENGTH_SHORT).show();
                break;
            }

            case  R.id.button4: {
                Toast.makeText(this, getToastMessage(defText, R.string.make_your_app_material), Toast.LENGTH_SHORT).show();
                break;
            }

            case  R.id.button5: {
                Toast.makeText(this, getToastMessage(defText, R.string.go_ubiquitous), Toast.LENGTH_SHORT).show();
                break;
            }

            case  R.id.button6: {
                Toast.makeText(this, getToastMessage(defText, R.string.capstone), Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }

    //
    private String getToastMessage(String defText, int resId) {
        return String.format(defText, getResources().getString(resId));
    }
}
