package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.p;
import java.util.Arrays;

final class e
{
  private Uri a;

  public e(Uri paramUri)
  {
    this.a = paramUri;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof e))
      return false;
    if (this == paramObject)
      return true;
    return p.a(((e)paramObject).a, this.a);
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return Arrays.hashCode(arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.images.e
 * JD-Core Version:    0.6.0
 */