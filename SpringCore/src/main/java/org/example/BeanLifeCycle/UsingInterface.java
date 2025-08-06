package org.example.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean, DisposableBean {
    private int pen;

    public int getPen() {
        return pen;
    }

    public void setPen(int pen) {
        this.pen = pen;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Lets, close and die or destroy pen..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Lets, Start initializing or init pen.");
    }

    @Override
    public String toString() {
        return "UsingInterface{" +
                "pen=" + pen +
                '}';
    }
}
