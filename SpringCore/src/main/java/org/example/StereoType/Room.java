package org.example.StereoType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Room {
    @Value("#{roomid}")
    private List<Integer> number;

    public List<Integer> getNumber() {
        return number;
    }

    public void setNumber(List<Integer> number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                '}';
    }
}
