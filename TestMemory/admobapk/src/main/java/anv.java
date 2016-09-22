import java.util.ArrayList;
import java.util.List;

public final class anv
{
  private final List a;
  private final Object b;

  anv(Object paramObject)
  {
    this.b = anw.a(paramObject);
    this.a = new ArrayList();
  }

  public final anv a(String paramString, Object paramObject)
  {
    List localList = this.a;
    String str1 = (String)anw.a(paramString);
    String str2 = String.valueOf(String.valueOf(paramObject));
    localList.add(1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + "=" + str2);
    return this;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)this.a.get(j));
      if (j >= i - 1)
        continue;
      localStringBuilder.append(", ");
    }
    return '}';
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     anv
 * JD-Core Version:    0.6.0
 */