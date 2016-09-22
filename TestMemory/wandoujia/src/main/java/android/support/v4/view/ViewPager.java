package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.widget.x;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup
{
  private static final int[] a = { 16842931 };
  private static final co ae;
  private static final Comparator<ch> c = new cd();
  private static final Interpolator d = new ce();
  private boolean A;
  private int B;
  private int C;
  private int D;
  private float E;
  private float F;
  private float G;
  private float H;
  private int I = -1;
  private VelocityTracker J;
  private int K;
  private int L;
  private int M;
  private int N;
  private x O;
  private x P;
  private boolean Q = true;
  private boolean R;
  private int S;
  private List<ck> T;
  private ck U;
  private ck V;
  private cj W;
  private cl aa;
  private Method ab;
  private int ac;
  private ArrayList<View> ad;
  private final Runnable af = new cf(this);
  private int ag = 0;
  private int b;
  private final ArrayList<ch> e = new ArrayList();
  private final ch f = new ch();
  private final Rect g = new Rect();
  private at h;
  private int i;
  private int j = -1;
  private Parcelable k = null;
  private ClassLoader l = null;
  private Scroller m;
  private cm n;
  private int o;
  private Drawable p;
  private int q;
  private int r;
  private float s = -3.402824E+038F;
  private float t = 3.4028235E+38F;
  private int u;
  private boolean v;
  private boolean w;
  private boolean x;
  private int y = 1;
  private boolean z;

  static
  {
    ae = new co();
  }

  public ViewPager(Context paramContext)
  {
    super(paramContext);
    d();
  }

  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    d();
  }

  private Rect a(Rect paramRect, View paramView)
  {
    if (paramRect == null);
    for (Rect localRect = new Rect(); ; localRect = paramRect)
    {
      if (paramView == null)
      {
        localRect.set(0, 0, 0, 0);
        return localRect;
      }
      localRect.left = paramView.getLeft();
      localRect.right = paramView.getRight();
      localRect.top = paramView.getTop();
      localRect.bottom = paramView.getBottom();
      ViewGroup localViewGroup;
      for (ViewParent localViewParent = paramView.getParent(); ((localViewParent instanceof ViewGroup)) && (localViewParent != this); localViewParent = localViewGroup.getParent())
      {
        localViewGroup = (ViewGroup)localViewParent;
        localRect.left += localViewGroup.getLeft();
        localRect.right += localViewGroup.getRight();
        localRect.top += localViewGroup.getTop();
        localRect.bottom += localViewGroup.getBottom();
      }
      return localRect;
    }
  }

  private ch a(int paramInt1, int paramInt2)
  {
    ch localch = new ch();
    localch.b = paramInt1;
    localch.a = this.h.a(this, paramInt1);
    localch.d = 1.0F;
    if ((paramInt2 < 0) || (paramInt2 >= this.e.size()))
    {
      this.e.add(localch);
      return localch;
    }
    this.e.add(paramInt2, localch);
    return localch;
  }

  private ch a(View paramView)
  {
    for (int i1 = 0; i1 < this.e.size(); i1++)
    {
      ch localch = (ch)this.e.get(i1);
      if (this.h.a(paramView, localch.a))
        return localch;
    }
    return null;
  }

  private void a(int paramInt)
  {
    int i21;
    ch localch1;
    int i1;
    if (this.i != paramInt)
      if (this.i < paramInt)
      {
        i21 = 66;
        ch localch14 = b(this.i);
        this.i = paramInt;
        localch1 = localch14;
        i1 = i21;
      }
    while (true)
    {
      if (this.h == null)
        e();
      do
      {
        return;
        i21 = 17;
        break;
        if (!this.x)
          continue;
        e();
        return;
      }
      while (getWindowToken() == null);
      int i2 = this.y;
      int i3 = Math.max(0, this.i - i2);
      int i4 = this.h.a();
      int i5 = Math.min(i4 - 1, i2 + this.i);
      if (i4 != this.b)
        try
        {
          String str2 = getResources().getResourceName(getId());
          str1 = str2;
          throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + i4 + " Pager id: " + str1 + " Pager class: " + getClass() + " Problematic adapter: " + this.h.getClass());
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          while (true)
            String str1 = Integer.toHexString(getId());
        }
      int i6 = 0;
      ch localch2;
      if (i6 < this.e.size())
      {
        localch2 = (ch)this.e.get(i6);
        if (localch2.b >= this.i)
          if (localch2.b != this.i)
            break label1286;
      }
      while (true)
      {
        if ((localch2 == null) && (i4 > 0));
        for (ch localch3 = a(this.i, i6); ; localch3 = localch2)
        {
          label347: int i12;
          label361: int i15;
          label384: label495: label628: float f3;
          label517: label523: ch localch8;
          label674: float f4;
          label682: int i19;
          int i20;
          Object localObject2;
          label706: ch localch13;
          label802: Object localObject3;
          float f6;
          if (localch3 != null)
          {
            int i11 = i6 - 1;
            ch localch7;
            float f1;
            float f2;
            int i14;
            int i16;
            if (i11 >= 0)
            {
              localch7 = (ch)this.e.get(i11);
              i12 = getClientWidth();
              if (i12 > 0)
                break label495;
              f1 = 0.0F;
              int i13 = -1 + this.i;
              f2 = 0.0F;
              i14 = i13;
              i15 = i6;
              i16 = i11;
              if (i14 < 0)
                break label628;
              if ((f2 < f1) || (i14 >= i3))
                break label523;
              if (localch7 == null)
                break label628;
              if ((i14 == localch7.b) && (!localch7.c))
              {
                this.e.remove(i16);
                this.h.a(this, i14, localch7.a);
                i16--;
                i15--;
                if (i16 < 0)
                  break label517;
                localch7 = (ch)this.e.get(i16);
              }
            }
            while (true)
            {
              i14--;
              break label384;
              i6++;
              break;
              localch7 = null;
              break label347;
              f1 = 2.0F - localch3.d + getPaddingLeft() / i12;
              break label361;
              localch7 = null;
              continue;
              if ((localch7 != null) && (i14 == localch7.b))
              {
                f2 += localch7.d;
                i16--;
                if (i16 >= 0)
                {
                  localch7 = (ch)this.e.get(i16);
                  continue;
                }
                localch7 = null;
                continue;
              }
              f2 += a(i14, i16 + 1).d;
              i15++;
              if (i16 >= 0)
              {
                localch7 = (ch)this.e.get(i16);
                continue;
              }
              localch7 = null;
            }
            f3 = localch3.d;
            int i17 = i15 + 1;
            if (f3 < 2.0F)
              if (i17 < this.e.size())
              {
                localch8 = (ch)this.e.get(i17);
                if (i12 > 0)
                  break label838;
                f4 = 0.0F;
                int i18 = 1 + this.i;
                ch localch9 = localch8;
                i19 = i17;
                i20 = i18;
                localObject2 = localch9;
                if (i20 >= i4)
                  break label997;
                if ((f3 < f4) || (i20 <= i5))
                  break label860;
                if (localObject2 == null)
                  break label997;
                if ((i20 != ((ch)localObject2).b) || (((ch)localObject2).c))
                  break label1264;
                this.e.remove(i19);
                this.h.a(this, i20, ((ch)localObject2).a);
                if (i19 >= this.e.size())
                  break label854;
                localch13 = (ch)this.e.get(i19);
                float f10 = f3;
                localObject3 = localch13;
                f6 = f10;
              }
          }
          while (true)
          {
            i20++;
            float f7 = f6;
            localObject2 = localObject3;
            f3 = f7;
            break label706;
            localch8 = null;
            break label674;
            label838: f4 = 2.0F + getPaddingRight() / i12;
            break label682;
            label854: localch13 = null;
            break label802;
            label860: if ((localObject2 != null) && (i20 == ((ch)localObject2).b))
            {
              float f8 = f3 + ((ch)localObject2).d;
              i19++;
              if (i19 < this.e.size());
              for (ch localch12 = (ch)this.e.get(i19); ; localch12 = null)
              {
                localObject3 = localch12;
                f6 = f8;
                break;
              }
            }
            ch localch10 = a(i20, i19);
            i19++;
            float f5 = f3 + localch10.d;
            if (i19 < this.e.size());
            for (ch localch11 = (ch)this.e.get(i19); ; localch11 = null)
            {
              localObject3 = localch11;
              f6 = f5;
              break;
            }
            label997: a(localch3, i15, localch1);
            at localat = this.h;
            int i7 = this.i;
            if (localch3 != null);
            for (Object localObject1 = localch3.a; ; localObject1 = null)
            {
              localat.b(this, i7, localObject1);
              this.h.b();
              int i8 = getChildCount();
              for (int i9 = 0; i9 < i8; i9++)
              {
                View localView3 = getChildAt(i9);
                ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView3.getLayoutParams();
                localLayoutParams.f = i9;
                if ((localLayoutParams.a) || (localLayoutParams.c != 0.0F))
                  continue;
                ch localch6 = a(localView3);
                if (localch6 == null)
                  continue;
                localLayoutParams.c = localch6.d;
                localLayoutParams.e = localch6.b;
              }
            }
            e();
            if (!hasFocus())
              break;
            View localView1 = findFocus();
            if (localView1 != null);
            for (ch localch4 = b(localView1); ; localch4 = null)
            {
              if ((localch4 != null) && (localch4.b == this.i))
                break label1262;
              for (int i10 = 0; ; i10++)
              {
                if (i10 >= getChildCount())
                  break label1256;
                View localView2 = getChildAt(i10);
                ch localch5 = a(localView2);
                if ((localch5 != null) && (localch5.b == this.i) && (localView2.requestFocus(i1)))
                  break;
              }
              label1256: break;
            }
            label1262: break;
            label1264: float f9 = f3;
            localObject3 = localObject2;
            f6 = f9;
          }
        }
        label1286: localch2 = null;
      }
      i1 = 2;
      localch1 = null;
    }
  }

  private void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i7;
    int i8;
    int i9;
    int i11;
    View localView2;
    int i16;
    int i13;
    int i14;
    if (this.S > 0)
    {
      int i6 = getScrollX();
      i7 = getPaddingLeft();
      i8 = getPaddingRight();
      i9 = getWidth();
      int i10 = getChildCount();
      i11 = 0;
      if (i11 < i10)
      {
        localView2 = getChildAt(i11);
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView2.getLayoutParams();
        if (!localLayoutParams.a)
          break label466;
        switch (0x7 & localLayoutParams.b)
        {
        case 2:
        case 4:
        default:
          i16 = i7;
          int i22 = i8;
          i13 = i7;
          i14 = i22;
          label132: int i18 = i16 + i6 - localView2.getLeft();
          if (i18 == 0)
            break;
          localView2.offsetLeftAndRight(i18);
        case 3:
        case 1:
        case 5:
        }
      }
    }
    while (true)
    {
      i11++;
      int i15 = i14;
      i7 = i13;
      i8 = i15;
      break;
      int i20 = i7 + localView2.getWidth();
      int i21 = i7;
      i14 = i8;
      i13 = i20;
      i16 = i21;
      break label132;
      i16 = Math.max((i9 - localView2.getMeasuredWidth()) / 2, i7);
      int i19 = i8;
      i13 = i7;
      i14 = i19;
      break label132;
      i16 = i9 - i8 - localView2.getMeasuredWidth();
      int i17 = i8 + localView2.getMeasuredWidth();
      i13 = i7;
      i14 = i17;
      break label132;
      if (this.U != null)
        this.U.a(paramInt1, paramFloat, paramInt2);
      if (this.T != null)
      {
        int i4 = this.T.size();
        for (int i5 = 0; i5 < i4; i5++)
        {
          ck localck = (ck)this.T.get(i5);
          if (localck == null)
            continue;
          localck.a(paramInt1, paramFloat, paramInt2);
        }
      }
      if (this.V != null)
        this.V.a(paramInt1, paramFloat, paramInt2);
      if (this.aa != null)
      {
        int i1 = getScrollX();
        int i2 = getChildCount();
        for (int i3 = 0; i3 < i2; i3++)
        {
          View localView1 = getChildAt(i3);
          if (((ViewPager.LayoutParams)localView1.getLayoutParams()).a)
            continue;
          float f1 = (localView1.getLeft() - i1) / getClientWidth();
          this.aa.a(localView1, f1);
        }
      }
      this.R = true;
      return;
      label466: int i12 = i8;
      i13 = i7;
      i14 = i12;
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > 0) && (!this.e.isEmpty()))
    {
      int i2 = paramInt3 + (paramInt1 - getPaddingLeft() - getPaddingRight());
      int i3 = paramInt4 + (paramInt2 - getPaddingLeft() - getPaddingRight());
      int i4 = (int)(getScrollX() / i3 * i2);
      scrollTo(i4, getScrollY());
      if (!this.m.isFinished())
      {
        int i5 = this.m.getDuration() - this.m.timePassed();
        ch localch2 = b(this.i);
        this.m.startScroll(i4, 0, (int)(localch2.e * paramInt1), 0, i5);
      }
      return;
    }
    ch localch1 = b(this.i);
    float f1;
    if (localch1 != null)
      f1 = Math.min(localch1.e, this.t);
    while (true)
    {
      int i1 = (int)(f1 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (i1 == getScrollX())
        break;
      a(false);
      scrollTo(i1, getScrollY());
      return;
      f1 = 0.0F;
    }
  }

  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    ch localch = b(paramInt1);
    int i1 = 0;
    if (localch != null)
      i1 = (int)(getClientWidth() * Math.max(this.s, Math.min(localch.e, this.t)));
    if (paramBoolean1)
    {
      if (getChildCount() == 0)
        setScrollingCacheEnabled(false);
      int i2;
      int i3;
      int i4;
      int i5;
      while (true)
      {
        if (paramBoolean2)
          d(paramInt1);
        return;
        i2 = getScrollX();
        i3 = getScrollY();
        i4 = i1 - i2;
        i5 = 0 - i3;
        if ((i4 != 0) || (i5 != 0))
          break;
        a(false);
        b();
        setScrollState(0);
      }
      setScrollingCacheEnabled(true);
      setScrollState(2);
      int i6 = getClientWidth();
      int i7 = i6 / 2;
      float f1 = Math.min(1.0F, 1.0F * Math.abs(i4) / i6);
      float f2 = i7 + i7 * (float)Math.sin((float)(0.47123891676382D * (f1 - 0.5F)));
      int i8 = Math.abs(paramInt2);
      if (i8 > 0);
      float f3;
      for (int i9 = 4 * Math.round(1000.0F * Math.abs(f2 / i8)); ; i9 = (int)(100.0F * (1.0F + Math.abs(i4) / (f3 + this.o))))
      {
        int i10 = Math.min(i9, 600);
        this.m.startScroll(i2, i3, i4, i5, i10);
        bg.d(this);
        break;
        f3 = 1.0F * i6;
      }
    }
    if (paramBoolean2)
      d(paramInt1);
    a(false);
    scrollTo(i1, 0);
    c(i1);
  }

  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }

  private void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    if ((this.h == null) || (this.h.a() <= 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if ((!paramBoolean2) && (this.i == paramInt1) && (this.e.size() != 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if (paramInt1 < 0)
      paramInt1 = 0;
    while (true)
    {
      int i1 = this.y;
      if ((paramInt1 <= i1 + this.i) && (paramInt1 >= this.i - i1))
        break;
      for (int i2 = 0; i2 < this.e.size(); i2++)
        ((ch)this.e.get(i2)).c = true;
      if (paramInt1 < this.h.a())
        continue;
      paramInt1 = -1 + this.h.a();
    }
    int i3 = this.i;
    boolean bool = false;
    if (i3 != paramInt1)
      bool = true;
    if (this.Q)
    {
      this.i = paramInt1;
      if (bool)
        d(paramInt1);
      requestLayout();
      return;
    }
    a(paramInt1);
    a(paramInt1, paramBoolean1, paramInt2, bool);
  }

  private void a(ch paramch1, int paramInt, ch paramch2)
  {
    int i1 = this.h.a();
    int i2 = getClientWidth();
    float f1;
    if (i2 > 0)
      f1 = this.o / i2;
    int i10;
    float f12;
    int i20;
    ch localch4;
    while (true)
    {
      if (paramch2 == null)
        break label405;
      i10 = paramch2.b;
      if (i10 >= paramch1.b)
        break;
      float f11 = f1 + (paramch2.e + paramch2.d);
      int i18 = i10 + 1;
      int i19 = 0;
      f12 = f11;
      i20 = i18;
      if ((i20 > paramch1.b) || (i19 >= this.e.size()))
        break label405;
      for (localch4 = (ch)this.e.get(i19); (i20 > localch4.b) && (i19 < -1 + this.e.size()); localch4 = (ch)this.e.get(i19))
        i19++;
      f1 = 0.0F;
    }
    while (true)
    {
      if (i22 < localch4.b)
      {
        Object localObject2;
        float f15 = localObject2 + (1.0F + f1);
        i22++;
        f13 = f15;
        continue;
      }
      localch4.e = f13;
      float f14 = f13 + (f1 + localch4.d);
      int i23 = i22 + 1;
      f12 = f14;
      i20 = i23;
      break;
      float f7;
      int i14;
      ch localch3;
      if (i10 > paramch1.b)
      {
        int i11 = -1 + this.e.size();
        float f6 = paramch2.e;
        int i12 = i10 - 1;
        int i13 = i11;
        f7 = f6;
        i14 = i12;
        if ((i14 >= paramch1.b) && (i13 >= 0))
          for (localch3 = (ch)this.e.get(i13); (i14 < localch3.b) && (i13 > 0); localch3 = (ch)this.e.get(i13))
            i13--;
      }
      while (true)
      {
        if (i16 > localch3.b)
        {
          Object localObject1;
          float f10 = localObject1 - (1.0F + f1);
          i16--;
          f8 = f10;
          continue;
        }
        float f9 = f8 - (f1 + localch3.d);
        localch3.e = f9;
        int i17 = i16 - 1;
        f7 = f9;
        i14 = i17;
        break;
        label405: int i3 = this.e.size();
        float f2 = paramch1.e;
        int i4 = -1 + paramch1.b;
        float f3;
        float f4;
        if (paramch1.b == 0)
        {
          f3 = paramch1.e;
          this.s = f3;
          if (paramch1.b != i1 - 1)
            break label533;
          f4 = paramch1.e + paramch1.d - 1.0F;
          label471: this.t = f4;
        }
        label533: int i9;
        for (int i5 = paramInt - 1; ; i5 = i9)
        {
          if (i5 < 0)
            break label590;
          ch localch2 = (ch)this.e.get(i5);
          while (true)
            if (i4 > localch2.b)
            {
              i4--;
              f2 -= 1.0F + f1;
              continue;
              f3 = -3.402824E+038F;
              break;
              f4 = 3.4028235E+38F;
              break label471;
            }
          f2 -= f1 + localch2.d;
          localch2.e = f2;
          if (localch2.b == 0)
            this.s = f2;
          i9 = i5 - 1;
          i4--;
        }
        label590: float f5 = f1 + (paramch1.e + paramch1.d);
        int i6 = 1 + paramch1.b;
        int i8;
        for (int i7 = paramInt + 1; i7 < i3; i7 = i8)
        {
          ch localch1 = (ch)this.e.get(i7);
          while (i6 < localch1.b)
          {
            i6++;
            f5 += 1.0F + f1;
          }
          if (localch1.b == i1 - 1)
            this.t = (f5 + localch1.d - 1.0F);
          localch1.e = f5;
          f5 += f1 + localch1.d;
          i8 = i7 + 1;
          i6++;
        }
        return;
        int i15 = i14;
        float f8 = f7;
        int i16 = i15;
      }
      int i21 = i20;
      float f13 = f12;
      int i22 = i21;
    }
  }

  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = al.b(paramMotionEvent);
    if (al.b(paramMotionEvent, i1) == this.I)
      if (i1 != 0)
        break label56;
    label56: for (int i2 = 1; ; i2 = 0)
    {
      this.E = al.c(paramMotionEvent, i2);
      this.I = al.b(paramMotionEvent, i2);
      if (this.J != null)
        this.J.clear();
      return;
    }
  }

  private void a(boolean paramBoolean)
  {
    if (this.ag == 2);
    int i3;
    for (int i1 = 1; ; i1 = 0)
    {
      if (i1 != 0)
      {
        setScrollingCacheEnabled(false);
        this.m.abortAnimation();
        int i4 = getScrollX();
        int i5 = getScrollY();
        int i6 = this.m.getCurrX();
        int i7 = this.m.getCurrY();
        if ((i4 != i6) || (i5 != i7))
        {
          scrollTo(i6, i7);
          if (i6 != i4)
            c(i6);
        }
      }
      this.x = false;
      int i2 = 0;
      i3 = i1;
      while (i2 < this.e.size())
      {
        ch localch = (ch)this.e.get(i2);
        if (localch.c)
        {
          localch.c = false;
          i3 = 1;
        }
        i2++;
      }
    }
    if (i3 != 0)
    {
      if (paramBoolean)
        bg.a(this, this.af);
    }
    else
      return;
    this.af.run();
  }

  private boolean a(float paramFloat)
  {
    int i1 = 1;
    float f1 = this.E - paramFloat;
    this.E = paramFloat;
    float f2 = f1 + getScrollX();
    int i2 = getClientWidth();
    float f3 = i2 * this.s;
    float f4 = i2 * this.t;
    ch localch1 = (ch)this.e.get(0);
    ch localch2 = (ch)this.e.get(-1 + this.e.size());
    if (localch1.b != 0)
      f3 = localch1.e * i2;
    for (int i3 = 0; ; i3 = i1)
    {
      float f5;
      if (localch2.b != -1 + this.h.a())
      {
        f5 = localch2.e * i2;
        i1 = 0;
      }
      while (true)
      {
        boolean bool;
        if (f2 < f3)
        {
          bool = false;
          if (i3 != 0)
          {
            float f6 = f3 - f2;
            bool = this.O.a(Math.abs(f6) / i2);
          }
        }
        while (true)
        {
          this.E += f3 - (int)f3;
          scrollTo((int)f3, getScrollY());
          c((int)f3);
          return bool;
          if (f2 > f5)
          {
            bool = false;
            if (i1 != 0)
            {
              float f7 = f2 - f5;
              bool = this.P.a(Math.abs(f7) / i2);
            }
            f3 = f5;
            continue;
          }
          f3 = f2;
          bool = false;
        }
        f5 = f4;
      }
    }
  }

  private ch b(int paramInt)
  {
    for (int i1 = 0; i1 < this.e.size(); i1++)
    {
      ch localch = (ch)this.e.get(i1);
      if (localch.b == paramInt)
        return localch;
    }
    return null;
  }

  private ch b(View paramView)
  {
    while (true)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this)
        break;
      if ((localViewParent == null) || (!(localViewParent instanceof View)))
        return null;
      paramView = (View)localViewParent;
    }
    return a(paramView);
  }

  private boolean c(int paramInt)
  {
    int i5;
    if (this.e.size() == 0)
    {
      this.R = false;
      a(0, 0.0F, 0);
      boolean bool = this.R;
      i5 = 0;
      if (!bool)
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    else
    {
      ch localch = g();
      int i1 = getClientWidth();
      int i2 = i1 + this.o;
      float f1 = this.o / i1;
      int i3 = localch.b;
      float f2 = (paramInt / i1 - localch.e) / (f1 + localch.d);
      int i4 = (int)(f2 * i2);
      this.R = false;
      a(i3, f2, i4);
      if (!this.R)
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      i5 = 1;
    }
    return i5;
  }

  private void d()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.m = new Scroller(localContext, d);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f1 = localContext.getResources().getDisplayMetrics().density;
    this.D = bs.a(localViewConfiguration);
    this.K = (int)(400.0F * f1);
    this.L = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.O = new x(localContext);
    this.P = new x(localContext);
    this.M = (int)(25.0F * f1);
    this.N = (int)(2.0F * f1);
    this.B = (int)(16.0F * f1);
    bg.a(this, new ci(this));
    if (bg.e(this) == 0)
      bg.c(this, 1);
  }

  private void d(int paramInt)
  {
    if (this.U != null)
      this.U.a(paramInt);
    if (this.T != null)
    {
      int i1 = this.T.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        ck localck = (ck)this.T.get(i2);
        if (localck == null)
          continue;
        localck.a(paramInt);
      }
    }
    if (this.V != null)
      this.V.a(paramInt);
  }

  private void e()
  {
    if (this.ac != 0)
    {
      if (this.ad == null)
        this.ad = new ArrayList();
      while (true)
      {
        int i1 = getChildCount();
        for (int i2 = 0; i2 < i1; i2++)
        {
          View localView = getChildAt(i2);
          this.ad.add(localView);
        }
        this.ad.clear();
      }
      Collections.sort(this.ad, ae);
    }
  }

  private boolean e(int paramInt)
  {
    View localView1 = findFocus();
    View localView2;
    View localView3;
    boolean bool1;
    label86: boolean bool2;
    label90: ViewParent localViewParent1;
    if (localView1 == this)
    {
      localView2 = null;
      localView3 = FocusFinder.getInstance().findNextFocus(this, localView2, paramInt);
      if ((localView3 == null) || (localView3 == localView2))
        break label311;
      if (paramInt != 17)
        break label252;
      int i3 = a(this.g, localView3).left;
      int i4 = a(this.g, localView2).left;
      if ((localView2 != null) && (i3 >= i4))
      {
        bool1 = i();
        bool2 = bool1;
        if (bool2)
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        return bool2;
      }
    }
    else
    {
      if (localView1 == null)
        break label391;
      localViewParent1 = localView1.getParent();
      if (!(localViewParent1 instanceof ViewGroup))
        break label396;
      if (localViewParent1 != this);
    }
    label391: label396: for (int i5 = 1; ; i5 = 0)
    {
      if (i5 == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView1.getClass().getSimpleName());
        ViewParent localViewParent2 = localView1.getParent();
        while (true)
          if ((localViewParent2 instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localViewParent2.getClass().getSimpleName());
            localViewParent2 = localViewParent2.getParent();
            continue;
            localViewParent1 = localViewParent1.getParent();
            break;
          }
        new StringBuilder("arrowScroll tried to find focus based on non-child current focused view ").append(localStringBuilder.toString());
        localView2 = null;
        break;
        bool1 = localView3.requestFocus();
        break label86;
        label252: bool2 = false;
        if (paramInt != 66)
          break label90;
        int i1 = a(this.g, localView3).left;
        int i2 = a(this.g, localView2).left;
        if ((localView2 == null) || (i1 > i2))
        {
          bool1 = localView3.requestFocus();
          break label86;
          label311: if ((paramInt == 17) || (paramInt == 1))
          {
            bool1 = i();
            break label86;
          }
          if (paramInt != 66)
          {
            bool2 = false;
            if (paramInt != 2)
              break label90;
          }
        }
        if ((this.h != null) && (this.i < -1 + this.h.a()))
        {
          a(1 + this.i, true);
          bool1 = true;
          break label86;
        }
        bool1 = false;
        break label86;
      }
      localView2 = localView1;
      break;
    }
  }

  private void f()
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(true);
  }

  private ch g()
  {
    int i1 = getClientWidth();
    float f1;
    float f2;
    label31: float f3;
    float f4;
    int i2;
    int i3;
    int i4;
    Object localObject;
    label49: ch localch1;
    ch localch3;
    int i5;
    if (i1 > 0)
    {
      f1 = getScrollX() / i1;
      if (i1 <= 0)
        break label199;
      f2 = this.o / i1;
      f3 = 0.0F;
      f4 = 0.0F;
      i2 = -1;
      i3 = 0;
      i4 = 1;
      localObject = null;
      if (i3 < this.e.size())
      {
        localch1 = (ch)this.e.get(i3);
        if ((i4 != 0) || (localch1.b == i2 + 1))
          break label250;
        localch3 = this.f;
        localch3.e = (f2 + (f3 + f4));
        localch3.b = (i2 + 1);
        localch3.d = 1.0F;
        i5 = i3 - 1;
      }
    }
    for (ch localch2 = localch3; ; localch2 = localch1)
    {
      float f5 = localch2.e;
      float f6 = f2 + (f5 + localch2.d);
      if ((i4 != 0) || (f1 >= f5))
      {
        if ((f1 < f6) || (i5 == -1 + this.e.size()))
          localObject = localch2;
      }
      else
      {
        return localObject;
        f1 = 0.0F;
        break;
        label199: f2 = 0.0F;
        break label31;
      }
      int i6 = localch2.b;
      float f7 = localch2.d;
      int i7 = i5 + 1;
      f4 = f5;
      i2 = i6;
      f3 = f7;
      localObject = localch2;
      i3 = i7;
      i4 = 0;
      break label49;
      label250: i5 = i3;
    }
  }

  private int getClientWidth()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }

  private void h()
  {
    this.z = false;
    this.A = false;
    if (this.J != null)
    {
      this.J.recycle();
      this.J = null;
    }
  }

  private boolean i()
  {
    if (this.i > 0)
    {
      a(-1 + this.i, true);
      return true;
    }
    return false;
  }

  private void setScrollState(int paramInt)
  {
    int i1 = 0;
    if (this.ag == paramInt);
    label39: label78: label84: 
    do
    {
      return;
      this.ag = paramInt;
      if (this.aa != null)
      {
        int i3;
        int i5;
        if (paramInt != 0)
        {
          i3 = 1;
          int i4 = getChildCount();
          i5 = 0;
          if (i5 >= i4)
            break label84;
          if (i3 == 0)
            break label78;
        }
        for (int i6 = 2; ; i6 = 0)
        {
          bg.a(getChildAt(i5), i6, null);
          i5++;
          break label39;
          i3 = 0;
          break;
        }
      }
      if (this.U != null)
        this.U.b(paramInt);
      if (this.T == null)
        continue;
      int i2 = this.T.size();
      while (i1 < i2)
      {
        ck localck = (ck)this.T.get(i1);
        if (localck != null)
          localck.b(paramInt);
        i1++;
      }
    }
    while (this.V == null);
    this.V.b(paramInt);
  }

  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.w != paramBoolean)
      this.w = paramBoolean;
  }

  final void a()
  {
    int i1 = this.h.a();
    this.b = i1;
    int i2;
    int i4;
    int i5;
    int i6;
    int i7;
    label61: ch localch;
    int i10;
    int i16;
    int i11;
    int i12;
    int i13;
    int i14;
    if ((this.e.size() < 1 + 2 * this.y) && (this.e.size() < i1))
    {
      i2 = 1;
      int i3 = this.i;
      i4 = 0;
      i5 = i3;
      i6 = i2;
      i7 = 0;
      if (i7 >= this.e.size())
        break label280;
      localch = (ch)this.e.get(i7);
      i10 = this.h.a(localch.a);
      if (i10 == -1)
        break label370;
      if (i10 != -2)
        break label229;
      this.e.remove(i7);
      i16 = i7 - 1;
      if (i4 == 0)
        i4 = 1;
      this.h.a(this, localch.b, localch.a);
      if (this.i != localch.b)
        break label389;
      int i17 = Math.max(0, Math.min(this.i, i1 - 1));
      i11 = i16;
      i12 = i4;
      i13 = i17;
      i14 = 1;
    }
    while (true)
    {
      int i15 = i11 + 1;
      i6 = i14;
      i5 = i13;
      i4 = i12;
      i7 = i15;
      break label61;
      i2 = 0;
      break;
      label229: if (localch.b != i10)
      {
        if (localch.b == this.i)
          i5 = i10;
        localch.b = i10;
        i11 = i7;
        i12 = i4;
        i13 = i5;
        i14 = 1;
        continue;
        if (i4 != 0)
          this.h.b();
        Collections.sort(this.e, c);
        if (i6 != 0)
        {
          int i8 = getChildCount();
          for (int i9 = 0; i9 < i8; i9++)
          {
            ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)getChildAt(i9).getLayoutParams();
            if (localLayoutParams.a)
              continue;
            localLayoutParams.c = 0.0F;
          }
          a(i5, false, true);
          requestLayout();
        }
        return;
      }
      label280: label370: i11 = i7;
      i12 = i4;
      i13 = i5;
      i14 = i6;
      continue;
      label389: i11 = i16;
      i12 = i4;
      i13 = i5;
      i14 = 1;
    }
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    this.x = false;
    a(paramInt, paramBoolean, false);
  }

  public final void a(ck paramck)
  {
    if (this.T == null)
      this.T = new ArrayList();
    this.T.add(paramck);
  }

  protected boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i1 = paramView.getScrollX();
      int i2 = paramView.getScrollY();
      i3 = -1 + localViewGroup.getChildCount();
      if (i3 >= 0)
      {
        View localView = localViewGroup.getChildAt(i3);
        if ((paramInt2 + i1 < localView.getLeft()) || (paramInt2 + i1 >= localView.getRight()) || (paramInt3 + i2 < localView.getTop()) || (paramInt3 + i2 >= localView.getBottom()) || (!a(localView, true, paramInt1, paramInt2 + i1 - localView.getLeft(), paramInt3 + i2 - localView.getTop())));
      }
    }
    do
    {
      return true;
      i3--;
      break;
    }
    while ((paramBoolean) && (bg.a(paramView, -paramInt1)));
    return false;
  }

  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayList.size();
    int i2 = getDescendantFocusability();
    if (i2 != 393216)
      for (int i3 = 0; i3 < getChildCount(); i3++)
      {
        View localView = getChildAt(i3);
        if (localView.getVisibility() != 0)
          continue;
        ch localch = a(localView);
        if ((localch == null) || (localch.b != this.i))
          continue;
        localView.addFocusables(paramArrayList, paramInt1, paramInt2);
      }
    if (((i2 == 262144) && (i1 != paramArrayList.size())) || (!isFocusable()));
    do
      return;
    while ((((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) || (paramArrayList == null));
    paramArrayList.add(this);
  }

  public void addTouchables(ArrayList<View> paramArrayList)
  {
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() != 0)
        continue;
      ch localch = a(localView);
      if ((localch == null) || (localch.b != this.i))
        continue;
      localView.addTouchables(paramArrayList);
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams));
    for (ViewGroup.LayoutParams localLayoutParams = generateLayoutParams(paramLayoutParams); ; localLayoutParams = paramLayoutParams)
    {
      ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localLayoutParams;
      localLayoutParams1.a |= paramView instanceof cg;
      if (this.v)
      {
        if ((localLayoutParams1 != null) && (localLayoutParams1.a))
          throw new IllegalStateException("Cannot add pager decor view during layout");
        localLayoutParams1.d = true;
        addViewInLayout(paramView, paramInt, localLayoutParams);
        return;
      }
      super.addView(paramView, paramInt, localLayoutParams);
      return;
    }
  }

  final ck b(ck paramck)
  {
    ck localck = this.V;
    this.V = paramck;
    return localck;
  }

  final void b()
  {
    a(this.i);
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    if (this.h == null);
    int i1;
    int i2;
    do
      while (true)
      {
        return false;
        i1 = getClientWidth();
        i2 = getScrollX();
        if (paramInt >= 0)
          break;
        if (i2 > (int)(i1 * this.s))
          return true;
      }
    while ((paramInt <= 0) || (i2 >= (int)(i1 * this.t)));
    return true;
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof ViewPager.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }

  public void computeScroll()
  {
    if ((!this.m.isFinished()) && (this.m.computeScrollOffset()))
    {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i3 = this.m.getCurrX();
      int i4 = this.m.getCurrY();
      if ((i1 != i3) || (i2 != i4))
      {
        scrollTo(i3, i4);
        if (!c(i3))
        {
          this.m.abortAnimation();
          scrollTo(0, i4);
        }
      }
      bg.d(this);
      return;
    }
    a(true);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool;
    if (!super.dispatchKeyEvent(paramKeyEvent))
    {
      if (paramKeyEvent.getAction() == 0);
      switch (paramKeyEvent.getKeyCode())
      {
      default:
        bool = false;
      case 21:
      case 22:
      case 61:
      }
    }
    while (true)
    {
      int i1 = 0;
      if (bool)
        i1 = 1;
      return i1;
      bool = e(17);
      continue;
      bool = e(66);
      continue;
      if (Build.VERSION.SDK_INT < 11)
        break;
      if (q.b(paramKeyEvent))
      {
        bool = e(2);
        continue;
      }
      if (!q.a(paramKeyEvent))
        break;
      bool = e(1);
    }
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool;
    }
    int i1 = getChildCount();
    for (int i2 = 0; ; i2++)
    {
      bool = false;
      if (i2 >= i1)
        break;
      View localView = getChildAt(i2);
      if (localView.getVisibility() != 0)
        continue;
      ch localch = a(localView);
      if ((localch != null) && (localch.b == this.i) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent)))
        return true;
    }
  }

  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1 = bg.a(this);
    boolean bool2;
    if ((i1 == 0) || ((i1 == 1) && (this.h != null) && (this.h.a() > 1)))
    {
      boolean bool1 = this.O.a();
      bool2 = false;
      if (!bool1)
      {
        int i5 = paramCanvas.save();
        int i6 = getHeight() - getPaddingTop() - getPaddingBottom();
        int i7 = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i6 + getPaddingTop(), this.s * i7);
        this.O.a(i6, i7);
        bool2 = false | this.O.a(paramCanvas);
        paramCanvas.restoreToCount(i5);
      }
      if (!this.P.a())
      {
        int i2 = paramCanvas.save();
        int i3 = getWidth();
        int i4 = getHeight() - getPaddingTop() - getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(1.0F + this.t) * i3);
        this.P.a(i4, i3);
        bool2 |= this.P.a(paramCanvas);
        paramCanvas.restoreToCount(i2);
      }
    }
    while (true)
    {
      if (bool2)
        bg.d(this);
      return;
      this.O.b();
      this.P.b();
      bool2 = false;
    }
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.p;
    if ((localDrawable != null) && (localDrawable.isStateful()))
      localDrawable.setState(getDrawableState());
  }

  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewPager.LayoutParams();
  }

  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewPager.LayoutParams(getContext(), paramAttributeSet);
  }

  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }

  public at getAdapter()
  {
    return this.h;
  }

  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.ac == 2)
      paramInt2 = paramInt1 - 1 - paramInt2;
    return ((ViewPager.LayoutParams)((View)this.ad.get(paramInt2)).getLayoutParams()).f;
  }

  public int getCurrentItem()
  {
    return this.i;
  }

  public int getOffscreenPageLimit()
  {
    return this.y;
  }

  public int getPageMargin()
  {
    return this.o;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.Q = true;
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.af);
    super.onDetachedFromWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.o > 0) && (this.p != null) && (this.e.size() > 0) && (this.h != null))
    {
      int i1 = getScrollX();
      int i2 = getWidth();
      float f1 = this.o / i2;
      ch localch = (ch)this.e.get(0);
      float f2 = localch.e;
      int i3 = this.e.size();
      int i4 = localch.b;
      int i5 = ((ch)this.e.get(i3 - 1)).b;
      int i6 = 0;
      int i7 = i4;
      if (i7 < i5)
      {
        while ((i7 > localch.b) && (i6 < i3))
        {
          ArrayList localArrayList = this.e;
          i6++;
          localch = (ch)localArrayList.get(i6);
        }
        float f3;
        if (i7 == localch.b)
        {
          f3 = (localch.e + localch.d) * i2;
          f2 = f1 + (localch.e + localch.d);
        }
        while (true)
        {
          if (f3 + this.o > i1)
          {
            this.p.setBounds((int)f3, this.q, (int)(0.5F + (f3 + this.o)), this.r);
            this.p.draw(paramCanvas);
          }
          if (f3 > i1 + i2)
            return;
          i7++;
          break;
          f3 = (1.0F + f2) * i2;
          f2 += 1.0F + f1;
        }
      }
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 0xFF & paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 1))
    {
      this.z = false;
      this.A = false;
      this.I = -1;
      if (this.J != null)
      {
        this.J.recycle();
        this.J = null;
      }
    }
    do
    {
      return false;
      if (i1 == 0)
        break;
      if (this.z)
        return true;
    }
    while (this.A);
    switch (i1)
    {
    default:
    case 2:
    case 0:
    case 6:
    }
    while (true)
    {
      if (this.J == null)
        this.J = VelocityTracker.obtain();
      this.J.addMovement(paramMotionEvent);
      return this.z;
      int i2 = this.I;
      if (i2 == -1)
        continue;
      int i3 = al.a(paramMotionEvent, i2);
      float f3 = al.c(paramMotionEvent, i3);
      float f4 = f3 - this.E;
      float f5 = Math.abs(f4);
      float f6 = al.d(paramMotionEvent, i3);
      float f7 = Math.abs(f6 - this.H);
      if (f4 != 0.0F)
      {
        float f9 = this.E;
        if (((f9 < this.C) && (f4 > 0.0F)) || ((f9 > getWidth() - this.C) && (f4 < 0.0F)));
        for (int i4 = 1; (i4 == 0) && (a(this, false, (int)f4, (int)f3, (int)f6)); i4 = 0)
        {
          this.E = f3;
          this.F = f6;
          this.A = true;
          return false;
        }
      }
      float f8;
      if ((f5 > this.D) && (0.5F * f5 > f7))
      {
        this.z = true;
        f();
        setScrollState(1);
        if (f4 > 0.0F)
        {
          f8 = this.G + this.D;
          label364: this.E = f8;
          this.F = f6;
          setScrollingCacheEnabled(true);
        }
      }
      while ((this.z) && (a(f3)))
      {
        bg.d(this);
        break;
        f8 = this.G - this.D;
        break label364;
        if (f7 <= this.D)
          continue;
        this.A = true;
      }
      float f1 = paramMotionEvent.getX();
      this.G = f1;
      this.E = f1;
      float f2 = paramMotionEvent.getY();
      this.H = f2;
      this.F = f2;
      this.I = al.b(paramMotionEvent, 0);
      this.A = false;
      this.m.computeScrollOffset();
      if ((this.ag == 2) && (Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.N))
      {
        this.m.abortAnimation();
        this.x = false;
        b();
        this.z = true;
        f();
        setScrollState(1);
        continue;
      }
      a(false);
      this.z = false;
      continue;
      a(paramMotionEvent);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    int i4 = getPaddingLeft();
    int i5 = getPaddingTop();
    int i6 = getPaddingRight();
    int i7 = getPaddingBottom();
    int i8 = getScrollX();
    int i9 = 0;
    int i10 = 0;
    View localView2;
    int i21;
    label156: int i22;
    int i24;
    int i25;
    label208: int i14;
    int i15;
    int i16;
    if (i10 < i1)
    {
      localView2 = getChildAt(i10);
      if (localView2.getVisibility() == 8)
        break label659;
      ViewPager.LayoutParams localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
      if (!localLayoutParams2.a)
        break label659;
      int i18 = 0x7 & localLayoutParams2.b;
      int i19 = 0x70 & localLayoutParams2.b;
      switch (i18)
      {
      case 2:
      case 4:
      default:
        i21 = i4;
        switch (i19)
        {
        default:
          i22 = i5;
          int i30 = i7;
          i24 = i5;
          i25 = i30;
          int i26 = i21 + i8;
          localView2.layout(i26, i22, i26 + localView2.getMeasuredWidth(), i22 + localView2.getMeasuredHeight());
          i14 = i9 + 1;
          i15 = i24;
          i7 = i25;
          i16 = i6;
        case 48:
        case 16:
        case 80:
        }
      case 3:
      case 1:
      case 5:
      }
    }
    for (int i17 = i4; ; i17 = i4)
    {
      i10++;
      i4 = i17;
      i6 = i16;
      i5 = i15;
      i9 = i14;
      break;
      int i31 = i4 + localView2.getMeasuredWidth();
      i21 = i4;
      i4 = i31;
      break label156;
      i21 = Math.max((i2 - localView2.getMeasuredWidth()) / 2, i4);
      break label156;
      int i20 = i2 - i6 - localView2.getMeasuredWidth();
      i6 += localView2.getMeasuredWidth();
      i21 = i20;
      break label156;
      int i28 = i5 + localView2.getMeasuredHeight();
      int i29 = i5;
      i25 = i7;
      i24 = i28;
      i22 = i29;
      break label208;
      i22 = Math.max((i3 - localView2.getMeasuredHeight()) / 2, i5);
      int i27 = i7;
      i24 = i5;
      i25 = i27;
      break label208;
      i22 = i3 - i7 - localView2.getMeasuredHeight();
      int i23 = i7 + localView2.getMeasuredHeight();
      i24 = i5;
      i25 = i23;
      break label208;
      int i11 = i2 - i4 - i6;
      for (int i12 = 0; i12 < i1; i12++)
      {
        View localView1 = getChildAt(i12);
        if (localView1.getVisibility() == 8)
          continue;
        ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
        if (localLayoutParams1.a)
          continue;
        ch localch = a(localView1);
        if (localch == null)
          continue;
        int i13 = i4 + (int)(i11 * localch.e);
        if (localLayoutParams1.d)
        {
          localLayoutParams1.d = false;
          localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i11 * localLayoutParams1.c), 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - i5 - i7, 1073741824));
        }
        localView1.layout(i13, i5, i13 + localView1.getMeasuredWidth(), i5 + localView1.getMeasuredHeight());
      }
      this.q = i5;
      this.r = (i3 - i7);
      this.S = i9;
      if (this.Q)
        a(this.i, false, 0, false);
      this.Q = false;
      return;
      label659: i14 = i9;
      i15 = i5;
      i16 = i6;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    int i1 = getMeasuredWidth();
    this.C = Math.min(i1 / 10, this.B);
    int i2 = i1 - getPaddingLeft() - getPaddingRight();
    int i3 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int i5 = 0;
    View localView2;
    ViewPager.LayoutParams localLayoutParams2;
    int i10;
    int i11;
    int i12;
    label167: int i13;
    label182: label192: int i14;
    int i15;
    if (i5 < i4)
    {
      localView2 = getChildAt(i5);
      if (localView2.getVisibility() != 8)
      {
        localLayoutParams2 = (ViewPager.LayoutParams)localView2.getLayoutParams();
        if ((localLayoutParams2 != null) && (localLayoutParams2.a))
        {
          int i8 = 0x7 & localLayoutParams2.b;
          int i9 = 0x70 & localLayoutParams2.b;
          i10 = -2147483648;
          i11 = -2147483648;
          if ((i9 != 48) && (i9 != 80))
            break label294;
          i12 = 1;
          if ((i8 != 3) && (i8 != 5))
            break label300;
          i13 = 1;
          if (i12 == 0)
            break label306;
          i10 = 1073741824;
          if (localLayoutParams2.width == -2)
            break label475;
          i14 = 1073741824;
          if (localLayoutParams2.width == -1)
            break label468;
          i15 = localLayoutParams2.width;
        }
      }
    }
    while (true)
    {
      if (localLayoutParams2.height != -2)
      {
        i11 = 1073741824;
        if (localLayoutParams2.height == -1);
      }
      for (int i16 = localLayoutParams2.height; ; i16 = i3)
      {
        localView2.measure(View.MeasureSpec.makeMeasureSpec(i15, i14), View.MeasureSpec.makeMeasureSpec(i16, i11));
        if (i12 != 0)
          i3 -= localView2.getMeasuredHeight();
        while (true)
        {
          i5++;
          break;
          label294: i12 = 0;
          break label167;
          label300: i13 = 0;
          break label182;
          label306: if (i13 == 0)
            break label192;
          i11 = 1073741824;
          break label192;
          if (i13 == 0)
            continue;
          i2 -= localView2.getMeasuredWidth();
        }
        View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        this.u = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.v = true;
        b();
        this.v = false;
        int i6 = getChildCount();
        for (int i7 = 0; i7 < i6; i7++)
        {
          View localView1 = getChildAt(i7);
          if (localView1.getVisibility() == 8)
            continue;
          ViewPager.LayoutParams localLayoutParams1 = (ViewPager.LayoutParams)localView1.getLayoutParams();
          if ((localLayoutParams1 != null) && (localLayoutParams1.a))
            continue;
          localView1.measure(View.MeasureSpec.makeMeasureSpec((int)(i2 * localLayoutParams1.c), 1073741824), this.u);
        }
        return;
      }
      label468: i15 = i2;
      continue;
      label475: i14 = i10;
      i15 = i2;
    }
  }

  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i1 = -1;
    int i2 = getChildCount();
    int i3;
    if ((paramInt & 0x2) != 0)
    {
      i1 = 1;
      i3 = 0;
    }
    while (i3 != i2)
    {
      View localView = getChildAt(i3);
      if (localView.getVisibility() == 0)
      {
        ch localch = a(localView);
        if ((localch != null) && (localch.b == this.i) && (localView.requestFocus(paramInt, paramRect)))
        {
          return true;
          i3 = i2 - 1;
          i2 = i1;
          continue;
        }
      }
      i3 += i1;
    }
    return false;
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof ViewPager.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    ViewPager.SavedState localSavedState = (ViewPager.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.h != null)
    {
      this.h.a(localSavedState.b, localSavedState.c);
      a(localSavedState.a, false, true);
      return;
    }
    this.j = localSavedState.a;
    this.k = localSavedState.b;
    this.l = localSavedState.c;
  }

  public Parcelable onSaveInstanceState()
  {
    ViewPager.SavedState localSavedState = new ViewPager.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.i;
    if (this.h != null)
      localSavedState.b = this.h.c();
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
      a(paramInt1, paramInt3, this.o, this.o);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      return false;
    if ((this.h == null) || (this.h.a() == 0))
      return false;
    if (this.J == null)
      this.J = VelocityTracker.obtain();
    this.J.addMovement(paramMotionEvent);
    int i1 = 0xFF & paramMotionEvent.getAction();
    boolean bool1 = false;
    switch (i1)
    {
    case 4:
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      if (bool1)
        bg.d(this);
      return true;
      this.m.abortAnimation();
      this.x = false;
      b();
      float f8 = paramMotionEvent.getX();
      this.G = f8;
      this.E = f8;
      float f9 = paramMotionEvent.getY();
      this.H = f9;
      this.F = f9;
      this.I = al.b(paramMotionEvent, 0);
      bool1 = false;
      continue;
      float f5;
      float f7;
      if (!this.z)
      {
        int i8 = al.a(paramMotionEvent, this.I);
        float f3 = al.c(paramMotionEvent, i8);
        float f4 = Math.abs(f3 - this.E);
        f5 = al.d(paramMotionEvent, i8);
        float f6 = Math.abs(f5 - this.F);
        if ((f4 > this.D) && (f4 > f6))
        {
          this.z = true;
          f();
          if (f3 - this.G <= 0.0F)
            break label373;
          f7 = this.G + this.D;
        }
      }
      while (true)
      {
        this.E = f7;
        this.F = f5;
        setScrollState(1);
        setScrollingCacheEnabled(true);
        ViewParent localViewParent = getParent();
        if (localViewParent != null)
          localViewParent.requestDisallowInterceptTouchEvent(true);
        boolean bool4 = this.z;
        bool1 = false;
        if (!bool4)
          break;
        bool1 = false | a(al.c(paramMotionEvent, al.a(paramMotionEvent, this.I)));
        break;
        label373: f7 = this.G - this.D;
      }
      boolean bool3 = this.z;
      bool1 = false;
      if (!bool3)
        continue;
      VelocityTracker localVelocityTracker = this.J;
      localVelocityTracker.computeCurrentVelocity(1000, this.L);
      int i3 = (int)bc.a(localVelocityTracker, this.I);
      this.x = true;
      int i4 = getClientWidth();
      int i5 = getScrollX();
      ch localch1 = g();
      int i6 = localch1.b;
      float f1 = (i5 / i4 - localch1.e) / localch1.d;
      int i7;
      if ((Math.abs((int)(al.c(paramMotionEvent, al.a(paramMotionEvent, this.I)) - this.G)) > this.M) && (Math.abs(i3) > this.K))
      {
        if (i3 > 0);
        while (true)
        {
          i7 = i6;
          if (this.e.size() > 0)
          {
            ch localch2 = (ch)this.e.get(0);
            ch localch3 = (ch)this.e.get(-1 + this.e.size());
            i7 = Math.max(localch2.b, Math.min(i7, localch3.b));
          }
          a(i7, true, true, i3);
          this.I = -1;
          h();
          bool1 = this.O.c() | this.P.c();
          break;
          i6++;
        }
      }
      float f2;
      if (i6 >= this.i)
        f2 = 0.4F;
      while (true)
      {
        i7 = (int)(f2 + (f1 + i6));
        break;
        f2 = 0.6F;
      }
      boolean bool2 = this.z;
      bool1 = false;
      if (!bool2)
        continue;
      a(this.i, true, 0, false);
      this.I = -1;
      h();
      bool1 = this.O.c() | this.P.c();
      continue;
      int i2 = al.b(paramMotionEvent);
      this.E = al.c(paramMotionEvent, i2);
      this.I = al.b(paramMotionEvent, i2);
      bool1 = false;
      continue;
      a(paramMotionEvent);
      this.E = al.c(paramMotionEvent, al.a(paramMotionEvent, this.I));
      bool1 = false;
    }
  }

  public void removeView(View paramView)
  {
    if (this.v)
    {
      removeViewInLayout(paramView);
      return;
    }
    super.removeView(paramView);
  }

  public void setAdapter(at paramat)
  {
    if (this.h != null)
    {
      this.h.b(this.n);
      for (int i1 = 0; i1 < this.e.size(); i1++)
      {
        ch localch = (ch)this.e.get(i1);
        this.h.a(this, localch.b, localch.a);
      }
      this.h.b();
      this.e.clear();
      for (int i2 = 0; i2 < getChildCount(); i2++)
      {
        if (((ViewPager.LayoutParams)getChildAt(i2).getLayoutParams()).a)
          continue;
        removeViewAt(i2);
        i2--;
      }
      this.i = 0;
      scrollTo(0, 0);
    }
    at localat = this.h;
    this.h = paramat;
    this.b = 0;
    boolean bool;
    if (this.h != null)
    {
      if (this.n == null)
        this.n = new cm(this, 0);
      this.h.a(this.n);
      this.x = false;
      bool = this.Q;
      this.Q = true;
      this.b = this.h.a();
      if (this.j < 0)
        break label291;
      this.h.a(this.k, this.l);
      a(this.j, false, true);
      this.j = -1;
      this.k = null;
      this.l = null;
    }
    while (true)
    {
      if ((this.W != null) && (localat != paramat))
        this.W.a(localat, paramat);
      return;
      label291: if (!bool)
      {
        b();
        continue;
      }
      requestLayout();
    }
  }

  void setChildrenDrawingOrderEnabledCompat(boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT < 7) || (this.ab == null));
    try
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      this.ab = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", arrayOfClass);
      try
      {
        label42: Method localMethod = this.ab;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(paramBoolean);
        localMethod.invoke(this, arrayOfObject);
        return;
      }
      catch (Exception localException)
      {
        return;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label42;
    }
  }

  public void setCurrentItem(int paramInt)
  {
    this.x = false;
    if (!this.Q);
    for (boolean bool = true; ; bool = false)
    {
      a(paramInt, bool, false);
      return;
    }
  }

  public void setOffscreenPageLimit(int paramInt)
  {
    if (paramInt <= 0)
    {
      new StringBuilder("Requested offscreen page limit ").append(paramInt).append(" too small; defaulting to 1");
      paramInt = 1;
    }
    if (paramInt != this.y)
    {
      this.y = paramInt;
      b();
    }
  }

  void setOnAdapterChangeListener(cj paramcj)
  {
    this.W = paramcj;
  }

  @Deprecated
  public void setOnPageChangeListener(ck paramck)
  {
    this.U = paramck;
  }

  public void setPageMargin(int paramInt)
  {
    int i1 = this.o;
    this.o = paramInt;
    int i2 = getWidth();
    a(i2, i2, paramInt, i1);
    requestLayout();
  }

  public void setPageMarginDrawable(int paramInt)
  {
    setPageMarginDrawable(getContext().getResources().getDrawable(paramInt));
  }

  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.p = paramDrawable;
    if (paramDrawable != null)
      refreshDrawableState();
    if (paramDrawable == null);
    for (boolean bool = true; ; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
    }
  }

  public final void setPageTransformer$382b7817(cl paramcl)
  {
    if (Build.VERSION.SDK_INT >= 11)
      if (this.aa == null)
        break label50;
    label50: for (int i1 = 1; ; i1 = 0)
    {
      int i2 = 0;
      if (1 != i1)
        i2 = 1;
      this.aa = paramcl;
      setChildrenDrawingOrderEnabledCompat(true);
      this.ac = 2;
      if (i2 != 0)
        b();
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.p);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.ViewPager
 * JD-Core Version:    0.6.0
 */