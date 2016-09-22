import java.util.ArrayList;
import java.util.List;

public final class ah
{
  final ai a;

  ah(ai paramai)
  {
    this.a = paramai;
  }

  public final int a()
  {
    ArrayList localArrayList = this.a.d.b;
    if (localArrayList == null)
      return 0;
    return localArrayList.size();
  }

  public final List a(List paramList)
  {
    if (this.a.d.b == null)
      return null;
    paramList.addAll(this.a.d.b);
    return paramList;
  }

  public final void b()
  {
    this.a.d.noteStateNotSaved();
  }

  public final boolean c()
  {
    return this.a.d.c();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ah
 * JD-Core Version:    0.6.0
 */