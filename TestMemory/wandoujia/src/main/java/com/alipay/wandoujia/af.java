package com.alipay.wandoujia;

import com.alipay.android.app.exception.AppErrorException;
import java.util.HashMap;
import java.util.Map;

public class af
{
  private static af a;
  private Map b = new HashMap();

  protected static ae a(md parammd, ae paramae)
  {
    if (paramae == null)
      throw new AppErrorException(af.class, "frame data is null");
    af localaf = a();
    mc localmc = (mc)localaf.b.get(parammd);
    if (localmc == null)
      throw new AppErrorException(af.class, "no such frame factory type " + parammd);
    boolean bool = localaf.b.containsKey(parammd);
    ai localai = null;
    if (bool)
      localai = localmc.c(paramae);
    if (localai == null);
    while (true)
    {
      localmc.b(paramae);
      paramae.b().a(parammd);
      return paramae;
      paramae = localai;
    }
  }

  private static af a()
  {
    if (a == null)
      a = new af();
    return a;
  }

  public static void a(mc parammc)
  {
    af localaf = a();
    md localmd = parammc.a();
    if (!localaf.b.containsKey(localmd))
      localaf.b.put(localmd, parammc);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.af
 * JD-Core Version:    0.6.0
 */