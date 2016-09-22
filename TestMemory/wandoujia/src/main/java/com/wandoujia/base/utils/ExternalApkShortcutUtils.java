package com.wandoujia.base.utils;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import java.util.Iterator;
import java.util.List;

public class ExternalApkShortcutUtils
{
  private static final int DEFAULT_ICON_SIZE = 144;

  private static Bitmap drawableToBitmap(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof BitmapDrawable))
    {
      BitmapDrawable localBitmapDrawable = (BitmapDrawable)paramDrawable;
      if (localBitmapDrawable.getBitmap() != null)
        return scaleBitmap(localBitmapDrawable.getBitmap());
    }
    if ((paramDrawable.getIntrinsicWidth() <= 0) || (paramDrawable.getIntrinsicHeight() <= 0));
    for (Bitmap localBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888); ; localBitmap = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888))
    {
      Canvas localCanvas = new Canvas(localBitmap);
      paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
      paramDrawable.draw(localCanvas);
      return scaleBitmap(localBitmap);
    }
  }

  @TargetApi(11)
  private static int getLauncherIconSize()
  {
    return ((ActivityManager)GlobalConfig.getAppContext().getSystemService("activity")).getLauncherLargeIconSize();
  }

  public static void installShortcut(Context paramContext, String paramString)
  {
    installShortcut(paramContext, paramString, false);
  }

  public static void installShortcut(Context paramContext, String paramString, boolean paramBoolean)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      Intent localIntent = new Intent();
      localIntent.setAction("android.intent.action.MAIN");
      localIntent.addCategory("android.intent.category.LAUNCHER");
      Iterator localIterator = localPackageManager.queryIntentActivities(localIntent, 64).iterator();
      while (localIterator.hasNext())
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
        if ((localResolveInfo == null) || (localResolveInfo.activityInfo == null) || (!localResolveInfo.activityInfo.enabled) || (!localResolveInfo.activityInfo.applicationInfo.enabled) || (!TextUtils.equals(localResolveInfo.activityInfo.packageName, paramString)))
          continue;
        ActivityInfo localActivityInfo = localResolveInfo.activityInfo;
        String str = localActivityInfo.packageName;
        sendShortcut(paramContext, localActivityInfo.packageName, localActivityInfo.name, localPackageManager.getApplicationLabel(localActivityInfo.applicationInfo).toString(), localPackageManager.getApplicationIcon(str), paramBoolean);
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
  }

  private static Bitmap scaleBitmap(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 11);
    for (int i = getLauncherIconSize(); (paramBitmap.getWidth() == i) && (paramBitmap.getHeight() == i); i = 144)
      return paramBitmap;
    float f = Math.min(1.0F * i / paramBitmap.getWidth(), 1.0F * i / paramBitmap.getHeight());
    return Bitmap.createScaledBitmap(paramBitmap, Math.round(f * paramBitmap.getWidth()), Math.round(f * paramBitmap.getHeight()), true);
  }

  private static void sendShortcut(Context paramContext, String paramString1, String paramString2, String paramString3, Drawable paramDrawable, boolean paramBoolean)
  {
    Intent localIntent1 = new Intent("android.intent.action.VIEW");
    localIntent1.setClassName(paramString1, paramString2);
    Intent localIntent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    localIntent2.putExtra("duplicate", paramBoolean);
    localIntent2.putExtra("android.intent.extra.shortcut.NAME", paramString3);
    localIntent2.putExtra("android.intent.extra.shortcut.ICON", drawableToBitmap(paramDrawable));
    localIntent2.putExtra("android.intent.extra.shortcut.INTENT", localIntent1);
    paramContext.sendBroadcast(localIntent2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ExternalApkShortcutUtils
 * JD-Core Version:    0.6.0
 */