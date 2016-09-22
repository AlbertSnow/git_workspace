package com.wandoujia.ripple_framework.download.a.a;

import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import java.util.HashSet;
import java.util.List;

public class b
{
  private static final UriMatcher a;
  private static final String[] b;
  private static HashSet<String> c;
  private static b f;
  private SQLiteOpenHelper d = null;
  private Context e;

  static
  {
    int i = 0;
    b.class.desiredAssertionStatus();
    UriMatcher localUriMatcher = new UriMatcher(-1);
    a = localUriMatcher;
    localUriMatcher.addURI("com.wandoujia.p4.download", "downloads", 1);
    a.addURI("com.wandoujia.p4.download", "downloads/#", 2);
    b = new String[] { "_id", "uri", "current_bytes", "description", "destination", "filename", "visible", "lastmod", "mimetype", "_data", "notification_class", "notification_extras", "resource_type", "resource_extras", "status", "resouce_identity", "no_integrity", "title", "failed_times", "total_bytes", "use_agent", "etag", "source", "check_size", "icon_url", "duration", "allowed_download_without_wifi", "retried_urls", "segment_config", "last_url_retried_times", "dservice_urls", "md5_checksum", "md5_state", "last_url_retried_times", "speed_limit", "speed", "verify_type", "verify_value" };
    c = new HashSet();
    while (i < 38)
    {
      c.add(b[i]);
      i++;
    }
  }

  private b(Context paramContext)
  {
    this.e = paramContext;
    this.d = new c(paramContext);
  }

  public static b a(Context paramContext)
  {
    monitorenter;
    try
    {
      if (f == null)
        f = new b(paramContext);
      b localb = f;
      return localb;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final Cursor a(Uri paramUri, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.d.getReadableDatabase();
    int i = a.match(paramUri);
    if (i == -1)
      throw new IllegalArgumentException("Unknown URI: " + paramUri);
    g localg = new g();
    localg.a(paramString, null);
    if (i == 2)
    {
      String[] arrayOfString3 = new String[1];
      arrayOfString3[0] = ((String)paramUri.getPathSegments().get(1));
      localg.a("_id = ?", arrayOfString3);
    }
    String[] arrayOfString1 = b;
    String str = localg.a.toString();
    String[] arrayOfString2 = new String[localg.b.size()];
    Cursor localCursor = localSQLiteDatabase.query("downloads", arrayOfString1, str, (String[])localg.b.toArray(arrayOfString2), null, null, null);
    if (localCursor != null);
    for (Object localObject = new d(localCursor); ; localObject = localCursor)
    {
      if (localObject != null)
        ((Cursor)localObject).setNotificationUri(this.e.getContentResolver(), paramUri);
      return localObject;
    }
  }

  public final void a()
  {
    try
    {
      c.a((c)this.d, this.d.getWritableDatabase());
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.a.b
 * JD-Core Version:    0.6.0
 */