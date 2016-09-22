package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.b.a;
import com.wandoujia.gson.n;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;

public final class w
{
  private static u<BitSet> A;
  private static u<Boolean> B;
  private static u<Number> C;
  private static u<Number> D;
  private static u<Number> E;
  private static u<Number> F;
  private static u<Character> G;
  private static u<String> H;
  private static u<StringBuilder> I;
  private static u<StringBuffer> J;
  private static u<URL> K;
  private static u<URI> L;
  private static u<InetAddress> M;
  private static u<UUID> N;
  private static u<Calendar> O;
  private static u<Locale> P;
  public static final v a;
  public static final v b;
  public static final u<Boolean> c;
  public static final v d;
  public static final v e;
  public static final v f;
  public static final v g;
  public static final u<Number> h;
  public static final v i;
  public static final v j;
  public static final u<BigDecimal> k;
  public static final u<BigInteger> l;
  public static final v m;
  public static final v n;
  public static final v o;
  public static final v p;
  public static final v q;
  public static final v r;
  public static final v s;
  public static final v t;
  public static final v u;
  public static final v v;
  public static final u<n> w;
  public static final v x;
  public static final v y;
  private static u<Class> z = new x();

  static
  {
    a = a(Class.class, z);
    A = new ai();
    b = a(BitSet.class, A);
    B = new au();
    c = new ay();
    d = a(Boolean.TYPE, Boolean.class, B);
    C = new az();
    e = a(Byte.TYPE, Byte.class, C);
    D = new ba();
    f = a(Short.TYPE, Short.class, D);
    E = new bb();
    g = a(Integer.TYPE, Integer.class, E);
    h = new bc();
    new bd();
    new y();
    F = new z();
    i = a(Number.class, F);
    G = new aa();
    j = a(Character.TYPE, Character.class, G);
    H = new ab();
    k = new ac();
    l = new ad();
    m = a(String.class, H);
    I = new ae();
    n = a(StringBuilder.class, I);
    J = new af();
    o = a(StringBuffer.class, J);
    K = new ag();
    p = a(URL.class, K);
    L = new ah();
    q = a(URI.class, L);
    M = new aj();
    r = b(InetAddress.class, M);
    N = new ak();
    s = a(UUID.class, N);
    t = new al();
    O = new an();
    u = new av(Calendar.class, GregorianCalendar.class, O);
    P = new ao();
    v = a(Locale.class, P);
    w = new ap();
    x = b(n.class, w);
    y = new aq();
  }

  public static <TT> v a(a<TT> parama, u<TT> paramu)
  {
    return new ar(parama, paramu);
  }

  public static <TT> v a(Class<TT> paramClass, u<TT> paramu)
  {
    return new as(paramClass, paramu);
  }

  public static <TT> v a(Class<TT> paramClass1, Class<TT> paramClass2, u<? super TT> paramu)
  {
    return new at(paramClass1, paramClass2, paramu);
  }

  private static <TT> v b(Class<TT> paramClass, u<TT> paramu)
  {
    return new aw(paramClass, paramu);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.w
 * JD-Core Version:    0.6.0
 */