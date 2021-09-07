import java.util.ArrayList;

public class Cell {

    public int strength;
    public int x;
    public int y;
    public int id;
    private ArrayList<Cell> neighbors;

    public Cell(int strength, int id, int x, int y){
        setStrength(strength);
        setID(id);
        setX(x);
        setY(y);
    }

    public Cell(){
        this( 0,0, 0,  0);
    }

    public static void main(String[] args) {
        Cell newCell = new Cell(-1,-1,-1,-1);
        newCell.setStrength(newCell.strength);
        newCell.setID(newCell.id);
        newCell.setX(newCell.x);
        newCell.setY(newCell.y);

        System.out.println(newCell.strength);
        System.out.println(newCell.id);
        System.out.println(newCell.x);
        System.out.println(newCell.y);
    }


    public void setStrength(int strength) {
        this.strength = Math.max(strength, 0);
    }
    public void setID (int id) {
        this.id = Math.max(id, 0);
    }
    public void setX (int x) {
        this.x = Math.max(x, 0);
    }
    public void setY (int y) {
        this.y = Math.max(y, 0);
    }

    public void interactNeighbors (ArrayList<Cell> neighbors){

    }
}
