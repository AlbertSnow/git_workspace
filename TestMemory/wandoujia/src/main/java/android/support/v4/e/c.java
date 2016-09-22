package android.support.v4.e;

final class c
{
  static final int[] a = new int[0];
  static final Object[] b = new Object[0];

  public static int a(int paramInt)
  {
    int i = paramInt * 4;
    for (int j = 4; ; j++)
    {
      if (j < 32)
      {
        if (i > -12 + (1 << j))
          continue;
        i = -12 + (1 << j);
      }
      return i / 4;
    }
  }

  static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramInt1 - 1;
    int j = 0;
    int k;
    while (true)
      if (j <= i)
      {
        k = j + i >>> 1;
        int m = paramArrayOfInt[k];
        if (m < paramInt2)
        {
          j = k + 1;
          continue;
        }
        if (m <= paramInt2)
          break;
        i = k - 1;
        continue;
      }
      else
      {
        k = j ^ 0xFFFFFFFF;
      }
    return k;
  }

  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.e.c
 * JD-Core Version:    0.6.0
 */