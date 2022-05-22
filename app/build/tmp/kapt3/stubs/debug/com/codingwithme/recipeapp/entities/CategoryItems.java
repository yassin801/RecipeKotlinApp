package com.codingwithme.recipeapp.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "CategoryItems")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/codingwithme/recipeapp/entities/CategoryItems;", "", "id", "", "idcategory", "", "strcategory", "strcategorythumb", "strcategorydescription", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getIdcategory", "()Ljava/lang/String;", "getStrcategory", "getStrcategorydescription", "getStrcategorythumb", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CategoryItems {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "idcategory")
    @com.google.gson.annotations.SerializedName(value = "idCategory")
    @com.google.gson.annotations.Expose()
    private final java.lang.String idcategory = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "strcategory")
    @com.google.gson.annotations.SerializedName(value = "strCategory")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strcategory = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "strcategorythumb")
    @com.google.gson.annotations.SerializedName(value = "strCategoryThumb")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strcategorythumb = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "strcategorydescription")
    @com.google.gson.annotations.SerializedName(value = "strCategoryDescription")
    @com.google.gson.annotations.Expose()
    private final java.lang.String strcategorydescription = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdcategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrcategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrcategorythumb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrcategorydescription() {
        return null;
    }
    
    public CategoryItems(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String idcategory, @org.jetbrains.annotations.NotNull()
    java.lang.String strcategory, @org.jetbrains.annotations.NotNull()
    java.lang.String strcategorythumb, @org.jetbrains.annotations.NotNull()
    java.lang.String strcategorydescription) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codingwithme.recipeapp.entities.CategoryItems copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String idcategory, @org.jetbrains.annotations.NotNull()
    java.lang.String strcategory, @org.jetbrains.annotations.NotNull()
    java.lang.String strcategorythumb, @org.jetbrains.annotations.NotNull()
    java.lang.String strcategorydescription) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}