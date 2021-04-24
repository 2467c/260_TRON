package pv260.general;

import java.awt.*;

public interface Engine {

    void game_start();
    void game_stop();
    void game_update(long Passed_time);
    void draw(Graphics2D g);
    void draw_test(Graphics2D g);
    

}
