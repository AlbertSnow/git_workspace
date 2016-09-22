import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class fl
{
  private static Comparator e = new fm();
  private List a = new LinkedList();
  private List b = new ArrayList(64);
  private int c = 0;
  private final int d;

  public fl(int paramInt)
  {
    this.d = paramInt;
  }

  private final void a()
  {
    monitorenter;
    try
    {
      if (this.c > this.d)
      {
        byte[] arrayOfByte = (byte[])this.a.remove(0);
        this.b.remove(arrayOfByte);
        this.c -= arrayOfByte.length;
      }
    }
    finally
    {
      monitorexit;
    }
  }

  public final void a(byte[] paramArrayOfByte)
  {
    monitorenter;
    if (paramArrayOfByte != null);
    try
    {
      int i = paramArrayOfByte.length;
      int j = this.d;
      if (i > j);
      while (true)
      {
        return;
        this.a.add(paramArrayOfByte);
        int k = Collections.binarySearch(this.b, paramArrayOfByte, e);
        if (k < 0)
          k = -1 + -k;
        this.b.add(k, paramArrayOfByte);
        this.c += paramArrayOfByte.length;
        a();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final byte[] a(int paramInt)
  {
    monitorenter;
    int i = 0;
    try
    {
      byte[] arrayOfByte;
      if (i < this.b.size())
      {
        arrayOfByte = (byte[])this.b.get(i);
        if (arrayOfByte.length >= paramInt)
        {
          this.c -= arrayOfByte.length;
          this.b.remove(i);
          this.a.remove(arrayOfByte);
        }
      }
      while (true)
      {
        return arrayOfByte;
        i++;
        break;
        arrayOfByte = new byte[paramInt];
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fl
 * JD-Core Version:    0.6.0
 */