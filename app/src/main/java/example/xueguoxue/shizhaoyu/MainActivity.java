package example.xueguoxue.shizhaoyu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;


import java.util.ArrayList;
import java.util.List;

import example.xueguoxue.shizhaoyu.com.shizhaoyu.modle.Card;
import example.xueguoxue.shizhaoyu.com.shizhaoyu.modle.MyAdapter;
import example.xueguoxue.shizhaoyu.com.shizhaoyu.modle.OKhttpManager;

public class MainActivity extends AppCompatActivity {
    private TextView can_use;
    private TextView can_used;
    private TextView out_date;
    private ListView  re_can_use;
    private ListView re_can_used;
    private ListView re_out_date;

    private ArrayList<Card.ResultBean.CouponsBean> list=new ArrayList<>();
    private ArrayList<Card.ResultBean.CouponsBean> use_list=new ArrayList<>();
    private ArrayList<Card.ResultBean.CouponsBean> out_list=new ArrayList<>();
    private ArrayList<Card.ResultBean.CouponsBean> used_list=new ArrayList<>();
    private String Url="http://apptest.iaugold.com/service/gateway.do?service_type=iaugold.member.query.couponcode&app_key=9001001&version=1.0&phone_info=Android,4.4.2,1080*1920&imei=866174010601413&token=b5269cad7b767e54&page_size=10&page_number=1&sign=2b61b494f72981d1c43320efac4f8e66";
    private OKhttpManager manager = OKhttpManager.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getDate();
    }
    private void  init(){
        can_use=findViewById(R.id.can_use);
        can_used=findViewById(R.id.can_used);
        out_date=findViewById(R.id.out_date);
        re_can_use=findViewById(R.id.rec_can_use);
        re_can_used=findViewById(R.id.rec_can_used);
        re_out_date=findViewById(R.id.rec_out_date);
    }

   //获取网络请求数据
    private void getDate(){
        manager.asyncJsonStringByURL(Url, new OKhttpManager.Func1() {
            @Override
            public void onResponse(String result) {
                Gson gson = new Gson();
                Card card = gson.fromJson(result, Card.class);
              list.addAll(card.getResult().getCoupons());

              for (int i=0;i<=list.size();i++){

                  if (list.get(i).isIs_used()==true){
                      used_list.addAll(card.getResult().getCoupons());
                  }else if (list.get(i).isIs_used()==false){
                      use_list.addAll(card.getResult().getCoupons());

                  }else if (list.get(i).isHas_expired()==true){
                      out_list.addAll(card.getResult().getCoupons());
                  }
              }
              //添加数据
                can_use.setText(use_list.size()+"张可用");
                can_used.setText("已使用");
                out_date.setText("已经过期");
                Log.e("TAG",use_list.size()+"---"+used_list.size()+"---"+out_list.size());
                re_can_use.setAdapter(new MyAdapter(use_list,MainActivity.this));
                re_can_used.setAdapter(new MyAdapter(used_list,MainActivity.this));
                re_out_date.setAdapter(new MyAdapter(out_list,MainActivity.this));

            }
        });
    }
}
