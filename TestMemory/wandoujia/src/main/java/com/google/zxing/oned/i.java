package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class i extends k
{
  private final k[] a;

  public i(Map<DecodeHintType, ?> paramMap)
  {
    Collection localCollection;
    if (paramMap == null)
    {
      localCollection = null;
      if ((paramMap == null) || (paramMap.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null))
        break label467;
    }
    label467: for (boolean bool = true; ; bool = false)
    {
      ArrayList localArrayList = new ArrayList();
      if (localCollection != null)
      {
        if ((localCollection.contains(BarcodeFormat.EAN_13)) || (localCollection.contains(BarcodeFormat.UPC_A)) || (localCollection.contains(BarcodeFormat.EAN_8)) || (localCollection.contains(BarcodeFormat.UPC_E)))
          localArrayList.add(new j(paramMap));
        if (localCollection.contains(BarcodeFormat.CODE_39))
          localArrayList.add(new c(bool));
        if (localCollection.contains(BarcodeFormat.CODE_93))
          localArrayList.add(new d());
        if (localCollection.contains(BarcodeFormat.CODE_128))
          localArrayList.add(new b());
        if (localCollection.contains(BarcodeFormat.ITF))
          localArrayList.add(new h());
        if (localCollection.contains(BarcodeFormat.CODABAR))
          localArrayList.add(new a());
        if (localCollection.contains(BarcodeFormat.RSS_14))
          localArrayList.add(new com.google.zxing.oned.rss.e());
        if (localCollection.contains(BarcodeFormat.RSS_EXPANDED))
          localArrayList.add(new com.google.zxing.oned.rss.expanded.c());
      }
      if (localArrayList.isEmpty())
      {
        localArrayList.add(new j(paramMap));
        localArrayList.add(new c());
        localArrayList.add(new a());
        localArrayList.add(new d());
        localArrayList.add(new b());
        localArrayList.add(new h());
        localArrayList.add(new com.google.zxing.oned.rss.e());
        localArrayList.add(new com.google.zxing.oned.rss.expanded.c());
      }
      this.a = ((k[])localArrayList.toArray(new k[localArrayList.size()]));
      return;
      localCollection = (Collection)paramMap.get(DecodeHintType.POSSIBLE_FORMATS);
      break;
    }
  }

  public final com.google.zxing.e a(int paramInt, com.google.zxing.common.a parama, Map<DecodeHintType, ?> paramMap)
  {
    k[] arrayOfk = this.a;
    int i = arrayOfk.length;
    int j = 0;
    while (j < i)
    {
      k localk = arrayOfk[j];
      try
      {
        com.google.zxing.e locale = localk.a(paramInt, parama, paramMap);
        return locale;
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
    k[] arrayOfk = this.a;
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.i
 * JD-Core Version:    0.6.0
 */