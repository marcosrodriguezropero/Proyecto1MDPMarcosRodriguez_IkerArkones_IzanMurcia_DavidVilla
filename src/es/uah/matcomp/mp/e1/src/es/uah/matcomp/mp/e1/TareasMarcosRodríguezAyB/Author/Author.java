package es.uah.matcomp.mp.e1.Author;
//Clase pública Author
public class Author {
    //Creamos las variables privadas
    private String name;
    private String email;

    //Función pública
    //Función que define las variables privadas
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Función que devuleve la variable "name"
    public String getName() {
        return name;
    }

    //Función que devuelve el valor de la variable "email"
    public String getEmail() {
        return email;
    }

    //Definimos la variable email con "em"
    public void setEmail(String em) {
        this.email = em;
    }

    //Definimos como debe escribirse la salida
    public String toString() {
        return "Author[name=" + name + ", email=" + email + "]";
    }
}
