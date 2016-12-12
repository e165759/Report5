/**
 * Created by e165759 on 2016/12/08.
 **/
public class Report5 {
    public static void main(String[] args){

        /* 想定している例外が起きる箇所では、予め例外に対応した処理を記述する。
            try{ 例外が起きる箇所 }
            catch(想定してる例外){例外処理}
            finally{例外の有無にかかわらず、最終的に実行させたい処理}
         */
        try {
            String str = "3．14";
            Double value = Double.parseDouble(str);
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("例外発生！");
            e.printStackTrace();
            System.exit(1); //exit code を1に。(正常終了 = 0)
        }

    }
}
