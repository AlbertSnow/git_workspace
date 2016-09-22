package android.support.v7.widget;

final class aq
{
  ao[] a = new ao[this.f.length];
  int b = -1 + this.a.length;
  ao[][] c = this.g.a(this.f);
  private int[] e = new int[1 + this.g.a()];

  static
  {
    if (!GridLayout.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      d = bool;
      return;
    }
  }

  aq(ap paramap, ao[] paramArrayOfao)
  {
  }

  final void a(int paramInt)
  {
    switch (this.e[paramInt])
    {
    default:
    case 0:
    case 1:
    }
    do
    {
      return;
      this.e[paramInt] = 1;
      for (ao localao : this.c[paramInt])
      {
        a(localao.a.b);
        ao[] arrayOfao2 = this.a;
        int k = this.b;
        this.b = (k - 1);
        arrayOfao2[k] = localao;
      }
      this.e[paramInt] = 2;
      return;
    }
    while (d);
    throw new AssertionError();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.aq
 * JD-Core Version:    0.6.0
 */