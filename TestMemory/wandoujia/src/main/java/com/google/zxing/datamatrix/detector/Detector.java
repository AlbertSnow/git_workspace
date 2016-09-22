package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class Detector
{
  private final com.google.zxing.common.b a;
  private final com.google.zxing.common.a.a b;

  public Detector(com.google.zxing.common.b paramb)
  {
    this.a = paramb;
    this.b = new com.google.zxing.common.a.a(paramb);
  }

  private static int a(com.google.zxing.f paramf1, com.google.zxing.f paramf2)
  {
    return android.support.v4.app.b.a(com.google.zxing.f.a(paramf1, paramf2));
  }

  private static com.google.zxing.common.b a(com.google.zxing.common.b paramb, com.google.zxing.f paramf1, com.google.zxing.f paramf2, com.google.zxing.f paramf3, com.google.zxing.f paramf4, int paramInt1, int paramInt2)
  {
    return com.google.zxing.common.f.a().a(paramb, paramInt1, paramInt2, 0.5F, 0.5F, paramInt1 - 0.5F, 0.5F, paramInt1 - 0.5F, paramInt2 - 0.5F, 0.5F, paramInt2 - 0.5F, paramf1.a(), paramf1.b(), paramf4.a(), paramf4.b(), paramf3.a(), paramf3.b(), paramf2.a(), paramf2.b());
  }

  private static void a(Map<com.google.zxing.f, Integer> paramMap, com.google.zxing.f paramf)
  {
    Integer localInteger = (Integer)paramMap.get(paramf);
    if (localInteger == null);
    for (int i = 1; ; i = 1 + localInteger.intValue())
    {
      paramMap.put(paramf, Integer.valueOf(i));
      return;
    }
  }

  private boolean a(com.google.zxing.f paramf)
  {
    return (paramf.a() >= 0.0F) && (paramf.a() < this.a.e()) && (paramf.b() > 0.0F) && (paramf.b() < this.a.f());
  }

  private a b(com.google.zxing.f paramf1, com.google.zxing.f paramf2)
  {
    int i = (int)paramf1.a();
    int j = (int)paramf1.b();
    int k = (int)paramf2.a();
    int m = (int)paramf2.b();
    int n;
    if (Math.abs(m - j) > Math.abs(k - i))
    {
      n = 1;
      if (n == 0)
        break label303;
    }
    while (true)
    {
      int i3 = Math.abs(m - j);
      int i4 = Math.abs(k - i);
      int i5 = -i3 / 2;
      int i6;
      label88: int i7;
      label98: int i8;
      int i9;
      label115: int i10;
      label124: boolean bool1;
      int i11;
      int i12;
      label142: com.google.zxing.common.b localb2;
      int i13;
      if (i < k)
      {
        i6 = 1;
        if (j >= m)
          break label257;
        i7 = 1;
        i8 = 0;
        com.google.zxing.common.b localb1 = this.a;
        if (n == 0)
          break label263;
        i9 = i;
        if (n == 0)
          break label270;
        i10 = j;
        bool1 = localb1.a(i9, i10);
        i11 = i5;
        i12 = i;
        if (j == m)
          break label290;
        localb2 = this.a;
        if (n == 0)
          break label276;
        i13 = i12;
        label164: if (n == 0)
          break label283;
      }
      label257: label263: label270: label276: label283: for (int i14 = j; ; i14 = i12)
      {
        boolean bool2 = localb2.a(i13, i14);
        if (bool2 != bool1)
        {
          i8++;
          bool1 = bool2;
        }
        int i15 = i11 + i4;
        if (i15 > 0)
        {
          if (i12 == k)
            break label290;
          i12 += i6;
          i15 -= i3;
        }
        j += i7;
        i11 = i15;
        break label142;
        n = 0;
        break;
        i6 = -1;
        break label88;
        i7 = -1;
        break label98;
        i9 = j;
        break label115;
        i10 = i;
        break label124;
        i13 = j;
        break label164;
      }
      label290: return new a(paramf1, paramf2, i8, 0);
      label303: int i1 = m;
      m = k;
      k = i1;
      int i2 = j;
      j = i;
      i = i2;
    }
  }

  public final d a()
  {
    com.google.zxing.f[] arrayOff1 = this.b.a();
    com.google.zxing.f localf1 = arrayOff1[0];
    com.google.zxing.f localf2 = arrayOff1[1];
    com.google.zxing.f localf3 = arrayOff1[2];
    com.google.zxing.f localf4 = arrayOff1[3];
    ArrayList localArrayList = new ArrayList(4);
    localArrayList.add(b(localf1, localf2));
    localArrayList.add(b(localf1, localf3));
    localArrayList.add(b(localf2, localf4));
    localArrayList.add(b(localf3, localf4));
    Collections.sort(localArrayList, new Detector.ResultPointsAndTransitionsComparator(null));
    a locala1 = (a)localArrayList.get(0);
    a locala2 = (a)localArrayList.get(1);
    HashMap localHashMap = new HashMap();
    a(localHashMap, locala1.a());
    a(localHashMap, locala1.b());
    a(localHashMap, locala2.a());
    a(localHashMap, locala2.b());
    Iterator localIterator = localHashMap.entrySet().iterator();
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      com.google.zxing.f localf11 = (com.google.zxing.f)localEntry.getKey();
      if (((Integer)localEntry.getValue()).intValue() == 2)
      {
        localObject1 = localf11;
        continue;
      }
      if (localObject2 == null)
      {
        localObject2 = localf11;
        continue;
      }
      localObject3 = localf11;
    }
    if ((localObject2 == null) || (localObject1 == null) || (localObject3 == null))
      throw NotFoundException.getNotFoundInstance();
    com.google.zxing.f[] arrayOff2 = { localObject2, localObject1, localObject3 };
    com.google.zxing.f.a(arrayOff2);
    com.google.zxing.f localf5 = arrayOff2[0];
    com.google.zxing.f localf6 = arrayOff2[1];
    com.google.zxing.f localf7 = arrayOff2[2];
    com.google.zxing.f localf8;
    int k;
    int m;
    com.google.zxing.f localf9;
    if (!localHashMap.containsKey(localf1))
    {
      localf8 = localf1;
      int i = b(localf7, localf8).c();
      int j = b(localf5, localf8).c();
      if ((i & 0x1) == 1)
        i++;
      k = i + 2;
      if ((j & 0x1) == 1)
        j++;
      m = j + 2;
      if ((k * 4 < m * 7) && (m * 4 < k * 7))
        break label886;
      float f1 = a(localf6, localf5) / k;
      int n = a(localf7, localf8);
      float f2 = (localf8.a() - localf7.a()) / n;
      float f3 = (localf8.b() - localf7.b()) / n;
      localObject4 = new com.google.zxing.f(localf8.a() + f2 * f1, localf8.b() + f1 * f3);
      float f4 = a(localf6, localf7) / m;
      int i1 = a(localf5, localf8);
      float f5 = (localf8.a() - localf5.a()) / i1;
      float f6 = (localf8.b() - localf5.b()) / i1;
      localf9 = new com.google.zxing.f(localf8.a() + f5 * f4, localf8.b() + f4 * f6);
      if (a((com.google.zxing.f)localObject4))
        break label797;
      if (a(localf9))
        break label879;
    }
    com.google.zxing.common.b localb;
    label797: label879: for (Object localObject4 = null; ; localObject4 = localf9)
      do
      {
        if (localObject4 == null)
          localObject4 = localf8;
        int i2 = b(localf7, (com.google.zxing.f)localObject4).c();
        int i3 = b(localf5, (com.google.zxing.f)localObject4).c();
        if ((i2 & 0x1) == 1)
          i2++;
        if ((i3 & 0x1) == 1)
          i3++;
        localb = a(this.a, localf7, localf6, localf5, (com.google.zxing.f)localObject4, i2, i3);
        return new d(localb, new com.google.zxing.f[] { localf7, localf6, localf5, localObject4 });
        if (!localHashMap.containsKey(localf2))
        {
          localf8 = localf2;
          break;
        }
        if (!localHashMap.containsKey(localf3))
        {
          localf8 = localf3;
          break;
        }
        localf8 = localf4;
        break;
      }
      while ((!a(localf9)) || (Math.abs(k - b(localf7, (com.google.zxing.f)localObject4).c()) + Math.abs(m - b(localf5, (com.google.zxing.f)localObject4).c()) <= Math.abs(k - b(localf7, localf9).c()) + Math.abs(m - b(localf5, localf9).c())));
    label886: int i4 = Math.min(m, k);
    float f7 = a(localf6, localf5) / i4;
    int i5 = a(localf7, localf8);
    float f8 = (localf8.a() - localf7.a()) / i5;
    float f9 = (localf8.b() - localf7.b()) / i5;
    localObject4 = new com.google.zxing.f(localf8.a() + f8 * f7, localf8.b() + f7 * f9);
    float f10 = a(localf6, localf7) / i4;
    int i6 = a(localf5, localf8);
    float f11 = (localf8.a() - localf5.a()) / i6;
    float f12 = (localf8.b() - localf5.b()) / i6;
    com.google.zxing.f localf10 = new com.google.zxing.f(localf8.a() + f11 * f10, localf8.b() + f10 * f12);
    if (!a((com.google.zxing.f)localObject4))
      if (a(localf10))
        break label1229;
    label1229: for (localObject4 = null; ; localObject4 = localf10)
      do
      {
        if (localObject4 == null)
          localObject4 = localf8;
        int i7 = 1 + Math.max(b(localf7, (com.google.zxing.f)localObject4).c(), b(localf5, (com.google.zxing.f)localObject4).c());
        if ((i7 & 0x1) == 1)
          i7++;
        localb = a(this.a, localf7, localf6, localf5, (com.google.zxing.f)localObject4, i7, i7);
        break;
      }
      while ((!a(localf10)) || (Math.abs(b(localf7, (com.google.zxing.f)localObject4).c() - b(localf5, (com.google.zxing.f)localObject4).c()) <= Math.abs(b(localf7, localf10).c() - b(localf5, localf10).c())));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.datamatrix.detector.Detector
 * JD-Core Version:    0.6.0
 */