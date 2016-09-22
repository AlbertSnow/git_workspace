package com.unipay.e.a;

import java.util.Vector;

public final class a
{
  Vector<e> a = new Vector();

  public final void a(e parame)
  {
    this.a.addElement(parame);
  }

  public final String toString()
  {
    int i = this.a.size();
    String str1 = "" + "start==========================================\n";
    Object localObject = str1 + "\ntablecount = " + i + "\n";
    int j = 0;
    while (j < i)
    {
      String str2 = (String)localObject + "tableindex = " + j + "\n";
      e locale = (e)this.a.elementAt(j);
      String str3 = str2 + locale.toString();
      j++;
      localObject = str3;
    }
    return (String)((String)localObject + "end=============================================\n");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.e.a.a
 * JD-Core Version:    0.6.0
 */