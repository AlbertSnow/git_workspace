package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.content.a;
import android.support.v4.widget.an;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.id;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

final class dj extends an
  implements View.OnClickListener
{
  private final SearchView d;
  private final SearchableInfo e;
  private final Context f;
  private final WeakHashMap<String, Drawable.ConstantState> g;
  private final int h;
  private int i = 1;
  private ColorStateList j;
  private int k = -1;
  private int l = -1;
  private int m = -1;
  private int n = -1;
  private int o = -1;
  private int p = -1;

  public dj(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap<String, Drawable.ConstantState> paramWeakHashMap)
  {
    super(paramContext, paramSearchView.getSuggestionRowLayout());
    this.c.getSystemService("search");
    this.d = paramSearchView;
    this.e = paramSearchableInfo;
    this.h = paramSearchView.getSuggestionCommitIconResId();
    this.f = paramContext;
    this.g = paramWeakHashMap;
  }

  private Drawable a(ComponentName paramComponentName)
  {
    PackageManager localPackageManager = this.c.getPackageManager();
    ActivityInfo localActivityInfo;
    int i1;
    try
    {
      localActivityInfo = localPackageManager.getActivityInfo(paramComponentName, 128);
      i1 = localActivityInfo.getIconResource();
      if (i1 == 0)
        return null;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localNameNotFoundException.toString();
      return null;
    }
    Drawable localDrawable = localPackageManager.getDrawable(paramComponentName.getPackageName(), i1, localActivityInfo.applicationInfo);
    if (localDrawable == null)
    {
      new StringBuilder("Invalid icon resource ").append(i1).append(" for ").append(paramComponentName.flattenToShortString());
      return null;
    }
    return localDrawable;
  }

  private Drawable a(Uri paramUri)
  {
    try
    {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      if (bool)
        try
        {
          Drawable localDrawable2 = b(paramUri);
          return localDrawable2;
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          throw new FileNotFoundException("Resource does not exist: " + paramUri);
        }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      new StringBuilder("Icon not found: ").append(paramUri).append(", ").append(localFileNotFoundException.getMessage());
      return null;
    }
    InputStream localInputStream = this.f.getContentResolver().openInputStream(paramUri);
    if (localInputStream == null)
      throw new FileNotFoundException("Failed to open " + paramUri);
    try
    {
      Drawable localDrawable1 = Drawable.createFromStream(localInputStream, null);
      try
      {
        localInputStream.close();
        return localDrawable1;
      }
      catch (IOException localIOException2)
      {
        new StringBuilder("Error closing icon stream for ").append(paramUri);
        return localDrawable1;
      }
    }
    finally
    {
    }
    try
    {
      localInputStream.close();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      while (true)
        new StringBuilder("Error closing icon stream for ").append(paramUri);
    }
  }

  private Drawable a(String paramString)
  {
    Drawable localDrawable1;
    if ((paramString == null) || (paramString.length() == 0) || ("0".equals(paramString)))
      localDrawable1 = null;
    while (true)
    {
      return localDrawable1;
      try
      {
        int i1 = Integer.parseInt(paramString);
        String str = "android.resource://" + this.f.getPackageName() + "/" + i1;
        localDrawable1 = b(str);
        if (localDrawable1 != null)
          continue;
        Drawable localDrawable3 = a.a(this.f, i1);
        a(str, localDrawable3);
        return localDrawable3;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localDrawable1 = b(paramString);
        if (localDrawable1 != null)
          continue;
        Drawable localDrawable2 = a(Uri.parse(paramString));
        a(paramString, localDrawable2);
        return localDrawable2;
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
      }
    }
    return null;
  }

  private static String a(Cursor paramCursor, int paramInt)
  {
    if (paramInt == -1)
      return null;
    try
    {
      String str = paramCursor.getString(paramInt);
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String a(Cursor paramCursor, String paramString)
  {
    return a(paramCursor, paramCursor.getColumnIndex(paramString));
  }

  private static void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null)
    {
      paramImageView.setVisibility(paramInt);
      return;
    }
    paramImageView.setVisibility(0);
    paramDrawable.setVisible(false, false);
    paramDrawable.setVisible(true, false);
  }

  private static void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence))
    {
      paramTextView.setVisibility(8);
      return;
    }
    paramTextView.setVisibility(0);
  }

  private void a(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null)
      this.g.put(paramString, paramDrawable.getConstantState());
  }

  private Drawable b(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (TextUtils.isEmpty(str))
      throw new FileNotFoundException("No authority: " + paramUri);
    Resources localResources;
    List localList;
    try
    {
      localResources = this.c.getPackageManager().getResourcesForApplication(str);
      localList = paramUri.getPathSegments();
      if (localList == null)
        throw new FileNotFoundException("No path: " + paramUri);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new FileNotFoundException("No package found for authority: " + paramUri);
    }
    int i1 = localList.size();
    if (i1 == 1);
    int i2;
    while (true)
    {
      try
      {
        int i3 = Integer.parseInt((String)localList.get(0));
        i2 = i3;
        if (i2 != 0)
          break;
        throw new FileNotFoundException("No resource found for: " + paramUri);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new FileNotFoundException("Single path segment is not a resource ID: " + paramUri);
      }
      if (i1 == 2)
      {
        i2 = localResources.getIdentifier((String)localList.get(1), (String)localList.get(0), str);
        continue;
      }
      throw new FileNotFoundException("More than two path segments: " + paramUri);
    }
    return localResources.getDrawable(i2);
  }

  private Drawable b(String paramString)
  {
    Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.g.get(paramString);
    if (localConstantState == null)
      return null;
    return localConstantState.newDrawable();
  }

  private static void c(Cursor paramCursor)
  {
    if (paramCursor != null);
    for (Bundle localBundle = paramCursor.getExtras(); ; localBundle = null)
    {
      if ((localBundle != null) && (localBundle.getBoolean("in_progress")));
      return;
    }
  }

  public final Cursor a(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    for (String str1 = ""; (this.d.getVisibility() != 0) || (this.d.getWindowVisibility() != 0); str1 = paramCharSequence.toString())
      return null;
    try
    {
      SearchableInfo localSearchableInfo = this.e;
      Cursor localCursor;
      if (localSearchableInfo == null)
        localCursor = null;
      while (localCursor != null)
      {
        localCursor.getCount();
        return localCursor;
        String str2 = localSearchableInfo.getSuggestAuthority();
        if (str2 == null)
        {
          localCursor = null;
          continue;
        }
        Uri.Builder localBuilder = new Uri.Builder().scheme("content").authority(str2).query("").fragment("");
        String str3 = localSearchableInfo.getSuggestPath();
        if (str3 != null)
          localBuilder.appendEncodedPath(str3);
        localBuilder.appendPath("search_suggest_query");
        String str4 = localSearchableInfo.getSuggestSelection();
        if (str4 != null);
        for (String[] arrayOfString = { str1 }; ; arrayOfString = null)
        {
          localBuilder.appendQueryParameter("limit", "50");
          Uri localUri = localBuilder.build();
          localCursor = this.c.getContentResolver().query(localUri, null, str4, arrayOfString, null);
          break;
          localBuilder.appendPath(str1);
        }
      }
    }
    catch (RuntimeException localRuntimeException)
    {
    }
    return null;
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = super.a(paramContext, paramCursor, paramViewGroup);
    localView.setTag(new dk(localView));
    ((ImageView)localView.findViewById(R.id.edit_query)).setImageResource(this.h);
    return localView;
  }

  public final void a(int paramInt)
  {
    this.i = paramInt;
  }

  public final void a(Cursor paramCursor)
  {
    try
    {
      super.a(paramCursor);
      if (paramCursor != null)
      {
        this.k = paramCursor.getColumnIndex("suggest_text_1");
        this.l = paramCursor.getColumnIndex("suggest_text_2");
        this.m = paramCursor.getColumnIndex("suggest_text_2_url");
        this.n = paramCursor.getColumnIndex("suggest_icon_1");
        this.o = paramCursor.getColumnIndex("suggest_icon_2");
        this.p = paramCursor.getColumnIndex("suggest_flags");
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(View paramView, Cursor paramCursor)
  {
    dk localdk = (dk)paramView.getTag();
    if (this.p != -1);
    for (int i1 = paramCursor.getInt(this.p); ; i1 = 0)
    {
      if (localdk.a != null)
      {
        String str3 = a(paramCursor, this.k);
        a(localdk.a, str3);
      }
      Object localObject3;
      label204: Object localObject1;
      label237: ImageView localImageView1;
      Drawable localDrawable1;
      if (localdk.b != null)
      {
        String str2 = a(paramCursor, this.m);
        if (str2 != null)
        {
          if (this.j == null)
          {
            TypedValue localTypedValue = new TypedValue();
            this.c.getTheme().resolveAttribute(R.attr.textColorSearchUrl, localTypedValue, true);
            this.j = this.c.getResources().getColorStateList(localTypedValue.resourceId);
          }
          SpannableString localSpannableString = new SpannableString(str2);
          localSpannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.j, null), 0, str2.length(), 33);
          localObject3 = localSpannableString;
          if (!TextUtils.isEmpty((CharSequence)localObject3))
            break label349;
          if (localdk.a != null)
          {
            localdk.a.setSingleLine(false);
            localdk.a.setMaxLines(2);
          }
          a(localdk.b, (CharSequence)localObject3);
        }
      }
      else
      {
        if (localdk.c != null)
        {
          ImageView localImageView2 = localdk.c;
          if (this.n != -1)
            break label375;
          localObject1 = null;
          a(localImageView2, (Drawable)localObject1, 4);
        }
        if (localdk.d != null)
        {
          localImageView1 = localdk.d;
          int i2 = this.o;
          localDrawable1 = null;
          if (i2 != -1)
            break label528;
        }
      }
      while (true)
      {
        a(localImageView1, localDrawable1, 8);
        if ((this.i != 2) && ((this.i != 1) || ((i1 & 0x1) == 0)))
          break label547;
        localdk.e.setVisibility(0);
        localdk.e.setTag(localdk.a.getText());
        localdk.e.setOnClickListener(this);
        return;
        localObject3 = a(paramCursor, this.l);
        break;
        label349: if (localdk.a == null)
          break label204;
        localdk.a.setSingleLine(true);
        localdk.a.setMaxLines(1);
        break label204;
        label375: localObject1 = a(paramCursor.getString(this.n));
        if (localObject1 != null)
          break label237;
        ComponentName localComponentName = this.e.getSearchActivity();
        String str1 = localComponentName.flattenToShortString();
        if (this.g.containsKey(str1))
        {
          Drawable.ConstantState localConstantState = (Drawable.ConstantState)this.g.get(str1);
          if (localConstantState == null);
          for (localObject1 = null; ; localObject1 = localConstantState.newDrawable(this.f.getResources()))
          {
            label446: if (localObject1 != null)
              break label516;
            localObject1 = this.c.getPackageManager().getDefaultActivityIcon();
            break;
          }
        }
        Drawable localDrawable2 = a(localComponentName);
        if (localDrawable2 == null);
        for (Object localObject2 = null; ; localObject2 = localDrawable2.getConstantState())
        {
          this.g.put(str1, localObject2);
          localObject1 = localDrawable2;
          break label446;
          label516: break;
        }
        label528: localDrawable1 = a(paramCursor.getString(this.o));
      }
      label547: localdk.e.setVisibility(8);
      return;
    }
  }

  public final CharSequence b(Cursor paramCursor)
  {
    if (paramCursor == null);
    String str2;
    do
    {
      do
      {
        return null;
        String str1 = a(paramCursor, "suggest_intent_query");
        if (str1 != null)
          return str1;
        if (!this.e.shouldRewriteQueryFromData())
          continue;
        String str3 = a(paramCursor, "suggest_intent_data");
        if (str3 != null)
          return str3;
      }
      while (!this.e.shouldRewriteQueryFromText());
      str2 = a(paramCursor, "suggest_text_1");
    }
    while (str2 == null);
    return str2;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView1;
    try
    {
      View localView2 = super.getView(paramInt, paramView, paramViewGroup);
      return localView2;
    }
    catch (RuntimeException localRuntimeException)
    {
      localView1 = a(this.c, this.b, paramViewGroup);
      if (localView1 != null)
        ((dk)localView1.getTag()).a.setText(localRuntimeException.toString());
    }
    return localView1;
  }

  public final boolean hasStableIds()
  {
    return false;
  }

  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    c(a());
  }

  public final void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    c(a());
  }

  public final void onClick(View paramView)
  {
    Object localObject = paramView.getTag();
    if ((localObject instanceof CharSequence))
      this.d.a((CharSequence)localObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.widget.dj
 * JD-Core Version:    0.6.0
 */