import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
final class jc extends jb
{
  private final AudioTimestamp c = new AudioTimestamp();
  private long d;
  private long e;
  private long f;

  public jc()
  {
    super(0);
  }

  public final void a(AudioTrack paramAudioTrack, boolean paramBoolean)
  {
    super.a(paramAudioTrack, paramBoolean);
    this.d = 0L;
    this.e = 0L;
    this.f = 0L;
  }

  public final boolean c()
  {
    boolean bool = this.a.getTimestamp(this.c);
    if (bool)
    {
      long l = this.c.framePosition;
      if (this.e > l)
        this.d = (1L + this.d);
      this.e = l;
      this.f = (l + (this.d << 32));
    }
    return bool;
  }

  public final long d()
  {
    return this.c.nanoTime;
  }

  public final long e()
  {
    return this.f;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jc
 * JD-Core Version:    0.6.0
 */