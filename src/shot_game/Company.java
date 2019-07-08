package shot_game;

import java.util.ArrayList;

public class Company {
    private ArrayList<String> location;
    private String name;

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = location.indexOf(userInput);
        if(index>=0){
            location.remove(index);
            if(location.isEmpty()){
                result = "kill";
                System.out.println("您击沉了"+name+"公司");
            }else{
                result = "hit";
            }
        }
        return result;
    }
}
