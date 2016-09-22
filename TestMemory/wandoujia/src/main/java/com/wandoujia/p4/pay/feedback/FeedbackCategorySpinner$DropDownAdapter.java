package com.wandoujia.p4.pay.feedback;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.ExpandableListView;
import android.widget.TextView;
import java.util.List;

class FeedbackCategorySpinner$DropDownAdapter extends BaseExpandableListAdapter
{
  private List<List<String>> generals;
  private List<String> generalsTypes;
  private String groupName;
  private ExpandableListView listView;

  public FeedbackCategorySpinner$DropDownAdapter(List<String> paramList, List<List<String>> paramList1, ExpandableListView paramExpandableListView, String paramString)
  {
    this.generalsTypes = paramList1;
    this.generals = paramExpandableListView;
    this.listView = paramString;
    Object localObject;
    this.groupName = localObject;
  }

  public Object getChild(int paramInt1, int paramInt2)
  {
    if (this.generalsTypes != null)
      return ((List)this.generals.get(paramInt1)).get(paramInt2);
    return null;
  }

  public long getChildId(int paramInt1, int paramInt2)
  {
    return paramInt2;
  }

  public View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    CheckedTextView localCheckedTextView = (CheckedTextView)LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903103, null);
    TextView localTextView = (TextView)localCheckedTextView.findViewById(2131493273);
    String str = getChild(paramInt1, paramInt2).toString();
    localTextView.setText(str);
    if ((this.this$0.getText() != null) && (this.this$0.getText().toString().endsWith(str)))
      localCheckedTextView.setChecked(true);
    return localCheckedTextView;
  }

  public int getChildrenCount(int paramInt)
  {
    if (this.generalsTypes != null)
      return ((List)this.generals.get(paramInt)).size();
    return 0;
  }

  public Object getGroup(int paramInt)
  {
    if (this.generalsTypes != null)
      return this.generalsTypes.get(paramInt);
    return null;
  }

  public int getGroupCount()
  {
    if (this.generalsTypes != null)
      return this.generalsTypes.size();
    return 0;
  }

  public long getGroupId(int paramInt)
  {
    return paramInt;
  }

  public View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null);
    for (View localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130903104, null); ; localView = paramView)
    {
      ((TextView)localView).setText(getGroup(paramInt).toString());
      if ((!TextUtils.isEmpty(this.groupName)) && (this.groupName.equals(getGroup(paramInt).toString())))
      {
        this.listView.expandGroup(paramInt);
        this.groupName = null;
      }
      return localView;
    }
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    return true;
  }

  public void onGroupExpanded(int paramInt)
  {
    for (int i = 0; i < getGroupCount(); i++)
    {
      if (i == paramInt)
        continue;
      this.listView.collapseGroup(i);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.feedback.FeedbackCategorySpinner.DropDownAdapter
 * JD-Core Version:    0.6.0
 */