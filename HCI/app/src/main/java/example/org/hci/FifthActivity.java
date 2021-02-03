package example.org.hci;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.DialogInterface;
import androidx.annotation.RequiresApi;
import de.hdodenhof.circleimageview.CircleImageView;

public class FifthActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_center);

        ImageButton btn1 = (ImageButton) findViewById(R.id.bottomButton1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn2 = (ImageButton) findViewById(R.id.bottomButton2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn3 = (ImageButton) findViewById(R.id.bottomButton3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn4 = (ImageButton) findViewById(R.id.bottomButton4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });
        CircleImageView circleImageView = (CircleImageView) findViewById(R.id.headImage);
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, ModifyInfoActivity.class);
                startActivity(intent);
            }
        });
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.myInfo);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, ModifyInfoActivity.class);
                startActivity(intent);
            }
        });
        FrameLayout frameLayout1 = (FrameLayout) findViewById(R.id.myMessage);
        frameLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, MyMessageActivity.class);
                startActivity(intent);
            }
        });
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.myScore);
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, MyScoreActivity.class);
                startActivity(intent);
            }
        });
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.myFriend);
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, MyFriendActivity.class);
                startActivity(intent);
            }
        });
        FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.myDonate);
        frameLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, MyDonateActivity.class);
                startActivity(intent);
            }
        });
        FrameLayout frameLayout5 = (FrameLayout) findViewById(R.id.myAnswer);
        frameLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, MyAnswerTipsActivity.class);
                startActivity(intent);
            }
        });
        FrameLayout frameLayout6 = (FrameLayout) findViewById(R.id.childModule);
        frameLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this, ChildModuleActivity.class);
                startActivity(intent);
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.daka);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();   //调用函数弹出对话框
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.dakasuccess);
        builder.setTitle("温馨提示");
        builder.setMessage("打卡成功  积分 +10 !");   //设置对话框属性
        builder.setPositiveButton("我知道了",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        AlertDialog dialog=builder.create();
        dialog.show();  // 显示对话框
    }
}
