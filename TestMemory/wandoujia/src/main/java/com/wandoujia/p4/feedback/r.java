package com.wandoujia.p4.feedback;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;
import java.util.List;

final class r extends BaseExpandableListAdapter
{
  private List<String> a;
  private List<List<String>> b;
  private ExpandableListView c;
  private String d;

  public r(List<String> paramList, List<List<String>> paramList1, ExpandableListView paramExpandableListView, String paramString)
  {
    this.a = paramList1;
    this.b = paramExpandableListView;
    this.c = paramString;
    Object localObject;
    this.d = localObject;
  }

  public final Object getChild(int paramInt1, int paramInt2)
  {
    if (this.a != null)
      return ((List)this.b.get(paramInt1)).get(paramInt2);
    return null;
  }

  public final long getChildId(int paramInt1, int paramInt2)
  {
    return paramInt2;
  }

  public final View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    CheckedTextView localCheckedTextView = (CheckedTextView)c.a(paramViewGroup.getContext(), 2130903103);
    TextView localTextView = (TextView)localCheckedTextView.findViewById(2131493273);
    String str = getChild(paramInt1, paramInt2).toString();
    localTextView.setText(str);
    if ((this.e.getText() != null) && (this.e.getText().toString().endsWith(str)))
      localCheckedTextView.setChecked(true);
    return localCheckedTextView;
  }

  public final int getChildrenCount(int paramInt)
  {
    if (this.a != null)
      return ((List)this.b.get(paramInt)).size();
    return 0;
  }

  public final Object getGroup(int paramInt)
  {
    if (this.a != null)
      return this.a.get(paramInt);
    return null;
  }

  public final int getGroupCount()
  {
    if (this.a != null)
      return this.a.size();
    return 0;
  }

  public final long getGroupId(int paramInt)
  {
    return paramInt;
  }

  public final View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = c.a(paramViewGroup.getContext(), 2130903104); ; localView = paramView)
    {
      ((TextView)localView).setText(getGroup(paramInt).toString());
      if ((!TextUtils.isEmpty(this.d)) && (this.d.equals(getGroup(paramInt).toString())))
      {
        this.c.performItemClick(localView, paramInt, this.c.getItemIdAtPosition(paramInt));
        this.d = null;
      }
      return localView;
    }
  }

  public final boolean hasStableIds()
  {
    return true;
  }

  public final boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    return true;
  }

  public final void onGroupExpanded(int paramInt)
  {
    for (int i = 0; i < getGroupCount(); i++)
    {
      if (i == paramInt)
        continue;
      this.c.collapseGroup(i);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.r
 * JD-Core Version:    0.6.0
 */