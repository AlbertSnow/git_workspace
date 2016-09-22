package com.wandoujia.p4.community.fragmant;

import android.os.Bundle;
import android.view.View;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.fragment.TabHostFragment;
import com.wandoujia.p4.fragment.k;
import java.util.ArrayList;
import java.util.List;

public class CommunityMembersTabFragment extends TabHostFragment
{
  private CommunityGroupModel a;

  public final String b()
  {
    return "weekly";
  }

  public final List<k> c()
  {
    ArrayList localArrayList = new ArrayList();
    for (CommunityMembersTabFragment.MemberTab localMemberTab : CommunityMembersTabFragment.MemberTab.values())
    {
      k localk = CommunityMembersTabFragment.MemberTab.access$000(localMemberTab);
      Bundle localBundle = new Bundle();
      if (this.a != null)
      {
        localBundle.putSerializable("group_model", this.a);
        localBundle.putSerializable("group_id", this.a.getId());
      }
      localBundle.putString("scope", CommunityMembersTabFragment.MemberTab.access$100(localMemberTab));
      localk.a(localBundle);
      localArrayList.add(localk);
    }
    return localArrayList;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    if (localBundle != null)
      this.a = ((CommunityGroupModel)localBundle.getSerializable("group_model"));
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    if (this.a != null);
    for (int i = this.a.getMembersCount(); ; i = 0)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      setTitle(getString(2131624478, arrayOfObject));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityMembersTabFragment
 * JD-Core Version:    0.6.0
 */