package com.wandoujia.ripple_framework.adapter;

import com.wandoujia.api.proto.MorphDetail;
import com.wandoujia.api.proto.TemplateTypeEnum.TemplateType;
import java.util.HashMap;
import java.util.Map;

public final class j
{
  private static int a = TemplateTypeEnum.TemplateType.MORPH_CARD.getValue();
  private static Map<Integer, Integer> b = new HashMap();
  private static Map<Integer, MorphDetail> c = new HashMap();

  public static int a(MorphDetail paramMorphDetail)
  {
    int i = paramMorphDetail.url.hashCode();
    if (b.containsKey(Integer.valueOf(i)))
      return ((Integer)b.get(Integer.valueOf(i))).intValue();
    a = 1 + a;
    b.put(Integer.valueOf(i), Integer.valueOf(a));
    c.put(Integer.valueOf(a), paramMorphDetail);
    return a;
  }

  public static boolean a(int paramInt)
  {
    return paramInt > TemplateTypeEnum.TemplateType.MORPH_CARD.getValue();
  }

  public static MorphDetail b(int paramInt)
  {
    return (MorphDetail)c.get(Integer.valueOf(paramInt));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.j
 * JD-Core Version:    0.6.0
 */