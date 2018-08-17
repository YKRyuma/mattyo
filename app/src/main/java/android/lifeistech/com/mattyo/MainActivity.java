package android.lifeistech.com.mattyo;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SoundPool mSoundPool;

    private int[] mSoundID;

    private int[] mSoundResource = {
            R.raw.acha,
            R.raw.wanchan
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.onResume();
        mSoundPool = new SoundPool(mSoundResource.length, AudioManager.STREAM_MUSIC,0);
        mSoundID = new int[mSoundResource.length];

        for (int i =0; i< mSoundResource.length;i++){
            mSoundID[i] =mSoundPool.load(getApplicationContext(),mSoundResource[i],0);
        }



    }

    public void add1(View v) {
        Toast.makeText(this, "ワンチャンある", Toast.LENGTH_LONG).show();
        mSoundPool.play(mSoundID[1],5.0F,5.0F,0,0,1.0F);

    }

    public void add2(View v) {
        Toast.makeText(this, "あちゃーじゃねぇよ", Toast.LENGTH_LONG).show();
        mSoundPool.play(mSoundID[0],5.0F,5.0F,0,0,1.0F);
    }

    protected void onDestoroy(){
        super.onDestroy();;

        mSoundPool.release();
    }


}