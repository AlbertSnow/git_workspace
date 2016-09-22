package com.wandoujia.accessibility.content_provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

public class AccessibilityContentProvider extends ContentProvider
{
  public static final String METHOD = "method";

  private Method findMethod(Uri paramUri)
  {
    String str1 = (String)paramUri.getPathSegments().get(1);
    if (TextUtils.isEmpty(str1))
      throw new Exception("No Function name");
    String str2 = paramUri.getQueryParameter("method");
    if (TextUtils.isEmpty(str2))
      throw new Exception("No method name");
    return AccessibilityContentProvider.Functions.valueOf(str1.toUpperCase()).getCls().getMethod(str2, new Class[] { Uri.class });
  }

  private boolean requestLegal(List<String> paramList, AccessibilityContentProvider.Type paramType)
  {
    return (paramList != null) && (!paramList.isEmpty()) && (((String)paramList.get(0)).equals(paramType.getTypeName()));
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    if (!requestLegal(paramUri.getPathSegments(), AccessibilityContentProvider.Type.DELETE))
      return 0;
    try
    {
      int i = ((Integer)findMethod(paramUri).invoke(null, new Object[] { paramUri })).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    return false;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    if (!requestLegal(paramUri.getPathSegments(), AccessibilityContentProvider.Type.QUERY))
      return null;
    try
    {
      Cursor localCursor = (Cursor)findMethod(paramUri).invoke(null, new Object[] { paramUri });
      return localCursor;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    if (!requestLegal(paramUri.getPathSegments(), AccessibilityContentProvider.Type.UPDATE))
      return 0;
    try
    {
      int i = ((Integer)findMethod(paramUri).invoke(null, new Object[] { paramUri })).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.content_provider.AccessibilityContentProvider
 * JD-Core Version:    0.6.0
 */