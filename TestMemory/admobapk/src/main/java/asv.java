import android.media.AudioTrack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

final class asv
  implements Runnable
{
  private aug a = this.d.b.f;
  private int b = AudioTrack.getMinBufferSize(this.a.d, a(this.a.b), 2);
  private AudioTrack c = asu.a(this.a.d, a(this.a.b), this.b);

  asv(asu paramasu)
  {
  }

  private static int a(int paramInt)
  {
    if (paramInt == 1)
      return 4;
    return 12;
  }

  public final void run()
  {
    Logger localLogger1 = asu.a;
    Level localLevel1 = asn.d;
    int i = this.b;
    localLogger1.log(localLevel1, 43 + "AudioTrack buffer length " + i + " bytes.");
    this.c.play();
    short[] arrayOfShort = new short[Math.max(this.a.e, this.a.f) * this.a.b];
    while ((!this.d.d.get()) && (!Thread.interrupted()))
    {
      int j = this.d.c.a(arrayOfShort, 0, this.a.e, this.a.f) * this.a.b;
      int k = this.c.write(arrayOfShort, 0, j);
      if (k == j)
        continue;
      switch (k)
      {
      default:
        Logger localLogger2 = asu.a;
        Level localLevel2 = asn.a;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(k);
        arrayOfObject[1] = Integer.valueOf(j);
        localLogger2.log(localLevel2, String.format("Write returned %d, not equal to data length %d.", arrayOfObject));
        break;
      case -3:
        asu.a.log(asn.a, "Write returned AudioTrack.ERROR_INVALID_OPERATION.");
        break;
      case -2:
        asu.a.log(asn.a, "Write returned AudioTrack.ERROR_BAD_VALUE.");
      }
    }
    this.c.stop();
    this.c.release();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asv
 * JD-Core Version:    0.6.0
 */