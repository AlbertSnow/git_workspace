package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;

public final class l
{
  static
  {
    Uri.parse("http://plus.google.com/").buildUpon().appendPath("circles").appendPath("find").build();
  }

  public static Intent a()
  {
    Intent localIntent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    localIntent.setPackage("com.google.android.wearable.app");
    return localIntent;
  }

  public static Intent a(String paramString)
  {
    Uri localUri = Uri.fromParts("package", paramString, null);
    Intent localIntent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(localUri);
    return localIntent;
  }

  public static Intent b(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("market://details").buildUpon().appendQueryParameter("id", paramString).build());
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    return localIntent;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.l
 * JD-Core Version:    0.6.0
 */