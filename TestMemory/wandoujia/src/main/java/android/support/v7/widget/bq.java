package android.support.v7.widget;

import java.util.List;

final class bq
{
  private br a;

  public bq(br parambr)
  {
    this.a = parambr;
  }

  final void a(List<o> paramList)
  {
    int i;
    int j;
    label11: int k;
    label39: int m;
    o localo1;
    o localo2;
    int i4;
    while (true)
    {
      i = -1 + paramList.size();
      j = 0;
      if (i < 0)
        break label251;
      if (((o)paramList.get(i)).a != 3)
        break;
      if (j == 0)
        break label1222;
      k = i;
      if (k == -1)
        break label1179;
      m = k + 1;
      localo1 = (o)paramList.get(k);
      localo2 = (o)paramList.get(m);
      switch (localo2.a)
      {
      default:
        break;
      case 0:
        if (localo1.c >= localo2.b)
          break label1192;
        i4 = -1;
        label127: if (localo1.b < localo2.b)
          i4++;
        if (localo2.b <= localo1.b)
          localo1.b += localo2.c;
        if (localo2.b <= localo1.c)
          localo1.c += localo2.c;
        localo2.b = (i4 + localo2.b);
        paramList.set(k, localo2);
        paramList.set(m, localo1);
      case 1:
      case 2:
      }
    }
    label308: label1204: label1213: label1222: for (int i5 = 1; ; i5 = j)
    {
      i--;
      j = i5;
      break label11;
      label251: k = -1;
      break label39;
      int i1;
      int i2;
      if (localo1.b < localo1.c)
      {
        if ((localo2.b != localo1.b) || (localo2.c != localo1.c - localo1.b))
          break label1213;
        i1 = 0;
        i2 = 1;
      }
      while (true)
      {
        label333: o localo3;
        if (localo1.c < localo2.b)
        {
          localo2.b = (-1 + localo2.b);
          if (localo1.b > localo2.b)
            break label517;
          localo2.b = (1 + localo2.b);
          localo3 = null;
        }
        while (true)
        {
          label721: Object localObject1;
          if (i2 != 0)
          {
            paramList.set(k, localo2);
            paramList.remove(m);
            this.a.a(localo1);
            break;
            if ((localo2.b != 1 + localo1.c) || (localo2.c != localo1.b - localo1.c))
              break label1204;
            i1 = 1;
            i2 = 1;
            break label308;
            if (localo1.c >= localo2.b + localo2.c)
              break label333;
            localo2.c = (-1 + localo2.c);
            localo1.a = 1;
            localo1.c = 1;
            if (localo2.c != 0)
              break;
            paramList.remove(m);
            this.a.a(localo2);
            break;
            if (localo1.b < localo2.b + localo2.c)
            {
              int i3 = localo2.b + localo2.c - localo1.b;
              localo3 = this.a.a(1, 1 + localo1.b, i3);
              localo2.c = (localo1.b - localo2.b);
              continue;
            }
          }
          else
          {
            if (i1 != 0)
            {
              if (localo3 != null)
              {
                if (localo1.b > localo3.b)
                  localo1.b -= localo3.c;
                if (localo1.c > localo3.b)
                  localo1.c -= localo3.c;
              }
              if (localo1.b > localo2.b)
                localo1.b -= localo2.c;
              if (localo1.c > localo2.b)
                localo1.c -= localo2.c;
              paramList.set(k, localo2);
              if (localo1.b == localo1.c)
                break label898;
              paramList.set(m, localo1);
            }
            while (localo3 != null)
            {
              paramList.add(k, localo3);
              break;
              if (localo3 != null)
              {
                if (localo1.b >= localo3.b)
                  localo1.b -= localo3.c;
                if (localo1.c >= localo3.b)
                  localo1.c -= localo3.c;
              }
              if (localo1.b >= localo2.b)
                localo1.b -= localo2.c;
              if (localo1.c < localo2.b)
                break label721;
              localo1.c -= localo2.c;
              break label721;
              paramList.remove(m);
            }
            if (localo1.c < localo2.b)
            {
              localo2.b = (-1 + localo2.b);
              localObject1 = null;
            }
            while (true)
            {
              Object localObject2;
              if (localo1.b <= localo2.b)
              {
                localo2.b = (1 + localo2.b);
                localObject2 = null;
              }
              while (true)
              {
                label966: paramList.set(m, localo1);
                if (localo2.c > 0)
                  paramList.set(k, localo2);
                while (true)
                {
                  if (localObject1 != null)
                    paramList.add(k, localObject1);
                  if (localObject2 == null)
                    break;
                  paramList.add(k, localObject2);
                  break;
                  if (localo1.c >= localo2.b + localo2.c)
                    break label1186;
                  localo2.c = (-1 + localo2.c);
                  localObject1 = this.a.a(2, localo1.b, 1);
                  break label938;
                  if (localo1.b >= localo2.b + localo2.c)
                    break label1180;
                  int n = localo2.b + localo2.c - localo1.b;
                  localObject2 = this.a.a(2, 1 + localo1.b, n);
                  localo2.c -= n;
                  break label966;
                  paramList.remove(k);
                  this.a.a(localo2);
                }
                return;
                localObject2 = null;
              }
              localObject1 = null;
            }
            i4 = 0;
            break label127;
          }
          localo3 = null;
        }
        i1 = 1;
        i2 = 0;
        continue;
        i1 = 0;
        i2 = 0;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.bq
 * JD-Core Version:    0.6.0
 */