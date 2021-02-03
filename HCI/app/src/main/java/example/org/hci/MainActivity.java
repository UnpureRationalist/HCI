package example.org.hci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageButton btn1 = (ImageButton) findViewById(R.id.bottomButton1);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
        ImageButton btn2 = (ImageButton) findViewById(R.id.bottomButton2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn3 = (ImageButton) findViewById(R.id.bottomButton3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn4 = (ImageButton) findViewById(R.id.bottomButton4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn5 = (ImageButton) findViewById(R.id.bottomButton5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FifthActivity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton = (ImageButton) findViewById(R.id.publish);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PublishActivity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton1 = (ImageButton) findViewById(R.id.searchAnimalButton2);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SearchResultActivity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.search_button2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TakePhotoActivity.class);
                startActivity(intent);
            }
        });
    }


}