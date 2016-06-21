package com.diegusweb.android.facebookrecipes;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by HP on 20/06/2016.
 */
public class FacebookRecipesApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        iniFacebook();
    }

    private void iniFacebook() {
        FacebookSdk.sdkInitialize(this);
    }
}
