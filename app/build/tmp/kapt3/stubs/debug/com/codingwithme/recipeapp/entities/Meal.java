package com.codingwithme.recipeapp.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "Meal")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/codingwithme/recipeapp/entities/Meal;", "", "id", "", "mealsItem", "", "Lcom/codingwithme/recipeapp/entities/MealsItems;", "(ILjava/util/List;)V", "getId", "()I", "setId", "(I)V", "getMealsItem", "()Ljava/util/List;", "setMealsItem", "(Ljava/util/List;)V", "app_debug"})
public final class Meal {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "meals")
    @com.google.gson.annotations.SerializedName(value = "meals")
    @com.google.gson.annotations.Expose()
    private java.util.List<com.codingwithme.recipeapp.entities.MealsItems> mealsItem;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.codingwithme.recipeapp.entities.MealsItems> getMealsItem() {
        return null;
    }
    
    public final void setMealsItem(@org.jetbrains.annotations.Nullable()
    java.util.List<com.codingwithme.recipeapp.entities.MealsItems> p0) {
    }
    
    public Meal(int id, @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverters(value = {com.codingwithme.recipeapp.entities.converter.MealListConverter.class})
    java.util.List<com.codingwithme.recipeapp.entities.MealsItems> mealsItem) {
        super();
    }
}