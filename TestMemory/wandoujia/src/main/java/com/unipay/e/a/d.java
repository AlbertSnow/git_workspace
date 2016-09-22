package com.unipay.e.a;

import java.util.Vector;

public final class d
{
  Vector<c> a = new Vector();

  public final String toString()
  {
    Object localObject = "" + "columscount = " + this.a.size() + "\n";
    int i = 0;
    while (i < this.a.size())
    {
      String str1 = (String)localObject + "columsindex = " + i + "\n";
      c localc = (c)this.a.elementAt(i);
      String str2 = str1 + localc.toString();
      i++;
      localObject = str2;
    }
    return (String)localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.e.a.d
 * JD-Core Version:    0.6.0
 */