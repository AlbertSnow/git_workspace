package com.wandoujia.base.utils;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.wandoujia.base.config.GlobalConfig;
import java.util.Timer;
import java.util.TimerTask;

public class AutoReleaseWifiLock
{
  private static final long DEFAULT_TIMEOUT = 600000L;
  private static final String WAKE_LOCK_TAG = "lock.power";
  private static final String WIFI_LOCK_TAG = "lock.wifi";
  private Context context = GlobalConfig.getAppContext();
  private long timeout;
  private TimerTask timeoutTask;
  private Timer timer;
  private PowerManager.WakeLock wakeLock;
  private WifiManager.WifiLock wifiLock;

  public AutoReleaseWifiLock()
  {
    this(600000L);
  }

  public AutoReleaseWifiLock(long paramLong)
  {
    this.timeout = paramLong;
  }

  private void acquireWakeLock()
  {
    this.wakeLock = ((PowerManager)this.context.getSystemService("power")).newWakeLock(1, "lock.power");
    if (this.wakeLock == null)
      return;
    this.wakeLock.setReferenceCounted(true);
    this.wakeLock.acquire();
  }

  private void acquireWifiLock()
  {
    this.wifiLock = ((WifiManager)this.context.getSystemService("wifi")).createWifiLock(3, "lock.wifi");
    if (this.wifiLock == null)
      return;
    this.wifiLock.setReferenceCounted(true);
    this.wifiLock.acquire();
  }

  private boolean isLocked()
  {
    return (this.wakeLock != null) && (this.wakeLock.isHeld()) && (this.wifiLock != null) && (this.wifiLock.isHeld());
  }

  private void releaseWakeLock()
  {
    if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
    {
      this.wakeLock.release();
      this.wakeLock = null;
      return;
    }
    this.wakeLock = null;
  }

  private void releaseWifiLock()
  {
    if ((this.wifiLock != null) && (this.wifiLock.isHeld()))
    {
      this.wifiLock.release();
      this.wifiLock = null;
      return;
    }
    this.wifiLock = null;
  }

  private void scheduleTimeout()
  {
    if (this.timer == null)
      this.timer = new Timer();
    if (this.timeoutTask != null)
    {
      this.timeoutTask.cancel();
      this.timer.purge();
    }
    this.timeoutTask = new a(this);
    try
    {
      this.timer.schedule(this.timeoutTask, this.timeout);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void acquire()
  {
    monitorenter;
    try
    {
      if (!isLocked())
      {
        release();
        acquireWakeLock();
        acquireWifiLock();
      }
      scheduleTimeout();
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void release()
  {
    monitorenter;
    try
    {
      releaseWifiLock();
      releaseWakeLock();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.AutoReleaseWifiLock
 * JD-Core Version:    0.6.0
 */