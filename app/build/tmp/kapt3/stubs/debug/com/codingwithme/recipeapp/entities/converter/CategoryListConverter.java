package com.codingwithme.recipeapp.entities.converter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/codingwithme/recipeapp/entities/converter/CategoryListConverter;", "", "()V", "fromCategoryList", "", "category", "", "Lcom/codingwithme/recipeapp/entities/CategoryItems;", "toCategoryList", "categoryString", "app_debug"})
public final class CategoryListConverter {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromCategoryList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.codingwithme.recipeapp.entities.CategoryItems> category) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.codingwithme.recipeapp.entities.CategoryItems> toCategoryList(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryString) {
        return null;
    }
    
    public CategoryListConverter() {
        super();
    }
}