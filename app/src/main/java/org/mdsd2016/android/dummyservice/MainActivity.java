package org.mdsd2016.android.dummyservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    private TextView mTvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnStartService = (Button) findViewById(R.id.btn_1);
        btnStartService.setOnClickListener(this);

        final Button btnStartBoundService2 = (Button) findViewById(R.id.btn_2);
        btnStartBoundService2.setOnClickListener(this);

        final Button btnStartService3 = (Button) findViewById(R.id.btn_3);
        btnStartService3.setOnClickListener(this);

        final Button btnDispInfo = (Button) findViewById(R.id.btn_4);
        btnDispInfo.setOnClickListener(this);

        this.mTvInfo = (TextView) findViewById(R.id.top_txt_view);


    }

    @Override
    public void onClick(View whichView){

        switch (whichView.getId()) {
            case R.id.btn_1:
                Log.i(MainActivity.TAG, "startService Start Service has been clicked");

                Intent intent = new Intent(this, CustomStartService.class);
                startService(intent);

                break;

            case R.id.btn_2:
                Log.i(MainActivity.TAG, "startService Start Bound Service has been clicked");
                this.mTvInfo.setText("Bound Service was Clicked Yo!");

                break;

            case R.id.btn_3:
                Log.i(MainActivity.TAG, "startService Start Intent Service has been clicked");

                Intent secondintent = new Intent(this, MyIntentService.class);
                startService(secondintent);

            case R.id.btn_4:
                Log.i(MainActivity.TAG, "Display Info Button has been clicked");
                this.mTvInfo.setText("POTATO");

                break;

            default:
                Log.v(MainActivity.TAG, "OnClickListener not matched");
        }

    }
}
