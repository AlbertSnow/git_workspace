package android.support.v4.view;

import android.view.KeyEvent;

class t
{
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    int j;
    int k;
    if ((paramInt2 & 0x1) != 0)
    {
      j = i;
      k = paramInt3 | paramInt4;
      if ((k & 0x1) == 0)
        break label51;
    }
    while (true)
    {
      if (j == 0)
        break label66;
      if (i == 0)
        break label57;
      throw new IllegalArgumentException("bad arguments");
      j = 0;
      break;
      label51: i = 0;
    }
    label57: paramInt1 &= (k ^ 0xFFFFFFFF);
    label66: 
    do
      return paramInt1;
    while (i == 0);
    return paramInt1 & (paramInt2 ^ 0xFFFFFFFF);
  }

  public int a(int paramInt)
  {
    if ((paramInt & 0xC0) != 0);
    for (int i = paramInt | 0x1; ; i = paramInt)
    {
      if ((i & 0x30) != 0)
        i |= 2;
      return i & 0xF7;
    }
  }

  public void a(KeyEvent paramKeyEvent)
  {
  }

  public boolean b(int paramInt)
  {
    return a(a(0xF7 & a(paramInt), 1, 64, 128), 2, 16, 32) == 1;
  }

  public boolean c(int paramInt)
  {
    return (0xF7 & a(paramInt)) == 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.t
 * JD-Core Version:    0.6.0
 */