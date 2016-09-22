import android.view.View;

final class aa extends ag
{
  aa(z paramz)
  {
  }

  public final View a(int paramInt)
  {
    if (this.a.K == null)
      throw new IllegalStateException("Fragment does not have a view");
    return this.a.K.findViewById(paramInt);
  }

  public final boolean a()
  {
    return this.a.K != null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aa
 * JD-Core Version:    0.6.0
 */