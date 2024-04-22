package fr.univlille.k2sae3a.model.maze;

public class Plateau {
    public static final int DEFAULT_SIZE=10;
    public int sizex;
    public int sizey;
    public Cell[][] cellules;
    public Plateau(int x, int y) throws SizeIsNotEnoughException{
        if(x<3 || y<3){
            throw new SizeIsNotEnoughException();
        }
        else{
            cellules=new Cell[x][y];
            sizex=x;
            sizey=y;
        }
    }
    public Plateau(int x) throws SizeIsNotEnoughException{
        this(x,x);
    }
    public Plateau() throws SizeIsNotEnoughException{
        this(DEFAULT_SIZE);
    }

    public void shot(int col, int line) throws CaseNotInTabException{
        if(col>=sizex || line >=sizey){
            throw new CaseNotInTabException();
        }
    }
    public boolean move(int col, int line){
        return true;
    }
    public boolean estColle(int colDepart, int linDepart, int colArrive, int linArrive){
        if(colDepart-1==colArrive || colDepart+1==colArrive){
            return linDepart==linArrive;
        }
        else{
            return linDepart-1==linArrive || linDepart+1==linArrive;
        }
    }
}
