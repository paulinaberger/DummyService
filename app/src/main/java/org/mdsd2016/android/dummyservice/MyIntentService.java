package org.mdsd2016.android.dummyservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class MyIntentService extends IntentService {

    private static final String TAG = MyIntentService.class.getSimpleName();

    public MyIntentService(){
        super(null);

    }


    @Override
    protected void onHandleIntent(Intent intent) {

        CustomStartService.waitForSomeTimeSeconds(20);

        //accessing staic classes, you call it by the name - access the static way to access static elements,
        //the class waitforsometime is found in the customsetartsergice.java class, we wanted to use it here
        Log.i(MyIntentService.TAG, "In-onHandleIntent");

    }
}