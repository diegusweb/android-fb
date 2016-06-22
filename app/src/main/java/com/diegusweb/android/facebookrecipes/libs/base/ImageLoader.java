package com.diegusweb.android.facebookrecipes.libs.base;

import android.widget.ImageView;

/**
 * Created by HP on 21/06/2016.
 */
public interface ImageLoader {
    void load(ImageView imageView, String URL);
    void setOnFinishedImageLoadingListener(Object listener);
}

