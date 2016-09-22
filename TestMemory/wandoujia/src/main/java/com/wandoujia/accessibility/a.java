package com.wandoujia.accessibility;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import com.wandoujia.accessibility.content_provider.AccessibilityContentProvider.Functions;
import com.wandoujia.accessibility.content_provider.AccessibilityContentProvider.Type;
import com.wandoujia.accessibility.content_provider.AutoInstall;
import com.wandoujia.accessibility.content_provider.AutoInstall.ColName;
import com.wandoujia.accessibility.content_provider.AutoInstall.Methods;
import com.wandoujia.accessibility.content_provider.AutoInstall.ParameterKey;
import com.wandoujia.accessibility.content_provider.Hibernation;
import com.wandoujia.accessibility.content_provider.Hibernation.ColName;
import com.wandoujia.accessibility.content_provider.Hibernation.Methods;
import com.wandoujia.accessibility.content_provider.Hibernation.ParameterKey;
import com.wandoujia.base.config.GlobalConfig;
import java.util.Set;

public final class a
{
  private static final ContentResolver a = GlobalConfig.getAppContext().getContentResolver();
  private static String b = "com.wandoujia.accessibility.contentprovider";
  private static Uri c = Uri.parse("content://" + b);

  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("wdj://hibernation_home"));
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  public static void a(String paramString)
  {
    b = paramString;
    c = Uri.parse("content://" + b);
  }

  public static void a(Set<String> paramSet)
  {
    Uri.Builder localBuilder = c.buildUpon().appendPath(AccessibilityContentProvider.Type.UPDATE.getTypeName()).appendPath(AccessibilityContentProvider.Functions.AUTO_INSTALL.getFunctionName()).appendQueryParameter("method", AutoInstall.Methods.UPDATE_LABEL.getMethodName()).appendQueryParameter(AutoInstall.ParameterKey.LABEL.name(), AutoInstall.createStringFromSet(paramSet));
    a.update(localBuilder.build(), new ContentValues(), null, null);
  }

  public static void a(Set<String> paramSet1, Set<String> paramSet2)
  {
    Uri.Builder localBuilder = c.buildUpon().appendPath(AccessibilityContentProvider.Type.UPDATE.getTypeName()).appendPath(AccessibilityContentProvider.Functions.HIBERNATION.getFunctionName()).appendQueryParameter("method", Hibernation.Methods.UPDATE_WHITE_LIST.getMethodName());
    if ((paramSet1 == null) && (paramSet2 == null))
      return;
    if (paramSet1 != null)
      localBuilder.appendQueryParameter(Hibernation.ParameterKey.USER_LIST.name(), Hibernation.createStringFromSet(paramSet1));
    if (paramSet2 != null)
      localBuilder.appendQueryParameter(Hibernation.ParameterKey.SYSTEM_LIST.name(), Hibernation.createStringFromSet(paramSet2));
    a.update(localBuilder.build(), new ContentValues(), null, null);
  }

  public static void a(boolean paramBoolean)
  {
    Uri.Builder localBuilder = c.buildUpon().appendPath(AccessibilityContentProvider.Type.UPDATE.getTypeName()).appendPath(AccessibilityContentProvider.Functions.AUTO_INSTALL.getFunctionName()).appendQueryParameter("method", AutoInstall.Methods.UPDATE_BLOCK.getMethodName()).appendQueryParameter(AutoInstall.ParameterKey.BLOCK.name(), String.valueOf(paramBoolean));
    a.update(localBuilder.build(), new ContentValues(), null, null);
  }

  public static boolean a()
  {
    Uri.Builder localBuilder = c.buildUpon().appendPath(AccessibilityContentProvider.Type.QUERY.getTypeName()).appendPath(AccessibilityContentProvider.Functions.HIBERNATION.getFunctionName()).appendQueryParameter("method", Hibernation.Methods.CHECK_BLOCK.getMethodName());
    Cursor localCursor = a.query(localBuilder.build(), null, null, null, null);
    if (localCursor == null)
      return false;
    int i = localCursor.getColumnIndex(Hibernation.ColName.BLOCK.name());
    int j;
    if (localCursor.moveToNext())
      if (localCursor.getInt(i) == 1)
        j = 1;
    while (true)
    {
      localCursor.close();
      return j;
      j = 0;
      continue;
      j = 0;
    }
  }

  public static void b(boolean paramBoolean)
  {
    Uri.Builder localBuilder = c.buildUpon().appendPath(AccessibilityContentProvider.Type.UPDATE.getTypeName()).appendPath(AccessibilityContentProvider.Functions.AUTO_INSTALL.getFunctionName()).appendQueryParameter("method", AutoInstall.Methods.SET_ENABLE.getMethodName()).appendQueryParameter(AutoInstall.ParameterKey.IS_ENABLE.name(), String.valueOf(paramBoolean));
    a.update(localBuilder.build(), new ContentValues(), null, null);
  }

  public static boolean b()
  {
    Uri.Builder localBuilder = c.buildUpon().appendPath(AccessibilityContentProvider.Type.QUERY.getTypeName()).appendPath(AccessibilityContentProvider.Functions.AUTO_INSTALL.getFunctionName()).appendQueryParameter("method", AutoInstall.Methods.FORCE_TURN_OFF.getMethodName());
    Cursor localCursor = a.query(localBuilder.build(), null, null, null, null);
    if (localCursor == null)
      return false;
    int i = localCursor.getColumnIndex(AutoInstall.ColName.FORCE_OFF.name());
    int j;
    if (localCursor.moveToNext())
      if (localCursor.getInt(i) == 1)
        j = 1;
    while (true)
    {
      localCursor.close();
      return j;
      j = 0;
      continue;
      j = 0;
    }
  }

  public static boolean c()
  {
    Uri.Builder localBuilder = c.buildUpon().appendPath(AccessibilityContentProvider.Type.QUERY.getTypeName()).appendPath(AccessibilityContentProvider.Functions.AUTO_INSTALL.getFunctionName()).appendQueryParameter("method", AutoInstall.Methods.IS_BLOCK.getMethodName());
    Cursor localCursor = a.query(localBuilder.build(), null, null, null, null);
    if (localCursor == null)
      return false;
    int i = localCursor.getColumnIndex(AutoInstall.ColName.BLOCK.name());
    int j;
    if (localCursor.moveToNext())
      if (localCursor.getInt(i) == 1)
        j = 1;
    while (true)
    {
      localCursor.close();
      return j;
      j = 0;
      continue;
      j = 0;
    }
  }

  public static boolean d()
  {
    Uri.Builder localBuilder = c.buildUpon().appendPath(AccessibilityContentProvider.Type.QUERY.getTypeName()).appendPath(AccessibilityContentProvider.Functions.AUTO_INSTALL.getFunctionName()).appendQueryParameter("method", AutoInstall.Methods.GET_STATE.getMethodName());
    Cursor localCursor = a.query(localBuilder.build(), null, null, null, null);
    if (localCursor == null)
      return false;
    int i = localCursor.getColumnIndex(AutoInstall.ColName.STATE.name());
    int j;
    if (localCursor.moveToNext())
      if (localCursor.getInt(i) == 1)
        j = 1;
    while (true)
    {
      localCursor.close();
      return j;
      j = 0;
      continue;
      j = 0;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.a
 * JD-Core Version:    0.6.0
 */