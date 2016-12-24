package android.subham.fontstest;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5;
    Typeface f1,f2,f3,f4,f5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        t5 = (TextView) findViewById(R.id.textView5);

        f1 = Typeface.createFromAsset(getAssets(),"ALBAS.ttf");
        f2 = Typeface.createFromAsset(getAssets(),"Android Insomnia Regular.ttf");
        f3 = Typeface.createFromAsset(getAssets(),"android_7.ttf");
        f4 = Typeface.createFromAsset(getAssets(),"Elektra.ttf");
        f5 = Typeface.createFromAsset(getAssets(),"green avocado.ttf");

        t1.setTypeface(f1);
        t2.setTypeface(f2);
        t3.setTypeface(f3);
        t4.setTypeface(f4);
        t5.setTypeface(f5);

    }
}
