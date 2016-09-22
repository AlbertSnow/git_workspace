import android.media.AudioTrack;

public class jb
{
  public AudioTrack a;
  boolean b;
  private int c;
  private long d;
  private long e;
  private long f;

  public final long a()
  {
    long l = 0xFFFFFFFF & this.a.getPlaybackHeadPosition();
    if ((ly.a <= 22) && (this.b))
    {
      if (this.a.getPlayState() != 1)
        break label85;
      this.d = l;
    }
    while (true)
    {
      l += this.f;
      if (this.d > l)
        this.e = (1L + this.e);
      this.d = l;
      return l + (this.e << 32);
      label85: if ((this.a.getPlayState() != 2) || (l != 0L))
        continue;
      this.f = this.d;
    }
  }

  public void a(AudioTrack paramAudioTrack, boolean paramBoolean)
  {
    this.a = paramAudioTrack;
    this.b = paramBoolean;
    this.d = 0L;
    this.e = 0L;
    this.f = 0L;
    if (paramAudioTrack != null)
      this.c = paramAudioTrack.getSampleRate();
  }

  public final long b()
  {
    return 1000000L * a() / this.c;
  }

  public boolean c()
  {
    return false;
  }

  public long d()
  {
    throw new UnsupportedOperationException();
  }

  public long e()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jb
 * JD-Core Version:    0.6.0
 */