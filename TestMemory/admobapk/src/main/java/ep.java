final class ep
  implements Runnable
{
  private final ev a;
  private final ez b;
  private final Runnable c;

  public ep(en paramen, ev paramev, ez paramez, Runnable paramRunnable)
  {
    this.a = paramev;
    this.b = paramez;
    this.c = paramRunnable;
  }

  public final void run()
  {
    int i;
    if (this.b.c == null)
    {
      i = 1;
      if (i == 0)
        break label76;
      this.a.a(this.b.a);
      label35: if (!this.b.d)
        break label111;
      this.a.a("intermediate-response");
    }
    while (true)
    {
      if (this.c != null)
        this.c.run();
      return;
      i = 0;
      break;
      label76: ev localev = this.a;
      fg localfg = this.b.c;
      if (localev.e == null)
        break label35;
      localev.e.a(localfg);
      break label35;
      label111: this.a.b("done");
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ep
 * JD-Core Version:    0.6.0
 */