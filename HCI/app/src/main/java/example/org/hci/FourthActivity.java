package example.org.hci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class FourthActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        ImageButton btn1 = (ImageButton) findViewById(R.id.bottomButton1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn2 = (ImageButton) findViewById(R.id.bottomButton2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn3 = (ImageButton) findViewById(R.id.bottomButton3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
//        ImageButton btn4 = (ImageButton) findViewById(R.id.bottomButton4);
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(FourthActivity.this, FourthActivity.class);
//                startActivity(intent);
//            }
//        });
        ImageButton btn5 = (ImageButton) findViewById(R.id.bottomButton5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,FifthActivity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton = (ImageButton) findViewById(R.id.addPhoto);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,TakePhotoActivity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton1 = (ImageButton) findViewById(R.id.addVideo);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,TakePhotoActivity.class);
                startActivity(intent);
            }
        });
    }
}
