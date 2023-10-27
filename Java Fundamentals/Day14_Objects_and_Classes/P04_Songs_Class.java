package Day14_Objects_and_Classes;

public class P04_Songs_Class {
    private String typeList;
    private String name;
    private String time;

    public P04_Songs_Class(String typeList, String name, String time){
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getTypeList(){
        return  this.typeList;
    }

    public  void  setTypeList(String typeList){
        this.typeList = typeList;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getTime(){
        return  this.time;
    }
    public  void setTime(String time){
        this.time = time;
    }
}
