import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ajv
  implements ako
{
  final akp a;
  boolean b = false;

  public ajv(akp paramakp)
  {
    this.a = paramakp;
  }

  public final ajh a(ajh paramajh)
  {
    return b(paramajh);
  }

  public final void a()
  {
  }

  public final void a(int paramInt)
  {
    this.a.a(null);
    this.a.n.a(paramInt, this.b);
  }

  public final void a(Bundle paramBundle)
  {
  }

  public final void a(ConnectionResult paramConnectionResult, aia paramaia, int paramInt)
  {
  }

  public final ajh b(ajh paramajh)
  {
    try
    {
      this.a.m.h.a(paramajh);
      akk localakk = this.a.m;
      aid localaid = paramajh.a;
      Object localObject = (aif)localakk.e.get(localaid);
      anw.a(localObject, "Appropriate Api was not requested.");
      if ((!((aif)localObject).e()) && (this.a.g.containsKey(paramajh.a)))
      {
        paramajh.b(new Status(17));
        return paramajh;
      }
      if ((localObject instanceof anz))
        localObject = ((anz)localObject).l;
      paramajh.b((aic)localObject);
      return paramajh;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      this.a.a(new ajw(this, this));
    }
    return (ajh)paramajh;
  }

  public final boolean b()
  {
    if (this.b)
      return false;
    if (this.a.m.g())
    {
      this.b = true;
      Iterator localIterator = this.a.m.g.iterator();
      while (localIterator.hasNext())
        ((all)localIterator.next()).a = null;
      return false;
    }
    this.a.a(null);
    return true;
  }

  public final void c()
  {
    if (this.b)
    {
      this.b = false;
      this.a.a(new ajx(this, this));
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajv
 * JD-Core Version:    0.6.0
 */