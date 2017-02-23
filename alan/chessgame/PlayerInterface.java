package alan.chessgame;

import alan.chessgame.visualizer.UpdatableVisualizer;
import alan.chessgame.joystick.InputJoystick;


/**
 * This is just a simple collection of user interface IO :D
 */
public class PlayerInterface {
    public final UpdatableVisualizer visualizer;
    
    public final InputJoystick joystick;
    
    public PlayerInterface(UpdatableVisualizer visualizer, InputJoystick joystick) {
        this.visualizer = visualizer;
        this.joystick = joystick;
    }
}