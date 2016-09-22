import android.content.Context;
import android.text.TextUtils;
import com.google.ads.afma.nano.d;
import com.google.android.ads.tasks.i;
import com.google.android.gms.ads.identifier.c;
import java.util.ArrayList;
import java.util.List;

public class gx extends gy
{
  public c i;

  static
  {
    gx.class.getSimpleName();
  }

  private gx(Context paramContext)
  {
    super(paramContext, "");
  }

  public static String a(String paramString1, String paramString2)
  {
    return ge.a(paramString1, paramString2, true);
  }

  public static gx d(Context paramContext)
  {
    a(paramContext, true);
    return new gx(paramContext);
  }

  protected final void a(hf paramhf, d paramd)
  {
    if (paramhf.j)
    {
      if (this.i != null)
      {
        String str = this.i.a;
        if (!TextUtils.isEmpty(str))
        {
          paramd.D = hi.a(str);
          paramd.E = Integer.valueOf(5);
          paramd.F = Boolean.valueOf(this.i.b);
        }
        this.i = null;
      }
      return;
    }
    a(b(paramhf, paramd));
  }

  protected final List b(hf paramhf, d paramd)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramhf.b == null)
      return localArrayList;
    localArrayList.add(new i(paramhf, "lLpTIaE60qRmDJilKTnB6dMslmEDCMG+aJ7xPwxeE01HtxatTPhAFeGxL2EFpKqq", "LwAyv7R7EEW6/T7p6KlsghmfaITLnkCV2ffewHyZJ4E=", paramd, paramhf.f(), 24));
    return localArrayList;
  }

  protected final d c(Context paramContext)
  {
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     gx
 * JD-Core Version:    0.6.0
 */