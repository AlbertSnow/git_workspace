package android.support.v7.widget;

import android.view.View;
import java.util.List;

final class bc
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h = 0;
  int i;
  List<co> j = null;

  final View a(ch paramch)
  {
    if (this.j != null)
    {
      int k = this.j.size();
      for (int m = 0; m < k; m++)
      {
        co localco = (co)this.j.get(m);
        if ((localco.o()) || (this.d != localco.d()))
          continue;
        a(localco);
        return localco.a;
      }
      return null;
    }
    View localView = paramch.c(this.d);
    this.d += this.e;
    return localView;
  }

  public final void a(co paramco)
  {
    int k = this.j.size();
    Object localObject1 = null;
    int m = 2147483647;
    int n = 0;
    Object localObject2;
    Object localObject3;
    int i2;
    if (n < k)
    {
      localObject2 = (co)this.j.get(n);
      if ((localObject2 == paramco) || (((co)localObject2).o()))
        break label138;
      int i3 = (((co)localObject2).d() - this.d) * this.e;
      if ((i3 < 0) || (i3 >= m))
        break label138;
      if (i3 == 0)
        break label113;
      localObject3 = localObject2;
      i2 = i3;
    }
    while (true)
    {
      n++;
      localObject1 = localObject3;
      m = i2;
      break;
      localObject2 = localObject1;
      label113: if (localObject2 == null);
      for (int i1 = -1; ; i1 = ((co)localObject2).d())
      {
        this.d = i1;
        return;
      }
      label138: i2 = m;
      localObject3 = localObject1;
    }
  }

  final boolean a(cm paramcm)
  {
    return (this.d >= 0) && (this.d < paramcm.e());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bc
 * JD-Core Version:    0.6.0
 */