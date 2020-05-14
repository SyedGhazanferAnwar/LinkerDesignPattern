package linkerdesignpattern;

class Ticket{
    
    Ticket(){
        
    }
    Ticket(String _id, boolean _isAvailable, float _price){
        id=_id;
        isAvailable=_isAvailable;
        price=_price;
    }
    
    String id;
    boolean isAvailable;
    float price;
}

