import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

final class amx
{
  private final String a;
  private final String b;
  private final ComponentName c;

  public amx(String paramString1, String paramString2)
  {
    this.a = anw.a(paramString1);
    this.b = anw.a(paramString2);
    this.c = null;
  }

  public final Intent a()
  {
    if (this.a != null)
      return new Intent(this.a).setPackage(this.b);
    return new Intent().setComponent(null);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    amx localamx;
    do
    {
      return true;
      if (!(paramObject instanceof amx))
        return false;
      localamx = (amx)paramObject;
    }
    while ((anu.a(this.a, localamx.a)) && (anu.a(null, null)));
    return false;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = null;
    return Arrays.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    if (this.a == null)
      return null.flattenToString();
    return this.a;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     amx
 * JD-Core Version:    0.6.0
 */