package android.support.v4.media.session;

public final class MediaSessionCompat<T>
  implements MediaSessionCompat<T>
{
  private final Object[] a = new Object[30];
  private int b;

  public final T a()
  {
    if (this.b > 0)
    {
      int i = -1 + this.b;
      Object localObject = this.a[i];
      this.a[i] = null;
      this.b = (-1 + this.b);
      return localObject;
    }
    return null;
  }

  public final boolean a(T paramT)
  {
    int i = 0;
    if (i < this.b)
      if (this.a[i] != paramT);
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
        break label47;
      throw new IllegalStateException("Already in the pool!");
      i++;
      break;
    }
    label47: int k = this.b;
    int m = 0;
    if (k < 30)
    {
      this.a[this.b] = paramT;
      this.b = (1 + this.b);
      m = 1;
    }
    return m;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat
 * JD-Core Version:    0.6.0
 */