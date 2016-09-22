package com.google.android.gms.common.data;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.e;
import com.google.zxing.f;
import com.google.zxing.pdf417.a.a;
import com.google.zxing.pdf417.decoder.j;
import com.wandoujia.morph.a.r;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class b
  implements com.google.zxing.d
{
  public b()
  {
  }

  private b(String[] paramArrayOfString)
  {
    android.support.v4.app.d.a(paramArrayOfString);
    new ArrayList();
    new HashMap();
  }

  private static int a(f paramf1, f paramf2)
  {
    if ((paramf1 == null) || (paramf2 == null))
      return 0;
    return (int)Math.abs(paramf1.a() - paramf2.a());
  }

  private static int b(f paramf1, f paramf2)
  {
    if ((paramf1 == null) || (paramf2 == null))
      return 2147483647;
    return (int)Math.abs(paramf1.a() - paramf2.a());
  }

  public final e a(com.google.zxing.b paramb, Map<DecodeHintType, ?> paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    com.google.zxing.pdf417.a.b localb = a.a(paramb);
    Iterator localIterator = localb.b().iterator();
    while (localIterator.hasNext())
    {
      f[] arrayOff = (f[])localIterator.next();
      BadgeUtil localBadgeUtil = j.a(localb.a(), arrayOff[4], arrayOff[5], arrayOff[6], arrayOff[7], Math.min(Math.min(b(arrayOff[0], arrayOff[4]), 17 * b(arrayOff[6], arrayOff[2]) / 18), Math.min(b(arrayOff[1], arrayOff[5]), 17 * b(arrayOff[7], arrayOff[3]) / 18)), Math.max(Math.max(a(arrayOff[0], arrayOff[4]), 17 * a(arrayOff[6], arrayOff[2]) / 18), Math.max(a(arrayOff[1], arrayOff[5]), 17 * a(arrayOff[7], arrayOff[3]) / 18)));
      e locale = new e(localBadgeUtil.b(), localBadgeUtil.a(), arrayOff, BarcodeFormat.PDF_417);
      locale.a(ResultMetadataType.ERROR_CORRECTION_LEVEL, localBadgeUtil.d());
      r localr = (r)localBadgeUtil.e();
      if (localr != null)
        locale.a(ResultMetadataType.PDF417_EXTRA_METADATA, localr);
      localArrayList.add(locale);
    }
    e[] arrayOfe = (e[])localArrayList.toArray(new e[localArrayList.size()]);
    if ((arrayOfe == null) || (arrayOfe.length == 0) || (arrayOfe[0] == null))
      throw NotFoundException.getNotFoundInstance();
    return arrayOfe[0];
  }

  public final void a()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.data.b
 * JD-Core Version:    0.6.0
 */