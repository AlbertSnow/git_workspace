package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzm extends Fragment
  implements DialogInterface.OnCancelListener
{
  private boolean a;
  private boolean b;
  private int c = -1;
  private ConnectionResult d;
  private final Handler e = new Handler(Looper.getMainLooper());
  private final SparseArray<s> f = new SparseArray();

  private void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    s locals1 = (s)this.f.get(paramInt);
    if (locals1 != null)
    {
      s locals2 = (s)this.f.get(paramInt);
      this.f.remove(paramInt);
      if (locals2 != null)
      {
        locals2.b.b(locals2);
        locals2.b.d();
      }
      e locale = locals1.c;
      if (locale != null)
        locale.a(paramConnectionResult);
    }
    b();
  }

  private void b()
  {
    this.b = false;
    this.c = -1;
    this.d = null;
    for (int i = 0; i < this.f.size(); i++)
      ((s)this.f.valueAt(i)).b.c();
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    for (int i = 0; i < this.f.size(); i++)
    {
      s locals = (s)this.f.valueAt(i);
      paramPrintWriter.append(paramString).append("GoogleApiClient #").print(locals.a);
      paramPrintWriter.println(":");
      locals.b.a(paramString + "  ", paramPrintWriter);
    }
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
      b();
      return;
      if (a.a(getActivity()) != 0)
        break;
      continue;
      if (paramInt2 != -1)
        break;
    }
    label62: a(this.c, this.d);
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    a(this.c, new ConnectionResult(13, null));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.b = paramBundle.getBoolean("resolving_error", false);
      this.c = paramBundle.getInt("failed_client_id", -1);
      if (this.c >= 0)
        this.d = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("resolving_error", this.b);
    if (this.c >= 0)
    {
      paramBundle.putInt("failed_client_id", this.c);
      paramBundle.putInt("failed_status", this.d.c());
      paramBundle.putParcelable("failed_resolution", this.d.d());
    }
  }

  public void onStart()
  {
    super.onStart();
    this.a = true;
    if (!this.b)
      for (int i = 0; i < this.f.size(); i++)
        ((s)this.f.valueAt(i)).b.c();
  }

  public void onStop()
  {
    super.onStop();
    this.a = false;
    for (int i = 0; i < this.f.size(); i++)
      ((s)this.f.valueAt(i)).b.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.zzm
 * JD-Core Version:    0.6.0
 */