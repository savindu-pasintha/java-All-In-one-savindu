
package Encapsulation_getters_setterd_or_instance_methods;


public class Aclass {
    
    
    private int id;
    public String name,k;

    //getters make (getMethods) set karpu variable ek atulevalue ek eliyat dann(gann eliyat)
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
    //setters make (setMethod()) value ekk athulata dann variable eke
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    public void  method(int i, String s){
       //catch method parameeter values
        int p=i;
        String q=s;
        System.out.println("parameeter--"+ p + "\n"+ q);
        
        
        
        Aclass b=new Aclass();
        b.setId(50);
        b.setName("savindu pasingtha");
        
        //catch id and name values
        Aclass a=new Aclass();
        System.out.println("ID IS NOW"+b.getId() + "\n"+ b.getName());
        
        
    }
    
}
