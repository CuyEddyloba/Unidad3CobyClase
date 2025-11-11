package ejercicio1.datos;

public class Materias {
    public String materia;
    public int semestre;
    public int calificaciones;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }

    
    public String[] aArreglo(){
        String[] arreglo = new String[3];
        arreglo[0] = materia;
        arreglo[1] = "" + semestre;
        arreglo[2] = "" + calificaciones;
        return arreglo;
    }
    
    
    }