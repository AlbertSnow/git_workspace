import java.io.IOException;

public final class avw
{
  protected final int a(Object paramObject)
  {
    throw new IllegalArgumentException(24 + "Unknown type 0");
  }

  protected final void a(Object paramObject, avt paramavt)
  {
    try
    {
      paramavt.c(0);
      throw new IllegalArgumentException(24 + "Unknown type 0");
    }
    catch (IOException localIOException)
    {
    }
    throw new IllegalStateException(localIOException);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    do
      return true;
    while ((paramObject instanceof avw));
    return false;
  }

  public final int hashCode()
  {
    return 31 * (31 * (35557 + null.hashCode()));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avw
 * JD-Core Version:    0.6.0
 */