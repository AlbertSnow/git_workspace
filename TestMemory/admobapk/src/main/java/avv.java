import java.util.List;

public abstract class avv extends awb
{
  public avx H;

  public int a()
  {
    int i = 0;
    if (this.H != null)
    {
      j = 0;
      while (i < this.H.d)
      {
        j += this.H.c[i].a();
        i++;
      }
    }
    int j = 0;
    return j;
  }

  public void a(avt paramavt)
  {
    if (this.H == null);
    while (true)
    {
      return;
      for (int i = 0; i < this.H.d; i++)
        this.H.c[i].a(paramavt);
    }
  }

  public final boolean a(avs paramavs, int paramInt)
  {
    int i = paramavs.j();
    if (!paramavs.b(paramInt))
      return false;
    int j = paramInt >>> 3;
    int k = paramavs.j() - i;
    byte[] arrayOfByte;
    awd localawd;
    avy localavy;
    label71: avx localavx2;
    int i1;
    if (k == 0)
    {
      arrayOfByte = awe.e;
      localawd = new awd(paramInt, arrayOfByte);
      if (this.H != null)
        break label161;
      this.H = new avx();
      localavy = null;
      if (localavy == null)
      {
        localavy = new avy();
        localavx2 = this.H;
        i1 = localavx2.b(j);
        if (i1 < 0)
          break label214;
        localavx2.c[i1] = localavy;
      }
    }
    while (true)
    {
      localavy.a.add(localawd);
      return true;
      arrayOfByte = new byte[k];
      int m = i + paramavs.b;
      System.arraycopy(paramavs.a, m, arrayOfByte, 0, k);
      break;
      label161: avx localavx1 = this.H;
      int n = localavx1.b(j);
      if ((n < 0) || (localavx1.c[n] == avx.a))
      {
        localavy = null;
        break label71;
      }
      localavy = localavx1.c[n];
      break label71;
      label214: int i2 = i1 ^ 0xFFFFFFFF;
      if ((i2 < localavx2.d) && (localavx2.c[i2] == avx.a))
      {
        localavx2.b[i2] = j;
        localavx2.c[i2] = localavy;
        continue;
      }
      if (localavx2.d >= localavx2.b.length)
      {
        int i3 = localavx2.a(1 + localavx2.d);
        int[] arrayOfInt = new int[i3];
        avy[] arrayOfavy = new avy[i3];
        System.arraycopy(localavx2.b, 0, arrayOfInt, 0, localavx2.b.length);
        System.arraycopy(localavx2.c, 0, arrayOfavy, 0, localavx2.c.length);
        localavx2.b = arrayOfInt;
        localavx2.c = arrayOfavy;
      }
      if (localavx2.d - i2 != 0)
      {
        System.arraycopy(localavx2.b, i2, localavx2.b, i2 + 1, localavx2.d - i2);
        System.arraycopy(localavx2.c, i2, localavx2.c, i2 + 1, localavx2.d - i2);
      }
      localavx2.b[i2] = j;
      localavx2.c[i2] = localavy;
      localavx2.d = (1 + localavx2.d);
    }
  }

  public avv c()
  {
    avv localavv = (avv)super.d();
    avz.a(this, localavv);
    return localavv;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avv
 * JD-Core Version:    0.6.0
 */