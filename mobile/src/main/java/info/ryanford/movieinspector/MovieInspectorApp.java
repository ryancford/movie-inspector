package info.ryanford.movieinspector;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import timber.log.BuildConfig;
import timber.log.Timber;

/**
 * Description: Custom Application class that handles app scope utils.
 * Author: Ryan Ford
 * Date: 2/14/16
 */
public class MovieInspectorApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        LeakCanary.install(this);

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
