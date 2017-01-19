package vis.ue4_androidservice;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class BLEService extends Service {
    public BLEService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onCreate() {
        super.onCreate();
        Log.i("BLEService", "creating service ...");

        Notification n = new Notification.Builder(this).setContentTitle("BLE Foreground Service").setSmallIcon(android.R.drawable.ic_menu_rotate).build();
        startForeground(666, n);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i("BLEService", "destroying service ...");
    }

    public int onStartCommand (Intent intent, int flags, int startId) {
        return Service.START_STICKY;
    }
}
