package example.org.hci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class NorthCircleActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_circle);

        Button button = (Button) findViewById(R.id.reportUserButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NorthCircleActivity.this, ReportUserActivity.class);
                startActivity(intent);
            }
        });
        Button button1 = (Button) findViewById(R.id.share);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NorthCircleActivity.this, ShareActivity.class);
                startActivity(intent);
            }
        });
    }
}
