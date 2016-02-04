package cn.edu.nju.trywrite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenovo on 2016/1/29.
 */
public class sales01 extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info01);

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                //TODO 自动跳转
//                intent.setClass(Img.this, LockScreenActivity.class);

//                startActivity(intent);
//                Img.this.finish();
            }
        });

        Button btInfo01Back = (Button) findViewById(R.id.btInfo01Back);
        btInfo01Back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(sales01.this, Img.class);

                startActivity(intent);
                sales01.this.finish();
            }
        });

    }
}
