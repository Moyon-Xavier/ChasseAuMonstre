package fr.univlille.k2sae3a.model.maze;

public class CaseNotInTabException extends Exception{
    CaseNotInTabException(String msg){
        super(msg);
    }
    CaseNotInTabException(){
        this("La case n'est pas dans le tableau");
    }
}
