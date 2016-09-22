import java.lang.ref.WeakReference;

abstract class pc extends pa
{
  private static final WeakReference b = new WeakReference(null);
  private WeakReference a = b;

  pc(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }

  final byte[] a()
  {
    monitorenter;
    try
    {
      byte[] arrayOfByte = (byte[])this.a.get();
      if (arrayOfByte == null)
      {
        arrayOfByte = d();
        this.a = new WeakReference(arrayOfByte);
      }
      return arrayOfByte;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  protected abstract byte[] d();
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     pc
 * JD-Core Version:    0.6.0
 */