import com.google.android.libraries.appstreaming.framework.NativeControlStreamer;

final class atd
{
  final NativeControlStreamer a;

  atd(auz paramauz, int paramInt1, int paramInt2)
  {
    this.a = new NativeControlStreamer(paramauz.a, paramauz.b, paramauz.c, paramauz.d, paramInt1, paramInt2);
  }

  final boolean a(avf paramavf)
  {
    return this.a.send(avf.a(paramavf));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     atd
 * JD-Core Version:    0.6.0
 */