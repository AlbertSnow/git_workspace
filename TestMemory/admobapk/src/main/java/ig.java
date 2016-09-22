import android.text.TextUtils;

final class ig
{
  public final String a;
  public final boolean b;

  public ig(String paramString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramBoolean;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    ig localig;
    do
    {
      return true;
      if ((paramObject == null) || (paramObject.getClass() != ig.class))
        return false;
      localig = (ig)paramObject;
    }
    while ((TextUtils.equals(this.a, localig.a)) && (this.b == localig.b));
    return false;
  }

  public final int hashCode()
  {
    int i;
    int j;
    if (this.a == null)
    {
      i = 0;
      j = 31 * (i + 31);
      if (!this.b)
        break label43;
    }
    label43: for (int k = 1231; ; k = 1237)
    {
      return k + j;
      i = this.a.hashCode();
      break;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ig
 * JD-Core Version:    0.6.0
 */