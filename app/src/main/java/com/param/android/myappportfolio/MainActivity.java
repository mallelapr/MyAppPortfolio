package com.param.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMovie(View view) {
        Button button = (Button) findViewById(R.id.btn_popular_movies);
        displayToast(button);
    }

    public void stockHawk(View view) {
        Button button = (Button) findViewById(R.id.btn_stock_hawk);
        displayToast(button);
    }

    public void buildItBigger(View view) {
        Button button = (Button) findViewById(R.id.btn_buildit_bigger);
        displayToast(button);
    }

    public void makeYourAppMaterial(View view) {
        Button button = (Button) findViewById(R.id.btn_make_app_material);
        displayToast(button);
    }

    public void goUbiquitous(View view) {
        Button button = (Button) findViewById(R.id.btn_go_ubiquitous);
        displayToast(button);
    }

    public void capstone(View view) {
        Button button = (Button) findViewById(R.id.btn_capstone);
        displayToast(button);
    }

    public void displayToast(Button button) {
        Context context = getApplicationContext();
        String text = "This button will launch my ";
        text += button.getText();
        text += " app!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }
}
