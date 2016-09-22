package com.wandoujia.jupiter.subscribe.a;

import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.BadgeEnum.Badge;
import com.wandoujia.api.proto.PublisherDetail;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static final int a = "SUBSCRIBE".hashCode();
  private static final Map<String, Boolean> b = new HashMap();

  public static void a()
  {
    b.clear();
  }

  public static void a(Model paramModel, boolean paramBoolean)
  {
    paramModel.a(a, Boolean.valueOf(paramBoolean));
  }

  public static boolean a(Model paramModel)
  {
    Object localObject = paramModel.a(a);
    if (localObject == null)
    {
      if (paramModel.I() != null)
        return paramModel.I().subscribed.booleanValue();
      return false;
    }
    return ((Boolean)localObject).booleanValue();
  }

  public static void b(Model paramModel, boolean paramBoolean)
  {
    b.put(paramModel.F().package_name, Boolean.valueOf(paramBoolean));
  }

  public static boolean b(Model paramModel)
  {
    String str = paramModel.F().package_name;
    if (b.containsKey(str))
      return ((Boolean)b.get(str)).booleanValue();
    return (paramModel.R() != null) && ((paramModel.R().intValue() & BadgeEnum.Badge.FAVORITE.getValue()) != 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.subscribe.a.a
 * JD-Core Version:    0.6.0
 */