package es.uah.matcomp.mp.e1.InvoiceItem;
//Clase InvoiceItem
public class InvoiceItem {
    //Creamos variables privadas
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    //Funciones públicas
    //Creamos la función con todas las variables
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    //Creamos la función que devuelve el valor de "id"
    public String getId() {
        return id;
    }

    //Creamos la función que devuelve el valor de "desc"
    public String getDesc() {
        return desc;
    }

    //Creamos la función que devuelve el valor de "qty"
    public int getQty() {
        return qty;
    }

    public void setQty(int q) {
        this.qty = q;
    }

    //Creamos la función que devuleve el valor de "UnitPrice"
    public double getUnitPrice() {
        return unitPrice;
    }

    //Función que establece el valor de UnitPrice a otra variable
    public void setUnitPrice(double uP) {
        this.unitPrice = uP;
    }

    //Función que devuelve el valor total con los valores de "qty" y "unitPrice
    public double getTotal() {
        return qty * unitPrice;
    }

    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}
