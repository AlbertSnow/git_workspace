package com.google.android.gms.ads.internal.purchase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

@zzhb
public class zzh
{
  private static final String zzFV = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[] { "InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time" });
  private final zza zzFW;
  private static final Object zzpV = new Object();
  private static zzh zzFX;

  public static zzh zzy(Context paramContext)
  {
    synchronized (zzpV)
    {
      if (zzFX == null)
        zzFX = new zzh(paramContext);
      return zzFX;
    }
  }

  zzh(Context paramContext)
  {
    this.zzFW = new zza(paramContext, "google_inapp_purchase.db");
  }

  public void zza(zzf paramzzf)
  {
    if (paramzzf == null)
      return;
    synchronized (zzpV)
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      if (localSQLiteDatabase == null)
        return;
      String str = String.format(Locale.US, "%s = %d", new Object[] { "purchase_id", Long.valueOf(paramzzf.zzFP) });
      localSQLiteDatabase.delete("InAppPurchase", str, null);
    }
  }

  public SQLiteDatabase getWritableDatabase()
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      localSQLiteDatabase = this.zzFW.getWritableDatabase();
    }
    catch (SQLiteException localSQLiteException)
    {
      zzin.zzaK("Error opening writable conversion tracking database");
      return null;
    }
    return localSQLiteDatabase;
  }

  public List<zzf> zzg(long paramLong)
  {
    synchronized (zzpV)
    {
      LinkedList localLinkedList = new LinkedList();
      if (paramLong <= 0L)
        return localLinkedList;
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      if (localSQLiteDatabase == null)
        return localLinkedList;
      Cursor localCursor = null;
      try
      {
        String str = "record_time ASC";
        localCursor = localSQLiteDatabase.query("InAppPurchase", null, null, null, null, null, str, String.valueOf(paramLong));
        if (localCursor.moveToFirst())
          do
            localLinkedList.add(zza(localCursor));
          while (localCursor.moveToNext());
      }
      catch (SQLiteException localSQLiteException)
      {
        zzin.zzaK("Error extracing purchase info: " + localSQLiteException.getMessage());
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
      return localLinkedList;
    }
  }

  public void zzb(zzf paramzzf)
  {
    if (paramzzf == null)
      return;
    synchronized (zzpV)
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      if (localSQLiteDatabase == null)
        return;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("product_id", paramzzf.zzFR);
      localContentValues.put("developer_payload", paramzzf.zzFQ);
      localContentValues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
      paramzzf.zzFP = localSQLiteDatabase.insert("InAppPurchase", null, localContentValues);
      if (getRecordCount() > 20000L)
        zzfY();
    }
  }

  public int getRecordCount()
  {
    synchronized (zzpV)
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      if (localSQLiteDatabase == null)
        return 0;
      Cursor localCursor = null;
      try
      {
        localCursor = localSQLiteDatabase.rawQuery("select count(*) from InAppPurchase", null);
        if (localCursor.moveToFirst())
        {
          int i = localCursor.getInt(0);
          if (localCursor != null)
            localCursor.close();
          return i;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        zzin.zzaK("Error getting record count" + localSQLiteException.getMessage());
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
      return 0;
    }
  }

  public void zzfY()
  {
    synchronized (zzpV)
    {
      SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
      if (localSQLiteDatabase == null)
        return;
      Cursor localCursor = null;
      try
      {
        String str = "record_time ASC";
        localCursor = localSQLiteDatabase.query("InAppPurchase", null, null, null, null, null, str, "1");
        if ((localCursor != null) && (localCursor.moveToFirst()))
          zza(zza(localCursor));
      }
      catch (SQLiteException localSQLiteException)
      {
        zzin.zzaK("Error remove oldest record" + localSQLiteException.getMessage());
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
    }
  }

  public zzf zza(Cursor paramCursor)
  {
    if (paramCursor == null)
      return null;
    return new zzf(paramCursor.getLong(0), paramCursor.getString(1), paramCursor.getString(2));
  }

  public class zza extends SQLiteOpenHelper
  {
    public zza(Context paramString, String arg3)
    {
      super(str, null, 4);
    }

    public void onCreate(SQLiteDatabase db)
    {
      db.execSQL(zzh.zzFV);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
      zzin.zzaJ("Database updated from version " + oldVersion + " to version " + newVersion);
      db.execSQL("DROP TABLE IF EXISTS InAppPurchase");
      onCreate(db);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzh
 * JD-Core Version:    0.6.0
 */