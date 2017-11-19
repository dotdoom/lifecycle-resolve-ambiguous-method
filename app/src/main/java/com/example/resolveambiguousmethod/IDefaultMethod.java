package com.example.resolveambiguousmethod;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

/**
 * Created by artem on 11/19/17.
 */

public interface IDefaultMethod extends LifecycleOwner {
    default void LogInfo() {
        getLifecycle().addObserver(new LifecycleObserver() {
            @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
            public void onAnyEvent() {
                Log.i("default-method", "This log comes from a default method");
            }
        });
    }
}
