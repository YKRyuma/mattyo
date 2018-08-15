package android.lifeistech.com.mattyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void add1(View v){
        Toast.makeText(this,"ワンチャンある",Toast.LENGTH_LONG).show();
    }
    public void  add2(View v){ Toast.makeText(this,"あちゃーじゃねぇよ",Toast.LENGTH_LONG).show();}
}
