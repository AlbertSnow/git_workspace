package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.b;

abstract class c
{
  private static final c[] a;

  static
  {
    c[] arrayOfc = new c[8];
    arrayOfc[0] = new d(0);
    arrayOfc[1] = new e(0);
    arrayOfc[2] = new f(0);
    arrayOfc[3] = new g(0);
    arrayOfc[4] = new h(0);
    arrayOfc[5] = new i(0);
    arrayOfc[6] = new j(0);
    arrayOfc[7] = new k(0);
    a = arrayOfc;
  }

  static c a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 7))
      throw new IllegalArgumentException();
    return a[paramInt];
  }

  final void a(b paramb, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
      for (int j = 0; j < paramInt; j++)
      {
        if (!a(i, j))
          continue;
        paramb.c(j, i);
      }
  }

  abstract boolean a(int paramInt1, int paramInt2);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.c
 * JD-Core Version:    0.6.0
 */