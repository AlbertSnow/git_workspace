package com.wandoujia.p4.community.utils;

import com.wandoujia.p4.community.card.b.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class h
{
  private static final Comparator a = new i();

  public static void a(List<c> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
      Collections.sort(paramList, a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.utils.h
 * JD-Core Version:    0.6.0
 */