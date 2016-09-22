import java.io.FilterInputStream;
import java.io.InputStream;

final class fp extends FilterInputStream
{
  int a = 0;

  fp(InputStream paramInputStream)
  {
    super(paramInputStream);
  }

  public final int read()
  {
    int i = super.read();
    if (i != -1)
      this.a = (1 + this.a);
    return i;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (i != -1)
      this.a = (i + this.a);
    return i;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     fp
 * JD-Core Version:    0.6.0
 */