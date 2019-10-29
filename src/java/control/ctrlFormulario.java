/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author adi
 */
@Named(value ="referencia")
@RequestScoped

public class ctrlFormulario {
    private String nombre;
    private String grupo;
    private int num_materias;
    private int pago;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    

    public int getNum_materias() {
        return num_materias;
    }

    public void setNum_materias(int num_materias) {
        this.num_materias = num_materias;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
    
    
    public void pagos(){
        int costo = 30;
        
        switch(getNum_materias()){
            case 1: setPago(costo);
            break;
            case 2: setPago(costo*2);
            break;
            case 3: setPago(costo*3);
            break;
            default : break;
    }   
        if(getNum_materias()>0&&getNum_materias()<=3){
        final String pago = getNombre()+" del grupo "+getGrupo()+ ": presentará "+getNum_materias()+" recuperaciones, el pago será de: "+getPago()+" ¡Suerte!";
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(pago));
        }
    }
    
}
