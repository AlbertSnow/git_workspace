import com.google.android.libraries.appstreaming.framework.NativeAudioPlayer;

final class asx
  implements Runnable
{
  NativeAudioPlayer a;

  asx(asu paramasu)
  {
    asu localasu = this.b;
    auz localauz = this.b.b;
    this.a = new NativeAudioPlayer(localauz.f, localauz.a, localauz.b, localauz.c, localauz.d, localasu.g);
  }

  public final void run()
  {
    try
    {
      this.a.start();
      int i = this.a.error();
      if (i != 0)
        this.b.f.a(i);
      return;
    }
    finally
    {
      this.a.release();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asx
 * JD-Core Version:    0.6.0
 */