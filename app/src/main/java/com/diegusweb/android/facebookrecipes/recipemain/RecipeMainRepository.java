package com.diegusweb.android.facebookrecipes.recipemain;

import com.diegusweb.android.facebookrecipes.entities.Recipe;

/**
 * Created by HP on 22/06/2016.
 */
public interface RecipeMainRepository {
    public final static int COUNT = 1;
    public final static String RECENT_SORT = "r";
    public final static int RECIPE_RANGE = 100000;

    void getNextRecipe();
    void saveRecipe(Recipe recipe);
    void setRecipePage(int RecipePage);
}
