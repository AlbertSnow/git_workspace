import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class asl
  implements Runnable
{
  public asl(asj paramasj)
  {
  }

  public final void run()
  {
    try
    {
      while (!this.a.h.get())
      {
        asj localasj = this.a;
        avf localavf = (avf)this.a.l.take();
        int i = localavf.e();
        localByteBuffer = localasj.m;
        j = i & 0x7F;
        i >>>= 7;
        if (i == 0)
        {
          localByteBuffer.put((byte)j);
          localavf.a(avt.a(localasj.m.array(), localasj.m.position(), localavf.e() + localasj.m.position()));
          localasj.k.write(localasj.m.array(), 0, localavf.e() + localasj.m.position());
          localasj.m.rewind();
          synchronized (this.a.n)
          {
            if (this.a.n.decrementAndGet() == 0)
              this.a.n.notify();
          }
        }
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        ByteBuffer localByteBuffer;
        int j;
        this.a.a(1);
        return;
        byte b = (byte)(j | 0x80);
        localByteBuffer.put(b);
      }
    }
    catch (IOException localIOException)
    {
      label195: break label195;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asl
 * JD-Core Version:    0.6.0
 */