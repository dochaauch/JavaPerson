package profJava.task221128;
//T(ype), E(lement), K(ey), V(alue), N(umber)
public class BoxGeneric<TYPE> {
    private TYPE obj;

    public BoxGeneric(TYPE obj) {
        this.obj = obj;
    }

    public TYPE getObj() {
        return obj;
    }

    public void setObj(TYPE obj) {
        this.obj = obj;
    }
}
