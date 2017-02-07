package org.mdsd2016.android.dummyservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.util.Random;

public class BoundService extends Service {

    private static final String TAG = BoundService.class.getSimpleName();

    private IBinder mBinder = new Binder();


    public BoundService() {

        Log.i(BoundService.TAG, "In-onBound() Constructor");
    }

    public BoundService(IBinder serviceInfo) {
        Log.i(BoundService.TAG, "In-BoundService() non-empty constructor");

        this.mBinder = serviceInfo;
    }



    @Override
    public void onCreate(){
        super.onCreate();
        Log.i(BoundService.TAG, "In-onCreate() Constructor");


    }

    @Override
    public IBinder onBind(Intent intent) {

        Log.i(BoundService.TAG, "In-onBind() Constructor");
        return this.mBinder;

 //       throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onUnbind(Intent intent){

        Log.i(BoundService.TAG, "In-onUnbind() Constructor");

        return super.onUnbind(intent);
    }


    public int getRandomNumber(){
        //define what it's doing, we need to reeturn integer
        Random rn = new Random();
        return new Random().nextInt();

  //      return new Random().nextInt();

    }
}
