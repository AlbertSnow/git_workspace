package com.wandoujia.jupiter.library.view;

import com.nineoldandroids.animation.ArgbEvaluator;

public abstract interface TransitionTab
{
  public static final ArgbEvaluator a = new ArgbEvaluator();

  public abstract void a(TransitionTab.State paramState);

  public abstract void a(TransitionTab.State paramState, float paramFloat);

  public abstract void b(TransitionTab.State paramState);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.view.TransitionTab
 * JD-Core Version:    0.6.0
 */