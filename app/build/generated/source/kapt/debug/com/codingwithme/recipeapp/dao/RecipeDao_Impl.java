package com.codingwithme.recipeapp.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.codingwithme.recipeapp.entities.CategoryItems;
import com.codingwithme.recipeapp.entities.MealsItems;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecipeDao_Impl implements RecipeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CategoryItems> __insertionAdapterOfCategoryItems;

  private final EntityInsertionAdapter<MealsItems> __insertionAdapterOfMealsItems;

  private final SharedSQLiteStatement __preparedStmtOfClearDb;

  public RecipeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCategoryItems = new EntityInsertionAdapter<CategoryItems>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CategoryItems` (`id`,`idcategory`,`strcategory`,`strcategorythumb`,`strcategorydescription`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CategoryItems value) {
        stmt.bindLong(1, value.getId());
        if (value.getIdcategory() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIdcategory());
        }
        if (value.getStrcategory() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStrcategory());
        }
        if (value.getStrcategorythumb() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStrcategorythumb());
        }
        if (value.getStrcategorydescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getStrcategorydescription());
        }
      }
    };
    this.__insertionAdapterOfMealsItems = new EntityInsertionAdapter<MealsItems>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MealItems` (`id`,`idMeal`,`categoryName`,`strmeal`,`strmealthumb`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MealsItems value) {
        stmt.bindLong(1, value.getId());
        if (value.getIdMeal() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIdMeal());
        }
        if (value.getCategoryName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategoryName());
        }
        if (value.getStrMeal() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStrMeal());
        }
        if (value.getStrMealThumb() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getStrMealThumb());
        }
      }
    };
    this.__preparedStmtOfClearDb = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM categoryitems";
        return _query;
      }
    };
  }

  @Override
  public Object insertCategory(final CategoryItems categoryItems,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCategoryItems.insert(categoryItems);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertMeal(final MealsItems mealsItems, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMealsItems.insert(mealsItems);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object clearDb(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearDb.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearDb.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getAllCategory(final Continuation<? super List<CategoryItems>> p0) {
    final String _sql = "SELECT * FROM categoryitems ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<CategoryItems>>() {
      @Override
      public List<CategoryItems> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIdcategory = CursorUtil.getColumnIndexOrThrow(_cursor, "idcategory");
          final int _cursorIndexOfStrcategory = CursorUtil.getColumnIndexOrThrow(_cursor, "strcategory");
          final int _cursorIndexOfStrcategorythumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strcategorythumb");
          final int _cursorIndexOfStrcategorydescription = CursorUtil.getColumnIndexOrThrow(_cursor, "strcategorydescription");
          final List<CategoryItems> _result = new ArrayList<CategoryItems>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CategoryItems _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpIdcategory;
            _tmpIdcategory = _cursor.getString(_cursorIndexOfIdcategory);
            final String _tmpStrcategory;
            _tmpStrcategory = _cursor.getString(_cursorIndexOfStrcategory);
            final String _tmpStrcategorythumb;
            _tmpStrcategorythumb = _cursor.getString(_cursorIndexOfStrcategorythumb);
            final String _tmpStrcategorydescription;
            _tmpStrcategorydescription = _cursor.getString(_cursorIndexOfStrcategorydescription);
            _item = new CategoryItems(_tmpId,_tmpIdcategory,_tmpStrcategory,_tmpStrcategorythumb,_tmpStrcategorydescription);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getSpecificMealList(final String categoryName,
      final Continuation<? super List<MealsItems>> p1) {
    final String _sql = "SELECT * FROM MealItems WHERE categoryName = ? ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (categoryName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, categoryName);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<MealsItems>>() {
      @Override
      public List<MealsItems> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfIdMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "idMeal");
          final int _cursorIndexOfCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryName");
          final int _cursorIndexOfStrMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "strmeal");
          final int _cursorIndexOfStrMealThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strmealthumb");
          final List<MealsItems> _result = new ArrayList<MealsItems>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MealsItems _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpIdMeal;
            _tmpIdMeal = _cursor.getString(_cursorIndexOfIdMeal);
            final String _tmpCategoryName;
            _tmpCategoryName = _cursor.getString(_cursorIndexOfCategoryName);
            final String _tmpStrMeal;
            _tmpStrMeal = _cursor.getString(_cursorIndexOfStrMeal);
            final String _tmpStrMealThumb;
            _tmpStrMealThumb = _cursor.getString(_cursorIndexOfStrMealThumb);
            _item = new MealsItems(_tmpId,_tmpIdMeal,_tmpCategoryName,_tmpStrMeal,_tmpStrMealThumb);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
