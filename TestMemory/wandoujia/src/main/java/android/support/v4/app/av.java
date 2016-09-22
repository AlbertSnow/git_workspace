package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

public final class av extends bi
{
  private final Bundle a;
  private int b = 0;
  private CharSequence c;
  private PendingIntent d;

  static
  {
    new bj();
  }

  public av(CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(paramCharSequence, paramPendingIntent, new Bundle());
  }

  private av(CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle)
  {
    this.c = aw.d(paramCharSequence);
    this.d = paramPendingIntent;
    this.a = paramBundle;
  }

  public final int a()
  {
    return 0;
  }

  public final CharSequence b()
  {
    return this.c;
  }

  public final PendingIntent c()
  {
    return this.d;
  }

  public final Bundle d()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.av
 * JD-Core Version:    0.6.0
 */