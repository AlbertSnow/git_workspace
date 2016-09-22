package com.tencent.mm.sdk.openapi;

import android.os.Bundle;
import android.support.v4.app.b;

public final class j extends a
{
  private WXMediaMessage b;

  public j()
  {
  }

  public j(Bundle paramBundle)
  {
    b(paramBundle);
  }

  public final int a()
  {
    return 4;
  }

  public final void a(Bundle paramBundle)
  {
    Bundle localBundle = b.a(this.b);
    super.a(localBundle);
    paramBundle.putAll(localBundle);
  }

  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    this.b = b.a(paramBundle);
  }

  final boolean b()
  {
    if (this.b == null)
      return false;
    return this.b.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.mm.sdk.openapi.j
 * JD-Core Version:    0.6.0
 */