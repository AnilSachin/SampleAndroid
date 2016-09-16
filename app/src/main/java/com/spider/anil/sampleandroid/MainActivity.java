package com.spider.anil.sampleandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindArray;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    @BindArray(R.array.test_strings)
    String[] names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new My());
        b2.setOnClickListener(new My());

    }

    class My implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button:
                    Toast.makeText(MainActivity.this, "Android Button is Working", Toast.LENGTH_SHORT).show();

                    break;
                case R.id.button2:
                    Toast.makeText(MainActivity.this, "Ios Button is Working", Toast.LENGTH_SHORT).show();
                    break;

            }
        }
    }
}
