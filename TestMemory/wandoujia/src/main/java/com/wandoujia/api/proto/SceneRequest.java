package com.wandoujia.api.proto;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import com.squareup.wire.Message.Label;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class SceneRequest extends Message
{
  public static final Integer DEFAULT_PB_VERSION = Integer.valueOf(0);
  public static final List<Long> DEFAULT_SCENE_ID = Collections.emptyList();

  @ProtoField(tag=2)
  public final UserContext context;

  @ProtoField(label=Message.Label.REQUIRED, tag=1, type=Message.Datatype.INT32)
  public final Integer pb_version;

  @ProtoField(label=Message.Label.REPEATED, tag=3, type=Message.Datatype.INT64)
  public final List<Long> scene_id;

  private SceneRequest(SceneRequest.Builder paramBuilder)
  {
    super(paramBuilder);
    this.pb_version = paramBuilder.pb_version;
    this.context = paramBuilder.context;
    this.scene_id = immutableCopyOf(paramBuilder.scene_id);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    SceneRequest localSceneRequest;
    do
    {
      return true;
      if (!(paramObject instanceof SceneRequest))
        return false;
      localSceneRequest = (SceneRequest)paramObject;
    }
    while ((equals(this.pb_version, localSceneRequest.pb_version)) && (equals(this.context, localSceneRequest.context)) && (equals(this.scene_id, localSceneRequest.scene_id)));
    return false;
  }

  public final int hashCode()
  {
    int i = this.hashCode;
    int j;
    int n;
    if (i == 0)
    {
      if (this.pb_version == null)
        break label92;
      j = this.pb_version.hashCode();
      int k = j * 37;
      UserContext localUserContext = this.context;
      int m = 0;
      if (localUserContext != null)
        m = this.context.hashCode();
      n = 37 * (k + m);
      if (this.scene_id == null)
        break label97;
    }
    label92: label97: for (int i1 = this.scene_id.hashCode(); ; i1 = 1)
    {
      i = i1 + n;
      this.hashCode = i;
      return i;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.api.proto.SceneRequest
 * JD-Core Version:    0.6.0
 */