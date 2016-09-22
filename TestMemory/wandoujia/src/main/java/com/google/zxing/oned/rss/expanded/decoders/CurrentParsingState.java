package com.google.zxing.oned.rss.expanded.decoders;

final class CurrentParsingState
{
  private int a = 0;
  private CurrentParsingState.State b = CurrentParsingState.State.NUMERIC;

  final int a()
  {
    return this.a;
  }

  final void a(int paramInt)
  {
    this.a = paramInt;
  }

  final void b(int paramInt)
  {
    this.a = (paramInt + this.a);
  }

  final boolean b()
  {
    return this.b == CurrentParsingState.State.ALPHA;
  }

  final boolean c()
  {
    return this.b == CurrentParsingState.State.ISO_IEC_646;
  }

  final void d()
  {
    this.b = CurrentParsingState.State.NUMERIC;
  }

  final void e()
  {
    this.b = CurrentParsingState.State.ALPHA;
  }

  final void f()
  {
    this.b = CurrentParsingState.State.ISO_IEC_646;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState
 * JD-Core Version:    0.6.0
 */