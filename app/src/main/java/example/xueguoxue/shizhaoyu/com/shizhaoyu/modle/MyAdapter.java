package example.xueguoxue.shizhaoyu.com.shizhaoyu.modle;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import example.xueguoxue.shizhaoyu.R;

/**
 * Created by xueguoxue on 2018/3/6.
 */

public class MyAdapter extends BaseAdapter{

    private ArrayList<Card.ResultBean.CouponsBean> list;
    private Context context;

    public MyAdapter(ArrayList<Card.ResultBean.CouponsBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return list.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item, null);
            holder = new ViewHolder();
            holder.answercircle = convertView.findViewById(R.id.item_text);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.answercircle.setText((position+1)+"");
        return convertView;
    }
    public static class ViewHolder {
        public TextView answercircle;

    }
}
