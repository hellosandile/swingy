package com.project;

import java.util.concurrent.ThreadLocalRandom;

import com.project.person.enemy.Aku;
import com.project.person.enemy.Enemy;
import com.project.person.hero.Hero;
import com.project.person.hero.IGameControlls;

public class GamePlay implements IGameControlls{
    public int[][] map;
    public int mapy;
    public int mapx;
    public int size;
    public int xpos;
    public int ypos;
    public boolean testBool = false;
    public MyCharacter myCharacter;
    private boolean condition = false;

    public GamePlay(){}

    public void setHeroposition(){
        int x = 0;
        int y = 0;

        if((size % 2) == 0){
            x = (size / 2);
            y = (size / 2);
        }else if ((size % 2) == 1){
            x = (int)(size / 2);
            y = (int)(size / 2);
        }
        this.xpos = x;
        this.ypos = y;
    }
    public int setMap(int level){
        return (level - 1) * 5 + 10 - (level % 2);
    }

    public void Mapsize(){
        size = setMap(1);
        mapx = size;
        mapy = size;
        map = new int[size][size];
    }

    public void MapDisplay(){
        if (condition == false){
            Mapsize();
            setHeroposition();
            condition = true;
        }
        
        

        for(int y = 0; y < size; y++){
            for(int x = 0; x < size; x++){
                map[y][x] = 0;
            }
        }
        map[this.ypos][this.xpos] = 3;
        if(testBool == false)
        {
           map[5][6] = 1;
        }
        else
        {
            map[5][6] = 0;
        }
        for(int y = 0; y < mapy; y++){
            for(int x = 0; x < mapx; x++){
                switch(map[y][x]){
                    case 0:
                        System.out.print("* *");
                        break;
                    case 1:
                        System.out.print("* d *" );
                        Aku.setX(x);
                        Aku.setY(y);
                        break;
                    default:
                        System.out.print("* H *" );
                        break;
                }
            }
            System.out.println();
        }
    }

    public void heroPosition(int x, int y) {

        if (xpos == 0 || xpos == size - 1 || ypos == 0 || ypos == size -1)
        {
            Story.printGameEnding();
            System.exit(0);
            GameLogic.scanner.close();
        }
        
        this.xpos += x;
        if(this.xpos < 0){
            this.xpos = (int)(size / 2);
            condition = false;
        }else if(this.xpos >= size){
            this.xpos = (int)(size / 2);
            condition = false;
        }

        this.ypos += y;
        if(this.ypos < 0){
            this.ypos = (int)(size / 2);
            condition = false;
        }else if(this.ypos >= size){
            this.ypos = (int)(size / 2);
            condition = false;
        }

        if (samePosition())
        {
            Story.printFightOrRun();
            int input = GameLogic.readInt("-> " , 2);
            if(input == 1)
            {
                System.out.println("They are fightijng");
                onFight();
                
            }

            if(input == 2)
            {
                System.out.println("running away");
                //run shit
            }
        }
    }

    public void onFight()
    {
        Enemy aku = (Enemy) GameLogic._IEnemy;
        int gainedXp = Result(aku);
        System.out.println("Gained XP:  " + gainedXp);
        System.out.println("Original XP:  " + ((Hero)GameLogic._ihero).experience);
        if (gainedXp >= 0)
        {
            ((Hero)GameLogic._ihero).increaseExp(gainedXp);
            System.out.println(((Hero)GameLogic._ihero).experience);
            System.out.println(((Hero)GameLogic._ihero).level);
            testBool = true;
            GameLogic.startJourney();

        }
        else{
            System.out.println("You lost");
        }
    }

    public Boolean samePosition()
    {
       
        if (Aku.getX() == xpos && Aku.getY() == ypos){
           return true;
        }
        return false;
    }

    public void updateExp(int exp)
    {

    }

    public void meetEnemy(int Hy, int Hx, int Ey, int Ex) {

    }

    public int Result(Enemy enemy)
    {
        int xp = enemy.getAttack() + enemy.getDefence() + enemy.getHitPoint();
        int rand = ThreadLocalRandom.current().nextInt(0, 100);

        if (rand < 20) {
            return xp;
        }

        return ((Hero) GameLogic._ihero).fight(enemy) ? xp : -1;
    }
}