package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class ServiceExample extends Service {
    public ServiceExample() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.e("Test service", "Service đã đưuọc khởi tạo");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.e("test service","Service đã đưuọc hủy");
    }
}
