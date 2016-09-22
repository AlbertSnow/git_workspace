import android.content.Context;
import com.google.ads.afma.nano.d;
import com.google.android.ads.tasks.i;
import java.util.ArrayList;
import java.util.List;

public class gz extends gy
{
  static
  {
    gz.class.getSimpleName();
  }

  private gz(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext, paramString, paramBoolean);
  }

  public static gz a(String paramString, Context paramContext, boolean paramBoolean)
  {
    a(paramContext, paramBoolean);
    return new gz(paramContext, paramString, paramBoolean);
  }

  protected final List b(hf paramhf, d paramd)
  {
    if ((paramhf.b == null) || (!this.j))
      return super.b(paramhf, paramd);
    int i = paramhf.f();
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(super.b(paramhf, paramd));
    localArrayList.add(new i(paramhf, "lLpTIaE60qRmDJilKTnB6dMslmEDCMG+aJ7xPwxeE01HtxatTPhAFeGxL2EFpKqq", "LwAyv7R7EEW6/T7p6KlsghmfaITLnkCV2ffewHyZJ4E=", paramd, i, 24));
    return localArrayList;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     gz
 * JD-Core Version:    0.6.0
 */