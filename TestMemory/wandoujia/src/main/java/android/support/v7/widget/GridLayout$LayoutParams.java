package android.support.v7.widget;

import android.content.res.TypedArray;
import android.support.v7.gridlayout.R.styleable;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class GridLayout$LayoutParams extends ViewGroup.MarginLayoutParams
{
  private static final int c = new as(-2147483648, -2147483647).a();
  private static final int d = R.styleable.GridLayout_Layout_android_layout_margin;
  private static final int e = R.styleable.GridLayout_Layout_android_layout_marginLeft;
  private static final int f = R.styleable.GridLayout_Layout_android_layout_marginTop;
  private static final int g = R.styleable.GridLayout_Layout_android_layout_marginRight;
  private static final int h = R.styleable.GridLayout_Layout_android_layout_marginBottom;
  private static final int i = R.styleable.GridLayout_Layout_layout_column;
  private static final int j = R.styleable.GridLayout_Layout_layout_columnSpan;
  private static final int k = R.styleable.GridLayout_Layout_layout_columnWeight;
  private static final int l = R.styleable.GridLayout_Layout_layout_row;
  private static final int m = R.styleable.GridLayout_Layout_layout_rowSpan;
  private static final int n = R.styleable.GridLayout_Layout_layout_rowWeight;
  private static final int o = R.styleable.GridLayout_Layout_layout_gravity;
  public av a = av.a;
  public av b = av.a;

  public GridLayout$LayoutParams()
  {
    this(av.a, av.a, 0);
  }

  // ERROR //
  public GridLayout$LayoutParams(android.content.Context paramContext, android.util.AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial 108	android/view/ViewGroup$MarginLayoutParams:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   6: aload_0
    //   7: getstatic 102	android/support/v7/widget/av:a	Landroid/support/v7/widget/av;
    //   10: putfield 109	android/support/v7/widget/GridLayout$LayoutParams:a	Landroid/support/v7/widget/av;
    //   13: aload_0
    //   14: getstatic 102	android/support/v7/widget/av:a	Landroid/support/v7/widget/av;
    //   17: putfield 111	android/support/v7/widget/GridLayout$LayoutParams:b	Landroid/support/v7/widget/av;
    //   20: aload_1
    //   21: aload_2
    //   22: getstatic 115	android/support/v7/gridlayout/R$styleable:GridLayout_Layout	[I
    //   25: invokevirtual 121	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   28: astore_3
    //   29: aload_3
    //   30: getstatic 43	android/support/v7/widget/GridLayout$LayoutParams:d	I
    //   33: ldc 26
    //   35: invokevirtual 127	android/content/res/TypedArray:getDimensionPixelSize	(II)I
    //   38: istore 5
    //   40: aload_0
    //   41: aload_3
    //   42: getstatic 48	android/support/v7/widget/GridLayout$LayoutParams:e	I
    //   45: iload 5
    //   47: invokevirtual 127	android/content/res/TypedArray:getDimensionPixelSize	(II)I
    //   50: putfield 130	android/support/v7/widget/GridLayout$LayoutParams:leftMargin	I
    //   53: aload_0
    //   54: aload_3
    //   55: getstatic 53	android/support/v7/widget/GridLayout$LayoutParams:f	I
    //   58: iload 5
    //   60: invokevirtual 127	android/content/res/TypedArray:getDimensionPixelSize	(II)I
    //   63: putfield 133	android/support/v7/widget/GridLayout$LayoutParams:topMargin	I
    //   66: aload_0
    //   67: aload_3
    //   68: getstatic 58	android/support/v7/widget/GridLayout$LayoutParams:g	I
    //   71: iload 5
    //   73: invokevirtual 127	android/content/res/TypedArray:getDimensionPixelSize	(II)I
    //   76: putfield 136	android/support/v7/widget/GridLayout$LayoutParams:rightMargin	I
    //   79: aload_0
    //   80: aload_3
    //   81: getstatic 63	android/support/v7/widget/GridLayout$LayoutParams:h	I
    //   84: iload 5
    //   86: invokevirtual 127	android/content/res/TypedArray:getDimensionPixelSize	(II)I
    //   89: putfield 139	android/support/v7/widget/GridLayout$LayoutParams:bottomMargin	I
    //   92: aload_3
    //   93: invokevirtual 142	android/content/res/TypedArray:recycle	()V
    //   96: aload_1
    //   97: aload_2
    //   98: getstatic 115	android/support/v7/gridlayout/R$styleable:GridLayout_Layout	[I
    //   101: invokevirtual 121	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   104: astore 6
    //   106: aload 6
    //   108: getstatic 98	android/support/v7/widget/GridLayout$LayoutParams:o	I
    //   111: iconst_0
    //   112: invokevirtual 145	android/content/res/TypedArray:getInt	(II)I
    //   115: istore 8
    //   117: aload 6
    //   119: getstatic 68	android/support/v7/widget/GridLayout$LayoutParams:i	I
    //   122: ldc 26
    //   124: invokevirtual 145	android/content/res/TypedArray:getInt	(II)I
    //   127: istore 9
    //   129: aload 6
    //   131: getstatic 73	android/support/v7/widget/GridLayout$LayoutParams:j	I
    //   134: getstatic 36	android/support/v7/widget/GridLayout$LayoutParams:c	I
    //   137: invokevirtual 145	android/content/res/TypedArray:getInt	(II)I
    //   140: istore 10
    //   142: aload 6
    //   144: getstatic 78	android/support/v7/widget/GridLayout$LayoutParams:k	I
    //   147: fconst_0
    //   148: invokevirtual 149	android/content/res/TypedArray:getFloat	(IF)F
    //   151: fstore 11
    //   153: aload_0
    //   154: iload 9
    //   156: iload 10
    //   158: iload 8
    //   160: iconst_1
    //   161: invokestatic 154	android/support/v7/widget/GridLayout:a	(IZ)Landroid/support/v7/widget/an;
    //   164: fload 11
    //   166: invokestatic 157	android/support/v7/widget/GridLayout:a	(IILandroid/support/v7/widget/an;F)Landroid/support/v7/widget/av;
    //   169: putfield 111	android/support/v7/widget/GridLayout$LayoutParams:b	Landroid/support/v7/widget/av;
    //   172: aload 6
    //   174: getstatic 83	android/support/v7/widget/GridLayout$LayoutParams:l	I
    //   177: ldc 26
    //   179: invokevirtual 145	android/content/res/TypedArray:getInt	(II)I
    //   182: istore 12
    //   184: aload 6
    //   186: getstatic 88	android/support/v7/widget/GridLayout$LayoutParams:m	I
    //   189: getstatic 36	android/support/v7/widget/GridLayout$LayoutParams:c	I
    //   192: invokevirtual 145	android/content/res/TypedArray:getInt	(II)I
    //   195: istore 13
    //   197: aload 6
    //   199: getstatic 93	android/support/v7/widget/GridLayout$LayoutParams:n	I
    //   202: fconst_0
    //   203: invokevirtual 149	android/content/res/TypedArray:getFloat	(IF)F
    //   206: fstore 14
    //   208: aload_0
    //   209: iload 12
    //   211: iload 13
    //   213: iload 8
    //   215: iconst_0
    //   216: invokestatic 154	android/support/v7/widget/GridLayout:a	(IZ)Landroid/support/v7/widget/an;
    //   219: fload 14
    //   221: invokestatic 157	android/support/v7/widget/GridLayout:a	(IILandroid/support/v7/widget/an;F)Landroid/support/v7/widget/av;
    //   224: putfield 109	android/support/v7/widget/GridLayout$LayoutParams:a	Landroid/support/v7/widget/av;
    //   227: aload 6
    //   229: invokevirtual 142	android/content/res/TypedArray:recycle	()V
    //   232: return
    //   233: astore 4
    //   235: aload_3
    //   236: invokevirtual 142	android/content/res/TypedArray:recycle	()V
    //   239: aload 4
    //   241: athrow
    //   242: astore 7
    //   244: aload 6
    //   246: invokevirtual 142	android/content/res/TypedArray:recycle	()V
    //   249: aload 7
    //   251: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   29	92	233	finally
    //   106	227	242	finally
  }

  private GridLayout$LayoutParams(av paramav1, av paramav2)
  {
    super(-2, -2);
    setMargins(-2147483648, -2147483648, -2147483648, -2147483648);
    this.a = paramav1;
    this.b = paramav2;
  }

  private GridLayout$LayoutParams(av paramav1, av paramav2, byte paramByte)
  {
    this(paramav1, paramav2);
  }

  public GridLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    LayoutParams localLayoutParams;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localLayoutParams = (LayoutParams)paramObject;
      if (!this.b.equals(localLayoutParams.b))
        return false;
    }
    while (this.a.equals(localLayoutParams.a));
    return false;
  }

  public int hashCode()
  {
    return 31 * this.a.hashCode() + this.b.hashCode();
  }

  protected void setBaseAttributes(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    this.width = paramTypedArray.getLayoutDimension(paramInt1, -2);
    this.height = paramTypedArray.getLayoutDimension(paramInt2, -2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.GridLayout.LayoutParams
 * JD-Core Version:    0.6.0
 */