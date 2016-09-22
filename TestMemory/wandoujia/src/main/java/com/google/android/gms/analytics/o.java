package com.google.android.gms.analytics;

import android.net.Uri;
import android.support.v4.app.d;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.ag;
import com.google.android.gms.analytics.internal.am;
import com.google.android.gms.analytics.internal.aw;
import com.google.android.gms.analytics.internal.b;
import com.google.android.gms.internal.af;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.y;
import java.util.List;
import java.util.ListIterator;

public class o extends y<o>
{
  private final com.google.android.gms.analytics.internal.w a;
  private boolean b;

  public o(com.google.android.gms.analytics.internal.w paramw)
  {
    super(paramw.g(), paramw.c());
    this.a = paramw;
  }

  protected final void a(com.google.android.gms.internal.w paramw)
  {
    f localf = (f)paramw.b(f.class);
    if (TextUtils.isEmpty(localf.b()))
      localf.b(this.a.o().b());
    if ((this.b) && (TextUtils.isEmpty(localf.d())))
    {
      b localb = this.a.n();
      localf.d(localb.c());
      localf.a(localb.b());
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final void b(String paramString)
  {
    d.i(paramString);
    Uri localUri = p.a(paramString);
    ListIterator localListIterator = h().listIterator();
    while (localListIterator.hasNext())
    {
      if (!localUri.equals(((af)localListIterator.next()).a()))
        continue;
      localListIterator.remove();
    }
    h().add(new p(this.a, paramString));
  }

  final com.google.android.gms.analytics.internal.w e()
  {
    return this.a;
  }

  public final com.google.android.gms.internal.w f()
  {
    com.google.android.gms.internal.w localw = g().a();
    localw.a(this.a.p().b());
    localw.a(this.a.q().b());
    i();
    return localw;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.o
 * JD-Core Version:    0.6.0
 */