package com.vipul.bit_hotels.model;

import android.support.annotation.StringRes;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.vipul.bit_hotels.R;
import com.vipul.bit_hotels.adapter.BaseEpoxyHolder;

import butterknife.BindView;

/** This model class gives an example of how to use a view holder pattern with your models. */
@EpoxyModelClass(layout = R.layout.item_blog_layout_1)
public abstract class BlogPostLayout1 extends EpoxyModelWithHolder<BlogPostLayout1.BlogPost1Holder> {
  @EpoxyAttribute @StringRes int text;
  @EpoxyAttribute(hash = false) OnClickListener clickListener;

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }

  @Override
  public void bind(BlogPost1Holder holder) {
    holder.button.setText(text);
    holder.button.setOnClickListener(clickListener);
  }

  static class BlogPost1Holder extends BaseEpoxyHolder {
    @BindView(R.id.tv_location) Button button;
  }

}