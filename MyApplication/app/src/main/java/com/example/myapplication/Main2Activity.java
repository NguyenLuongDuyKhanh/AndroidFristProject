package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        String data = extras.getString("value1");
        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();
        Button testButton = (Button) findViewById(R.id.button2);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            finish();
            /*
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("value1","This is value 1 return by intent");
                i.putExtra("value2","This is value 2 return by intent");
                int REQUEST_CODE = 9;
                startActivityForResult(i,REQUEST_CODE);
            */
            }

        });


    }

    @Override
    public void finish()
    {
        Intent data =new Intent();
        data.putExtra("returnKey1","Đây là returnKey1");
        data.putExtra("returnKey2","Đây là returnKey2");
        setResult(RESULT_OK,data);
        super.finish();
    }
}
