package com.diegusweb.android.facebookrecipes.recipemain;

import android.support.v7.widget.RecyclerView;

import com.diegusweb.android.facebookrecipes.entities.Recipe;
import com.diegusweb.android.facebookrecipes.recipemain.events.RecipeMainEvent;
import com.diegusweb.android.facebookrecipes.recipemain.ui.RecipeMainView;

/**
 * Created by HP on 22/06/2016.
 */
public interface RecipeMainPresenter {
    void onCreate();
    void onDestroy();

    //para
    void dismissRecipe();
    void getNextRecipe();
    void saveRecipe(Recipe recipee);
    void onEventMainThread(RecipeMainEvent event);

    //para testin
    RecipeMainView getView();

}
