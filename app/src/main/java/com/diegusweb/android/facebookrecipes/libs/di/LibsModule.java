package com.diegusweb.android.facebookrecipes.libs.di;

import android.app.Activity;

import com.bumptech.glide.RequestManager;
import com.diegusweb.android.facebookrecipes.libs.GlideImageLoader;
import com.diegusweb.android.facebookrecipes.libs.GreenRobotEventBus;
import com.diegusweb.android.facebookrecipes.libs.base.EventBus;
import com.diegusweb.android.facebookrecipes.libs.base.ImageLoader;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by HP on 21/06/2016.
 */
public class LibsModule {
    Activity activity;

    public LibsModule() {
    }

    public LibsModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @Singleton
    EventBus provideEventBus(org.greenrobot.eventbus.EventBus eventBus) {
        return new GreenRobotEventBus(eventBus);
    }

    @Provides
    @Singleton
    ImageLoader provideImageLoader(RequestManager requestManager) {
        /*GlideImageLoader imageLoader = new GlideImageLoader();
        if (activity != null) {
            imageLoader.setLoaderContext(activity);
        }
        return imageLoader;*/
        return new GlideImageLoader(requestManager);
    }

    @Provides
    @Singleton
    Activity provideActivity(){
        return this.activity;
    }
}
