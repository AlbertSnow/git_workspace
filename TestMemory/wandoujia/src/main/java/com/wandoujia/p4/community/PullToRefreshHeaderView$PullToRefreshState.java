package com.wandoujia.p4.community;

public enum PullToRefreshHeaderView$PullToRefreshState
{
  static
  {
    LOADING = new PullToRefreshState("LOADING", 2);
    PullToRefreshState[] arrayOfPullToRefreshState = new PullToRefreshState[3];
    arrayOfPullToRefreshState[0] = PULLING;
    arrayOfPullToRefreshState[1] = RELEASE;
    arrayOfPullToRefreshState[2] = LOADING;
    $VALUES = arrayOfPullToRefreshState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.PullToRefreshHeaderView.PullToRefreshState
 * JD-Core Version:    0.6.0
 */