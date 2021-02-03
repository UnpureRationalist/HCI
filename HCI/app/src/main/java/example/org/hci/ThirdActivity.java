package example.org.hci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        ImageButton btn1 = (ImageButton) findViewById(R.id.bottomButton1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn2 = (ImageButton) findViewById(R.id.bottomButton2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
//        ImageButton btn3 = (ImageButton) findViewById(R.id.bottomButton3);
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(ThirdActivity.this, ThirdActivity.class);
//                startActivity(intent);
//            }
//        });
        ImageButton btn4 = (ImageButton) findViewById(R.id.bottomButton4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn5 = (ImageButton) findViewById(R.id.bottomButton5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThirdActivity.this,FifthActivity.class);
                startActivity(intent);
            }
        });
        Button button1 = (Button) findViewById(R.id.hotForest);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThirdActivity.this,HotForestActivity.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.deadForest);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThirdActivity.this,DeadForestActivity.class);
                startActivity(intent);
            }
        });
    }
}
