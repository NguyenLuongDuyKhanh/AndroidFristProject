package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
        /*
        Button testButton = (Button) findViewById(R.id.button);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("value1","This is value 1 return by intent");
                i.putExtra("value2","This is value 2 return by intent");
                int REQUEST_CODE = 9;
                startActivityForResult(i,REQUEST_CODE);
            }
        });
        */

    }

    public void XuatThongBao(View v)
    {

        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        i.putExtra("value1","This is value 1 return by intent");
        i.putExtra("value2","This is value 2 return by intent");
        int REQUEST_CODE = 9;
        startActivityForResult(i,REQUEST_CODE);
        //startActivity(i);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        Toast.makeText(MainActivity.this,"Activity2 Finish",Toast.LENGTH_LONG).show();
        if(resultCode==RESULT_OK && requestCode == 5)
        {
            if(data.hasExtra(("returnKey1")));
            Toast.makeText(this, data.getExtras().getString("returnKey2"),Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Ngu bò, có gì đâu mà bấm =)))",Toast.LENGTH_SHORT).show();
        }
    }
    public static final String TAG ="MyMessage";

}