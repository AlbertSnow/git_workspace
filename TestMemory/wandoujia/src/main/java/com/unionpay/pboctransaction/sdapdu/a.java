package com.unionpay.pboctransaction.sdapdu;

import android.support.v4.app.i;
import com.unionpay.pboctransaction.AppIdentification;
import com.unionpay.pboctransaction.e;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public final class a
  implements com.unionpay.pboctransaction.c
{
  private NativeSDWriter a = null;
  private boolean b = false;

  private static ArrayList<com.unionpay.pboctransaction.model.b> b(e parame)
  {
    if (parame.a() == null)
      return null;
    String str1 = parame.c();
    if (str1 == null)
      return null;
    byte[] arrayOfByte = i.b(str1);
    int i = (0xFF & arrayOfByte[0]) << 24 | (0xFF & arrayOfByte[1]) << 16;
    int j = -2147483648;
    int k = 0;
    int m = 0;
    if (m < 10)
      if ((j & i) != 0)
        break label285;
    label285: for (int i3 = k + 1; ; i3 = k)
    {
      j >>>= 1;
      m++;
      k = i3;
      break;
      if (k <= 0)
        return null;
      ArrayList localArrayList = new ArrayList(k);
      int n = -2147483648;
      int i1 = 1;
      while (true)
        if ((i1 <= k) && (i1 < 11))
        {
          String str2;
          String str3;
          if ((i & n) == 0)
          {
            str2 = parame.a(i1, com.unionpay.mpay.utils.c.a());
            if ((str2 != null) && (str2.length() > 0))
              str3 = i.e(str2.substring(0, 40));
          }
          try
          {
            str4 = new String(i.b(str3), "gbk");
            String str5 = str2.substring(40, 60);
            localArrayList.add(new com.unionpay.pboctransaction.model.a(8, Integer.toString(i1), str4, i.d(str5), 2));
            new StringBuilder().append(i1).append("----").append(str5);
            int i2 = i1 + 1;
            n >>>= 1;
            i1 = i2;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            while (true)
              String str4 = str3;
          }
        }
      return localArrayList;
    }
  }

  public final ArrayList<com.unionpay.pboctransaction.model.b> a(e parame)
  {
    if (!this.b)
      return null;
    ArrayList localArrayList1 = new ArrayList();
    String str = parame.a(new AppIdentification("A0000003330101", "1.0"));
    Object localObject = null;
    if (str != null)
    {
      int i = str.length();
      localObject = null;
      if (i > 0)
      {
        ArrayList localArrayList3 = new ArrayList(1);
        localArrayList3.add(new com.unionpay.pboctransaction.model.a(8, "A0000003330101", "", i.d(str), 1));
        new StringBuilder().append("A0000003330101").append("----").append(str);
        localObject = localArrayList3;
      }
    }
    if ((localObject != null) && (localObject.size() > 0))
      localArrayList1.addAll(localObject);
    ArrayList localArrayList2 = b(parame);
    if ((localArrayList2 != null) && (localArrayList2.size() > 0))
      localArrayList1.addAll(localArrayList2);
    return localArrayList1;
  }

  public final void a()
  {
    this.a = new NativeSDWriter();
    b.a();
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = b.a;
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
      localArrayList.add(arrayOfString[j]);
    this.b = this.a.a(localArrayList);
  }

  public final byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    String str = "";
    if (this.a != null)
      str = this.a.a(i.a(paramArrayOfByte, paramArrayOfByte.length));
    return i.b(str);
  }

  public final void b()
  {
    if (this.a != null)
      this.a.a();
  }

  public final void c()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.pboctransaction.sdapdu.a
 * JD-Core Version:    0.6.0
 */