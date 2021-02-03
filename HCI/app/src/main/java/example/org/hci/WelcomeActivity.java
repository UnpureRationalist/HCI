package example.org.hci;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //APP启动动画
        new Handler().postDelayed(new Runnable() {
            //在Runnable被传入消息队列之前，延迟一定的时间，在这里传入的是1500毫秒
            @Override
            public void run() {
                Intent loginIntent = new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(loginIntent);
                finish();
            }
        },1500);
    }
}
