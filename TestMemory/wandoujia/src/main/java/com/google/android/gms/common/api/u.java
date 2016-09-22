package com.google.android.gms.common.api;

import android.content.Context;
import android.support.v4.content.f;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class u extends f<ConnectionResult>
  implements d, e
{
  public final c a;
  private boolean b;
  private ConnectionResult c;

  public u(Context paramContext, c paramc)
  {
    super(paramContext);
    this.a = paramc;
  }

  private void b(ConnectionResult paramConnectionResult)
  {
    this.c = paramConnectionResult;
    if ((b()) && (!c()))
      a(paramConnectionResult);
  }

  public final void a(ConnectionResult paramConnectionResult)
  {
    this.b = true;
    b(paramConnectionResult);
  }

  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    this.a.a(paramString, paramPrintWriter);
  }

  protected final void e()
  {
    super.e();
    this.a.a(this);
    this.a.a(this);
    if (this.c != null)
      a(this.c);
    if ((!this.a.i()) && (!this.a.j()) && (!this.b))
      this.a.c();
  }

  protected final void g()
  {
    this.a.d();
  }

  protected final void j()
  {
    this.c = null;
    this.b = false;
    this.a.b(this);
    this.a.b(this);
    this.a.d();
  }

  public final boolean k()
  {
    return this.b;
  }

  public final void o()
  {
    this.b = false;
    b(ConnectionResult.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.u
 * JD-Core Version:    0.6.0
 */