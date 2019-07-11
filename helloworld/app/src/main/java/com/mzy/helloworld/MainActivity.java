package com.mzy.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final TextView textView=findViewById(R.id.textView);
        final ImageView imageView=findViewById(R.id.imageView);
        Switch  mSwitch = findViewById(R.id.switch1);
        RadioGroup radioGroup = findViewById(R.id.rg);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView.setText("What a beautiful world!");
            }
        });

        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    button.setVisibility(View.VISIBLE);
                }
                else{
                    button.setVisibility(View.GONE);
                }
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rb2) {
                    imageView.setImageResource(R.mipmap.download1);
                }
                if (checkedId == R.id.rb1) {
                    imageView.setImageResource(R.mipmap.download2);
                }
            }


        });
        }
}
