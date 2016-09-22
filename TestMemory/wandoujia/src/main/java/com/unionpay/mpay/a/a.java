package com.unionpay.mpay.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.d;
import android.util.DisplayMetrics;

public final class a
{
  public static int A;
  public static int B;
  private static int C = 48;
  private static int D;
  private static int E;
  private static int F;
  private static int G;
  private static int H;
  private static int I;
  private static int J;
  private static boolean K;
  public static int a = 8;
  public static int b = 4;
  public static int c = 12;
  public static int d = 8;
  public static int e = 8;
  public static int f = 4;
  public static int g;
  public static int h;
  public static int i;
  public static int j;
  public static int k;
  public static int l;
  public static int m;
  public static int n;
  public static int o;
  public static int p;
  public static int q;
  public static int r;
  public static int s;
  public static int t;
  public static int u;
  public static int v;
  public static int w;
  public static int x;
  public static int y;
  public static int z;

  static
  {
    D = 8;
    g = 2;
    h = 16;
    i = 52;
    E = 32;
    j = 54;
    k = 45;
    l = 35;
    F = 40;
    m = 54;
    G = 10;
    n = 0;
    H = 28;
    o = 30;
    p = 22;
    q = 40;
    r = j;
    s = 46;
    t = 45;
    I = 32;
    u = 6;
    v = 26;
    w = 97;
    x = 25;
    y = 25;
    z = 25;
    A = 1;
    B = 0;
    J = 5;
    K = false;
  }

  public static void a(Context paramContext)
  {
    if (!K)
    {
      C = d.a(paramContext, C);
      a = d.a(paramContext, a);
      b = d.a(paramContext, b);
      c = d.a(paramContext, c);
      d = d.a(paramContext, d);
      e = d.a(paramContext, e);
      f = d.a(paramContext, f);
      D = d.a(paramContext, D);
      g = d.a(paramContext, g);
      h = d.a(paramContext, h);
      i = d.a(paramContext, i);
      E = d.a(paramContext, E);
      j = d.a(paramContext, j);
      k = d.a(paramContext, k);
      l = d.a(paramContext, l);
      F = d.a(paramContext, F);
      m = d.a(paramContext, m);
      G = d.a(paramContext, G);
      H = d.a(paramContext, H);
      o = d.a(paramContext, o);
      p = d.a(paramContext, p);
      s = d.a(paramContext, s);
      q = d.a(paramContext, q);
      t = d.a(paramContext, t);
      I = d.a(paramContext, I);
      u = d.a(paramContext, u);
      r = d.a(paramContext, r);
      v = d.a(paramContext, v);
      w = d.a(paramContext, w);
      x = d.a(paramContext, x);
      y = d.a(paramContext, y);
      z = d.a(paramContext, z);
      A = d.a(paramContext, A);
      B = paramContext.getResources().getDisplayMetrics().widthPixels;
      n = paramContext.getResources().getDisplayMetrics().heightPixels;
      if (B > n)
      {
        int i1 = B + n;
        B = i1;
        n = i1 - n;
        B -= n;
      }
      J = d.a(paramContext, J);
      K = true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.a.a
 * JD-Core Version:    0.6.0
 */