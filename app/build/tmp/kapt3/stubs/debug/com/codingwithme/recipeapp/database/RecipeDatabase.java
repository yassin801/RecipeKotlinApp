package com.codingwithme.recipeapp.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.codingwithme.recipeapp.entities.converter.CategoryListConverter.class, com.codingwithme.recipeapp.entities.converter.MealListConverter.class})
@androidx.room.Database(entities = {com.codingwithme.recipeapp.entities.Recipes.class, com.codingwithme.recipeapp.entities.CategoryItems.class, com.codingwithme.recipeapp.entities.Category.class, com.codingwithme.recipeapp.entities.Meal.class, com.codingwithme.recipeapp.entities.MealsItems.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codingwithme/recipeapp/database/RecipeDatabase;", "Landroidx/room/RoomDatabase;", "()V", "recipeDao", "Lcom/codingwithme/recipeapp/dao/RecipeDao;", "Companion", "app_debug"})
public abstract class RecipeDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.Nullable()
    private static com.codingwithme.recipeapp.database.RecipeDatabase recipesDatabase;
    public static final com.codingwithme.recipeapp.database.RecipeDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.codingwithme.recipeapp.dao.RecipeDao recipeDao();
    
    public RecipeDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/codingwithme/recipeapp/database/RecipeDatabase$Companion;", "", "()V", "recipesDatabase", "Lcom/codingwithme/recipeapp/database/RecipeDatabase;", "getRecipesDatabase", "()Lcom/codingwithme/recipeapp/database/RecipeDatabase;", "setRecipesDatabase", "(Lcom/codingwithme/recipeapp/database/RecipeDatabase;)V", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.codingwithme.recipeapp.database.RecipeDatabase getRecipesDatabase() {
            return null;
        }
        
        public final void setRecipesDatabase(@org.jetbrains.annotations.Nullable()
        com.codingwithme.recipeapp.database.RecipeDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.codingwithme.recipeapp.database.RecipeDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}