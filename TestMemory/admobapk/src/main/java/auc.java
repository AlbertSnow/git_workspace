import com.google.android.libraries.appstreaming.framework.NativeVideoPlayer;

final class auc
  implements Runnable
{
  auc(aub paramaub)
  {
  }

  public final void run()
  {
    try
    {
      this.a.d.start();
      int i = this.a.d.error();
      if (i != 0)
      {
        if (this.a.f)
          break label69;
        this.a.g.a(i);
      }
      while (true)
      {
        return;
        label69: this.a.g.b(i);
      }
    }
    finally
    {
      this.a.c.c();
      this.a.d.release();
    }
    throw localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     auc
 * JD-Core Version:    0.6.0
 */