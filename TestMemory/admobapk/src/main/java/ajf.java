import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public final class ajf extends ajl
{
  private int a;
  private boolean b;

  private ail b(Status paramStatus)
  {
    monitorenter;
    try
    {
      ConnectionResult localConnectionResult = new ConnectionResult(8);
      for (int i = 0; i < null.size(); i++)
        a((ajc)null.b(i), localConnectionResult);
      if (null.size() == 1);
      for (Object localObject2 = new aik(paramStatus, null); ; localObject2 = new ail(paramStatus, null))
        return localObject2;
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  public final void a(ajc paramajc, ConnectionResult paramConnectionResult)
  {
    monitorenter;
    try
    {
      null.put(paramajc, paramConnectionResult);
      this.a = (-1 + this.a);
      if (!paramConnectionResult.b())
        this.b = true;
      Status localStatus;
      if (this.a == 0)
      {
        if (!this.b)
          break label85;
        localStatus = new Status(13);
        if (null.size() != 1)
          break label93;
      }
      label85: label93: for (Object localObject2 = new aik(localStatus, null); ; localObject2 = new ail(localStatus, null))
      {
        a((aiv)localObject2);
        return;
        localStatus = Status.a;
        break;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ajf
 * JD-Core Version:    0.6.0
 */