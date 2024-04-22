package fr.univlille.k2sae3a.model.maze;

public class SizeIsNotEnoughException extends Exception{
    SizeIsNotEnoughException(String msg){
        super(msg);
    }
    SizeIsNotEnoughException(){
        this("C'est trop petit");
    }
}
