package com.wandoujia.jupiter.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.android.volley.AuthFailureError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.nispok.snackbar.Snackbar;
import com.nispok.snackbar.Snackbar.SnackbarDuration;
import com.nispok.snackbar.enums.SnackbarType;
import com.wandoujia.jupiter.homepage.splashwindow.k;

public final class p
{
  public static final int a = Snackbar.SnackbarDuration.LENGTH_LONG.getDuration();
  public static final int b = Snackbar.SnackbarDuration.LENGTH_SHORT.getDuration();
  private Snackbar c;

  static
  {
    Snackbar.SnackbarDuration.LENGTH_INDEFINITE.getDuration();
  }

  public static p a(Context paramContext)
  {
    p localp = new p();
    localp.c = Snackbar.a(paramContext).c(2131624233).a(new u(paramContext)).c().a(2131624210).b(2131362195).a(Snackbar.SnackbarDuration.LENGTH_INDEFINITE).a(SnackbarType.MULTI_LINE);
    return localp;
  }

  public static p a(Context paramContext, int paramInt, long paramLong)
  {
    p localp = new p();
    localp.c = Snackbar.a(paramContext).a(paramInt).a(paramLong);
    return localp;
  }

  public static p a(Context paramContext, com.nispok.snackbar.a.a parama)
  {
    p localp = new p();
    localp.c = Snackbar.a(paramContext).c(2131624364).a(new s(parama)).a(Snackbar.SnackbarDuration.LENGTH_INDEFINITE);
    return localp;
  }

  public static p a(Context paramContext, com.nispok.snackbar.a.a parama1, com.nispok.snackbar.a.a parama2)
  {
    p localp = new p();
    localp.c = Snackbar.a(paramContext).c(2131624960).a(new r(parama1)).a().b(new q(parama2)).a(2131625547).b(2131361989).a(Snackbar.SnackbarDuration.LENGTH_INDEFINITE);
    return localp;
  }

  public static p a(Context paramContext, com.nispok.snackbar.a.a parama, String paramString)
  {
    p localp = new p();
    localp.c = Snackbar.a(paramContext).b().a(new t(parama)).a(paramString).b(2131362195).a(Snackbar.SnackbarDuration.LENGTH_INDEFINITE);
    return localp;
  }

  public static p a(Context paramContext, com.wandoujia.nirvana.framework.network.page.a parama, Exception paramException)
  {
    int i;
    if ((paramException instanceof NoConnectionError))
      i = 2131625175;
    while (true)
    {
      p localp = new p();
      localp.c = Snackbar.a(paramContext).b().a(new v(parama)).a(i).b(2131362195).a(Snackbar.SnackbarDuration.LENGTH_INDEFINITE);
      return localp;
      if ((paramException instanceof ParseError))
      {
        i = 2131625364;
        continue;
      }
      if ((paramException instanceof AuthFailureError))
      {
        i = 2131625174;
        continue;
      }
      i = 2131625176;
    }
  }

  public static p a(Context paramContext, CharSequence paramCharSequence, long paramLong)
  {
    p localp = new p();
    localp.c = Snackbar.a(paramContext).a(paramCharSequence).a(paramLong);
    return localp;
  }

  public static p a(Context paramContext, Exception paramException, long paramLong)
  {
    int i;
    if ((paramException instanceof NoConnectionError))
      i = 2131625175;
    while (true)
    {
      p localp = new p();
      localp.c = Snackbar.a(paramContext).a(i).b(2131362195).a(paramLong);
      return localp;
      if ((paramException instanceof ParseError))
      {
        i = 2131625364;
        continue;
      }
      if ((paramException instanceof AuthFailureError))
      {
        i = 2131625174;
        continue;
      }
      i = 2131625176;
    }
  }

  public static p a(Context paramContext, String paramString, long paramLong)
  {
    p localp = new p();
    localp.c = Snackbar.a(paramContext).a(paramString).a(paramLong);
    return localp;
  }

  public final void a()
  {
    if (k.l())
      new Handler(Looper.getMainLooper()).postDelayed(new w(this), 500L);
    do
      return;
    while (this.c == null);
    com.nispok.snackbar.q.a(this.c);
  }

  public final void a(ViewGroup paramViewGroup)
  {
    if (this.c != null)
      com.nispok.snackbar.q.a(this.c, paramViewGroup);
  }

  public final void b()
  {
    if (this.c != null)
      this.c.g();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.view.p
 * JD-Core Version:    0.6.0
 */