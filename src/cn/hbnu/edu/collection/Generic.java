package cn.hbnu.edu.collection;

public class Generic {
    private Object[] arrayObject;

    public Generic(int catacity) {
        this.arrayObject = new Object[catacity];
    }

    public void setData(int index, Object obj) {
        arrayObject[index] = obj;
    }

    public Object getData(int index) {
        return arrayObject[index];
    }
}
