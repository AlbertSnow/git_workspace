package com.wandoujia.base.services;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import com.wandoujia.base.config.GlobalConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AlarmService extends Service
{
  private static final String ALARM_ACTION = "ALARM_ACTION";
  private static final int CHECK_COMPLETED = 1000;
  private static final int DEFAULT_CHECK_INTERVAL = 10000;
  private static final long DEFAULT_DURATION = 0L;
  private static final int DEFAULT_TIMEOUT_MILL_SECONDS = 600000;
  private static final int NONE_CHECKER = 0;
  private static final int ONE_MINUTE_DELAY = 60000;
  private static final String TAG = "AlarmService";
  private static List<AlarmService.ScheduleChecker> checkerList;
  private String action;
  private int checkNum;
  private Thread checkThread;
  private CountDownTimer countDownTimer;
  private boolean finished = false;
  private final Handler handler = new a(this);

  static
  {
    long l;
    if (GlobalConfig.isInternalPackage())
      l = 60000L;
    while (true)
    {
      DEFAULT_DURATION = l;
      return;
      l = 3600000L;
    }
  }

  private void handleChecker()
  {
    c localc = new c(this);
    Iterator localIterator = checkerList.iterator();
    while (localIterator.hasNext())
      ((AlarmService.ScheduleChecker)localIterator.next()).scheduleCheck(this, localc);
  }

  private void handleIntent(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      stopSelf();
      return;
    }
    this.action = paramIntent.getAction();
    if (TextUtils.isEmpty(this.action))
    {
      stopSelf();
      return;
    }
    new StringBuilder("start alarm service from action ").append(this.action);
    if ((this.countDownTimer != null) || (this.checkThread != null))
    {
      new StringBuilder("service is running now by action from ").append(this.action);
      return;
    }
    this.checkNum = checkerList.size();
    this.checkThread = new d(this);
    this.checkThread.start();
    this.countDownTimer = new b(this);
    this.countDownTimer.start();
  }

  private static boolean hasAlarmService(Context paramContext, Class paramClass)
  {
    try
    {
      Intent localIntent = new Intent(paramContext, paramClass);
      localIntent.setAction("ALARM_ACTION");
      PendingIntent localPendingIntent = PendingIntent.getService(paramContext, 0, localIntent, 536870912);
      int i = 0;
      if (localPendingIntent != null)
        i = 1;
      return i;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public static void scheduleAlarm(Context paramContext, String paramString, Class<? extends AlarmService> paramClass)
  {
    if (paramContext == null);
    do
      return;
    while (hasAlarmService(paramContext, paramClass));
    startAlarmService(paramContext, 60000L, paramString, paramClass);
  }

  public static void scheduleAlarmAtOnce(Context paramContext, String paramString, Class<? extends AlarmService> paramClass)
  {
    if (paramContext == null)
      return;
    startAlarmService(paramContext, 100L, paramString, paramClass);
  }

  private void scheduleNextAlarm()
  {
    startAlarmService(this, DEFAULT_DURATION, "ALARM_ACTION", getClass());
  }

  private static void startAlarmService(Context paramContext, long paramLong, String paramString, Class<? extends AlarmService> paramClass)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    Intent localIntent = new Intent(paramContext, paramClass);
    localIntent.setAction(paramString);
    PendingIntent localPendingIntent = PendingIntent.getService(paramContext, 0, localIntent, 134217728);
    localAlarmManager.set(2, paramLong + SystemClock.elapsedRealtime(), localPendingIntent);
  }

  protected abstract List<AlarmService.ScheduleChecker> initCheckerList();

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    List localList = initCheckerList();
    checkerList = localList;
    if (localList == null)
      checkerList = new ArrayList();
  }

  public void onDestroy()
  {
    if (!hasAlarmService(this, getClass()))
      scheduleNextAlarm();
    if (this.countDownTimer != null)
      this.countDownTimer = null;
    if ((this.checkThread != null) && (this.checkThread.isAlive()))
      this.checkThread.interrupt();
    this.checkThread = null;
    super.onDestroy();
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    scheduleNextAlarm();
    handleIntent(paramIntent);
    return 1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.services.AlarmService
 * JD-Core Version:    0.6.0
 */