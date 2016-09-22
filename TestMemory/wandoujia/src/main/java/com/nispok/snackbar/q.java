package com.nispok.snackbar;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class q
{
  private static final Handler a;
  private static WeakReference<Snackbar> b;

  static
  {
    q.class.getSimpleName();
    a = new Handler(Looper.getMainLooper());
  }

  public static void a()
  {
    Snackbar localSnackbar = b();
    if (localSnackbar != null)
      a.post(new t(localSnackbar));
  }

  public static void a(Snackbar paramSnackbar)
  {
    try
    {
      Activity localActivity = (Activity)paramSnackbar.getContext();
      a.post(new r(paramSnackbar, localActivity));
      return;
    }
    catch (ClassCastException localClassCastException)
    {
    }
  }

  public static void a(Snackbar paramSnackbar, ViewGroup paramViewGroup)
  {
    boolean bool = Snackbar.b(paramSnackbar.getContext());
    a.post(new s(paramSnackbar, paramViewGroup, bool));
  }

  public static Snackbar b()
  {
    if (b != null)
      return (Snackbar)b.get();
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.q
 * JD-Core Version:    0.6.0
 */