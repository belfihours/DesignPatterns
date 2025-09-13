package creational;

public class SingletonDB {
    private static SingletonDB instance;
    private static int seq = 0;
    private SingletonDB()
    {
        seq++;
    }

    public static SingletonDB getInstance() {
        if (instance==null){
            instance = new SingletonDB();
        }
        return instance;
    }

    public int getSeq(){
        return seq;
    }
}
