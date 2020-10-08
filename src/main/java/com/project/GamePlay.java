package com.project;

public class GamePlay{
    public static int[][] map;
    public static int mapy;
    public static int mapx;
    public static int size;
    public static int xpos;
    public static int ypos;
    public void heroposition(int x, int y){

    }

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
        MapDisplay();
        setHeroposition();

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
}