package org.mdsd2016.android.dummyservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class CustomStartService extends Service {

    private static final String TAG = CustomStartService.class.getSimpleName();

    public CustomStartService() {}

    @Override
    public void onCreate(){
        super.onCreate();

        Log.i(CustomStartService.TAG, "In-onCreate()");
    }

    @Override
    public  int onStartCommand(Intent intent, int flags, int startId){

//        long threshold = 1000000;
//        for (long cnt = 0; cnt < threshold; cnt++);
//method to wait a couple of seconds to make the thread sleep

        Log.i(CustomStartService.TAG, "In-onStartCommand");

        return  Service.START_NOT_STICKY;
    }


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
//only method that we HAVE to overwrite


}
