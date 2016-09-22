package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      super.onCreate(paramBundle);
      q.d();
      Uri localUri = getIntent().getData();
      if (!i.a(this).a(localUri))
      {
        String str = "Cannot preview the app with the uri: " + localUri + ". Launching current version instead.";
        q.c();
        AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
        localAlertDialog.setTitle("Preview failure");
        localAlertDialog.setMessage(str);
        localAlertDialog.setButton(-1, "Continue", new h());
        localAlertDialog.show();
      }
      Intent localIntent = getPackageManager().getLaunchIntentForPackage(getPackageName());
      if (localIntent != null)
      {
        new StringBuilder("Invoke the launch activity for package name: ").append(getPackageName());
        q.d();
        startActivity(localIntent);
        return;
      }
      new StringBuilder("No launch activity found for package name: ").append(getPackageName());
      q.d();
      return;
    }
    catch (Exception localException)
    {
      new StringBuilder("Calling preview threw an exception: ").append(localException.getMessage());
      q.a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.PreviewActivity
 * JD-Core Version:    0.6.0
 */