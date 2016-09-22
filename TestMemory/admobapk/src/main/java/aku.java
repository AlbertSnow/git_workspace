import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

final class aku extends PhantomReference
{
  final int a;

  public aku(akt paramakt, ain paramain, int paramInt, ReferenceQueue paramReferenceQueue)
  {
    super(paramain, paramReferenceQueue);
    this.a = paramInt;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aku
 * JD-Core Version:    0.6.0
 */