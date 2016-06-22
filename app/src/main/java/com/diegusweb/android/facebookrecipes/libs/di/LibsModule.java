package com.diegusweb.android.facebookrecipes.libs.di;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import com.bumptech.glide.Glide;
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
@Module
public class LibsModule {
    Activity activity;

    public LibsModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @Singleton
    ImageLoader provideImageLoader(RequestManager requestManager) {

        return new GlideImageLoader(requestManager);
    }

    @Provides
    @Singleton
    RequestManager providesRequestMAnager(Activity activity){
        return Glide.with(activity);
    }

    @Provides
    @Singleton
    EventBus provideEventBus(org.greenrobot.eventbus.EventBus eventBus) {
        return new GreenRobotEventBus(eventBus);
    }


    @Provides
    @Singleton
    Activity provideActivity(){
        return this.activity;
    }

    @Provides
    @Singleton
    org.greenrobot.eventbus.EventBus providesLibraryEventBus(){
        return org.greenrobot.eventbus.EventBus.getDefault();
    }
}
