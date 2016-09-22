package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;

public final class SceneDetail$Builder extends Message.Builder<SceneDetail>
{
  public String entry_icon;
  public String entry_icon_pressed;
  public String group_name;
  public String name;
  public Long next_update;
  public CountDownText plot_description;
  public Boolean valid;
  public Double weight;

  public SceneDetail$Builder()
  {
  }

  public SceneDetail$Builder(SceneDetail paramSceneDetail)
  {
    super(paramSceneDetail);
    if (paramSceneDetail == null)
      return;
    this.name = paramSceneDetail.name;
    this.valid = paramSceneDetail.valid;
    this.next_update = paramSceneDetail.next_update;
    this.weight = paramSceneDetail.weight;
    this.plot_description = paramSceneDetail.plot_description;
    this.entry_icon = paramSceneDetail.entry_icon;
    this.entry_icon_pressed = paramSceneDetail.entry_icon_pressed;
    this.group_name = paramSceneDetail.group_name;
  }

  public final SceneDetail build()
  {
    checkRequiredFields();
    return new SceneDetail(this, null);
  }

  public final Builder entry_icon(String paramString)
  {
    this.entry_icon = paramString;
    return this;
  }

  public final Builder entry_icon_pressed(String paramString)
  {
    this.entry_icon_pressed = paramString;
    return this;
  }

  public final Builder group_name(String paramString)
  {
    this.group_name = paramString;
    return this;
  }

  public final Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }

  public final Builder next_update(Long paramLong)
  {
    this.next_update = paramLong;
    return this;
  }

  public final Builder plot_description(CountDownText paramCountDownText)
  {
    this.plot_description = paramCountDownText;
    return this;
  }

  public final Builder valid(Boolean paramBoolean)
  {
    this.valid = paramBoolean;
    return this;
  }

  public final Builder weight(Double paramDouble)
  {
    this.weight = paramDouble;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.SceneDetail.Builder
 * JD-Core Version:    0.6.0
 */