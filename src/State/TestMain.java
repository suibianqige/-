package State;

/**
 * @Author: 杨长江
 * @Date: 2019-05-27 22:31
 * @Description: 说明
 */
public class TestMain {


    public static void main(String[] args) {
        VoteManager manager = new VoteManager();
        for(int i = 0;i<10;i++){
            manager.vote("杨长江","我自己");
        }
    }
}
