package com.diegusweb.android.facebookrecipes.recipemain.ui;

import com.diegusweb.android.facebookrecipes.entities.Recipe;

/**
 * Created by HP on 22/06/2016.
 */
public interface RecipeMainView {
    //todo lo necesario pala vista
    void showProgress();
    void hideProgress();

    void showUIElements();
    void hideIElements();

    //animaciones
    void saveAnimation();
    void dismissAnimation();

    //salvar receta
    void onRecipeSAved();

    //visualizar varias cambiar imagen
    void setRecipe(Recipe recipe);
    void getRecipeError(String error);


}
