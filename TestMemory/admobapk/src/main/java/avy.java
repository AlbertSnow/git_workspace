import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class avy
  implements Cloneable
{
  List a = new ArrayList();
  private avw b;
  private Object c;

  private final byte[] c()
  {
    byte[] arrayOfByte = new byte[a()];
    a(avt.a(arrayOfByte, 0, arrayOfByte.length));
    return arrayOfByte;
  }

  final int a()
  {
    int i;
    if (this.c != null)
      i = this.b.a(this.c);
    while (true)
    {
      return i;
      Iterator localIterator = this.a.iterator();
      i = 0;
      while (localIterator.hasNext())
      {
        awd localawd = (awd)localIterator.next();
        i += 0 + avt.d(localawd.a) + localawd.b.length;
      }
    }
  }

  final void a(avt paramavt)
  {
    if (this.c != null)
      this.b.a(this.c, paramavt);
    while (true)
    {
      return;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        awd localawd = (awd)localIterator.next();
        paramavt.c(localawd.a);
        paramavt.b(localawd.b);
      }
    }
  }

  public final avy b()
  {
    avy localavy = new avy();
    try
    {
      localavy.b = this.b;
      if (this.a == null)
        localavy.a = null;
      while (true)
      {
        if (this.c == null)
          break label379;
        if (!(this.c instanceof awb))
          break;
        localavy.c = ((awb)((awb)this.c).clone());
        return localavy;
        localavy.a.addAll(this.a);
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    if ((this.c instanceof byte[]))
    {
      localavy.c = ((byte[])this.c).clone();
      return localavy;
    }
    if ((this.c instanceof byte[][]))
    {
      byte[][] arrayOfByte = (byte[][])this.c;
      byte[][] arrayOfByte1 = new byte[arrayOfByte.length][];
      localavy.c = arrayOfByte1;
      for (int j = 0; j < arrayOfByte.length; j++)
        arrayOfByte1[j] = ((byte[])arrayOfByte[j].clone());
    }
    if ((this.c instanceof boolean[]))
    {
      localavy.c = ((boolean[])this.c).clone();
      return localavy;
    }
    if ((this.c instanceof int[]))
    {
      localavy.c = ((int[])this.c).clone();
      return localavy;
    }
    if ((this.c instanceof long[]))
    {
      localavy.c = ((long[])this.c).clone();
      return localavy;
    }
    if ((this.c instanceof float[]))
    {
      localavy.c = ((float[])this.c).clone();
      return localavy;
    }
    if ((this.c instanceof double[]))
    {
      localavy.c = ((double[])this.c).clone();
      return localavy;
    }
    if ((this.c instanceof awb[]))
    {
      awb[] arrayOfawb1 = (awb[])this.c;
      awb[] arrayOfawb2 = new awb[arrayOfawb1.length];
      localavy.c = arrayOfawb2;
      for (int i = 0; i < arrayOfawb1.length; i++)
        arrayOfawb2[i] = ((awb)arrayOfawb1[i].clone());
    }
    label379: return localavy;
  }

  public final boolean equals(Object paramObject)
  {
    int i;
    if (paramObject == this)
      i = 1;
    avy localavy;
    while (true)
    {
      return i;
      boolean bool1 = paramObject instanceof avy;
      i = 0;
      if (!bool1)
        continue;
      localavy = (avy)paramObject;
      if ((this.c == null) || (localavy.c == null))
        break;
      avw localavw1 = this.b;
      avw localavw2 = localavy.b;
      i = 0;
      if (localavw1 != localavw2)
        continue;
      if (!null.isArray())
        return this.c.equals(localavy.c);
      if ((this.c instanceof byte[]))
        return Arrays.equals((byte[])this.c, (byte[])localavy.c);
      if ((this.c instanceof int[]))
        return Arrays.equals((int[])this.c, (int[])localavy.c);
      if ((this.c instanceof long[]))
        return Arrays.equals((long[])this.c, (long[])localavy.c);
      if ((this.c instanceof float[]))
        return Arrays.equals((float[])this.c, (float[])localavy.c);
      if ((this.c instanceof double[]))
        return Arrays.equals((double[])this.c, (double[])localavy.c);
      if ((this.c instanceof boolean[]))
        return Arrays.equals((boolean[])this.c, (boolean[])localavy.c);
      return Arrays.deepEquals((Object[])this.c, (Object[])localavy.c);
    }
    if ((this.a != null) && (localavy.a != null))
      return this.a.equals(localavy.a);
    try
    {
      boolean bool2 = Arrays.equals(c(), localavy.c());
      return bool2;
    }
    catch (IOException localIOException)
    {
    }
    throw new IllegalStateException(localIOException);
  }

  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(c());
      return i + 527;
    }
    catch (IOException localIOException)
    {
    }
    throw new IllegalStateException(localIOException);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avy
 * JD-Core Version:    0.6.0
 */