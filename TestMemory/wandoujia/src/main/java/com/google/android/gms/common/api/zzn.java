package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.ak;
import android.support.v4.app.al;
import android.support.v4.content.f;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;

public class zzn extends Fragment
  implements DialogInterface.OnCancelListener, al<ConnectionResult>
{
  private boolean a;
  private int b = -1;
  private ConnectionResult c;
  private final Handler d = new Handler(Looper.getMainLooper());
  private final SparseArray<a> e = new SparseArray();

  private void a()
  {
    int i = 0;
    this.a = false;
    this.b = -1;
    this.c = null;
    ak localak = getLoaderManager();
    while (i < this.e.size())
    {
      int j = this.e.keyAt(i);
      u localu = b(j);
      if ((localu != null) && (localu.k()))
      {
        localak.a(j);
        localak.a(j, this);
      }
      i++;
    }
  }

  private void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    a locala = (a)this.e.get(paramInt);
    if (locala != null)
    {
      this.e.remove(paramInt);
      getLoaderManager().a(paramInt);
      e locale = locala.i;
      if (locale != null)
        locale.a(paramConnectionResult);
    }
    a();
  }

  private u b(int paramInt)
  {
    try
    {
      u localu = (u)getLoaderManager().b(paramInt);
      return localu;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", localClassCastException);
  }

  public final f<ConnectionResult> a(int paramInt)
  {
    return new u(getActivity(), ((a)this.e.get(paramInt)).h);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    switch (paramInt1)
    {
    default:
      i = 0;
    case 2:
    case 1:
    }
    while (true)
    {
      if (i == 0)
        break label62;
      a();
      return;
      if (com.google.android.gms.common.a.a(getActivity()) != 0)
        break;
      continue;
      if (paramInt2 != -1)
        break;
    }
    label62: a(this.b, this.c);
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    int i = 0;
    if (i < this.e.size())
    {
      int j = this.e.keyAt(i);
      u localu = b(j);
      if ((localu != null) && (((a)this.e.valueAt(i)).h != localu.a))
        getLoaderManager().b(j, this);
      while (true)
      {
        i++;
        break;
        getLoaderManager().a(j, this);
      }
    }
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    a(this.b, new ConnectionResult(13, null));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.a = paramBundle.getBoolean("resolving_error", false);
      this.b = paramBundle.getInt("failed_client_id", -1);
      if (this.b >= 0)
        this.c = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("resolving_error", this.a);
    if (this.b >= 0)
    {
      paramBundle.putInt("failed_client_id", this.b);
      paramBundle.putInt("failed_status", this.c.c());
      paramBundle.putParcelable("failed_resolution", this.c.d());
    }
  }

  public void onStart()
  {
    super.onStart();
    if (!this.a)
      for (int i = 0; i < this.e.size(); i++)
        getLoaderManager().a(this.e.keyAt(i), this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.zzn
 * JD-Core Version:    0.6.0
 */