package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.ab;
import android.support.v4.view.af;
import android.support.v4.view.al;
import android.support.v4.view.bg;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.internal.view.e;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.y;
import android.support.v7.internal.widget.aa;
import android.support.v7.internal.widget.au;
import android.support.v7.internal.widget.aw;
import android.support.v7.internal.widget.ba;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.connect.dataprovider.DataType;
import com.tencent.mm.sdk.channel.a;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup
{
  private static final String TAG = "Toolbar";
  private y mActionMenuPresenterCallback;
  private int mButtonGravity;
  private ImageButton mCollapseButtonView;
  private CharSequence mCollapseDescription;
  private Drawable mCollapseIcon;
  private boolean mCollapsible;
  private final DataType mContentInsets$433fd199 = new DataType();
  private boolean mEatingHover;
  private boolean mEatingTouch;
  View mExpandedActionView;
  private dp mExpandedMenuPresenter;
  private int mGravity = 8388627;
  private ImageView mLogoView;
  private int mMaxButtonHeight;
  private j mMenuBuilderCallback;
  private ActionMenuView mMenuView;
  private final l mMenuViewItemClickListener = new dm(this);
  private ImageButton mNavButtonView;
  private l mOnMenuItemClickListener$76933922;
  private ActionMenuPresenter mOuterActionMenuPresenter;
  private Context mPopupContext;
  private int mPopupTheme;
  private final Runnable mShowOverflowMenuRunnable = new dn(this);
  private CharSequence mSubtitleText;
  private int mSubtitleTextAppearance;
  private int mSubtitleTextColor;
  private TextView mSubtitleTextView;
  private final int[] mTempMargins = new int[2];
  private final ArrayList<View> mTempViews = new ArrayList();
  private final au mTintManager;
  private int mTitleMarginBottom;
  private int mTitleMarginEnd;
  private int mTitleMarginStart;
  private int mTitleMarginTop;
  private CharSequence mTitleText;
  private int mTitleTextAppearance;
  private int mTitleTextColor;
  private TextView mTitleTextView;
  private aw mWrapper;

  public Toolbar(Context paramContext)
  {
    this(paramContext, null);
  }

  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.toolbarStyle);
  }

  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a locala = a.a(getContext(), paramAttributeSet, R.styleable.Toolbar, paramInt);
    this.mTitleTextAppearance = locala.f(R.styleable.Toolbar_titleTextAppearance, 0);
    this.mSubtitleTextAppearance = locala.f(R.styleable.Toolbar_subtitleTextAppearance, 0);
    this.mGravity = locala.b(R.styleable.Toolbar_android_gravity, this.mGravity);
    this.mButtonGravity = 48;
    int i = locala.c(R.styleable.Toolbar_titleMargins, 0);
    this.mTitleMarginBottom = i;
    this.mTitleMarginTop = i;
    this.mTitleMarginEnd = i;
    this.mTitleMarginStart = i;
    int j = locala.c(R.styleable.Toolbar_titleMarginStart, -1);
    if (j >= 0)
      this.mTitleMarginStart = j;
    int k = locala.c(R.styleable.Toolbar_titleMarginEnd, -1);
    if (k >= 0)
      this.mTitleMarginEnd = k;
    int m = locala.c(R.styleable.Toolbar_titleMarginTop, -1);
    if (m >= 0)
      this.mTitleMarginTop = m;
    int n = locala.c(R.styleable.Toolbar_titleMarginBottom, -1);
    if (n >= 0)
      this.mTitleMarginBottom = n;
    this.mMaxButtonHeight = locala.d(R.styleable.Toolbar_maxButtonHeight, -1);
    int i1 = locala.c(R.styleable.Toolbar_contentInsetStart, -2147483648);
    int i2 = locala.c(R.styleable.Toolbar_contentInsetEnd, -2147483648);
    int i3 = locala.d(R.styleable.Toolbar_contentInsetLeft, 0);
    int i4 = locala.d(R.styleable.Toolbar_contentInsetRight, 0);
    this.mContentInsets$433fd199.b(i3, i4);
    if ((i1 != -2147483648) || (i2 != -2147483648))
      this.mContentInsets$433fd199.a(i1, i2);
    this.mCollapseIcon = locala.a(R.styleable.Toolbar_collapseIcon);
    this.mCollapseDescription = locala.c(R.styleable.Toolbar_collapseContentDescription);
    CharSequence localCharSequence1 = locala.c(R.styleable.Toolbar_title);
    if (!TextUtils.isEmpty(localCharSequence1))
      setTitle(localCharSequence1);
    CharSequence localCharSequence2 = locala.c(R.styleable.Toolbar_subtitle);
    if (!TextUtils.isEmpty(localCharSequence2))
      setSubtitle(localCharSequence2);
    this.mPopupContext = getContext();
    setPopupTheme(locala.f(R.styleable.Toolbar_popupTheme, 0));
    Drawable localDrawable = locala.a(R.styleable.Toolbar_navigationIcon);
    if (localDrawable != null)
      setNavigationIcon(localDrawable);
    CharSequence localCharSequence3 = locala.c(R.styleable.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(localCharSequence3))
      setNavigationContentDescription(localCharSequence3);
    locala.b();
    this.mTintManager = locala.c();
  }

  private void addCustomViewsWithGravity(List<View> paramList, int paramInt)
  {
    int i = 1;
    if (bg.h(this) == i);
    while (true)
    {
      int j = getChildCount();
      int k = android.support.v4.view.m.a(paramInt, bg.h(this));
      paramList.clear();
      int m = 0;
      if (i != 0)
      {
        for (int n = j - 1; n >= 0; n--)
        {
          View localView2 = getChildAt(n);
          Toolbar.LayoutParams localLayoutParams2 = (Toolbar.LayoutParams)localView2.getLayoutParams();
          if ((localLayoutParams2.b != 0) || (!shouldLayout(localView2)) || (getChildHorizontalGravity(localLayoutParams2.a) != k))
            continue;
          paramList.add(localView2);
        }
        i = 0;
        continue;
      }
      while (m < j)
      {
        View localView1 = getChildAt(m);
        Toolbar.LayoutParams localLayoutParams1 = (Toolbar.LayoutParams)localView1.getLayoutParams();
        if ((localLayoutParams1.b == 0) && (shouldLayout(localView1)) && (getChildHorizontalGravity(localLayoutParams1.a) == k))
          paramList.add(localView1);
        m++;
      }
    }
  }

  private void addSystemView(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    Toolbar.LayoutParams localLayoutParams1;
    if (localLayoutParams == null)
      localLayoutParams1 = generateDefaultLayoutParams();
    while (true)
    {
      localLayoutParams1.b = 1;
      addView(paramView, localLayoutParams1);
      return;
      if (!checkLayoutParams(localLayoutParams))
      {
        localLayoutParams1 = generateLayoutParams(localLayoutParams);
        continue;
      }
      localLayoutParams1 = (Toolbar.LayoutParams)localLayoutParams;
    }
  }

  private void ensureCollapseButtonView()
  {
    if (this.mCollapseButtonView == null)
    {
      this.mCollapseButtonView = new ImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
      this.mCollapseButtonView.setImageDrawable(this.mCollapseIcon);
      this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
      Toolbar.LayoutParams localLayoutParams = generateDefaultLayoutParams();
      localLayoutParams.a = (0x800003 | 0x70 & this.mButtonGravity);
      localLayoutParams.b = 2;
      this.mCollapseButtonView.setLayoutParams(localLayoutParams);
      this.mCollapseButtonView.setOnClickListener(new do(this));
    }
  }

  private void ensureLogoView()
  {
    if (this.mLogoView == null)
      this.mLogoView = new ImageView(getContext());
  }

  private void ensureMenu()
  {
    ensureMenuView();
    if (this.mMenuView.c() == null)
    {
      i locali = (i)this.mMenuView.getMenu();
      if (this.mExpandedMenuPresenter == null)
        this.mExpandedMenuPresenter = new dp(this, 0);
      this.mMenuView.setExpandedActionViewsExclusive(true);
      locali.a(this.mExpandedMenuPresenter, this.mPopupContext);
    }
  }

  private void ensureMenuView()
  {
    if (this.mMenuView == null)
    {
      this.mMenuView = new ActionMenuView(getContext());
      this.mMenuView.setPopupTheme(this.mPopupTheme);
      this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
      this.mMenuView.a(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
      Toolbar.LayoutParams localLayoutParams = generateDefaultLayoutParams();
      localLayoutParams.a = (0x800005 | 0x70 & this.mButtonGravity);
      this.mMenuView.setLayoutParams(localLayoutParams);
      addSystemView(this.mMenuView);
    }
  }

  private void ensureNavButtonView()
  {
    if (this.mNavButtonView == null)
    {
      this.mNavButtonView = new ImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
      Toolbar.LayoutParams localLayoutParams = generateDefaultLayoutParams();
      localLayoutParams.a = (0x800003 | 0x70 & this.mButtonGravity);
      this.mNavButtonView.setLayoutParams(localLayoutParams);
    }
  }

  private int getChildHorizontalGravity(int paramInt)
  {
    int i = bg.h(this);
    int j = 0x7 & android.support.v4.view.m.a(paramInt, i);
    switch (j)
    {
    case 2:
    case 4:
    default:
      if (i != 1)
        break;
      j = 5;
    case 1:
    case 3:
    case 5:
      return j;
    }
    return 3;
  }

  private int getChildTop(View paramView, int paramInt)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i3;
    if (paramInt > 0)
    {
      j = (i - paramInt) / 2;
      switch (getChildVerticalGravity(localLayoutParams.a))
      {
      default:
        k = getPaddingTop();
        m = getPaddingBottom();
        n = getHeight();
        i1 = (n - k - m - i) / 2;
        if (i1 >= localLayoutParams.topMargin)
          break;
        i3 = localLayoutParams.topMargin;
      case 48:
      case 80:
      }
    }
    while (true)
    {
      return i3 + k;
      j = 0;
      break;
      return getPaddingTop() - j;
      return getHeight() - getPaddingBottom() - i - localLayoutParams.bottomMargin - j;
      int i2 = n - m - i - i1 - k;
      if (i2 < localLayoutParams.bottomMargin)
      {
        i3 = Math.max(0, i1 - (localLayoutParams.bottomMargin - i2));
        continue;
      }
      i3 = i1;
    }
  }

  private int getChildVerticalGravity(int paramInt)
  {
    int i = paramInt & 0x70;
    switch (i)
    {
    default:
      i = 0x70 & this.mGravity;
    case 16:
    case 48:
    case 80:
    }
    return i;
  }

  private int getHorizontalMargins(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return ab.a(localMarginLayoutParams) + ab.b(localMarginLayoutParams);
  }

  private MenuInflater getMenuInflater()
  {
    return new e(getContext());
  }

  private int getVerticalMargins(View paramView)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin;
  }

  private int getViewListMeasuredWidth(List<View> paramList, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = paramList.size();
    int m = 0;
    int n = 0;
    int i1 = i;
    int i2 = j;
    while (m < k)
    {
      View localView = (View)paramList.get(m);
      Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)localView.getLayoutParams();
      int i3 = localLayoutParams.leftMargin - i1;
      int i4 = localLayoutParams.rightMargin - i2;
      int i5 = Math.max(0, i3);
      int i6 = Math.max(0, i4);
      i1 = Math.max(0, -i3);
      i2 = Math.max(0, -i4);
      int i7 = n + (i6 + (i5 + localView.getMeasuredWidth()));
      m++;
      n = i7;
    }
    return n;
  }

  private static boolean isCustomView(View paramView)
  {
    return ((Toolbar.LayoutParams)paramView.getLayoutParams()).b == 0;
  }

  private int layoutChildLeft(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.leftMargin - paramArrayOfInt[0];
    int j = paramInt1 + Math.max(0, i);
    paramArrayOfInt[0] = Math.max(0, -i);
    int k = getChildTop(paramView, paramInt2);
    int m = paramView.getMeasuredWidth();
    paramView.layout(j, k, j + m, k + paramView.getMeasuredHeight());
    return j + (m + localLayoutParams.rightMargin);
  }

  private int layoutChildRight(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    Toolbar.LayoutParams localLayoutParams = (Toolbar.LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.rightMargin - paramArrayOfInt[1];
    int j = paramInt1 - Math.max(0, i);
    paramArrayOfInt[1] = Math.max(0, -i);
    int k = getChildTop(paramView, paramInt2);
    int m = paramView.getMeasuredWidth();
    paramView.layout(j - m, k, j, k + paramView.getMeasuredHeight());
    return j - (m + localLayoutParams.leftMargin);
  }

  private int measureChildCollapseMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = localMarginLayoutParams.leftMargin - paramArrayOfInt[0];
    int j = localMarginLayoutParams.rightMargin - paramArrayOfInt[1];
    int k = Math.max(0, i) + Math.max(0, j);
    paramArrayOfInt[0] = Math.max(0, -i);
    paramArrayOfInt[1] = Math.max(0, -j);
    paramView.measure(getChildMeasureSpec(paramInt1, paramInt2 + (k + (getPaddingLeft() + getPaddingRight())), localMarginLayoutParams.width), getChildMeasureSpec(paramInt3, paramInt4 + (getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin), localMarginLayoutParams.height));
    return k + paramView.getMeasuredWidth();
  }

  private void measureChildConstrained(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getChildMeasureSpec(paramInt1, paramInt2 + (getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin), localMarginLayoutParams.width);
    int j = getChildMeasureSpec(paramInt3, paramInt4 + (getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin), localMarginLayoutParams.height);
    int k = View.MeasureSpec.getMode(j);
    if ((k != 1073741824) && (paramInt5 >= 0))
    {
      if (k != 0)
        paramInt5 = Math.min(View.MeasureSpec.getSize(j), paramInt5);
      j = View.MeasureSpec.makeMeasureSpec(paramInt5, 1073741824);
    }
    paramView.measure(i, j);
  }

  private void postShowOverflowMenu()
  {
    removeCallbacks(this.mShowOverflowMenuRunnable);
    post(this.mShowOverflowMenuRunnable);
  }

  private void setChildVisibilityForExpandedActionView(boolean paramBoolean)
  {
    int i = getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = getChildAt(j);
      if ((((Toolbar.LayoutParams)localView.getLayoutParams()).b != 2) && (localView != this.mMenuView))
        if (!paramBoolean)
          break label64;
      label64: for (int k = 8; ; k = 0)
      {
        localView.setVisibility(k);
        j++;
        break;
      }
    }
  }

  private boolean shouldCollapse()
  {
    if (!this.mCollapsible)
      return false;
    int i = getChildCount();
    for (int j = 0; ; j++)
    {
      if (j >= i)
        break label55;
      View localView = getChildAt(j);
      if ((shouldLayout(localView)) && (localView.getMeasuredWidth() > 0) && (localView.getMeasuredHeight() > 0))
        break;
    }
    label55: return true;
  }

  private boolean shouldLayout(View paramView)
  {
    return (paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8);
  }

  private void updateChildVisibilityForExpandedActionView(View paramView)
  {
    if ((((Toolbar.LayoutParams)paramView.getLayoutParams()).b != 2) && (paramView != this.mMenuView))
      if (this.mExpandedActionView == null)
        break label38;
    label38: for (int i = 8; ; i = 0)
    {
      paramView.setVisibility(i);
      return;
    }
  }

  public boolean canShowOverflowMenu()
  {
    return (getVisibility() == 0) && (this.mMenuView != null) && (this.mMenuView.a());
  }

  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof Toolbar.LayoutParams));
  }

  public void collapseActionView()
  {
    if (this.mExpandedMenuPresenter == null);
    for (android.support.v7.internal.view.menu.m localm = null; ; localm = this.mExpandedMenuPresenter.a)
    {
      if (localm != null)
        localm.collapseActionView();
      return;
    }
  }

  public void dismissPopupMenus()
  {
    if (this.mMenuView != null)
      this.mMenuView.h();
  }

  protected Toolbar.LayoutParams generateDefaultLayoutParams()
  {
    return new Toolbar.LayoutParams();
  }

  public Toolbar.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new Toolbar.LayoutParams(getContext(), paramAttributeSet);
  }

  protected Toolbar.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof Toolbar.LayoutParams))
      return new Toolbar.LayoutParams((Toolbar.LayoutParams)paramLayoutParams);
    if ((paramLayoutParams instanceof ActionBar.LayoutParams))
      return new Toolbar.LayoutParams((ActionBar.LayoutParams)paramLayoutParams);
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
      return new Toolbar.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    return new Toolbar.LayoutParams(paramLayoutParams);
  }

  public int getContentInsetEnd()
  {
    return this.mContentInsets$433fd199.d();
  }

  public int getContentInsetLeft()
  {
    return this.mContentInsets$433fd199.a();
  }

  public int getContentInsetRight()
  {
    return this.mContentInsets$433fd199.b();
  }

  public int getContentInsetStart()
  {
    return this.mContentInsets$433fd199.c();
  }

  public Drawable getLogo()
  {
    if (this.mLogoView != null)
      return this.mLogoView.getDrawable();
    return null;
  }

  public CharSequence getLogoDescription()
  {
    if (this.mLogoView != null)
      return this.mLogoView.getContentDescription();
    return null;
  }

  public Menu getMenu()
  {
    ensureMenu();
    return this.mMenuView.getMenu();
  }

  public CharSequence getNavigationContentDescription()
  {
    if (this.mNavButtonView != null)
      return this.mNavButtonView.getContentDescription();
    return null;
  }

  public Drawable getNavigationIcon()
  {
    if (this.mNavButtonView != null)
      return this.mNavButtonView.getDrawable();
    return null;
  }

  public int getPopupTheme()
  {
    return this.mPopupTheme;
  }

  public CharSequence getSubtitle()
  {
    return this.mSubtitleText;
  }

  public CharSequence getTitle()
  {
    return this.mTitleText;
  }

  public aa getWrapper()
  {
    if (this.mWrapper == null)
      this.mWrapper = new aw(this);
    return this.mWrapper;
  }

  public boolean hasExpandedActionView()
  {
    return (this.mExpandedMenuPresenter != null) && (this.mExpandedMenuPresenter.a != null);
  }

  public boolean hideOverflowMenu()
  {
    return (this.mMenuView != null) && (this.mMenuView.e());
  }

  public void inflateMenu(int paramInt)
  {
    getMenuInflater().inflate(paramInt, getMenu());
  }

  public boolean isOverflowMenuShowPending()
  {
    return (this.mMenuView != null) && (this.mMenuView.g());
  }

  public boolean isOverflowMenuShowing()
  {
    return (this.mMenuView != null) && (this.mMenuView.f());
  }

  public boolean isTitleTruncated()
  {
    if (this.mTitleTextView == null);
    while (true)
    {
      return false;
      Layout localLayout = this.mTitleTextView.getLayout();
      if (localLayout == null)
        continue;
      int i = localLayout.getLineCount();
      for (int j = 0; j < i; j++)
        if (localLayout.getEllipsisCount(j) > 0)
          return true;
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.mShowOverflowMenuRunnable);
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = al.a(paramMotionEvent);
    if (i == 9)
      this.mEatingHover = false;
    if (!this.mEatingHover)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool))
        this.mEatingHover = true;
    }
    if ((i == 10) || (i == 3))
      this.mEatingHover = false;
    return true;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int[] arrayOfInt;
    int i4;
    int i5;
    if (bg.h(this) == 1)
    {
      i = 1;
      j = getWidth();
      k = getHeight();
      m = getPaddingLeft();
      n = getPaddingRight();
      i1 = getPaddingTop();
      i2 = getPaddingBottom();
      i3 = j - n;
      arrayOfInt = this.mTempMargins;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      i4 = bg.p(this);
      if (!shouldLayout(this.mNavButtonView))
        break label1610;
      if (i == 0)
        break label878;
      i3 = layoutChildRight(this.mNavButtonView, i3, arrayOfInt, i4);
      i5 = m;
    }
    while (true)
    {
      label112: int i6;
      label144: label176: int i7;
      label272: int i8;
      int i9;
      if (shouldLayout(this.mCollapseButtonView))
      {
        if (i != 0)
          i3 = layoutChildRight(this.mCollapseButtonView, i3, arrayOfInt, i4);
      }
      else
      {
        if (shouldLayout(this.mMenuView))
        {
          if (i == 0)
            break label916;
          i5 = layoutChildLeft(this.mMenuView, i5, arrayOfInt, i4);
        }
        arrayOfInt[0] = Math.max(0, getContentInsetLeft() - i5);
        arrayOfInt[1] = Math.max(0, getContentInsetRight() - (j - n - i3));
        i6 = Math.max(i5, getContentInsetLeft());
        i7 = Math.min(i3, j - n - getContentInsetRight());
        if (shouldLayout(this.mExpandedActionView))
        {
          if (i == 0)
            break label935;
          i7 = layoutChildRight(this.mExpandedActionView, i7, arrayOfInt, i4);
        }
        if (!shouldLayout(this.mLogoView))
          break label1599;
        if (i == 0)
          break label954;
        i8 = layoutChildRight(this.mLogoView, i7, arrayOfInt, i4);
        i9 = i6;
      }
      while (true)
      {
        label308: boolean bool1 = shouldLayout(this.mTitleTextView);
        boolean bool2 = shouldLayout(this.mSubtitleTextView);
        int i10 = 0;
        if (bool1)
        {
          Toolbar.LayoutParams localLayoutParams8 = (Toolbar.LayoutParams)this.mTitleTextView.getLayoutParams();
          i10 = 0 + (localLayoutParams8.topMargin + this.mTitleTextView.getMeasuredHeight() + localLayoutParams8.bottomMargin);
        }
        Toolbar.LayoutParams localLayoutParams7;
        if (bool2)
          localLayoutParams7 = (Toolbar.LayoutParams)this.mSubtitleTextView.getLayoutParams();
        for (int i11 = i10 + (localLayoutParams7.topMargin + this.mSubtitleTextView.getMeasuredHeight() + localLayoutParams7.bottomMargin); ; i11 = i10)
        {
          TextView localTextView1;
          label433: TextView localTextView2;
          label444: Toolbar.LayoutParams localLayoutParams1;
          Toolbar.LayoutParams localLayoutParams2;
          int i12;
          label497: int i52;
          int i54;
          if ((bool1) || (bool2))
          {
            if (!bool1)
              break label981;
            localTextView1 = this.mTitleTextView;
            if (!bool2)
              break label990;
            localTextView2 = this.mSubtitleTextView;
            localLayoutParams1 = (Toolbar.LayoutParams)localTextView1.getLayoutParams();
            localLayoutParams2 = (Toolbar.LayoutParams)localTextView2.getLayoutParams();
            if (((!bool1) || (this.mTitleTextView.getMeasuredWidth() <= 0)) && ((!bool2) || (this.mSubtitleTextView.getMeasuredWidth() <= 0)))
              break label999;
            i12 = 1;
            switch (0x70 & this.mGravity)
            {
            default:
              i52 = (k - i1 - i2 - i11) / 2;
              if (i52 >= localLayoutParams1.topMargin + this.mTitleMarginTop)
                break;
              i54 = localLayoutParams1.topMargin + this.mTitleMarginTop;
            case 48:
            case 80:
            }
          }
          while (true)
          {
            label574: int i13 = i1 + i54;
            label581: int i39;
            label597: int i41;
            int i51;
            if (i != 0)
              if (i12 != 0)
              {
                i39 = this.mTitleMarginStart;
                int i40 = i39 - arrayOfInt[1];
                i41 = i8 - Math.max(0, i40);
                arrayOfInt[1] = Math.max(0, -i40);
                if (!bool1)
                  break label1578;
                Toolbar.LayoutParams localLayoutParams6 = (Toolbar.LayoutParams)this.mTitleTextView.getLayoutParams();
                int i49 = i41 - this.mTitleTextView.getMeasuredWidth();
                int i50 = i13 + this.mTitleTextView.getMeasuredHeight();
                this.mTitleTextView.layout(i49, i13, i41, i50);
                i51 = i49 - this.mTitleMarginEnd;
                i13 = i50 + localLayoutParams6.bottomMargin;
              }
            label916: label935: label1578: for (int i42 = i51; ; i42 = i41)
            {
              Toolbar.LayoutParams localLayoutParams5;
              int i48;
              if (bool2)
              {
                localLayoutParams5 = (Toolbar.LayoutParams)this.mSubtitleTextView.getLayoutParams();
                int i45 = i13 + localLayoutParams5.topMargin;
                int i46 = i41 - this.mSubtitleTextView.getMeasuredWidth();
                int i47 = i45 + this.mSubtitleTextView.getMeasuredHeight();
                this.mSubtitleTextView.layout(i46, i45, i41, i47);
                i48 = i41 - this.mTitleMarginEnd;
              }
              for (int i43 = i48; ; i43 = i41)
              {
                if (i12 != 0);
                for (int i44 = Math.min(i42, i43); ; i44 = i41)
                {
                  i8 = i44;
                  addCustomViewsWithGravity(this.mTempViews, 3);
                  int i19 = this.mTempViews.size();
                  int i20 = 0;
                  int i21 = i9;
                  label878: int i14;
                  label954: label981: label990: label999: int i38;
                  label1122: int i16;
                  while (true)
                    if (i20 < i19)
                    {
                      i21 = layoutChildLeft((View)this.mTempViews.get(i20), i21, arrayOfInt, i4);
                      i20++;
                      continue;
                      i = 0;
                      break;
                      i5 = layoutChildLeft(this.mNavButtonView, m, arrayOfInt, i4);
                      break label112;
                      i5 = layoutChildLeft(this.mCollapseButtonView, i5, arrayOfInt, i4);
                      break label144;
                      i3 = layoutChildRight(this.mMenuView, i3, arrayOfInt, i4);
                      break label176;
                      i6 = layoutChildLeft(this.mExpandedActionView, i6, arrayOfInt, i4);
                      break label272;
                      int i55 = layoutChildLeft(this.mLogoView, i6, arrayOfInt, i4);
                      i8 = i7;
                      i9 = i55;
                      break label308;
                      localTextView1 = this.mSubtitleTextView;
                      break label433;
                      localTextView2 = this.mTitleTextView;
                      break label444;
                      i12 = 0;
                      break label497;
                      i13 = getPaddingTop() + localLayoutParams1.topMargin + this.mTitleMarginTop;
                      break label581;
                      int i53 = k - i2 - i11 - i52 - i1;
                      if (i53 >= localLayoutParams1.bottomMargin + this.mTitleMarginBottom)
                        break label1585;
                      i54 = Math.max(0, i52 - (localLayoutParams2.bottomMargin + this.mTitleMarginBottom - i53));
                      break label574;
                      i13 = k - i2 - localLayoutParams2.bottomMargin - this.mTitleMarginBottom - i11;
                      break label581;
                      i39 = 0;
                      break label597;
                      if (i12 != 0)
                      {
                        i14 = this.mTitleMarginStart;
                        int i15 = i14 - arrayOfInt[0];
                        i9 += Math.max(0, i15);
                        arrayOfInt[0] = Math.max(0, -i15);
                        if (!bool1)
                          break label1553;
                        Toolbar.LayoutParams localLayoutParams4 = (Toolbar.LayoutParams)this.mTitleTextView.getLayoutParams();
                        int i35 = i9 + this.mTitleTextView.getMeasuredWidth();
                        int i36 = i13 + this.mTitleTextView.getMeasuredHeight();
                        this.mTitleTextView.layout(i9, i13, i35, i36);
                        int i37 = i35 + this.mTitleMarginEnd;
                        i38 = i36 + localLayoutParams4.bottomMargin;
                        i16 = i37;
                      }
                    }
                  for (int i17 = i38; ; i17 = i13)
                  {
                    Toolbar.LayoutParams localLayoutParams3;
                    int i34;
                    if (bool2)
                    {
                      localLayoutParams3 = (Toolbar.LayoutParams)this.mSubtitleTextView.getLayoutParams();
                      int i31 = i17 + localLayoutParams3.topMargin;
                      int i32 = i9 + this.mSubtitleTextView.getMeasuredWidth();
                      int i33 = i31 + this.mSubtitleTextView.getMeasuredHeight();
                      this.mSubtitleTextView.layout(i9, i31, i32, i33);
                      i34 = i32 + this.mTitleMarginEnd;
                    }
                    for (int i18 = i34; ; i18 = i9)
                    {
                      if (i12 == 0)
                        break label1551;
                      i9 = Math.max(i16, i18);
                      break;
                      i14 = 0;
                      break label1122;
                      addCustomViewsWithGravity(this.mTempViews, 5);
                      int i22 = this.mTempViews.size();
                      for (int i23 = 0; i23 < i22; i23++)
                        i8 = layoutChildRight((View)this.mTempViews.get(i23), i8, arrayOfInt, i4);
                      addCustomViewsWithGravity(this.mTempViews, 1);
                      int i24 = getViewListMeasuredWidth(this.mTempViews, arrayOfInt);
                      int i25 = m + (j - m - n) / 2 - i24 / 2;
                      int i26 = i24 + i25;
                      if (i25 < i21)
                        i25 = i21;
                      while (true)
                      {
                        int i27 = this.mTempViews.size();
                        int i28 = 0;
                        int i30;
                        for (int i29 = i25; i28 < i27; i29 = i30)
                        {
                          i30 = layoutChildLeft((View)this.mTempViews.get(i28), i29, arrayOfInt, i4);
                          i28++;
                        }
                        if (i26 <= i8)
                          continue;
                        i25 -= i26 - i8;
                      }
                      this.mTempViews.clear();
                      return;
                    }
                    break;
                    i16 = i9;
                  }
                }
              }
            }
            label1551: label1553: label1585: i54 = i52;
          }
        }
        label1599: i8 = i7;
        i9 = i6;
      }
      label1610: i5 = m;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = this.mTempMargins;
    int i;
    int j;
    int k;
    int i23;
    int m;
    if (ba.a(this))
    {
      i = 0;
      j = 1;
      if (!shouldLayout(this.mNavButtonView))
        break label900;
      measureChildConstrained(this.mNavButtonView, paramInt1, 0, paramInt2, 0, this.mMaxButtonHeight);
      k = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
      i23 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
      m = ba.a(0, bg.l(this.mNavButtonView));
    }
    for (int n = i23; ; n = 0)
    {
      if (shouldLayout(this.mCollapseButtonView))
      {
        measureChildConstrained(this.mCollapseButtonView, paramInt1, 0, paramInt2, 0, this.mMaxButtonHeight);
        k = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
        n = Math.max(n, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
        m = ba.a(m, bg.l(this.mCollapseButtonView));
      }
      int i1 = getContentInsetStart();
      int i2 = 0 + Math.max(i1, k);
      arrayOfInt[j] = Math.max(0, i1 - k);
      boolean bool1 = shouldLayout(this.mMenuView);
      int i3 = 0;
      if (bool1)
      {
        measureChildConstrained(this.mMenuView, paramInt1, i2, paramInt2, 0, this.mMaxButtonHeight);
        i3 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
        n = Math.max(n, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
        m = ba.a(m, bg.l(this.mMenuView));
      }
      int i4 = getContentInsetEnd();
      int i5 = i2 + Math.max(i4, i3);
      arrayOfInt[i] = Math.max(0, i4 - i3);
      if (shouldLayout(this.mExpandedActionView))
      {
        i5 += measureChildCollapseMargins(this.mExpandedActionView, paramInt1, i5, paramInt2, 0, arrayOfInt);
        n = Math.max(n, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
        m = ba.a(m, bg.l(this.mExpandedActionView));
      }
      if (shouldLayout(this.mLogoView))
      {
        i5 += measureChildCollapseMargins(this.mLogoView, paramInt1, i5, paramInt2, 0, arrayOfInt);
        n = Math.max(n, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
        m = ba.a(m, bg.l(this.mLogoView));
      }
      int i6 = getChildCount();
      int i7 = 0;
      int i8 = n;
      int i9 = m;
      label486: int i22;
      int i20;
      if (i7 < i6)
      {
        View localView = getChildAt(i7);
        if ((((Toolbar.LayoutParams)localView.getLayoutParams()).b != 0) || (!shouldLayout(localView)))
          break label889;
        i5 += measureChildCollapseMargins(localView, paramInt1, i5, paramInt2, 0, arrayOfInt);
        i22 = Math.max(i8, localView.getMeasuredHeight() + getVerticalMargins(localView));
        i20 = ba.a(i9, bg.l(localView));
      }
      for (int i21 = i22; ; i21 = i8)
      {
        i7++;
        i9 = i20;
        i8 = i21;
        break label486;
        i = 1;
        j = 0;
        break;
        int i10 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i11 = this.mTitleMarginStart + this.mTitleMarginEnd;
        boolean bool2 = shouldLayout(this.mTitleTextView);
        int i12 = 0;
        int i13 = 0;
        if (bool2)
        {
          measureChildCollapseMargins(this.mTitleTextView, paramInt1, i5 + i11, paramInt2, i10, arrayOfInt);
          i13 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
          i12 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
          i9 = ba.a(i9, bg.l(this.mTitleTextView));
        }
        if (shouldLayout(this.mSubtitleTextView))
        {
          i13 = Math.max(i13, measureChildCollapseMargins(this.mSubtitleTextView, paramInt1, i5 + i11, paramInt2, i10 + i12, arrayOfInt));
          i12 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
          i9 = ba.a(i9, bg.l(this.mSubtitleTextView));
        }
        int i14 = i13 + i5;
        int i15 = Math.max(i8, i12);
        int i16 = i14 + (getPaddingLeft() + getPaddingRight());
        int i17 = i15 + (getPaddingTop() + getPaddingBottom());
        int i18 = bg.a(Math.max(i16, getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i9);
        int i19 = bg.a(Math.max(i17, getSuggestedMinimumHeight()), paramInt2, i9 << 16);
        if (shouldCollapse())
          i19 = 0;
        setMeasuredDimension(i18, i19);
        return;
        label889: i20 = i9;
      }
      label900: k = 0;
      m = 0;
    }
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    Toolbar.SavedState localSavedState = (Toolbar.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.mMenuView != null);
    for (i locali = this.mMenuView.c(); ; locali = null)
    {
      if ((localSavedState.a != 0) && (this.mExpandedMenuPresenter != null) && (locali != null))
      {
        MenuItem localMenuItem = locali.findItem(localSavedState.a);
        if (localMenuItem != null)
          af.b(localMenuItem);
      }
      if (localSavedState.b)
        postShowOverflowMenu();
      return;
    }
  }

  public void onRtlPropertiesChanged(int paramInt)
  {
    int i = 1;
    if (Build.VERSION.SDK_INT >= 17)
      super.onRtlPropertiesChanged(paramInt);
    DataType localDataType = this.mContentInsets$433fd199;
    if (paramInt == i);
    while (true)
    {
      localDataType.a(i);
      return;
      i = 0;
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    Toolbar.SavedState localSavedState = new Toolbar.SavedState(super.onSaveInstanceState());
    if ((this.mExpandedMenuPresenter != null) && (this.mExpandedMenuPresenter.a != null))
      localSavedState.a = this.mExpandedMenuPresenter.a.getItemId();
    localSavedState.b = isOverflowMenuShowing();
    return localSavedState;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = al.a(paramMotionEvent);
    if (i == 0)
      this.mEatingTouch = false;
    if (!this.mEatingTouch)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool))
        this.mEatingTouch = true;
    }
    if ((i == 1) || (i == 3))
      this.mEatingTouch = false;
    return true;
  }

  public void setCollapsible(boolean paramBoolean)
  {
    this.mCollapsible = paramBoolean;
    requestLayout();
  }

  public void setContentInsetsAbsolute(int paramInt1, int paramInt2)
  {
    this.mContentInsets$433fd199.b(paramInt1, paramInt2);
  }

  public void setContentInsetsRelative(int paramInt1, int paramInt2)
  {
    this.mContentInsets$433fd199.a(paramInt1, paramInt2);
  }

  public void setLogo(int paramInt)
  {
    setLogo(this.mTintManager.a(paramInt));
  }

  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      ensureLogoView();
      if (this.mLogoView.getParent() == null)
      {
        addSystemView(this.mLogoView);
        updateChildVisibilityForExpandedActionView(this.mLogoView);
      }
    }
    while (true)
    {
      if (this.mLogoView != null)
        this.mLogoView.setImageDrawable(paramDrawable);
      return;
      if ((this.mLogoView == null) || (this.mLogoView.getParent() == null))
        continue;
      removeView(this.mLogoView);
    }
  }

  public void setLogoDescription(int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }

  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
      ensureLogoView();
    if (this.mLogoView != null)
      this.mLogoView.setContentDescription(paramCharSequence);
  }

  public void setMenu(i parami, ActionMenuPresenter paramActionMenuPresenter)
  {
    if ((parami == null) && (this.mMenuView == null));
    i locali;
    do
    {
      return;
      ensureMenuView();
      locali = this.mMenuView.c();
    }
    while (locali == parami);
    if (locali != null)
    {
      locali.b(this.mOuterActionMenuPresenter);
      locali.b(this.mExpandedMenuPresenter);
    }
    if (this.mExpandedMenuPresenter == null)
      this.mExpandedMenuPresenter = new dp(this, 0);
    paramActionMenuPresenter.c(true);
    if (parami != null)
    {
      parami.a(paramActionMenuPresenter, this.mPopupContext);
      parami.a(this.mExpandedMenuPresenter, this.mPopupContext);
    }
    while (true)
    {
      this.mMenuView.setPopupTheme(this.mPopupTheme);
      this.mMenuView.setPresenter(paramActionMenuPresenter);
      this.mOuterActionMenuPresenter = paramActionMenuPresenter;
      return;
      paramActionMenuPresenter.a(this.mPopupContext, null);
      this.mExpandedMenuPresenter.a(this.mPopupContext, null);
      paramActionMenuPresenter.b(true);
      this.mExpandedMenuPresenter.b(true);
    }
  }

  public void setMenuCallbacks(y paramy, j paramj)
  {
    this.mActionMenuPresenterCallback = paramy;
    this.mMenuBuilderCallback = paramj;
  }

  public void setNavigationContentDescription(int paramInt)
  {
    if (paramInt != 0);
    for (CharSequence localCharSequence = getContext().getText(paramInt); ; localCharSequence = null)
    {
      setNavigationContentDescription(localCharSequence);
      return;
    }
  }

  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
      ensureNavButtonView();
    if (this.mNavButtonView != null)
      this.mNavButtonView.setContentDescription(paramCharSequence);
  }

  public void setNavigationIcon(int paramInt)
  {
    setNavigationIcon(this.mTintManager.a(paramInt));
  }

  public void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      ensureNavButtonView();
      if (this.mNavButtonView.getParent() == null)
      {
        addSystemView(this.mNavButtonView);
        updateChildVisibilityForExpandedActionView(this.mNavButtonView);
      }
    }
    while (true)
    {
      if (this.mNavButtonView != null)
        this.mNavButtonView.setImageDrawable(paramDrawable);
      return;
      if ((this.mNavButtonView == null) || (this.mNavButtonView.getParent() == null))
        continue;
      removeView(this.mNavButtonView);
    }
  }

  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    ensureNavButtonView();
    this.mNavButtonView.setOnClickListener(paramOnClickListener);
  }

  public void setOnMenuItemClickListener$486aeec7(l paraml)
  {
    this.mOnMenuItemClickListener$76933922 = paraml;
  }

  public void setPopupTheme(int paramInt)
  {
    if (this.mPopupTheme != paramInt)
    {
      this.mPopupTheme = paramInt;
      if (paramInt == 0)
        this.mPopupContext = getContext();
    }
    else
    {
      return;
    }
    this.mPopupContext = new ContextThemeWrapper(getContext(), paramInt);
  }

  public void setSubtitle(int paramInt)
  {
    setSubtitle(getContext().getText(paramInt));
  }

  public void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.mSubtitleTextView == null)
      {
        Context localContext = getContext();
        this.mSubtitleTextView = new TextView(localContext);
        this.mSubtitleTextView.setSingleLine();
        this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (this.mSubtitleTextAppearance != 0)
          this.mSubtitleTextView.setTextAppearance(localContext, this.mSubtitleTextAppearance);
        if (this.mSubtitleTextColor != 0)
          this.mSubtitleTextView.setTextColor(this.mSubtitleTextColor);
      }
      if (this.mSubtitleTextView.getParent() == null)
      {
        addSystemView(this.mSubtitleTextView);
        updateChildVisibilityForExpandedActionView(this.mSubtitleTextView);
      }
    }
    while (true)
    {
      if (this.mSubtitleTextView != null)
        this.mSubtitleTextView.setText(paramCharSequence);
      this.mSubtitleText = paramCharSequence;
      return;
      if ((this.mSubtitleTextView == null) || (this.mSubtitleTextView.getParent() == null))
        continue;
      removeView(this.mSubtitleTextView);
    }
  }

  public void setSubtitleTextAppearance(Context paramContext, int paramInt)
  {
    this.mSubtitleTextAppearance = paramInt;
    if (this.mSubtitleTextView != null)
      this.mSubtitleTextView.setTextAppearance(paramContext, paramInt);
  }

  public void setSubtitleTextColor(int paramInt)
  {
    this.mSubtitleTextColor = paramInt;
    if (this.mSubtitleTextView != null)
      this.mSubtitleTextView.setTextColor(paramInt);
  }

  public void setTitle(int paramInt)
  {
    setTitle(getContext().getText(paramInt));
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.mTitleTextView == null)
      {
        Context localContext = getContext();
        this.mTitleTextView = new TextView(localContext);
        this.mTitleTextView.setSingleLine();
        this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (this.mTitleTextAppearance != 0)
          this.mTitleTextView.setTextAppearance(localContext, this.mTitleTextAppearance);
        if (this.mTitleTextColor != 0)
          this.mTitleTextView.setTextColor(this.mTitleTextColor);
      }
      if (this.mTitleTextView.getParent() == null)
      {
        addSystemView(this.mTitleTextView);
        updateChildVisibilityForExpandedActionView(this.mTitleTextView);
      }
    }
    while (true)
    {
      if (this.mTitleTextView != null)
        this.mTitleTextView.setText(paramCharSequence);
      this.mTitleText = paramCharSequence;
      return;
      if ((this.mTitleTextView == null) || (this.mTitleTextView.getParent() == null))
        continue;
      removeView(this.mTitleTextView);
    }
  }

  public void setTitleTextAppearance(Context paramContext, int paramInt)
  {
    this.mTitleTextAppearance = paramInt;
    if (this.mTitleTextView != null)
      this.mTitleTextView.setTextAppearance(paramContext, paramInt);
  }

  public void setTitleTextColor(int paramInt)
  {
    this.mTitleTextColor = paramInt;
    if (this.mTitleTextView != null)
      this.mTitleTextView.setTextColor(paramInt);
  }

  public boolean showOverflowMenu()
  {
    return (this.mMenuView != null) && (this.mMenuView.d());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.Toolbar
 * JD-Core Version:    0.6.0
 */