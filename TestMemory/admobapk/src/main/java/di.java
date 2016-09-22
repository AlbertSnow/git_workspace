public final class di
  implements Cloneable
{
  private static final Object d = new Object();
  public int[] a;
  public Object[] b;
  public int c;
  private boolean e = false;

  public di()
  {
    this(10);
  }

  private di(int paramInt)
  {
    int i = cy.a(10);
    this.a = new int[i];
    this.b = new Object[i];
    this.c = 0;
  }

  // ERROR //
  private di b()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 46	java/lang/Object:clone	()Ljava/lang/Object;
    //   4: checkcast 2	di
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: getfield 35	di:a	[I
    //   13: invokevirtual 48	[I:clone	()Ljava/lang/Object;
    //   16: checkcast 47	[I
    //   19: putfield 35	di:a	[I
    //   22: aload_2
    //   23: aload_0
    //   24: getfield 37	di:b	[Ljava/lang/Object;
    //   27: invokevirtual 50	[Ljava/lang/Object;:clone	()Ljava/lang/Object;
    //   30: checkcast 49	[Ljava/lang/Object;
    //   33: putfield 37	di:b	[Ljava/lang/Object;
    //   36: aload_2
    //   37: areturn
    //   38: astore_1
    //   39: aconst_null
    //   40: areturn
    //   41: astore_3
    //   42: aload_2
    //   43: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	8	38	java/lang/CloneNotSupportedException
    //   8	36	41	java/lang/CloneNotSupportedException
  }

  public final void a()
  {
    int i = this.c;
    Object[] arrayOfObject = this.b;
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = null;
    this.c = 0;
    this.e = false;
  }

  public final String toString()
  {
    if (this.c <= 0)
      return "{}";
    StringBuilder localStringBuilder = new StringBuilder(28 * this.c);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.c)
    {
      if (i > 0)
        localStringBuilder.append(", ");
      localStringBuilder.append(this.a[i]);
      localStringBuilder.append('=');
      Object localObject = this.b[i];
      if (localObject != this)
        localStringBuilder.append(localObject);
      while (true)
      {
        i++;
        break;
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     di
 * JD-Core Version:    0.6.0
 */