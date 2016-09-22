package com.unipay.e.a;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

public final class e
{
  byte[] a;
  public Vector<d> b = new Vector();
  private int c = 0;

  public static e a(DataInputStream paramDataInputStream)
  {
    e locale = new e();
    while (true)
    {
      try
      {
        locale.c = paramDataInputStream.readInt();
        locale.a = new byte[locale.c];
        paramDataInputStream.read(locale.a);
        int i = paramDataInputStream.readInt();
        if (i <= 1000)
          break label239;
        return null;
        if (j < i)
        {
          d locald = new d();
          int k = paramDataInputStream.readInt();
          if (k <= 1000)
            break label251;
          locald = null;
          if (locald == null)
            break label245;
          locale.b.addElement(locald);
          break label245;
          if (m >= k)
            continue;
          c localc = new c();
          localc.a = paramDataInputStream.readInt();
          localc.b = new byte[localc.a];
          paramDataInputStream.read(localc.b);
          localc.c = paramDataInputStream.readInt();
          localc.d = new byte[localc.c];
          paramDataInputStream.read(localc.d);
          localc.e = paramDataInputStream.readInt();
          if (localc.e <= 0)
            continue;
          localc.f = new byte[localc.e];
          paramDataInputStream.read(localc.f);
          locald.a.addElement(localc);
          m++;
          continue;
          continue;
        }
      }
      catch (IOException localIOException)
      {
        locale = null;
      }
      return locale;
      label239: int j = 0;
      continue;
      label245: j++;
      continue;
      label251: int m = 0;
    }
  }

  public final String toString()
  {
    Object localObject;
    try
    {
      str1 = new String(this.a, "UTF-8");
      String str2 = "" + "tablenamesize = " + this.c + "\n";
      String str3 = str2 + "tablename = " + str1 + "\n";
      localObject = str3 + "rowcount = " + this.b.size() + "\n";
      int i = 0;
      while (i < this.b.size())
      {
        String str4 = (String)localObject + "rowindex = " + i + "\n";
        d locald = (d)this.b.elementAt(i);
        String str5 = str4 + locald.toString();
        i++;
        localObject = str5;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        String str1 = "";
    }
    return (String)localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.e.a.e
 * JD-Core Version:    0.6.0
 */