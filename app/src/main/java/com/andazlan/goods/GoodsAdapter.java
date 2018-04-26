package com.andazlan.goods;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.andazlan.goods.R;
import com.andazlan.goods.model.Good;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GoodsAdapter extends ArrayAdapter<Good> {
    private ListGoodsListener mListener;
    private int mOutOfStockPosition = -1;

    public GoodsAdapter(Context context) {
        super(context, 0, new ArrayList<Good>());
        //
        //
        // this.mListener = (ListGoodsListener) context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder = null;
        if (view == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.segment_good_item, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        final Good orderDetail = this.getItem(position);
        holder.name.setText(orderDetail.getName());
        holder.category.setText(orderDetail.getCategory());
        holder.stock.setText(String.valueOf(orderDetail.getStock()));
        return view;
    }

    static class ViewHolder {
        TextView name, category, stock;
        public ViewHolder(View itemView){
            name = itemView.findViewById(R.id.txt_name);
            category = itemView.findViewById(R.id.txt_category);
            stock = itemView.findViewById(R.id.txt_stock);
        }
    }

    public interface ListGoodsListener{

    }
}