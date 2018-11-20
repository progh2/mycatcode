package kr.emirim.ham.mycatcode2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "메인액티비티";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreated가 실행됨");
        Log.v(TAG, "Log.v 실행:모두출력");
        Log.i(TAG, "Log.i 실행:정보출력");
        Log.d(TAG, "Log.d 실행:디버깅출력");
        Log.w(TAG, "Log.w 실행:경고출력");
        Log.e(TAG, "Log.e 실행:에러출력");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume 실행됨");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart가 실행됨");
    }
}
