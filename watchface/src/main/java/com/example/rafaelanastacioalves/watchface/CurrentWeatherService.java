package com.example.rafaelanastacioalves.watchface;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class CurrentWeatherService extends Service {
    public CurrentWeatherService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
