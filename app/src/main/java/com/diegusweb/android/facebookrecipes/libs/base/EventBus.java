package com.diegusweb.android.facebookrecipes.libs.base;

/**
 * Created by HP on 21/06/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
