package helloworld.plainactivity;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

public class MyIntentService extends IntentService {
    private static final String TAG = "MyIntentService";

    public MyIntentService() {
        super(TAG);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(), "Service started", Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //Normally do a time consuming function like playing music in background
        //or download a file
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(), "Service stopped", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
