import android.media.AudioTrack;
import android.os.ConditionVariable;

final class iz extends Thread
{
  iz(iy paramiy, AudioTrack paramAudioTrack)
  {
  }

  public final void run()
  {
    try
    {
      this.a.release();
      return;
    }
    finally
    {
      this.b.a.open();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     iz
 * JD-Core Version:    0.6.0
 */