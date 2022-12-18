package com.erkanterzioglu.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Context
        //ActivityContext
        //App Context

        //getApplicationContext()



    }

public void save(View view){

    AlertDialog.Builder alert= new AlertDialog.Builder(this);
    alert.setTitle("Save");
    alert.setMessage("Are you sure?");
    alert.setPositiveButton("SAVE", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            //save progress
            Toast.makeText(getApplicationContext(),"Saved!",Toast.LENGTH_LONG).show();
        }
    });
    alert.setNegativeButton("NO!", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

            Toast.makeText(getApplicationContext(),"Non Saved!",Toast.LENGTH_LONG).show();
        }
    });
    alert.show();

}


}