package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.al;
import android.support.v4.view.bg;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.widget.ab;
import android.support.v7.internal.widget.au;
import android.support.v7.internal.widget.ba;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.widget.CompoundButton;
import java.util.List;

public class SwitchCompat extends CompoundButton
{
  private static final int[] F = { 16842912 };
  private Layout A;
  private TransformationMethod B;
  private Animation C;
  private final Rect D = new Rect();
  private final au E;
  private Drawable a;
  private Drawable b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private CharSequence g;
  private CharSequence h;
  private boolean i;
  private int j;
  private int k;
  private float l;
  private float m;
  private VelocityTracker n = VelocityTracker.obtain();
  private int o;
  private float p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private TextPaint x = new TextPaint(1);
  private ColorStateList y;
  private Layout z;

  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.switchStyle);
  }

  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getResources();
    this.x.density = localResources.getDisplayMetrics().density;
    com.tencent.mm.sdk.channel.a locala = com.tencent.mm.sdk.channel.a.a(paramContext, paramAttributeSet, R.styleable.SwitchCompat, paramInt);
    this.a = locala.a(R.styleable.SwitchCompat_android_thumb);
    if (this.a != null)
      this.a.setCallback(this);
    this.b = locala.a(R.styleable.SwitchCompat_track);
    if (this.b != null)
      this.b.setCallback(this);
    this.g = locala.c(R.styleable.SwitchCompat_android_textOn);
    this.h = locala.c(R.styleable.SwitchCompat_android_textOff);
    this.i = locala.a(R.styleable.SwitchCompat_showText, true);
    this.c = locala.d(R.styleable.SwitchCompat_thumbTextPadding, 0);
    this.d = locala.d(R.styleable.SwitchCompat_switchMinWidth, 0);
    this.e = locala.d(R.styleable.SwitchCompat_switchPadding, 0);
    this.f = locala.a(R.styleable.SwitchCompat_splitTrack, false);
    int i1 = locala.f(R.styleable.SwitchCompat_switchTextAppearance, 0);
    TypedArray localTypedArray;
    int i4;
    Typeface localTypeface1;
    label359: Typeface localTypeface2;
    label376: int i5;
    label394: boolean bool;
    label419: float f1;
    if (i1 != 0)
    {
      localTypedArray = paramContext.obtainStyledAttributes(i1, R.styleable.TextAppearance);
      ColorStateList localColorStateList = localTypedArray.getColorStateList(R.styleable.TextAppearance_android_textColor);
      if (localColorStateList == null)
        break label533;
      this.y = localColorStateList;
      int i2 = localTypedArray.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
      if ((i2 != 0) && (i2 != this.x.getTextSize()))
      {
        this.x.setTextSize(i2);
        requestLayout();
      }
      int i3 = localTypedArray.getInt(R.styleable.TextAppearance_android_typeface, -1);
      i4 = localTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, -1);
      switch (i3)
      {
      default:
        localTypeface1 = null;
        if (i4 > 0)
        {
          if (localTypeface1 != null)
            break;
          localTypeface2 = Typeface.defaultFromStyle(i4);
          setSwitchTypeface(localTypeface2);
          if (localTypeface2 != null)
          {
            i5 = localTypeface2.getStyle();
            int i6 = i4 & (i5 ^ 0xFFFFFFFF);
            TextPaint localTextPaint1 = this.x;
            if ((i6 & 0x1) == 0)
              break label586;
            bool = true;
            localTextPaint1.setFakeBoldText(bool);
            TextPaint localTextPaint2 = this.x;
            if ((i6 & 0x2) == 0)
              break label592;
            f1 = -0.25F;
            label443: localTextPaint2.setTextSkewX(f1);
            label450: if (!localTypedArray.getBoolean(R.styleable.TextAppearance_textAllCaps, false))
              break label623;
          }
        }
      case 1:
      case 2:
      case 3:
      }
    }
    label533: label586: label592: label623: for (this.B = new android.support.v7.internal.b.a(getContext()); ; this.B = null)
    {
      localTypedArray.recycle();
      this.E = locala.c();
      locala.b();
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
      this.k = localViewConfiguration.getScaledTouchSlop();
      this.o = localViewConfiguration.getScaledMinimumFlingVelocity();
      refreshDrawableState();
      setChecked(isChecked());
      return;
      this.y = getTextColors();
      break;
      localTypeface1 = Typeface.SANS_SERIF;
      break label359;
      localTypeface1 = Typeface.SERIF;
      break label359;
      localTypeface1 = Typeface.MONOSPACE;
      break label359;
      localTypeface2 = Typeface.create(localTypeface1, i4);
      break label376;
      i5 = 0;
      break label394;
      bool = false;
      break label419;
      f1 = 0.0F;
      break label443;
      this.x.setFakeBoldText(false);
      this.x.setTextSkewX(0.0F);
      setSwitchTypeface(localTypeface1);
      break label450;
    }
  }

  private Layout a(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence;
    TextPaint localTextPaint;
    if (this.B != null)
    {
      localCharSequence = this.B.getTransformation(paramCharSequence, this);
      localTextPaint = this.x;
      if (localCharSequence == null)
        break label66;
    }
    label66: for (int i1 = (int)Math.ceil(Layout.getDesiredWidth(localCharSequence, this.x)); ; i1 = 0)
    {
      return new StaticLayout(localCharSequence, localTextPaint, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
      localCharSequence = paramCharSequence;
      break;
    }
  }

  private boolean getTargetCheckedState()
  {
    return this.p > 0.5F;
  }

  private int getThumbOffset()
  {
    float f1;
    if (ba.a(this))
      f1 = 1.0F - this.p;
    while (true)
    {
      return (int)(0.5F + f1 * getThumbScrollRange());
      f1 = this.p;
    }
  }

  private int getThumbScrollRange()
  {
    if (this.b != null)
    {
      Rect localRect1 = this.D;
      this.b.getPadding(localRect1);
      if (this.a != null);
      for (Rect localRect2 = ab.a(this.a); ; localRect2 = ab.a)
        return this.q - this.s - localRect1.left - localRect1.right - localRect2.left - localRect2.right;
    }
    return 0;
  }

  private void setThumbPosition(float paramFloat)
  {
    this.p = paramFloat;
    invalidate();
  }

  public void draw(Canvas paramCanvas)
  {
    Rect localRect1 = this.D;
    int i1 = this.t;
    int i2 = this.u;
    int i3 = this.v;
    int i4 = this.w;
    int i5 = i1 + getThumbOffset();
    Rect localRect2;
    int i9;
    int i11;
    label142: int i10;
    if (this.a != null)
    {
      localRect2 = ab.a(this.a);
      if (this.b == null)
        break label331;
      this.b.getPadding(localRect1);
      i9 = i5 + localRect1.left;
      if ((localRect2 == null) || (localRect2.isEmpty()))
        break label320;
      if (localRect2.left > localRect1.left)
        i1 += localRect2.left - localRect1.left;
      if (localRect2.top <= localRect1.top)
        break label313;
      i11 = i2 + (localRect2.top - localRect1.top);
      if (localRect2.right > localRect1.right)
        i3 -= localRect2.right - localRect1.right;
      if (localRect2.bottom <= localRect1.bottom)
        break label306;
      i10 = i4 - (localRect2.bottom - localRect1.bottom);
      label196: this.b.setBounds(i1, i11, i3, i10);
    }
    label306: label313: label320: label331: for (int i6 = i9; ; i6 = i5)
    {
      if (this.a != null)
      {
        this.a.getPadding(localRect1);
        int i7 = i6 - localRect1.left;
        int i8 = i6 + this.s + localRect1.right;
        this.a.setBounds(i7, i2, i8, i4);
        Drawable localDrawable = getBackground();
        if (localDrawable != null)
          android.support.v4.a.a.a.a(localDrawable, i7, i2, i8, i4);
      }
      super.draw(paramCanvas);
      return;
      localRect2 = ab.a;
      break;
      i10 = i4;
      break label196;
      i11 = i2;
      break label142;
      i10 = i4;
      i11 = i2;
      break label196;
    }
  }

  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21)
      super.drawableHotspotChanged(paramFloat1, paramFloat2);
    if (this.a != null)
      android.support.v4.a.a.a.a(this.a, paramFloat1, paramFloat2);
    if (this.b != null)
      android.support.v4.a.a.a.a(this.b, paramFloat1, paramFloat2);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if (this.a != null)
      this.a.setState(arrayOfInt);
    if (this.b != null)
      this.b.setState(arrayOfInt);
    invalidate();
  }

  public int getCompoundPaddingLeft()
  {
    int i1;
    if (!ba.a(this))
      i1 = super.getCompoundPaddingLeft();
    do
    {
      return i1;
      i1 = super.getCompoundPaddingLeft() + this.q;
    }
    while (TextUtils.isEmpty(getText()));
    return i1 + this.e;
  }

  public int getCompoundPaddingRight()
  {
    int i1;
    if (ba.a(this))
      i1 = super.getCompoundPaddingRight();
    do
    {
      return i1;
      i1 = super.getCompoundPaddingRight() + this.q;
    }
    while (TextUtils.isEmpty(getText()));
    return i1 + this.e;
  }

  public boolean getShowText()
  {
    return this.i;
  }

  public boolean getSplitTrack()
  {
    return this.f;
  }

  public int getSwitchMinWidth()
  {
    return this.d;
  }

  public int getSwitchPadding()
  {
    return this.e;
  }

  public CharSequence getTextOff()
  {
    return this.h;
  }

  public CharSequence getTextOn()
  {
    return this.g;
  }

  public Drawable getThumbDrawable()
  {
    return this.a;
  }

  public int getThumbTextPadding()
  {
    return this.c;
  }

  public Drawable getTrackDrawable()
  {
    return this.b;
  }

  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.a != null)
        this.a.jumpToCurrentState();
      if (this.b != null)
        this.b.jumpToCurrentState();
      if ((this.C != null) && (!this.C.hasEnded()))
      {
        clearAnimation();
        this.C = null;
      }
    }
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      mergeDrawableStates(arrayOfInt, F);
    return arrayOfInt;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Rect localRect1 = this.D;
    Drawable localDrawable1 = this.b;
    int i3;
    int i4;
    label144: int i5;
    Layout localLayout;
    label174: Rect localRect2;
    if (localDrawable1 != null)
    {
      localDrawable1.getPadding(localRect1);
      int i1 = this.u;
      int i2 = this.w;
      i3 = i1 + localRect1.top;
      i4 = i2 - localRect1.bottom;
      Drawable localDrawable2 = this.a;
      if (localDrawable1 != null)
      {
        if ((!this.f) || (localDrawable2 == null))
          break label304;
        Rect localRect3 = ab.a(localDrawable2);
        localDrawable2.copyBounds(localRect1);
        localRect1.left += localRect3.left;
        localRect1.right -= localRect3.right;
        int i9 = paramCanvas.save();
        paramCanvas.clipRect(localRect1, Region.Op.DIFFERENCE);
        localDrawable1.draw(paramCanvas);
        paramCanvas.restoreToCount(i9);
      }
      i5 = paramCanvas.save();
      if (localDrawable2 != null)
        localDrawable2.draw(paramCanvas);
      if (!getTargetCheckedState())
        break label312;
      localLayout = this.z;
      if (localLayout != null)
      {
        int[] arrayOfInt = getDrawableState();
        if (this.y != null)
          this.x.setColor(this.y.getColorForState(arrayOfInt, 0));
        this.x.drawableState = arrayOfInt;
        if (localDrawable2 == null)
          break label321;
        localRect2 = localDrawable2.getBounds();
      }
    }
    label304: label312: label321: for (int i6 = localRect2.left + localRect2.right; ; i6 = getWidth())
    {
      int i7 = i6 / 2 - localLayout.getWidth() / 2;
      int i8 = (i3 + i4) / 2 - localLayout.getHeight() / 2;
      paramCanvas.translate(i7, i8);
      localLayout.draw(paramCanvas);
      paramCanvas.restoreToCount(i5);
      return;
      localRect1.setEmpty();
      break;
      localDrawable1.draw(paramCanvas);
      break label144;
      localLayout = this.A;
      break label174;
    }
  }

  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }

  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
      if (!isChecked())
        break label57;
    }
    CharSequence localCharSequence2;
    label57: for (CharSequence localCharSequence1 = this.g; ; localCharSequence1 = this.h)
    {
      if (!TextUtils.isEmpty(localCharSequence1))
      {
        localCharSequence2 = paramAccessibilityNodeInfo.getText();
        if (!TextUtils.isEmpty(localCharSequence2))
          break;
        paramAccessibilityNodeInfo.setText(localCharSequence1);
      }
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localCharSequence2).append(' ').append(localCharSequence1);
    paramAccessibilityNodeInfo.setText(localStringBuilder);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Rect localRect1;
    int i2;
    int i1;
    if (this.a != null)
    {
      localRect1 = this.D;
      if (this.b != null)
      {
        this.b.getPadding(localRect1);
        Rect localRect2 = ab.a(this.a);
        i2 = Math.max(0, localRect2.left - localRect1.left);
        i1 = Math.max(0, localRect2.right - localRect1.right);
      }
    }
    while (true)
    {
      int i5;
      int i4;
      label119: int i7;
      int i6;
      if (ba.a(this))
      {
        int i8 = i2 + getPaddingLeft();
        i5 = i8 + this.q - i2 - i1;
        i4 = i8;
        switch (0x70 & getGravity())
        {
        default:
          i7 = getPaddingTop();
          i6 = i7 + this.r;
        case 16:
        case 80:
        }
      }
      while (true)
      {
        this.t = i4;
        this.u = i7;
        this.w = i6;
        this.v = i5;
        return;
        localRect1.setEmpty();
        break;
        int i3 = getWidth() - getPaddingRight() - i1;
        i4 = i1 + (i2 + (i3 - this.q));
        i5 = i3;
        break label119;
        i7 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2 - this.r / 2;
        i6 = i7 + this.r;
        continue;
        i6 = getHeight() - getPaddingBottom();
        i7 = i6 - this.r;
      }
      i1 = 0;
      i2 = 0;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.i)
    {
      if (this.z == null)
        this.z = a(this.g);
      if (this.A == null)
        this.A = a(this.h);
    }
    Rect localRect1 = this.D;
    int i2;
    int i1;
    int i3;
    if (this.a != null)
    {
      this.a.getPadding(localRect1);
      i2 = this.a.getIntrinsicWidth() - localRect1.left - localRect1.right;
      i1 = this.a.getIntrinsicHeight();
      if (!this.i)
        break label292;
      i3 = Math.max(this.z.getWidth(), this.A.getWidth()) + 2 * this.c;
      label127: this.s = Math.max(i3, i2);
      if (this.b == null)
        break label298;
      this.b.getPadding(localRect1);
    }
    for (int i4 = this.b.getIntrinsicHeight(); ; i4 = 0)
    {
      int i5 = localRect1.left;
      int i6 = localRect1.right;
      if (this.a != null)
      {
        Rect localRect2 = ab.a(this.a);
        i5 = Math.max(i5, localRect2.left);
        i6 = Math.max(i6, localRect2.right);
      }
      int i7 = Math.max(this.d, i6 + (i5 + 2 * this.s));
      int i8 = Math.max(i4, i1);
      this.q = i7;
      this.r = i8;
      super.onMeasure(paramInt1, paramInt2);
      if (getMeasuredHeight() < i8)
        setMeasuredDimension(bg.k(this), i8);
      return;
      i1 = 0;
      i2 = 0;
      break;
      label292: i3 = 0;
      break label127;
      label298: localRect1.setEmpty();
    }
  }

  @TargetApi(14)
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked());
    for (CharSequence localCharSequence = this.g; ; localCharSequence = this.h)
    {
      if (localCharSequence != null)
        paramAccessibilityEvent.getText().add(localCharSequence);
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 1.0F;
    int i1 = 1;
    this.n.addMovement(paramMotionEvent);
    switch (al.a(paramMotionEvent))
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      i1 = super.onTouchEvent(paramMotionEvent);
      label485: label496: 
      while (true)
      {
        return i1;
        float f9 = paramMotionEvent.getX();
        float f10 = paramMotionEvent.getY();
        if (!isEnabled())
          break;
        Drawable localDrawable = this.a;
        int i7 = 0;
        if (localDrawable != null)
        {
          int i8 = getThumbOffset();
          this.a.getPadding(this.D);
          int i9 = this.u - this.k;
          int i10 = i8 + this.t - this.k;
          int i11 = i10 + this.s + this.D.left + this.D.right + this.k;
          int i12 = this.w + this.k;
          boolean bool2 = f9 < i10;
          i7 = 0;
          if (bool2)
          {
            boolean bool3 = f9 < i11;
            i7 = 0;
            if (bool3)
            {
              boolean bool4 = f10 < i9;
              i7 = 0;
              if (bool4)
              {
                boolean bool5 = f10 < i12;
                i7 = 0;
                if (bool5)
                  i7 = i1;
              }
            }
          }
        }
        if (i7 == 0)
          break;
        this.j = i1;
        this.l = f9;
        this.m = f10;
        break;
        switch (this.j)
        {
        case 0:
        default:
          break;
        case 1:
          float f7 = paramMotionEvent.getX();
          float f8 = paramMotionEvent.getY();
          if ((Math.abs(f7 - this.l) <= this.k) && (Math.abs(f8 - this.m) <= this.k))
            break;
          this.j = 2;
          getParent().requestDisallowInterceptTouchEvent(i1);
          this.l = f7;
          this.m = f8;
          return i1;
        case 2:
          float f3 = paramMotionEvent.getX();
          int i6 = getThumbScrollRange();
          float f4 = f3 - this.l;
          float f5;
          float f6;
          if (i6 != 0)
          {
            f5 = f4 / i6;
            if (ba.a(this))
              f5 = -f5;
            f6 = f5 + this.p;
            if (f6 >= 0.0F)
              break label485;
            f1 = 0.0F;
          }
          while (true)
          {
            if (f1 == this.p)
              break label496;
            this.l = f3;
            setThumbPosition(f1);
            return i1;
            if (f4 > 0.0F)
            {
              f5 = f1;
              break;
            }
            f5 = -1.0F;
            break;
            if (f6 > f1)
              continue;
            f1 = f6;
          }
        }
      }
      if (this.j == 2)
      {
        this.j = 0;
        int i4;
        float f2;
        int i5;
        if ((paramMotionEvent.getAction() == i1) && (isEnabled()))
        {
          int i2 = i1;
          i4 = isChecked();
          if (i2 == 0)
            break label680;
          this.n.computeCurrentVelocity(1000);
          f2 = this.n.getXVelocity();
          if (Math.abs(f2) <= this.o)
            break label671;
          if (!ba.a(this))
            break label652;
          if (f2 >= 0.0F)
            break label646;
          i5 = i1;
        }
        while (true)
        {
          if (i5 != i4)
          {
            playSoundEffect(0);
            setChecked(i5);
          }
          MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
          localMotionEvent.setAction(3);
          super.onTouchEvent(localMotionEvent);
          localMotionEvent.recycle();
          super.onTouchEvent(paramMotionEvent);
          return i1;
          int i3 = 0;
          break;
          label646: boolean bool1 = false;
          continue;
          label652: if (f2 > 0.0F)
          {
            bool1 = i1;
            continue;
          }
          bool1 = false;
          continue;
          label671: bool1 = getTargetCheckedState();
          continue;
          label680: bool1 = i4;
        }
      }
      this.j = 0;
      this.n.clear();
    }
  }

  public void setChecked(boolean paramBoolean)
  {
    float f1 = 1.0F;
    super.setChecked(paramBoolean);
    boolean bool = isChecked();
    if ((getWindowToken() != null) && (bg.B(this)))
    {
      float f2 = this.p;
      if (bool);
      while (true)
      {
        this.C = new dl(this, f2, f1 - f2);
        this.C.setDuration(250L);
        startAnimation(this.C);
        return;
        f1 = 0.0F;
      }
    }
    if (this.C != null)
    {
      clearAnimation();
      this.C = null;
    }
    if (bool);
    while (true)
    {
      setThumbPosition(f1);
      return;
      f1 = 0.0F;
    }
  }

  public void setShowText(boolean paramBoolean)
  {
    if (this.i != paramBoolean)
    {
      this.i = paramBoolean;
      requestLayout();
    }
  }

  public void setSplitTrack(boolean paramBoolean)
  {
    this.f = paramBoolean;
    invalidate();
  }

  public void setSwitchMinWidth(int paramInt)
  {
    this.d = paramInt;
    requestLayout();
  }

  public void setSwitchPadding(int paramInt)
  {
    this.e = paramInt;
    requestLayout();
  }

  public void setSwitchTypeface(Typeface paramTypeface)
  {
    if (this.x.getTypeface() != paramTypeface)
    {
      this.x.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    }
  }

  public void setTextOff(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    requestLayout();
  }

  public void setTextOn(CharSequence paramCharSequence)
  {
    this.g = paramCharSequence;
    requestLayout();
  }

  public void setThumbDrawable(Drawable paramDrawable)
  {
    this.a = paramDrawable;
    requestLayout();
  }

  public void setThumbResource(int paramInt)
  {
    setThumbDrawable(this.E.a(paramInt));
  }

  public void setThumbTextPadding(int paramInt)
  {
    this.c = paramInt;
    requestLayout();
  }

  public void setTrackDrawable(Drawable paramDrawable)
  {
    this.b = paramDrawable;
    requestLayout();
  }

  public void setTrackResource(int paramInt)
  {
    setTrackDrawable(this.E.a(paramInt));
  }

  public void toggle()
  {
    if (!isChecked());
    for (boolean bool = true; ; bool = false)
    {
      setChecked(bool);
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.a) || (paramDrawable == this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.SwitchCompat
 * JD-Core Version:    0.6.0
 */