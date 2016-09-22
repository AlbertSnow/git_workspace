package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class PagerTitleStrip extends ViewGroup
  implements cg
{
  private static final int[] n = { 16842804, 16842901, 16842904, 16842927 };
  private static final int[] o = { 16843660 };
  private static final ax q;
  ViewPager a;
  TextView b;
  TextView c;
  TextView d;
  int e;
  private int f = -1;
  private float g = -1.0F;
  private int h;
  private int i;
  private boolean j;
  private boolean k;
  private final aw l = new aw(this, 0);
  private WeakReference<at> m;
  private int p;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      q = new az();
      return;
    }
    q = new ay();
  }

  public PagerTitleStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TextView localTextView1 = new TextView(paramContext);
    this.b = localTextView1;
    addView(localTextView1);
    TextView localTextView2 = new TextView(paramContext);
    this.c = localTextView2;
    addView(localTextView2);
    TextView localTextView3 = new TextView(paramContext);
    this.d = localTextView3;
    addView(localTextView3);
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, n);
    int i1 = localTypedArray1.getResourceId(0, 0);
    if (i1 != 0)
    {
      this.b.setTextAppearance(paramContext, i1);
      this.c.setTextAppearance(paramContext, i1);
      this.d.setTextAppearance(paramContext, i1);
    }
    int i2 = localTypedArray1.getDimensionPixelSize(1, 0);
    if (i2 != 0)
    {
      float f1 = i2;
      this.b.setTextSize(0, f1);
      this.c.setTextSize(0, f1);
      this.d.setTextSize(0, f1);
    }
    if (localTypedArray1.hasValue(2))
    {
      int i3 = localTypedArray1.getColor(2, 0);
      this.b.setTextColor(i3);
      this.c.setTextColor(i3);
      this.d.setTextColor(i3);
    }
    this.i = localTypedArray1.getInteger(3, 80);
    localTypedArray1.recycle();
    this.e = this.c.getTextColors().getDefaultColor();
    setNonPrimaryAlpha(0.6F);
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    this.c.setEllipsize(TextUtils.TruncateAt.END);
    this.d.setEllipsize(TextUtils.TruncateAt.END);
    boolean bool = false;
    if (i1 != 0)
    {
      TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(i1, o);
      bool = localTypedArray2.getBoolean(0, false);
      localTypedArray2.recycle();
    }
    if (bool)
    {
      setSingleLineAllCaps(this.b);
      setSingleLineAllCaps(this.c);
      setSingleLineAllCaps(this.d);
    }
    while (true)
    {
      this.h = (int)(16.0F * paramContext.getResources().getDisplayMetrics().density);
      return;
      this.b.setSingleLine();
      this.c.setSingleLine();
      this.d.setSingleLine();
    }
  }

  private static void setSingleLineAllCaps(TextView paramTextView)
  {
    q.a(paramTextView);
  }

  void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    int i1;
    int i3;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i14;
    int i15;
    int i20;
    int i21;
    int i22;
    int i26;
    int i28;
    int i29;
    int i30;
    if (paramInt != this.f)
    {
      a(paramInt, this.a.getAdapter());
      this.k = true;
      i1 = this.b.getMeasuredWidth();
      int i2 = this.c.getMeasuredWidth();
      i3 = this.d.getMeasuredWidth();
      int i4 = i2 / 2;
      i5 = getWidth();
      i6 = getHeight();
      i7 = getPaddingLeft();
      i8 = getPaddingRight();
      i9 = getPaddingTop();
      i10 = getPaddingBottom();
      int i11 = i7 + i4;
      int i12 = i8 + i4;
      int i13 = i5 - i11 - i12;
      float f1 = 0.5F + paramFloat;
      if (f1 > 1.0F)
        f1 -= 1.0F;
      i14 = i5 - i12 - (int)(f1 * i13) - i4;
      i15 = i14 + i2;
      int i16 = this.b.getBaseline();
      int i17 = this.c.getBaseline();
      int i18 = this.d.getBaseline();
      int i19 = Math.max(Math.max(i16, i17), i18);
      i20 = i19 - i16;
      i21 = i19 - i17;
      i22 = i19 - i18;
      int i23 = i20 + this.b.getMeasuredHeight();
      int i24 = i21 + this.c.getMeasuredHeight();
      int i25 = i22 + this.d.getMeasuredHeight();
      i26 = Math.max(Math.max(i23, i24), i25);
      switch (0x70 & this.i)
      {
      default:
        i28 = i9 + i20;
        i29 = i9 + i21;
        i30 = i9 + i22;
      case 16:
      case 80:
      }
    }
    while (true)
    {
      this.c.layout(i14, i29, i15, i29 + this.c.getMeasuredHeight());
      int i31 = Math.min(i7, i14 - this.h - i1);
      this.b.layout(i31, i28, i1 + i31, i28 + this.b.getMeasuredHeight());
      int i32 = Math.max(i5 - i8 - i3, i15 + this.h);
      this.d.layout(i32, i30, i32 + i3, i30 + this.d.getMeasuredHeight());
      this.g = paramFloat;
      this.k = false;
      return;
      if ((paramBoolean) || (paramFloat != this.g))
        break;
      return;
      int i33 = (i6 - i9 - i10 - i26) / 2;
      i28 = i33 + i20;
      i29 = i33 + i21;
      i30 = i33 + i22;
      continue;
      int i27 = i6 - i10 - i26;
      i28 = i27 + i20;
      i29 = i27 + i21;
      i30 = i27 + i22;
    }
  }

  final void a(int paramInt, at paramat)
  {
    int i1;
    if (paramat != null)
    {
      i1 = paramat.a();
      this.j = true;
      if ((paramInt <= 0) || (paramat == null))
        break label238;
    }
    label238: for (CharSequence localCharSequence1 = paramat.a(paramInt - 1); ; localCharSequence1 = null)
    {
      this.b.setText(localCharSequence1);
      TextView localTextView = this.c;
      if ((paramat != null) && (paramInt < i1));
      for (CharSequence localCharSequence2 = paramat.a(paramInt); ; localCharSequence2 = null)
      {
        localTextView.setText(localCharSequence2);
        int i2 = paramInt + 1;
        CharSequence localCharSequence3 = null;
        if (i2 < i1)
        {
          localCharSequence3 = null;
          if (paramat != null)
            localCharSequence3 = paramat.a(paramInt + 1);
        }
        this.d.setText(localCharSequence3);
        int i3 = getWidth() - getPaddingLeft() - getPaddingRight();
        int i4 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i5 = View.MeasureSpec.makeMeasureSpec((int)(0.8F * i3), -2147483648);
        int i6 = View.MeasureSpec.makeMeasureSpec(i4, -2147483648);
        this.b.measure(i5, i6);
        this.c.measure(i5, i6);
        this.d.measure(i5, i6);
        this.f = paramInt;
        if (!this.k)
          a(paramInt, this.g, false);
        this.j = false;
        return;
        i1 = 0;
        break;
      }
    }
  }

  final void a(at paramat1, at paramat2)
  {
    if (paramat1 != null)
    {
      paramat1.b(this.l);
      this.m = null;
    }
    if (paramat2 != null)
    {
      paramat2.a(this.l);
      this.m = new WeakReference(paramat2);
    }
    if (this.a != null)
    {
      this.f = -1;
      this.g = -1.0F;
      a(this.a.getCurrentItem(), paramat2);
      requestLayout();
    }
  }

  int getMinHeight()
  {
    Drawable localDrawable = getBackground();
    int i1 = 0;
    if (localDrawable != null)
      i1 = localDrawable.getIntrinsicHeight();
    return i1;
  }

  public int getTextSpacing()
  {
    return this.h;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewParent localViewParent = getParent();
    if (!(localViewParent instanceof ViewPager))
      throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    ViewPager localViewPager = (ViewPager)localViewParent;
    at localat1 = localViewPager.getAdapter();
    localViewPager.b(this.l);
    localViewPager.setOnAdapterChangeListener(this.l);
    this.a = localViewPager;
    if (this.m != null);
    for (at localat2 = (at)this.m.get(); ; localat2 = null)
    {
      a(localat2, localat1);
      return;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.a != null)
    {
      a(this.a.getAdapter(), null);
      this.a.b(null);
      this.a.setOnAdapterChangeListener(null);
      this.a = null;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a != null)
    {
      boolean bool = this.g < 0.0F;
      float f1 = 0.0F;
      if (!bool)
        f1 = this.g;
      a(this.f, f1, true);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    if (i1 != 1073741824)
      throw new IllegalStateException("Must measure with an exact width");
    int i5 = getMinHeight();
    int i6 = getPaddingTop() + getPaddingBottom();
    int i7 = i4 - i6;
    int i8 = View.MeasureSpec.makeMeasureSpec((int)(0.8F * i3), -2147483648);
    int i9 = View.MeasureSpec.makeMeasureSpec(i7, -2147483648);
    this.b.measure(i8, i9);
    this.c.measure(i8, i9);
    this.d.measure(i8, i9);
    if (i2 == 1073741824)
    {
      setMeasuredDimension(i3, i4);
      return;
    }
    setMeasuredDimension(i3, Math.max(i5, i6 + this.c.getMeasuredHeight()));
  }

  public void requestLayout()
  {
    if (!this.j)
      super.requestLayout();
  }

  public void setGravity(int paramInt)
  {
    this.i = paramInt;
    requestLayout();
  }

  public void setNonPrimaryAlpha(float paramFloat)
  {
    this.p = (0xFF & (int)(255.0F * paramFloat));
    int i1 = this.p << 24 | 0xFFFFFF & this.e;
    this.b.setTextColor(i1);
    this.d.setTextColor(i1);
  }

  public void setTextColor(int paramInt)
  {
    this.e = paramInt;
    this.c.setTextColor(paramInt);
    int i1 = this.p << 24 | 0xFFFFFF & this.e;
    this.b.setTextColor(i1);
    this.d.setTextColor(i1);
  }

  public void setTextSpacing(int paramInt)
  {
    this.h = paramInt;
    requestLayout();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.PagerTitleStrip
 * JD-Core Version:    0.6.0
 */