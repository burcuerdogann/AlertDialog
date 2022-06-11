package com.burcuerdogan.alertdialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"Toast Message",Toast.LENGTH_LONG).show();
    }

    public void save(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Save Message Pop-up");
        alert.setMessage("Are You Sure?");
        alert.setPositiveButton("Yes", (dialog, which) -> {
            //save
            Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show();
        });
        alert.setNegativeButton("No", (dialog, which) -> {
            //not save
            Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show();
        });
        alert.show();

    }
}