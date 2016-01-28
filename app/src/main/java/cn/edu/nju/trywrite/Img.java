package cn.edu.nju.trywrite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lenovo on 2016/1/28.
 */
public class Img extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Img.this, LockScreenActivity.class);

                startActivity(intent);
                Img.this.finish();
            }
        });

        Button b4 = (Button) findViewById(R.id.preview);
        b4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Img.this, Preview.class);

                startActivity(intent);
                Img.this.finish();
            }
        });

    }
}
