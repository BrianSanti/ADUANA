/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTITY;

/**
 *
 * @author BRIAN
 */
public class CONTRIENTITY {
    private String ID_DPI;
    private String Nit;
    private String Nombre1;
    private String Nonmbre2;
    private String Apellido1;
    private String Apellido2;
    private String FechaIngreso;
    private String RiesgoCliente;

    public CONTRIENTITY() {
        
        
        
        
        
    }

    public CONTRIENTITY(String ID_DPI, String Nit, String Nombre1, String Nonmbre2, String Apellido1, String Apellido2, String FechaIngreso, String RiesgoCliente) {
        this.ID_DPI = ID_DPI;
        this.Nit = Nit;
        this.Nombre1 = Nombre1;
        this.Nonmbre2 = Nonmbre2;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.FechaIngreso = FechaIngreso;
        this.RiesgoCliente = RiesgoCliente;
    }

    public String getID_DPI() {
        return ID_DPI;
    }

    public void setID_DPI(String ID_DPI) {
        this.ID_DPI = ID_DPI;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getNombre1() {
        return Nombre1;
    }

    public void setNombre1(String Nombre1) {
        this.Nombre1 = Nombre1;
    }

    public String getNonmbre2() {
        return Nonmbre2;
    }

    public void setNonmbre2(String Nonmbre2) {
        this.Nonmbre2 = Nonmbre2;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getRiesgoCliente() {
        return RiesgoCliente;
    }

    public void setRiesgoCliente(String RiesgoCliente) {
        this.RiesgoCliente = RiesgoCliente;
    }

    @Override
    public String toString() {
        return "CONTRIENTITY{" + "ID_DPI=" + ID_DPI + ", Nit=" + Nit + ", Nombre1=" + Nombre1 + ", Nonmbre2=" + Nonmbre2 + ", Apellido1=" + Apellido1 + ", Apellido2=" + Apellido2 + ", FechaIngreso=" + FechaIngreso + ", RiesgoCliente=" + RiesgoCliente + '}';
    }

   
    
    
}
