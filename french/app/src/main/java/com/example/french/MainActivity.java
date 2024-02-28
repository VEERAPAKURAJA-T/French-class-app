package com.example.french;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    Button button,button2,button3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

        button.setOnClickListener(this);/*it redirects the call to the onClick method
                                         that it is implemented and override
                                         */
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(id==R.id.button){
            playaudio(R.raw.jailer);
        } else if (id==R.id.button2) {
            playaudio(R.raw.jailer);
        }
    }
    public void playaudio(int a){
        MediaPlayer u=MediaPlayer.create(this,a);
        u.start();

    }
}

 /* Inorder to perform a multiple button we have implement "view.OnClickListener"
 then override the method .That override onClick method is lay outside the onCreate method.
  */