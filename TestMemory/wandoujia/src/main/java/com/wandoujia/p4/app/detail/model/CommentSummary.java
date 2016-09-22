package com.wandoujia.p4.app.detail.model;

import com.wandoujia.base.utils.JsonSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CommentSummary
  implements Serializable
{
  private static final long serialVersionUID = -183077569730736596L;
  private List<CommentJson> comments = new ArrayList();
  private int count;
  private EnjoySummary enjoySummary = new EnjoySummary();
  private CommentJson savedComment = new CommentJson();
  private String target;
  private UserCenterInfo user = new UserCenterInfo();

  public CommentSummary()
  {
  }

  public CommentSummary(int paramInt, String paramString, CommentJson paramCommentJson, UserCenterInfo paramUserCenterInfo, List<CommentJson> paramList, EnjoySummary paramEnjoySummary)
  {
    this.count = paramInt;
    this.target = paramString;
    this.savedComment = paramCommentJson;
    this.user = paramUserCenterInfo;
    this.comments = paramList;
    this.enjoySummary = paramEnjoySummary;
  }

  public static CommentSummary parseFromJson(String paramString)
  {
    new CommentSummary();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      CommentSummary localCommentSummary = parseFromJsonObject(localJSONObject);
      if ((localJSONObject.has("comments")) && (!localJSONObject.isNull("comments")))
      {
        JSONArray localJSONArray = new JSONArray(localJSONObject.getString("comments"));
        ArrayList localArrayList = new ArrayList();
        for (int i = 0; i < localJSONArray.length(); i++)
          localArrayList.add((CommentJson)JsonSerializer.fromJsonObject(localJSONArray.getJSONObject(i), CommentJson.class));
        localCommentSummary.comments = localArrayList;
        return localCommentSummary;
      }
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public static CommentSummary parseFromJsonObject(JSONObject paramJSONObject)
  {
    return (CommentSummary)JsonSerializer.fromJsonObject(paramJSONObject, CommentSummary.class);
  }

  public List<CommentJson> getComments()
  {
    return this.comments;
  }

  public int getCount()
  {
    return this.count;
  }

  public EnjoySummary getEnjoySummary()
  {
    return this.enjoySummary;
  }

  public CommentJson getSavedComment()
  {
    return this.savedComment;
  }

  public String getTarget()
  {
    return this.target;
  }

  public UserCenterInfo getUser()
  {
    return this.user;
  }

  public void setSavedComment(CommentJson paramCommentJson)
  {
    this.savedComment = paramCommentJson;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.model.CommentSummary
 * JD-Core Version:    0.6.0
 */