package com.wandoujia.p4.app_launcher.manager;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.SurfaceHolder;
import android.widget.Toast;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.a;
import java.util.List;

public class m
{
  private Camera a;
  private PowerManager.WakeLock b;

  public static boolean d()
  {
    boolean bool = SystemUtil.aboveApiLevel(14);
    int i = 0;
    FeatureInfo[] arrayOfFeatureInfo;
    int j;
    if (bool)
    {
      PackageManager localPackageManager = GlobalConfig.getAppContext().getPackageManager();
      i = 0;
      if (localPackageManager != null)
      {
        arrayOfFeatureInfo = localPackageManager.getSystemAvailableFeatures();
        i = 0;
        if (arrayOfFeatureInfo != null)
          j = arrayOfFeatureInfo.length;
      }
    }
    for (int k = 0; ; k++)
    {
      i = 0;
      if (k < j)
      {
        FeatureInfo localFeatureInfo = arrayOfFeatureInfo[k];
        if ((localFeatureInfo == null) || (!"android.hardware.camera.flash".equals(localFeatureInfo.name)))
          continue;
        i = 1;
      }
      return i;
    }
  }

  public final void a()
  {
    this.b.release();
    if (this.a != null)
    {
      this.a.release();
      this.a = null;
    }
  }

  public final void a(SurfaceHolder paramSurfaceHolder)
  {
    if (this.a != null)
      return;
    this.b = ((PowerManager)GlobalConfig.getAppContext().getSystemService("power")).newWakeLock(1, m.class.getSimpleName());
    this.b.acquire();
    if (this.a == null);
    try
    {
      this.a = Camera.open();
      label53: if (this.a == null)
      {
        Toast.makeText(a.a(), 2131624280, 0).show();
        return;
      }
      try
      {
        this.a.setPreviewDisplay(paramSurfaceHolder);
        return;
      }
      catch (Exception localException)
      {
        return;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      break label53;
    }
  }

  public final boolean b()
  {
    if (this.a == null);
    while (true)
    {
      return false;
      try
      {
        Camera.Parameters localParameters = this.a.getParameters();
        List localList = localParameters.getSupportedFlashModes();
        if ((localList == null) || ((!localList.contains("torch")) && (!localList.contains("on"))))
          continue;
        localParameters.setFlashMode("torch");
        localParameters.setPreviewSize(640, 480);
        this.a.setParameters(localParameters);
        this.a.startPreview();
        return true;
      }
      catch (Exception localException)
      {
      }
    }
    return false;
  }

  public final void c()
  {
    if (this.a != null);
    try
    {
      Camera.Parameters localParameters = this.a.getParameters();
      localParameters.setFlashMode("off");
      this.a.setParameters(localParameters);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.manager.m
 * JD-Core Version:    0.6.0
 */