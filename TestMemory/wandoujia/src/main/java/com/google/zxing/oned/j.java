package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.a;
import com.google.zxing.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class j extends k
{
  private final p[] a;

  public j(Map<DecodeHintType, ?> paramMap)
  {
    Collection localCollection;
    ArrayList localArrayList;
    if (paramMap == null)
    {
      localCollection = null;
      localArrayList = new ArrayList();
      if (localCollection != null)
      {
        if (!localCollection.contains(BarcodeFormat.EAN_13))
          break label190;
        localArrayList.add(new e());
      }
    }
    while (true)
    {
      if (localCollection.contains(BarcodeFormat.EAN_8))
        localArrayList.add(new f());
      if (localCollection.contains(BarcodeFormat.UPC_E))
        localArrayList.add(new q());
      if (localArrayList.isEmpty())
      {
        localArrayList.add(new e());
        localArrayList.add(new f());
        localArrayList.add(new q());
      }
      this.a = ((p[])localArrayList.toArray(new p[localArrayList.size()]));
      return;
      localCollection = (Collection)paramMap.get(DecodeHintType.POSSIBLE_FORMATS);
      break;
      label190: if (!localCollection.contains(BarcodeFormat.UPC_A))
        continue;
      localArrayList.add(new l());
    }
  }

  public final com.google.zxing.e a(int paramInt, a parama, Map<DecodeHintType, ?> paramMap)
  {
    int[] arrayOfInt = p.a(parama);
    p[] arrayOfp = this.a;
    int i = arrayOfp.length;
    int j = 0;
    while (j < i)
    {
      p localp = arrayOfp[j];
      try
      {
        com.google.zxing.e locale1 = localp.a(paramInt, parama, arrayOfInt, paramMap);
        int k;
        Collection localCollection;
        if ((locale1.d() == BarcodeFormat.EAN_13) && (locale1.a().charAt(0) == '0'))
        {
          k = 1;
          if (paramMap != null)
            break label162;
          localCollection = null;
          label81: if ((localCollection != null) && (!localCollection.contains(BarcodeFormat.UPC_A)))
            break label179;
        }
        label162: label179: for (int m = 1; ; m = 0)
        {
          if ((k == 0) || (m == 0))
            break label185;
          com.google.zxing.e locale2 = new com.google.zxing.e(locale1.a().substring(1), locale1.b(), locale1.c(), BarcodeFormat.UPC_A);
          locale2.a(locale1.e());
          return locale2;
          k = 0;
          break;
          localCollection = (Collection)paramMap.get(DecodeHintType.POSSIBLE_FORMATS);
          break label81;
        }
        label185: return locale1;
      }
      catch (ReaderException localReaderException)
      {
        j++;
      }
    }
    throw NotFoundException.getNotFoundInstance();
  }

  public final void a()
  {
    p[] arrayOfp = this.a;
    int i = arrayOfp.length;
    for (int j = 0; j < i; j++)
      arrayOfp[j].a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.j
 * JD-Core Version:    0.6.0
 */