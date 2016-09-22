package com.wandoujia.jupiter.presenter;

import android.text.TextPaint;
import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.ParagraphContent;
import com.wandoujia.api.proto.ReviewBean;
import com.wandoujia.api.proto.StoryParagraph;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.entities.game.ParagraphContent.TextStyle;
import com.wandoujia.ripple_framework.TypefaceManager.FONT;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.CustomFontTextView;
import java.util.List;

public final class aj extends c
{
  protected final void a(Model paramModel)
  {
    CustomFontTextView localCustomFontTextView = (CustomFontTextView)e();
    if ((paramModel.f() == ContentTypeEnum.ContentType.APP) && (paramModel.F().review != null) && (!CollectionUtils.isEmpty(paramModel.F().review.story)) && (((StoryParagraph)paramModel.F().review.story.get(0)).item != null))
    {
      ParagraphContent localParagraphContent = ((StoryParagraph)paramModel.F().review.story.get(0)).item;
      localCustomFontTextView.setText(localParagraphContent.text);
      String str = localParagraphContent.text_style;
      ParagraphContent.TextStyle[] arrayOfTextStyle = ParagraphContent.TextStyle.values();
      int i = arrayOfTextStyle.length;
      int j = 0;
      ParagraphContent.TextStyle localTextStyle;
      label146: TextPaint localTextPaint;
      if (j < i)
      {
        localTextStyle = arrayOfTextStyle[j];
        if (localTextStyle.name().equalsIgnoreCase(str))
        {
          localTextPaint = localCustomFontTextView.getPaint();
          if (localTextStyle != ParagraphContent.TextStyle.SUBTITLE)
            break label229;
        }
      }
      label229: for (boolean bool = true; ; bool = false)
      {
        localTextPaint.setFakeBoldText(bool);
        localCustomFontTextView.setTextSize(0, localTextStyle.size);
        localCustomFontTextView.setTextColor(localTextStyle.color);
        localCustomFontTextView.setGravity(localTextStyle.gravity);
        if (localTextStyle != ParagraphContent.TextStyle.TITLE)
          break label235;
        localCustomFontTextView.setFont(TypefaceManager.FONT.BOLD);
        return;
        j++;
        break;
        localTextStyle = ParagraphContent.TextStyle.NORMAL;
        break label146;
      }
      label235: localCustomFontTextView.setFont(TypefaceManager.FONT.NORMAL);
      return;
    }
    ((TextView)e()).setText(null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.aj
 * JD-Core Version:    0.6.0
 */