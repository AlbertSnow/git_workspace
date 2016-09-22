package android.support.v4.e;

import java.io.Writer;

public final class d extends Writer
{
  private StringBuilder a = new StringBuilder(128);

  private void a()
  {
    if (this.a.length() > 0)
      this.a.delete(0, this.a.length());
  }

  public final void close()
  {
    a();
  }

  public final void flush()
  {
    a();
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n')
        a();
      while (true)
      {
        i++;
        break;
        this.a.append(c);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.e.d
 * JD-Core Version:    0.6.0
 */