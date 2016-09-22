package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public final class zzb extends zzc.zza
{
  private Fragment a;

  private zzb(Fragment paramFragment)
  {
    this.a = paramFragment;
  }

  private static zzb a(Fragment paramFragment)
  {
    if (paramFragment != null)
      return new zzb(paramFragment);
    return null;
  }

  public final zzd a()
  {
    return zze.a(this.a.getActivity());
  }

  public final void a(Intent paramIntent)
  {
    this.a.startActivity(paramIntent);
  }

  public final void a(Intent paramIntent, int paramInt)
  {
    this.a.startActivityForResult(paramIntent, paramInt);
  }

  public final void a(zzd paramzzd)
  {
    View localView = (View)zze.a(paramzzd);
    this.a.registerForContextMenu(localView);
  }

  public final void a(boolean paramBoolean)
  {
    this.a.setHasOptionsMenu(paramBoolean);
  }

  public final Bundle b()
  {
    return this.a.getArguments();
  }

  public final void b(zzd paramzzd)
  {
    View localView = (View)zze.a(paramzzd);
    this.a.unregisterForContextMenu(localView);
  }

  public final void b(boolean paramBoolean)
  {
    this.a.setMenuVisibility(paramBoolean);
  }

  public final int c()
  {
    return this.a.getId();
  }

  public final void c(boolean paramBoolean)
  {
    this.a.setRetainInstance(paramBoolean);
  }

  public final zzc d()
  {
    return a(this.a.getParentFragment());
  }

  public final void d(boolean paramBoolean)
  {
    this.a.setUserVisibleHint(paramBoolean);
  }

  public final zzd e()
  {
    return zze.a(this.a.getResources());
  }

  public final boolean f()
  {
    return this.a.getRetainInstance();
  }

  public final String g()
  {
    return this.a.getTag();
  }

  public final zzc h()
  {
    return a(this.a.getTargetFragment());
  }

  public final int i()
  {
    return this.a.getTargetRequestCode();
  }

  public final boolean j()
  {
    return this.a.getUserVisibleHint();
  }

  public final zzd k()
  {
    return zze.a(this.a.getView());
  }

  public final boolean l()
  {
    return this.a.isAdded();
  }

  public final boolean m()
  {
    return this.a.isDetached();
  }

  public final boolean n()
  {
    return this.a.isHidden();
  }

  public final boolean o()
  {
    return this.a.isInLayout();
  }

  public final boolean p()
  {
    return this.a.isRemoving();
  }

  public final boolean q()
  {
    return this.a.isResumed();
  }

  public final boolean r()
  {
    return this.a.isVisible();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.dynamic.zzb
 * JD-Core Version:    0.6.0
 */