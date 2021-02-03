package example.org.hci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_news);
        ImageButton btn1 = (ImageButton) findViewById(R.id.bottomButton1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
//        ImageButton btn2 = (ImageButton) findViewById(R.id.bottomButton2);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(SecondActivity.this,SecondActivity.class);
//                startActivity(intent);
//            }
//        });
        ImageButton btn3 = (ImageButton) findViewById(R.id.bottomButton3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn4 = (ImageButton) findViewById(R.id.bottomButton4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn5 = (ImageButton) findViewById(R.id.bottomButton5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,FifthActivity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton = (ImageButton) findViewById(R.id.searchAnimalButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,SearchResultActivity.class);
                startActivity(intent);
            }
        });
        Button button = (Button) findViewById(R.id.northCircle);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this, NorthCircleActivity.class);
                startActivity(intent);
            }
        });
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.talkWithPanda);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this, TalkWithAnimalActivity.class);
                startActivity(intent);
            }
        });
    }
}
