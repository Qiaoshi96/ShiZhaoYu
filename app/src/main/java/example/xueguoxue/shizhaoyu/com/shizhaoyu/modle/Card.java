package example.xueguoxue.shizhaoyu.com.shizhaoyu.modle;

import java.util.List;

/**
 * Created by xueguoxue on 2018/3/6.
 */

public class Card {

    /**
     * sign : 17c2e02a6437d07b66145aee6d68b144
     * result_code : 0000
     * result_desc : 操作成功!
     * result : {"coupons":[{"begin_date":"2018-01-30 20:32:58","coupon_code":"k73887129582242F4A0273F2A6FC61AD3","coupon_price":100,"end_date":"2022-01-30 20:33:00","has_expired":false,"is_used":false},{"begin_date":"2017-11-28 16:23:07","coupon_code":"20YB67FCB0D142A46B18872590AEA1F3BA1","coupon_price":20,"end_date":"2018-12-24 10:55:11","has_expired":false,"is_used":false},{"begin_date":"2017-11-28 16:23:07","coupon_code":"20YFEF6140811A74BB59E6F3B33B41F156D","coupon_price":20,"end_date":"2018-12-24 10:55:11","has_expired":false,"is_used":false},{"begin_date":"2017-11-28 16:23:07","coupon_code":"20YDFBC37A609E04E758AEEF9C04A3FA45B","coupon_price":20,"end_date":"2018-12-24 10:55:11","has_expired":false,"is_used":false},{"begin_date":"2017-11-28 16:23:07","coupon_code":"20YD3BBB95D05FC4A87B063359E6EB30B84","coupon_price":20,"end_date":"2018-12-24 10:55:11","has_expired":false,"is_used":false},{"begin_date":"2017-11-28 16:23:07","coupon_code":"20YBA1F0CA3C31A48B187977BAB862AA396","coupon_price":20,"end_date":"2018-12-24 10:55:11","has_expired":false,"is_used":false},{"begin_date":"2017-11-28 16:23:07","coupon_code":"20Y33218A2176564D05A40E0C3F18587AB9","coupon_price":20,"end_date":"2018-12-24 10:55:11","has_expired":false,"is_used":false},{"begin_date":"2017-11-28 16:23:07","coupon_code":"20Y20B0966096564DDB8BB26F3E9A863F74","coupon_price":20,"end_date":"2018-12-24 10:55:11","has_expired":false,"is_used":false},{"begin_date":"2017-11-28 16:23:07","coupon_code":"20YBCC8FC06C9E048D9B01194041AB9CF98","coupon_price":20,"end_date":"2018-12-24 10:55:11","has_expired":false,"is_used":false},{"begin_date":"2017-11-28 16:23:07","coupon_code":"20Y9A9A49F738E943769EE412A7CD06D02D","coupon_price":20,"end_date":"2018-12-24 10:55:11","has_expired":false,"is_used":false}]}
     */

    private String sign;
    private String result_code;
    private String result_desc;
    private ResultBean result;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getResult_desc() {
        return result_desc;
    }

    public void setResult_desc(String result_desc) {
        this.result_desc = result_desc;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<CouponsBean> coupons;

        public List<CouponsBean> getCoupons() {
            return coupons;
        }

        public void setCoupons(List<CouponsBean> coupons) {
            this.coupons = coupons;
        }

        public static class CouponsBean {
            /**
             * begin_date : 2018-01-30 20:32:58
             * coupon_code : k73887129582242F4A0273F2A6FC61AD3
             * coupon_price : 100
             * end_date : 2022-01-30 20:33:00
             * has_expired : false
             * is_used : false
             */

            private String begin_date;
            private String coupon_code;
            private int coupon_price;
            private String end_date;
            private boolean has_expired;
            private boolean is_used;

            public String getBegin_date() {
                return begin_date;
            }

            public void setBegin_date(String begin_date) {
                this.begin_date = begin_date;
            }

            public String getCoupon_code() {
                return coupon_code;
            }

            public void setCoupon_code(String coupon_code) {
                this.coupon_code = coupon_code;
            }

            public int getCoupon_price() {
                return coupon_price;
            }

            public void setCoupon_price(int coupon_price) {
                this.coupon_price = coupon_price;
            }

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public boolean isHas_expired() {
                return has_expired;
            }

            public void setHas_expired(boolean has_expired) {
                this.has_expired = has_expired;
            }

            public boolean isIs_used() {
                return is_used;
            }

            public void setIs_used(boolean is_used) {
                this.is_used = is_used;
            }
        }
    }
}
