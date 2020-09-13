package clocks;

import actions.Collision;
import game.Dir;
import game.Head;
import game.Snake;

public class GameClock extends Thread {
    public static boolean running = true;

    public void run(){
        while (running) {
            try {
                sleep(250);
                Snake.move();
                Snake.waitToMove = false;
                Collision.collidePickUp();
                if(Snake.score >= 1) {
                    Collision.collideKillUp();
                }
                if (Collision.collideSelf()) {
                    Snake.tails.clear();
                    Snake.head.setDir(Dir.NONE);
                    Snake.score = 0;
                }
                if (Collision.collideWall()) {
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                    Snake.head.setDir(Dir.NONE);
                    Snake.score = 0;
                }

                //System.out.println("X" + Snake.head.getX());
                //System.out.println("Y" + Snake.head.getY());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
