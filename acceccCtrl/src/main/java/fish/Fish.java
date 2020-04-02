package fish;

import com.huawei.Animal;

public class Fish extends Animal {
    protected String name;

    int sex;

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", sex=" + sex +
                '}';
    }
}
