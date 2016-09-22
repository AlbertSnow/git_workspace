import java.io.IOException;

public final class awa extends IOException
{
  private static final long serialVersionUID = -1616151763072450476L;

  public awa(String paramString)
  {
    super(paramString);
  }

  static awa a()
  {
    return new awa("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
  }

  static awa b()
  {
    return new awa("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }

  static awa c()
  {
    return new awa("CodedInputStream encountered a malformed varint.");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awa
 * JD-Core Version:    0.6.0
 */