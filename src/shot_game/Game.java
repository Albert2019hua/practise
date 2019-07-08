package shot_game;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    //声明并出示化变量
    private GameHelper helper = new GameHelper();
    private ArrayList<Company> target = new ArrayList<Company>();
    private int numOfGuess = 0;
    //初始化游戏，将目标数组存放到集合中
    protected void setUpGame(){
        Company one = new Company();
        one.setName("pets.com");
        Company two = new Company();
        two.setName("flowers.com");
        Company three = new Company();
        three.setName("toys.com");
        target.add(one);
        target.add(two);
        target.add(three);
        System.out.println("目标公司是：");
        for (Company name : target) {
//          初始化公司坐标
            ArrayList<String> newLocation = helper.setLocation(3);
            name.setLocation(newLocation);
            System.out.print(name.toString()+"\n");
        }

    }

    protected void startPlaying(){
        while(!target.isEmpty()){
            System.out.println("请输入您猜想的数字");
            Scanner scanner = new Scanner(System.in);
            String guess = scanner.nextLine();
            checkUserGuess(guess);
        }
    }

    private String checkUserGuess(String userGuess){
        String result = "miss";
        for (Company shot : target) {
            result = shot.checkYourself(userGuess);
            if(result.equals("kill")){
                //在遍历的集合中删去
                target.remove(shot);
                break;
            }else if(result.equals("hit")) {
                break;
            }
        }
        return result;
    }

    Game(){

    }
}
