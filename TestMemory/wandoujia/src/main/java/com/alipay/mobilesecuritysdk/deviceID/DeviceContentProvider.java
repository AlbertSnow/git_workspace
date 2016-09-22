package com.alipay.mobilesecuritysdk.deviceID;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class DeviceContentProvider extends ContentProvider
{
  private static final UriMatcher a;

  static
  {
    Uri.parse("content://content://com.alipay.mobilesecuritysdk.deviceID.DeviceContentProvider/devices");
    UriMatcher localUriMatcher = new UriMatcher(-1);
    a = localUriMatcher;
    localUriMatcher.addURI("content://com.alipay.mobilesecuritysdk.deviceID.DeviceContentProvider", "devices", 1);
    a.addURI("content://com.alipay.mobilesecuritysdk.deviceID.DeviceContentProvider", "devices/#", 2);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    switch (a.match(paramUri))
    {
    default:
      throw new IllegalArgumentException("UnKown url" + paramUri);
    case 1:
      return "vnd.android.Cursor.dir/vnd.androiddevices.device";
    case 2:
    }
    return "vnd.android.Cursor.item/vnd.androiddevices.device";
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    new c(getContext());
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.mobilesecuritysdk.deviceID.DeviceContentProvider
 * JD-Core Version:    0.6.0
 */