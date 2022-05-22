package com.codingwithme.recipeapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0012J\u0014\u0010#\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060%R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006("}, d2 = {"Lcom/codingwithme/recipeapp/adapter/MainCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codingwithme/recipeapp/adapter/MainCategoryAdapter$RecipeViewHolder;", "()V", "arrMainCategory", "Ljava/util/ArrayList;", "Lcom/codingwithme/recipeapp/entities/CategoryItems;", "getArrMainCategory", "()Ljava/util/ArrayList;", "setArrMainCategory", "(Ljava/util/ArrayList;)V", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "setCtx", "(Landroid/content/Context;)V", "listener", "Lcom/codingwithme/recipeapp/adapter/MainCategoryAdapter$OnItemClickListener;", "getListener", "()Lcom/codingwithme/recipeapp/adapter/MainCategoryAdapter$OnItemClickListener;", "setListener", "(Lcom/codingwithme/recipeapp/adapter/MainCategoryAdapter$OnItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickListener", "listener1", "setData", "arrData", "", "OnItemClickListener", "RecipeViewHolder", "app_debug"})
public final class MainCategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.codingwithme.recipeapp.adapter.MainCategoryAdapter.RecipeViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.codingwithme.recipeapp.adapter.MainCategoryAdapter.OnItemClickListener listener;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context ctx;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codingwithme.recipeapp.entities.CategoryItems> arrMainCategory;
    
    @org.jetbrains.annotations.Nullable()
    public final com.codingwithme.recipeapp.adapter.MainCategoryAdapter.OnItemClickListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.codingwithme.recipeapp.adapter.MainCategoryAdapter.OnItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getCtx() {
        return null;
    }
    
    public final void setCtx(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codingwithme.recipeapp.entities.CategoryItems> getArrMainCategory() {
        return null;
    }
    
    public final void setArrMainCategory(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codingwithme.recipeapp.entities.CategoryItems> p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.codingwithme.recipeapp.entities.CategoryItems> arrData) {
    }
    
    public final void setClickListener(@org.jetbrains.annotations.NotNull()
    com.codingwithme.recipeapp.adapter.MainCategoryAdapter.OnItemClickListener listener1) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codingwithme.recipeapp.adapter.MainCategoryAdapter.RecipeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.codingwithme.recipeapp.adapter.MainCategoryAdapter.RecipeViewHolder holder, int position) {
    }
    
    public MainCategoryAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/codingwithme/recipeapp/adapter/MainCategoryAdapter$RecipeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class RecipeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public RecipeViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codingwithme/recipeapp/adapter/MainCategoryAdapter$OnItemClickListener;", "", "onClicked", "", "categoryName", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String categoryName);
    }
}