package android.support.v7.widget;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

final class au<K, V>
{
  public final K[] a;
  public final V[] b;
  private int[] c;

  private au(K[] paramArrayOfK, V[] paramArrayOfV)
  {
    this.c = a(paramArrayOfK);
    this.a = a(paramArrayOfK, this.c);
    this.b = a(paramArrayOfV, this.c);
  }

  private static <K> int[] a(K[] paramArrayOfK)
  {
    int i = paramArrayOfK.length;
    int[] arrayOfInt = new int[i];
    HashMap localHashMap = new HashMap();
    for (int j = 0; j < i; j++)
    {
      K ? = paramArrayOfK[j];
      Integer localInteger = (Integer)localHashMap.get(?);
      if (localInteger == null)
      {
        localInteger = Integer.valueOf(localHashMap.size());
        localHashMap.put(?, localInteger);
      }
      arrayOfInt[j] = localInteger.intValue();
    }
    return arrayOfInt;
  }

  private static <K> K[] a(K[] paramArrayOfK, int[] paramArrayOfInt)
  {
    int i = paramArrayOfK.length;
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfK.getClass().getComponentType(), 1 + GridLayout.a(paramArrayOfInt));
    for (int j = 0; j < i; j++)
      arrayOfObject[paramArrayOfInt[j]] = paramArrayOfK[j];
    return arrayOfObject;
  }

  public final V a(int paramInt)
  {
    return this.b[this.c[paramInt]];
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.au
 * JD-Core Version:    0.6.0
 */