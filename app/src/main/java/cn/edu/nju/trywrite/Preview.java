package cn.edu.nju.trywrite;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Lenovo on 2016/1/28.
 */
public class Preview extends Activity {

    private ImageView mImageView01;
    private ImageView mImageView02;
    private ImageView mImageView03;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview);

        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Preview.this, Img.class);

                startActivity(intent);
                Preview.this.finish();
            }
        });








    }


}
