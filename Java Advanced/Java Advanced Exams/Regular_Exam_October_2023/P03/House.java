package Java_Advanced_Exams.Regular_Exam_October_2023.P03;

import java.util.ArrayList;
import java.util.List;

public class House {
    private int capacity;
    private List<Kid> data;

    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    void addKid(Kid kid){
        if(data.size() < capacity){
            data.add(kid);
        }
    }
    boolean removeKid(String name){
        Kid kidToRemove = null;
        for (Kid kid : data) {
            if(kid.getName().equals(name)){
             kidToRemove = kid;
            }
        }
        return data.remove(kidToRemove);
    }
    public Kid getKid(String street){
        Kid kidStreet = null;
        for (Kid kid : data) {
            if(kid.getStreet().equals(street)){
                kidStreet = kid;
            }
        }
        return kidStreet;
    }

    public int getAllKids(){
        return data.size();
    }
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("Children who visited a house for candy:");
        sb.append(System.lineSeparator());

        for (Kid v : data) {
            sb.append(v.toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
