package com.google.android.gms.ads.internal.appcontent;

import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@a
public final class j
{
  private final int a;
  private final int b;
  private final int c;
  private final i d = new n();

  public j(int paramInt)
  {
    this.b = paramInt;
    this.a = 6;
    this.c = 0;
  }

  private String a(String paramString)
  {
    String[] arrayOfString1 = paramString.split("\n");
    if (arrayOfString1.length == 0)
      return "";
    l locall = new l();
    PriorityQueue localPriorityQueue = new PriorityQueue(this.b, new k(this));
    for (int i = 0; i < arrayOfString1.length; i++)
    {
      String[] arrayOfString2 = m.b(arrayOfString1[i]);
      if (arrayOfString2.length == 0)
        continue;
      o.a(arrayOfString2, this.b, this.a, localPriorityQueue);
    }
    Iterator localIterator = localPriorityQueue.iterator();
    while (true)
      if (localIterator.hasNext())
      {
        p localp = (p)localIterator.next();
        try
        {
          locall.a(this.d.a(localp.b));
        }
        catch (IOException localIOException)
        {
          c.b("Error while writing hash to byteStream", localIOException);
        }
      }
    return locall.toString();
  }

  public final String a(ArrayList paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      localStringBuffer.append(((String)localIterator.next()).toLowerCase(Locale.US));
      localStringBuffer.append('\n');
    }
    return a(localStringBuffer.toString());
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.appcontent.j
 * JD-Core Version:    0.6.0
 */