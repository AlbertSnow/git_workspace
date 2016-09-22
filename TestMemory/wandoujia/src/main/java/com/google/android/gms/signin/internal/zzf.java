package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzq;

public abstract interface zzf extends IInterface
{
  public abstract void a(int paramInt);

  public abstract void a(int paramInt, Account paramAccount, zze paramzze);

  public abstract void a(AuthAccountRequest paramAuthAccountRequest, zze paramzze);

  public abstract void a(IAccountAccessor paramIAccountAccessor, int paramInt, boolean paramBoolean);

  public abstract void a(ResolveAccountRequest paramResolveAccountRequest, zzq paramzzq);

  public abstract void a(CheckServerAuthResult paramCheckServerAuthResult);

  public abstract void a(boolean paramBoolean);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.signin.internal.zzf
 * JD-Core Version:    0.6.0
 */