package com.param.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Private object for Toast to handle toast messages
    private static Toast toast;
    //Private objects for buttons
    private Button btnPopluarMovies, btnStockHawk, btnBuildItBigger, btnMakeAppMaterial, btnGoUbiquitous, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonInit();
    }

    @Override
    public void onClick(View view) {
        // To identify from which button was the click triggered
        switch (view.getId()) {

            case R.id.btn_popular_movies:
                displayToast(btnPopluarMovies);
                break;

            case R.id.btn_stock_hawk:
                displayToast(btnStockHawk);
                break;

            case R.id.btn_buildit_bigger:
                displayToast(btnBuildItBigger);
                break;

            case R.id.btn_make_app_material:
                displayToast(btnMakeAppMaterial);
                break;

            case R.id.btn_go_ubiquitous:
                displayToast(btnGoUbiquitous);
                break;

            case R.id.btn_capstone:
                displayToast(btnCapstone);

        }

    }
    //To initialize button
      private void ButtonInit() {
        btnPopluarMovies = (Button) findViewById(R.id.btn_popular_movies);
        btnStockHawk = (Button) findViewById(R.id.btn_stock_hawk);
        btnBuildItBigger = (Button) findViewById(R.id.btn_buildit_bigger);
        btnMakeAppMaterial = (Button) findViewById(R.id.btn_make_app_material);
        btnGoUbiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        btnCapstone = (Button) findViewById(R.id.btn_capstone);

        btnCapstone.setOnClickListener(this);
        btnGoUbiquitous.setOnClickListener(this);
        btnMakeAppMaterial.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnPopluarMovies.setOnClickListener(this);
        btnStockHawk.setOnClickListener(this);
    }

   //To format message and send to showToast
    public void displayToast(Button button) {
        showToast(this,
                getString(R.string.toast_msg_1) +" "+
                        button.getText() +" "+
                        getString(R.string.toast_msg_2)
        );
    }

    //Toast
    private void showToast(Context ctx, String message) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(ctx, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
