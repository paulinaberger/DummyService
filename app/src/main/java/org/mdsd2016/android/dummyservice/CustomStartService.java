package org.mdsd2016.android.dummyservice;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
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

        //Services are done to show what is importart, to simulate this, we use the onStartComman
        //we use to address the specific task we want to do (i.e. download etc, wiating time)
        //before we were doing a for loop, just count - if the number is long enough it takes some time
        //dodgy to use a FOR loop, depends on how fast our computer can count, we want to be more precise on how long
        //it will be run, to sehow app freezing or not
        //so we create  a method to do a waitingTime
        //give me the time now and we are going to add a number of miliseconds from then to now
        //everytime you check, it increments very little because it's instant
        //when ou modify value, you see the app ferezes at some point, usually around 8 or 10
        //not start services in main threat
        //options to start services in a different thread

//        long threshold = 1000000;
//        for (long cnt = 0; cnt < threshold; cnt++);
//
//        method to wait a couple of seconds to make the thread sleep. Define integer called timelapse

        waitForSomeTimeSeconds(2);
//
        int timeLapseSeconds = 2;
        //want to define int that runs the process for 2 seconds
        //then we want to tell the system to calculate which is the time right now and add 2 seconds
        //and with that value, give a while - so wihle the time from now onwards is less than the time now
        //+timelapse, i stay there, if the ocndition is not fulfilled then i exit
        //with this we can define how long the processing is going to take. Need API from system
        //API will return the time

//       long endTime = System.currentTimeMillis() + timeLapseSeconds * 1000;
//       while(System.currentTimeMillis() < endTime){

 //      wait(endTime - System.currentTimeMillis());


        Log.i(CustomStartService.TAG, "In-onStartCommand");


        return  Service.START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public static void waitForSomeTimeSeconds (int i) {
    //only method that we HAVE to overwrite

    int timeLapseSeconds = 5;
    long endTime = System.currentTimeMillis() + timeLapseSeconds * 1000;

    while (System.currentTimeMillis() < endTime) {

        //           wait(endTime - System.currentTimeMillis());

    }
}


}
