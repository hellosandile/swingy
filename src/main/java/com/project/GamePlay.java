package com.project;

import com.project.person.hero.IGameControlls;

public class GamePlay implements IGameControlls{
    public int[][] map;
    public int mapy;
    public int mapx;
    public int size;
    public int xpos;
    public int ypos;
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
        map[5][6] = 1;
        for(int y = 0; y < mapy; y++){
            for(int x = 0; x < mapx; x++){
                switch(map[y][x]){
                    case 0:
                        System.out.print("* *");
                        break;
                    case 1:
                        System.out.print("* d *" );
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
    }

    public void updateExp(int exp) {

    }

    public void meetEnemy(int Hy, int Hx, int Ey, int Ex) {

    }
}