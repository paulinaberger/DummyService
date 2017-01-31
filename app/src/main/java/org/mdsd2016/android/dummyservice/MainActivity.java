package org.mdsd2016.android.dummyservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStartService = (Button) findViewById(R.id.btn_1);
        btnStartService.setOnClickListener(this);

        Button btnStartService2 = (Button) findViewById(R.id.btn_2);
        btnStartService2.setOnClickListener(this);

        Button btnStartService3 = (Button) findViewById(R.id.btn_3);
        btnStartService3.setOnClickListener(this);

    }

    @Override
    public void onClick(View whichView){
//          if (whichView.getId() == R.id.btn_1){
//              Log.e("OnClickClass", "Button 1 has been clicked");
//              Intent intent = new Intent(this, SecondActivity.class);
//             startActivityForResult(intent, 0);
//}
        switch (whichView.getId()) {
            case R.id.btn_1:
                Log.i(MainActivity.TAG, "startService button 1 has been clicked");
                break;

            case R.id.btn_2:
                Log.i(MainActivity.TAG, "startService button 2 has been clicked");
                break;

            case R.id.btn_3:
                Log.i(MainActivity.TAG, "startService button 3 has been clicked");
                break;

            default:
                Log.v(MainActivity.TAG, "OnClickListener not matched");
        }

    }
}
