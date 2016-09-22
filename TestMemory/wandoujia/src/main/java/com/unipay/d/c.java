package com.unipay.d;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  private static c i;
  public String a = "packagename";
  public String b = "androidos";
  public String c = "softversion";
  public String d = "isroot";
  public String e = "isOpen";
  private List<d> f = new ArrayList();
  private List<d> g = new ArrayList();
  private Context h;
  private com.unipay.c.a j;
  private a k;
  private String l = "secinfo";
  private String m = "sec_info.db";

  private c(Context paramContext)
  {
    this.h = paramContext;
    this.k = new a(this, this.h);
    d();
    e();
    this.j = new com.unipay.c.a(new com.unipay.c.c());
    if (com.unipay.tools.b.g(this.h))
    {
      if (this.j == null)
        this.j = new com.unipay.c.a(new com.unipay.c.c());
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)this.h.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      com.unipay.c.e locale = new com.unipay.c.e();
      locale.a("imsi", com.unipay.tools.b.c(this.h));
      locale.a("osversion", Build.VERSION.SDK);
      locale.a("model", com.unipay.tools.a.j());
      locale.a("lcd", localDisplayMetrics.widthPixels + "x" + localDisplayMetrics.heightPixels);
      locale.a("imei", com.unipay.tools.b.e(this.h));
      locale.a("mac", com.unipay.tools.b.a(this.h));
      locale.a("net", com.unipay.tools.b.b(this.h));
      locale.a("ip", com.unipay.tools.b.a());
      locale.a("version", this.h.getSharedPreferences("secinfo", 0).getString("sec_version", "1"));
      this.j.a("http://uniview.wostore.cn/log-safepackage/update?", "GET", locale, new b(this));
    }
  }

  public static c a(Context paramContext)
  {
    if (i == null)
      i = new c(paramContext);
    return i;
  }

  private void d()
  {
    Cursor localCursor = this.k.getReadableDatabase().query(this.l, null, null, null, null, null, null);
    if ((localCursor != null) && (localCursor.getCount() > 0))
    {
      this.f.clear();
      localCursor.moveToFirst();
    }
    while (localCursor.moveToNext())
    {
      this.f.add(new d(localCursor.getString(localCursor.getColumnIndex(this.a)), localCursor.getString(localCursor.getColumnIndex(this.b)), localCursor.getString(localCursor.getColumnIndex(this.c)), localCursor.getString(localCursor.getColumnIndex(this.d)), localCursor.getString(localCursor.getColumnIndex(this.e))));
      continue;
      this.f.clear();
      this.f.add(new d("com.lbe.security", "any", "any", "true", "true"));
      this.f.add(new d("com.lbe.security.miui", "15", "any", "true", "true"));
      this.f.add(new d("com.lenovo.safecenter", "any", "any", "any", "true"));
      this.f.add(new d("com.tencent.qqpimsecure", "any", "3.8.6", "true", "false"));
      this.f.add(new d("com.qihoo360.mobilesafe", "any", "any", "true", "false"));
    }
  }

  private void e()
  {
    PackageManager localPackageManager = this.h.getPackageManager();
    this.g.clear();
    int n = 0;
    while (true)
    {
      if (n < this.f.size());
      try
      {
        PackageInfo localPackageInfo = localPackageManager.getPackageInfo(((d)this.f.get(n)).c(), 1);
        if (localPackageInfo != null)
          this.g.add(new d(localPackageInfo.packageName, Build.VERSION.SDK_INT, localPackageInfo.versionName, e.a(), ((d)this.f.get(n)).b()));
        label135: n++;
        continue;
        return;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        break label135;
      }
    }
  }

  public final List<d> a()
  {
    return this.g;
  }

  public final void a(String paramString)
  {
    SharedPreferences.Editor localEditor = this.h.getSharedPreferences("secinfo", 0).edit();
    localEditor.putString("sec_version", paramString);
    localEditor.commit();
  }

  public final void a(List<d> paramList)
  {
    SQLiteDatabase localSQLiteDatabase = this.k.getWritableDatabase();
    for (int n = 0; n < paramList.size(); n++)
    {
      paramList.get(n);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put(this.a, ((d)paramList.get(n)).c());
      localContentValues.put(this.b, ((d)paramList.get(n)).d());
      localContentValues.put(this.c, ((d)paramList.get(n)).e());
      localContentValues.put(this.d, ((d)paramList.get(n)).f());
      localContentValues.put(this.e, ((d)paramList.get(n)).b());
      localSQLiteDatabase.insert(this.l, this.a, localContentValues);
    }
    localSQLiteDatabase.close();
  }

  public final d b()
  {
    for (int n = 0; n < this.f.size(); n++)
      for (int i1 = 0; i1 < this.g.size(); i1++)
      {
        if (!((d)this.f.get(n)).c().equals(((d)this.g.get(i1)).c()))
          continue;
        d locald1 = (d)this.f.get(n);
        d locald2 = (d)this.g.get(i1);
        if (((locald1.d().equals(locald2.d())) || (locald1.d().equals("any"))) && ((locald1.e().equals(locald2.e())) || (locald1.e().equals("any"))) && ((locald1.f().equals(locald2.f())) || (locald1.f().equals("any"))) && (locald1.b().equals("true")));
        for (int i2 = 1; i2 != 0; i2 = 0)
        {
          this.g.get(i1);
          return (d)this.g.get(i1);
        }
      }
    return null;
  }

  public final void c()
  {
    SQLiteDatabase localSQLiteDatabase = this.k.getWritableDatabase();
    localSQLiteDatabase.delete(this.l, null, null);
    localSQLiteDatabase.close();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.d.c
 * JD-Core Version:    0.6.0
 */