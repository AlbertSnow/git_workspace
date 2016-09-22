package com.alipay.wandoujia;

import com.wandoujia.jupiter.d.a;
import org.json.JSONObject;

public enum ra
{
  private String A;
  private JSONObject B;
  private String C;
  private String D;
  private String E;
  private boolean F;
  private boolean G;
  private String y;
  private String z;

  static
  {
    ra[] arrayOfra = new ra[24];
    arrayOfra[0] = a;
    arrayOfra[1] = b;
    arrayOfra[2] = c;
    arrayOfra[3] = d;
    arrayOfra[4] = e;
    arrayOfra[5] = f;
    arrayOfra[6] = g;
    arrayOfra[7] = h;
    arrayOfra[8] = i;
    arrayOfra[9] = j;
    arrayOfra[10] = k;
    arrayOfra[11] = l;
    arrayOfra[12] = m;
    arrayOfra[13] = n;
    arrayOfra[14] = o;
    arrayOfra[15] = p;
    arrayOfra[16] = q;
    arrayOfra[17] = r;
    arrayOfra[18] = s;
    arrayOfra[19] = t;
    arrayOfra[20] = u;
    arrayOfra[21] = v;
    arrayOfra[22] = w;
    arrayOfra[23] = x;
    H = arrayOfra;
  }

  private ra(String arg3)
  {
    Object localObject;
    this.y = localObject;
  }

  public static ra a$65b37f89(a parama)
  {
    Object localObject1 = null;
    ra[] arrayOfra = values();
    int i1 = arrayOfra.length;
    int i2 = 0;
    if (i2 >= i1)
    {
      if (localObject1 == null)
        localObject1 = a;
      ((ra)localObject1).z = parama.g();
      ((ra)localObject1).A = parama.h();
      ((ra)localObject1).B = parama.j();
      ((ra)localObject1).C = parama.i();
      ((ra)localObject1).D = parama.k();
      ((ra)localObject1).E = parama.l();
      ((ra)localObject1).F = parama.m();
      ((ra)localObject1).G = parama.n();
      return localObject1;
    }
    Object localObject2 = arrayOfra[i2];
    if (parama.g().startsWith(((ra)localObject2).y));
    while (true)
    {
      i2++;
      localObject1 = localObject2;
      break;
      localObject2 = localObject1;
    }
  }

  public final String a()
  {
    return this.z;
  }

  public final String b()
  {
    return this.A;
  }

  public final JSONObject c()
  {
    return this.B;
  }

  public final String d()
  {
    return this.C;
  }

  public final String e()
  {
    return this.D;
  }

  public final String f()
  {
    return this.E;
  }

  public final boolean g()
  {
    return this.F;
  }

  public final boolean h()
  {
    return this.G;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ra
 * JD-Core Version:    0.6.0
 */