import java.io.IOException;

public final class avu extends IOException
{
  private static final long serialVersionUID = -6947486886997889499L;

  avu(int paramInt1, int paramInt2)
  {
    super(108 + "CodedOutputStream was writing to a flat byte array and ran out of space (pos " + paramInt1 + " limit " + paramInt2 + ").");
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avu
 * JD-Core Version:    0.6.0
 */