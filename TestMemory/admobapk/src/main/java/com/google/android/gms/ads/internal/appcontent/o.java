package com.google.android.gms.ads.internal.appcontent;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import java.util.PriorityQueue;

@a
public final class o
{
  private static long a(long paramLong, int paramInt)
  {
    if (paramInt == 0)
      paramLong = 1L;
    do
      return paramLong;
    while (paramInt == 1);
    if (paramInt % 2 == 0)
      return a(paramLong * paramLong % 1073807359L, paramInt / 2) % 1073807359L;
    return paramLong * (a(paramLong * paramLong % 1073807359L, paramInt / 2) % 1073807359L) % 1073807359L;
  }

  private static String a(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    if (paramArrayOfString.length < paramInt1 + paramInt2)
    {
      c.c("Unable to construct shingle");
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = paramInt1; i < -1 + (paramInt1 + paramInt2); i++)
    {
      localStringBuffer.append(paramArrayOfString[i]);
      localStringBuffer.append(' ');
    }
    localStringBuffer.append(paramArrayOfString[(-1 + (paramInt1 + paramInt2))]);
    return localStringBuffer.toString();
  }

  private static void a(int paramInt1, long paramLong, String paramString, int paramInt2, PriorityQueue paramPriorityQueue)
  {
    p localp = new p(paramLong, paramString, paramInt2);
    if ((paramPriorityQueue.size() == paramInt1) && ((((p)paramPriorityQueue.peek()).c > localp.c) || (((p)paramPriorityQueue.peek()).a > localp.a)));
    do
    {
      do
        return;
      while (paramPriorityQueue.contains(localp));
      paramPriorityQueue.add(localp);
    }
    while (paramPriorityQueue.size() <= paramInt1);
    paramPriorityQueue.poll();
  }

  public static void a(String[] paramArrayOfString, int paramInt1, int paramInt2, PriorityQueue paramPriorityQueue)
  {
    if (paramArrayOfString.length < paramInt2)
      a(paramInt1, b(paramArrayOfString, 0, paramArrayOfString.length), a(paramArrayOfString, 0, paramArrayOfString.length), paramArrayOfString.length, paramPriorityQueue);
    while (true)
    {
      return;
      long l1 = b(paramArrayOfString, 0, paramInt2);
      a(paramInt1, l1, a(paramArrayOfString, 0, paramInt2), paramInt2, paramPriorityQueue);
      long l2 = a(16785407L, paramInt2 - 1);
      for (int i = 1; i < 1 + (paramArrayOfString.length - paramInt2); i++)
      {
        int j = m.a(paramArrayOfString[(i - 1)]);
        int k = m.a(paramArrayOfString[(-1 + (i + paramInt2))]);
        long l3 = l2 * ((2147483647L + j) % 1073807359L) % 1073807359L;
        l1 = (16785407L * ((l1 + 1073807359L - l3) % 1073807359L) % 1073807359L + (2147483647L + k) % 1073807359L) % 1073807359L;
        a(paramInt1, l1, a(paramArrayOfString, i, paramInt2), paramArrayOfString.length, paramPriorityQueue);
      }
    }
  }

  private static long b(String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    long l = (2147483647L + m.a(paramArrayOfString[0])) % 1073807359L;
    for (int i = 1; i < paramInt2 + 0; i++)
      l = (l * 16785407L % 1073807359L + (2147483647L + m.a(paramArrayOfString[i])) % 1073807359L) % 1073807359L;
    return l;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.o
 * JD-Core Version:    0.6.0
 */