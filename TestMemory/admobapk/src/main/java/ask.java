import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ask
  implements Runnable
{
  public ask(asj paramasj)
  {
  }

  public final void run()
  {
    try
    {
      if (!this.a.h.get())
      {
        localasm = this.a.g;
        localasj = this.a;
        localInputStream = localasj.j;
        i = 0;
        j = 0;
        if (i < 32)
          break label68;
        throw new IndexOutOfBoundsException("varint too long");
      }
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      asj localasj;
      int j;
      int k;
      do
      {
        InputStream localInputStream;
        int i;
        this.a.a(3);
        return;
        k = localInputStream.read();
        j |= (k & 0x7F) << i;
        i += 7;
      }
      while ((k & 0x80) != 0);
      arrayOfByte = new byte[j];
      m = j;
      if (m > 0)
      {
        n = localasj.j.read(arrayOfByte, j - m, m);
        if (n < 0)
          throw new EOFException();
      }
    }
    catch (EOFException localEOFException)
    {
      while (true)
      {
        asm localasm;
        byte[] arrayOfByte;
        int m;
        int n;
        this.a.a(4);
        return;
        m -= n;
        continue;
        localasm.a((avf)awb.a(new avf(), arrayOfByte));
      }
    }
    catch (IOException localIOException)
    {
      label68: this.a.a(2);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ask
 * JD-Core Version:    0.6.0
 */