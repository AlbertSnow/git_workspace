package com.unionpay.uppay;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.unionpay.mpay.utils.UPPayEngine;
import com.unionpay.mpay.views.j;
import com.unionpay.mpay.widgets.k;
import java.util.ArrayList;

public final class PayActivityEx extends Activity
  implements DialogInterface.OnDismissListener
{
  private static int e;
  private ArrayList<com.unionpay.mpay.views.b> a = null;
  private j b = null;
  private a c = null;
  private k d = null;

  static
  {
    System.loadLibrary("entryex");
    e = 0;
  }

  public final Object a(String paramString)
  {
    b localb;
    if (paramString == null)
      localb = this.c.a;
    boolean bool;
    do
    {
      return localb;
      if (paramString.equalsIgnoreCase(UPPayEngine.class.toString()))
        return this.c.b;
      bool = paramString.equalsIgnoreCase(k.class.toString());
      localb = null;
    }
    while (!bool);
    return this.d;
  }

  public final void a()
  {
    int i = this.a.size();
    if (i > 0)
    {
      this.a.remove(i - 1);
      if (this.a.size() != 0)
        setContentView((View)this.a.get(-1 + this.a.size()));
    }
  }

  public final void a(com.unionpay.mpay.views.b paramb)
  {
    this.a.add(paramb);
    setContentView(paramb);
  }

  public final void b()
  {
    for (int i = -1 + this.a.size(); ; i--)
    {
      if (i >= 0)
      {
        com.unionpay.mpay.views.b localb = (com.unionpay.mpay.views.b)this.a.get(i);
        if (localb.f() == 2)
          setContentView(localb);
      }
      else
      {
        return;
      }
      this.a.remove(i);
    }
  }

  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.b != null)
    {
      this.b.m();
      this.b = null;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }

  public final void onCreate(Bundle paramBundle)
  {
    com.unionpay.mpay.b.c.a();
    com.unionpay.mpay.a.a.a(this);
    this.a = new ArrayList(1);
    this.c = new a(this);
    this.d = new k(this, this);
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    this.b = new j(this);
    setContentView(this.b);
    e = 1 + e;
  }

  protected final void onDestroy()
  {
    this.a.clear();
    this.b = null;
    int i = -1 + e;
    e = i;
    if (i == 0)
      com.unionpay.mpay.c.c.a(this).a();
    if ((this.c != null) && (this.c.a != null) && (this.c.a.Z != null))
      this.c.a.Z.a();
    super.onDestroy();
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.a.size() > 0)
        ((com.unionpay.mpay.views.b)this.a.get(-1 + this.a.size())).c();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected final void onResume()
  {
    super.onResume();
    if (this.d.a())
      this.d.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.uppay.PayActivityEx
 * JD-Core Version:    0.6.0
 */