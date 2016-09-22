import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;

class dm extends dl
{
  public void a(LayoutInflater paramLayoutInflater, ds paramds)
  {
    if (paramds != null);
    for (dr localdr = new dr(paramds); ; localdr = null)
    {
      paramLayoutInflater.setFactory2(localdr);
      LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
      if (!(localFactory instanceof LayoutInflater.Factory2))
        break;
      dq.a(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
      return;
    }
    dq.a(paramLayoutInflater, localdr);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     dm
 * JD-Core Version:    0.6.0
 */