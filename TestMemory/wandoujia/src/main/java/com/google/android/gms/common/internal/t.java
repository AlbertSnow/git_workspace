package com.google.android.gms.common.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

public final class t extends zzg<zzr>
{
  private static final t a = new t();

  private t()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }

  public static View a(Context paramContext, int paramInt1, int paramInt2)
  {
    return a.b(paramContext, paramInt1, paramInt2);
  }

  private View b(Context paramContext, int paramInt1, int paramInt2)
  {
    try
    {
      zzd localzzd = zze.a(paramContext);
      View localView = (View)zze.a(((zzr)a(paramContext)).a(localzzd, paramInt1, paramInt2));
      return localView;
    }
    catch (Exception localException)
    {
    }
    throw new zzg.zza("Could not get button with size " + paramInt1 + " and color " + paramInt2, localException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.internal.t
 * JD-Core Version:    0.6.0
 */