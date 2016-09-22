package com.wandoujia.api.proto;

import com.squareup.wire.Message.Builder;
import java.util.List;

public final class SceneRequest$Builder extends Message.Builder<SceneRequest>
{
  public UserContext context;
  public Integer pb_version;
  public List<Long> scene_id;

  public SceneRequest$Builder()
  {
  }

  public SceneRequest$Builder(SceneRequest paramSceneRequest)
  {
    super(paramSceneRequest);
    if (paramSceneRequest == null)
      return;
    this.pb_version = paramSceneRequest.pb_version;
    this.context = paramSceneRequest.context;
    this.scene_id = SceneRequest.access$000(paramSceneRequest.scene_id);
  }

  public final SceneRequest build()
  {
    checkRequiredFields();
    return new SceneRequest(this, null);
  }

  public final Builder context(UserContext paramUserContext)
  {
    this.context = paramUserContext;
    return this;
  }

  public final Builder pb_version(Integer paramInteger)
  {
    this.pb_version = paramInteger;
    return this;
  }

  public final Builder scene_id(List<Long> paramList)
  {
    this.scene_id = checkForNulls(paramList);
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.SceneRequest.Builder
 * JD-Core Version:    0.6.0
 */