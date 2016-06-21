package com.diegusweb.android.facebookrecipes.entities;

import com.diegusweb.android.facebookrecipes.db.RecipesDatabase;
import com.google.gson.annotations.SerializedName;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

/**
 * Created by HP on 20/06/2016.
 */
@Table(database = RecipesDatabase.class)
public class Recipe {
    @SerializedName("recipe_id")
    @PrimaryKey private String recipeId;

    @Column private String title;

    @SerializedName("image_id")
    @Column private String imageURL;

    @SerializedName("source_id")
    @Column private String sourceURL;

    @Column private boolean favorite;

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getSourceURL() {
        return sourceURL;
    }

    public void setSourceURL(String sourceURL) {
        this.sourceURL = sourceURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equal = false;

        if (obj instanceof Recipe){
            Recipe recipe = (Recipe)obj;
            equal = this.recipeId.equals(recipe.getRecipeId());
        }

        return equal;
    }

}
