package com.google.zxing.oned.rss.expanded.decoders;

public abstract class j
{
  private final com.google.zxing.common.a a;
  private final r b;

  j(com.google.zxing.common.a parama)
  {
    this.a = parama;
    this.b = new r(parama);
  }

  public static j a(com.google.zxing.common.a parama)
  {
    if (parama.a(1))
      return new g(parama);
    if (!parama.a(2))
      return new k(parama);
    switch (r.a(parama, 1, 4))
    {
    default:
      switch (r.a(parama, 1, 5))
      {
      default:
        switch (r.a(parama, 1, 7))
        {
        default:
          throw new IllegalStateException("unknown decoder: " + parama);
        case 56:
        case 57:
        case 58:
        case 59:
        case 60:
        case 61:
        case 62:
        case 63:
        }
      case 12:
      case 13:
      }
    case 4:
      return new a(parama);
    case 5:
    }
    return new b(parama);
    return new c(parama);
    return new d(parama);
    return new e(parama, "310", "11");
    return new e(parama, "320", "11");
    return new e(parama, "310", "13");
    return new e(parama, "320", "13");
    return new e(parama, "310", "15");
    return new e(parama, "320", "15");
    return new e(parama, "310", "17");
    return new e(parama, "320", "17");
  }

  public abstract String a();

  protected final com.google.zxing.common.a b()
  {
    return this.a;
  }

  protected final r c()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.j
 * JD-Core Version:    0.6.0
 */