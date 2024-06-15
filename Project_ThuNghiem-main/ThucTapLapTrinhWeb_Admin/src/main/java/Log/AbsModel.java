package Log;




public abstract class AbsModel {
    int id;
    int level;
//    IPAddressName ipAddressName;

    public AbsModel(int id, int level) {
        this.id = id;
        this.level = level;
//        this.ipAddressName = ipAddressName;
    }
}
