package com.google.zxing.oned;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.b;
import com.google.zxing.common.a;
import com.google.zxing.d;
import com.google.zxing.e;
import com.google.zxing.f;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public abstract class k
  implements d
{
  protected static float a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, float paramFloat)
  {
    int i = paramArrayOfInt1.length;
    int j = 0;
    int k = 0;
    int m = 0;
    while (j < i)
    {
      m += paramArrayOfInt1[j];
      k += paramArrayOfInt2[j];
      j++;
    }
    if (m < k);
    float f3;
    label142: 
    while (true)
    {
      return (1.0F / 1.0F);
      float f1 = m / k;
      float f2 = paramFloat * f1;
      f3 = 0.0F;
      int n = 0;
      if (n >= i)
        break;
      int i1 = paramArrayOfInt1[n];
      float f4 = f1 * paramArrayOfInt2[n];
      float f5;
      if (i1 > f4)
        f5 = i1 - f4;
      while (true)
      {
        if (f5 > f2)
          break label142;
        f3 += f5;
        n++;
        break;
        f5 = f4 - i1;
      }
    }
    return f3 / m;
  }

  protected static void a(a parama, int paramInt, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    Arrays.fill(paramArrayOfInt, 0, i, 0);
    int j = parama.a();
    if (paramInt >= j)
      throw NotFoundException.getNotFoundInstance();
    int k;
    if (!parama.a(paramInt))
      k = 1;
    int n;
    while (true)
    {
      int m = k;
      n = 0;
      int i4;
      while (true)
      {
        if (paramInt >= j)
          break label137;
        if ((m ^ parama.a(paramInt)) != 0)
        {
          paramArrayOfInt[n] = (1 + paramArrayOfInt[n]);
          i4 = m;
          paramInt++;
          m = i4;
          continue;
          k = 0;
          break;
        }
      }
      i1 = n + 1;
      if (i1 == i)
        break label141;
      paramArrayOfInt[i1] = 1;
      if (m == 0);
      for (int i2 = 1; ; i2 = 0)
      {
        int i3 = i1;
        i4 = i2;
        n = i3;
        break;
      }
    }
    label137: int i1 = n;
    label141: if ((i1 != i) && ((i1 != i - 1) || (paramInt != j)))
      throw NotFoundException.getNotFoundInstance();
  }

  private e b(b paramb, Map<DecodeHintType, ?> paramMap)
  {
    int i = paramb.a();
    int j = paramb.b();
    a locala1 = new a(i);
    int k = j >> 1;
    int m;
    int n;
    label55: int i2;
    label75: int i3;
    Object localObject1;
    Object localObject2;
    label85: int i4;
    int i5;
    label110: int i6;
    if ((paramMap != null) && (paramMap.containsKey(DecodeHintType.TRY_HARDER)))
    {
      m = 1;
      if (m == 0)
        break label333;
      n = 8;
      int i1 = Math.max(1, j >> n);
      if (m == 0)
        break label339;
      i2 = j;
      i3 = 0;
      localObject1 = locala1;
      localObject2 = paramMap;
      if (i3 >= i2)
        break label380;
      i4 = (i3 + 1) / 2;
      if ((i3 & 0x1) != 0)
        break label346;
      i5 = 1;
      if (i5 == 0)
        break label352;
      i6 = k + i4 * i1;
      if ((i6 < 0) || (i6 >= j))
        break label380;
    }
    while (true)
    {
      try
      {
        while (true)
        {
          a locala2 = paramb.a(i6, (a)localObject1);
          localObject1 = locala2;
          int i7 = 0;
          if (i7 >= 2)
            break label374;
          if (i7 != 1)
            break label384;
          ((a)localObject1).d();
          if ((localObject2 == null) || (!((Map)localObject2).containsKey(DecodeHintType.NEED_RESULT_POINT_CALLBACK)))
            break label384;
          localObject3 = new EnumMap(DecodeHintType.class);
          ((Map)localObject3).putAll((Map)localObject2);
          ((Map)localObject3).remove(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
          try
          {
            e locale = a(i6, (a)localObject1, (Map)localObject3);
            if (i7 == 1)
            {
              locale.a(ResultMetadataType.ORIENTATION, Integer.valueOf(180));
              f[] arrayOff = locale.c();
              if (arrayOff != null)
              {
                arrayOff[0] = new f(i - arrayOff[0].a() - 1.0F, arrayOff[0].b());
                arrayOff[1] = new f(i - arrayOff[1].a() - 1.0F, arrayOff[1].b());
              }
            }
            return locale;
            m = 0;
            break;
            label333: n = 5;
            break label55;
            label339: i2 = 15;
            break label75;
            label346: i5 = 0;
            break label110;
            label352: i4 = -i4;
          }
          catch (ReaderException localReaderException)
          {
            i7++;
            localObject2 = localObject3;
          }
        }
        continue;
      }
      catch (NotFoundException localNotFoundException)
      {
        label374: i3++;
      }
      break label85;
      label380: throw NotFoundException.getNotFoundInstance();
      label384: Object localObject3 = localObject2;
    }
  }

  protected static void b(a parama, int paramInt, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    boolean bool = parama.a(paramInt);
    while ((paramInt > 0) && (i >= 0))
    {
      paramInt--;
      if (parama.a(paramInt) == bool)
        continue;
      i--;
      if (!bool)
      {
        bool = true;
        continue;
      }
      bool = false;
    }
    if (i >= 0)
      throw NotFoundException.getNotFoundInstance();
    a(parama, paramInt + 1, paramArrayOfInt);
  }

  public abstract e a(int paramInt, a parama, Map<DecodeHintType, ?> paramMap);

  public e a(b paramb, Map<DecodeHintType, ?> paramMap)
  {
    try
    {
      e locale = b(paramb, paramMap);
      return locale;
    }
    catch (NotFoundException localNotFoundException)
    {
      if (paramMap != null)
        paramMap.containsKey(DecodeHintType.TRY_HARDER);
    }
    throw localNotFoundException;
  }

  public void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.k
 * JD-Core Version:    0.6.0
 */