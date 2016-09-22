import java.lang.ref.WeakReference;

final class akn extends akz
{
  private WeakReference a;

  akn(akk paramakk)
  {
    this.a = new WeakReference(paramakk);
  }

  public final void a()
  {
    akk localakk = (akk)this.a.get();
    if (localakk == null)
      return;
    localakk.d();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     akn
 * JD-Core Version:    0.6.0
 */