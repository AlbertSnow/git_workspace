package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

public final class b
{
  private String a;
  private CharSequence b;
  private CharSequence c;
  private CharSequence d;
  private Bitmap e;
  private Uri f;
  private Bundle g;

  public final MediaDescriptionCompat a()
  {
    return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, 0);
  }

  public final b a(Bitmap paramBitmap)
  {
    this.e = paramBitmap;
    return this;
  }

  public final b a(Uri paramUri)
  {
    this.f = paramUri;
    return this;
  }

  public final b a(Bundle paramBundle)
  {
    this.g = paramBundle;
    return this;
  }

  public final b a(CharSequence paramCharSequence)
  {
    this.b = paramCharSequence;
    return this;
  }

  public final b a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final b b(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
    return this;
  }

  public final b c(CharSequence paramCharSequence)
  {
    this.d = paramCharSequence;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.b
 * JD-Core Version:    0.6.0
 */